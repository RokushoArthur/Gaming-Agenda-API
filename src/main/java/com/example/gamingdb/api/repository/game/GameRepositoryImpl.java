package com.example.gamingdb.api.repository.game;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import com.example.gamingdb.api.model.Game;
import com.example.gamingdb.api.model.Game_;
import com.example.gamingdb.api.repository.filter.GameFilter;

public class GameRepositoryImpl implements GameRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<Game> filter(GameFilter gameFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Game> criteria = builder.createQuery(Game.class);
		
		Root<Game> root = criteria.from(Game.class);
		
		//create restrictions
		Predicate[] predicates = createRestrictions(gameFilter, builder, root);
		criteria.where(predicates);
		
		
		TypedQuery<Game> query = manager.createQuery(criteria);
		addPageRestrictions(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(gameFilter)); 
	}


	private Predicate[] createRestrictions(GameFilter gameFilter, CriteriaBuilder builder, Root<Game> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		
		// where genre like %textext%
		if (!StringUtils.isEmpty(gameFilter.getGenre())) {
			predicates.add(builder.like(builder.lower(root.get(Game_.genre)), "%" + gameFilter.getGenre().toLowerCase() + "%"));
		}
		
		if (gameFilter.getPlataform() != null) {
			predicates.add(builder.like(builder.lower(root.get(Game_.plataform)), "%" + gameFilter.getPlataform().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private void addPageRestrictions(TypedQuery<Game> query, Pageable pageable) {
		int actualPage = pageable.getPageNumber();
		int itemsPerPage = pageable.getPageSize();
		int firstPageItem = actualPage * itemsPerPage;
		
		query.setFirstResult(firstPageItem);
		query.setMaxResults(itemsPerPage);
	}
	
	private Long total(GameFilter gameFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Game> root = criteria.from(Game.class);
		
		Predicate[] predicates = createRestrictions(gameFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		
		return manager.createQuery(criteria).getSingleResult();
	}
	
}
