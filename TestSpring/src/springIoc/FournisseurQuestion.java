package springIoc;

//这是一个问题类生成工厂，提供各种具体子类生成对象时需要用到的方法，方法调用的都是子类的具体方法。
public class FournisseurQuestion {
    
	private Question question;

	public void setQuestion(Question question) {
		this.question = question;
	}
	
    public void poseQuestion(){
    	System.out.println(question.popQuestion());
    }
}
