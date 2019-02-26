package springAop;

import org.aspectj.lang.JoinPoint;

//定义切面上要执行的各种方法
public class Decoration {

	public void ecrireAvant(JoinPoint jp){
		System.out.println("Je suis avantAAAAAAAA");
	}
	public void ecrireApres(){
		System.out.println("Je suis apresSSSSSSSS");
	}
}
