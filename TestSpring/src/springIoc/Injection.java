package springIoc;

public class Injection {
	
	private String ques;
	private String ans;
	
	
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	public void MiseAJour(String ans) {
		this.ans=ans;
	}

}
