package form;

import org.apache.struts.action.ActionForm;
//封装页面表单数据的，省得你每次都要获取数据，转换数据，它会默认得封装到你指定的actionForm中
//写bean程序，继承ActionForm
public class LoginForm  extends ActionForm{
	
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
