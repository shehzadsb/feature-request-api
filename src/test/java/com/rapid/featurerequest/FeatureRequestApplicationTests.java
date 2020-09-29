package com.rapid.featurerequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


import java.util.Date;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.rapid.featurerequest.model.Feature;




@SpringBootTest
class FeatureRequestApplicationTests {

	//@Autowired
    //FeatureService featureService;
	
	
	
	 
	 @Test
	  void assertException() {
		 //final Feature feature = new Feature(null, "Desc 1", "CLIENT_A", 1, new Date(), "Billing");

	    assertThatThrownBy(() -> new Feature(null, "Desc 1", "CLIENT_A", 1, new Date(), "Billing"))
	        .isInstanceOf(IllegalArgumentException.class);
	  }



}
