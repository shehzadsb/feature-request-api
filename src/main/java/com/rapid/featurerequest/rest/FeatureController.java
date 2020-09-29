package com.rapid.featurerequest.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rapid.featurerequest.model.Feature;
import com.rapid.featurerequest.service.FeatureService;

//@ComponentScan({"com.rapid.dao", "com.rapid.service", "com.rapid.rest"})
@RestController
public class FeatureController {
	
	@Autowired
	FeatureService featureService;
	
	@RequestMapping("/features")
	public List<Feature> getAllFeatures() {
		return featureService.getAllFeatures();
		
		
	}
	
	@RequestMapping("/features/{id}")
	public Optional<Feature> getFeature(@PathVariable Integer id) {
		return featureService.getFeature(id);
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/features")
	public void addFeature(@RequestBody Feature feature) {
		featureService.addFeature(feature);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/features/{id}")
	public void updateFeature(@RequestBody Feature feature , @PathVariable Integer id) {
		featureService.updateFeature(feature);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/features/{id}")
	public void deleteFeature(@PathVariable Integer id) {
		Feature f = new Feature();
		f.setId(id);
		featureService.deleteFeature(f);
		
	}
	
	
}
