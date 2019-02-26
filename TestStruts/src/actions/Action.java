package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//自己定义一个action接口
public interface Action {
	String perform(HttpServletRequest req, HttpServletResponse res);
}
