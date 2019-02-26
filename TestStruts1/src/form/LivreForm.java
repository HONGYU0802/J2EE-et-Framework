package form;

import org.apache.struts.action.ActionForm;

public class LivreForm extends ActionForm{
	
	private String article;
	private int quantite;
	
	
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
}
