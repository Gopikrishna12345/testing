package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {

	@Test
	public void tc002() throws Exception {
    DOMConfigurator.configure("log4j.xml");
	
    
    General obj = new General();
	obj.openapplication();
	obj.login();
	obj.goto_emp_page();
	obj.enter_frames();
	obj.add_emp();
	obj.logout();
	obj.closeapplication();
	

}
}
