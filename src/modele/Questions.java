package src.modele;

public class Questions {
	
	protected String question;
	protected String answer;
	
	public Questions(String question) {
		this.question = question;
		this.answer = "";
		}
	
	public String getQuestion() {
		return this.question;
		}
	
	public void setQuestion(String newQuestion) {
		this.question = newQuestion;
		}

}
