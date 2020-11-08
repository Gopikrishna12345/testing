package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;

	//Test Data
	public String  url ="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw ="admin";
	public String ln ="gopikrishna";
	public String fn = "thirumalsetty";
	public String file_path = "C:\\Users\\ASUS\\Desktop\\Screenshot 2020-10-22 123108.png";
	
	
	//Object Info
	public String txt_username ="txtUserName";
	public String txt_password = "txtPassword";
	public String btn_lolgin ="Submit";
	public String link_logout = "Logout";
	public String link_pim ="PIM";
	public String link_addemp ="Add Employee";
	public String frame_id="rightMenu";
	public String id_save ="btnEdit";
	public String name_upload ="photofile";
	public String name_ln="txtEmpLastName";
	public String name_fn ="txtEmpFirstName";	
	}


