package com.rapid.featurerequest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rapid.featurerequest.model.Feature;

public interface FeatureRepository  extends CrudRepository<Feature, Integer> {
	

}
