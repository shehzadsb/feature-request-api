package com.rapid.featurerequest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapid.featurerequest.dao.FeatureRepository;
import com.rapid.featurerequest.model.Client;
import com.rapid.featurerequest.model.Feature;
import com.rapid.featurerequest.model.ProductArea;

@Service
public class FeatureService {

	@Autowired
	FeatureRepository featureRepository;


	public List<Feature> getAllFeatures() {

		List<Feature> features = new ArrayList<>();
		featureRepository.findAll().forEach(features::add);
		return features;


	}


	public Optional<Feature> getFeature(Integer id) {

		return featureRepository.findById(id);
	}
	/*Client Priority: The feature's priority number according to the client (1...n).
	 * Client Priority numbers should not repeat for the given client, so if a priority is set on a
	 * new feature as "1", then all other feature requests for that client should be adjusted.*/


	public void addFeature(Feature feature) {

		List<Feature> allFeatures = getAllFeatures();
	 int size = 0;
	 if(allFeatures != null) {
		 size = allFeatures.size();
		 if(size > 0)
			 feature.setClientPriority(size);
	 }


		if(feature.getTargetDate() == null)
			feature.setTargetDate(new Date());

		featureRepository.save(feature);
	}

	public void updateFeature(Feature feature) {
		feature.setTargetDate(new Date());
		featureRepository.save(feature);


	}

	public void deleteFeature(Feature feature) {
		featureRepository.delete(feature);
	}

}
