package com.rapid.featurerequest.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rapid.featurerequest.model.Feature;

public interface FeatureRepository  extends CrudRepository<Feature, Integer> {
	
	Optional<Feature> findByTitle(String title);
	
	Optional<Feature> findByClient(String client);
	
}
