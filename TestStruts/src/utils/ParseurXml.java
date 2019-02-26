package utils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

//自定义解析xml文件，把xml文件内容写进我们定义的变量lesActions里
public class ParseurXml {
		//Map是一个接口不能实例化，HashMap是Map的一个实现，HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
		Map<String, String>  lesActions = new HashMap<String,String>();
		//构造方法
		public ParseurXml() throws ParserConfigurationException, SAXException, IOException {
			//要解析的文件地址
			String fichier="/Users/lihongyu/eclipse-workspace/TestStruts/WebContent/WEB-INF/config.xml";
			//DocumentBuilderFactory是一个抽象工厂类，它不能直接实例化，但该类提供了一个newInstance方法 ，得到创建 DOM 解析器的工厂
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			//调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象。
			DocumentBuilder builder = factory.newDocumentBuilder();
			//调用 DOM 解析器对象的 parse() 方法解析 XML 文档，得到代表整个文档的 Document 对象，进行可以利用DOM特性对整个XML文档进行操作了。
			Document document = builder.parse(fichier);
			
			Node enfanturl=null;
			Element racine = document.getDocumentElement();//获得根结点，monframework
			NodeList bases = racine.getElementsByTagName("mapping");//返回monframework带有指定标签名的‘对象的集合’
			
			//遍历元素
			for(int i=0; i< bases.getLength();i++) {//此例length=3，有3个mapping
				Node base = bases.item(i);//分析第1，2，3个mapping
				NodeList elements= base.getChildNodes();//得到节点的子节点集合url和action
				
				for(int j=0; j<elements.getLength();j++) {//此例length=2，url和action
					Node enfant = elements.item(j);
					if(enfant.getNodeName().equals("url")) {//方法返回标签名
						//System.out.println(enfant.getTextContent());//返回此节点及其后代的文本内容
						enfanturl= elements.item(j);//赋值给子路径
					}	
					if(enfant.getNodeName().equals("action")) {
						//System.out.println(enfant.getTextContent());
						lesActions.put(enfanturl.getTextContent(),enfant.getTextContent());//把此映射写进我们提前定义好的lesActions里
					}
				}	
			}
		}
		
		public Map<String, String> getMaMap(){
			return lesActions;
		}
}		
