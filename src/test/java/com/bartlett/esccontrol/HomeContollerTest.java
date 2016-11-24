package com.bartlett.esccontrol;


import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.bartlett.esccontrol.web.HomeController;


public class HomeContollerTest {

	protected final Log log = LogFactory.getLog(getClass());
	
	 @Test
	    public void testHandleRequestView() throws Exception{		
	       	HomeController homeC = new HomeController();
	        ModelAndView modelAndView = homeC.handleRequest(null, null);
	        log.info("Model name:" +  modelAndView.getViewName());
	        assertEquals("home_vw", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        String nowValue = (String) modelAndView.getModel().get("hora_servidor");
	        assertNotNull(nowValue);
	    }

}
