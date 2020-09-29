package com.rapid.featurerequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.Optional;

//import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.rapid.featurerequest.dao.FeatureRepository;
import com.rapid.featurerequest.model.Feature;
import com.rapid.featurerequest.service.FeatureService;




@SpringBootTest
class FeatureRequestApplicationTests {

	@Autowired
    FeatureService featureService;
	
	@Autowired
    private FeatureRepository featureRepository;
	
	@Test
	  void injectedFeatureRepositoryIsNotNull(){
	    assertThat(featureRepository).isNotNull();
	    assertThat(featureService).isNotNull();
	   
	  }
	
	
	 
	 @Test
	  void assertException() {
		 //final Feature feature = new Feature(null, "Desc 1", "CLIENT_A", 1, new Date(), "Billing");

	    assertThatThrownBy(() -> new Feature(null, "Desc 1", "CLIENT_A", 1, new Date(), "Billing"))
	        .isInstanceOf(IllegalArgumentException.class);
	  }

	 @Test
	 public Iterable<Feature> findAll()
     {
         return featureRepository.findAll();
     }

	 @Test
	  public void whenSaved_thenFindsById() {
	    Feature feature = new Feature("New Title", "nee description", "CLIENT_B", 2, new Date(), "Reports");
	    featureRepository.save(feature);
	    
	    Optional<Feature> f = featureRepository.findById(1);
	    assertTrue(f.isPresent());
	  }
	 
	 @Test
	  public void whenSaved_thenFindsByTitle() {
	    Feature feature = new Feature("Another Title", "nee description", "CLIENT_B", 2, new Date(), "Reports");
	    featureRepository.save(feature);
	    
	    Optional<Feature> f = featureRepository.findByTitle("Another Title");
	    assertTrue(f.isPresent());
	  }
	 
	

}
