package utils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import actions.Action;

public class UsineANew {
		//Map是一个接口不能实例化，HashMap是Map的一个实现，HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
		Map<String, String> lesActions =new HashMap<String, String>();
		//构造函数
		public UsineANew(){
			/*不自己写解析文件的简单调用方法
			lesActions.put("/actionLogin.fraise","actions.ActionLogin");
			lesActions.put("/page1.fraise","actions.ActionPage1");
			lesActions.put("/quitte.fraise","actions.ActionQuitter");*/
			
			ParseurXml parse;//解析xml类
			try {
				parse = new ParseurXml();//构造方法里已经把config.xml文件解析好了
				lesActions = parse.getMaMap();//解析好的文件直接赋值
				
			} catch (ParserConfigurationException e) {//解析设置异常
				e.printStackTrace();
				
			} catch (SAXException e) {//格式字符串异常
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}						
		}

		//输入路径名字，例如/actionLogin.fraise，返回一个ActionLogin对象
		public Action getAction(String provenance) {//来源，起源
			Action act=null;
			//hashmap取值方法 String vlaues = map.get("key");
			String nomClass = lesActions.get(provenance);//比如返回的是"actions.ActionLogin"

			try {
				//Class.forName(xxx.xx.xx)返回的是一个类。
				Class classe = Class.forName(nomClass);//找到之匹配的类ActionLogin.class，
				act = (Action) classe.newInstance();//给这个类实例化一个对象			
			} catch (Exception e) {
				System.out.println("pas de chance");
			}			
			
			return act;
		}
}
