package variables;

public class Urls {
	final private String login_url = "https://10.10.98.50/web/financial-advisor-portal/login?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&_com_liferay_login_web_portlet_LoginPortlet_redirect=%2F";
	final private String faconnect_url = "https://faconnectuat.britam.com";
			
	public Urls(){
		
	}
	
	public String getLoginUrl() {
		return login_url;
	}
	
	public String getFaConnectUrl() {
		return faconnect_url;
	}
}
