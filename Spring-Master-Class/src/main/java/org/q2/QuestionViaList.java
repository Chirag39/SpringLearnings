package org.q2;

import java.util.List;

public class QuestionViaList {
	private int questionId;
	private String question;
	private List<String> answers;
	public QuestionViaList(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;	
	}
	
	public void show() {
		System.out.println("Case a) Answers are of type List<String>");
		System.out.println(questionId+") "+question);  	    
	    for (String a : answers) {
			System.out.println("-> " +a);
		}  
	    System.out.println("---------------------------------------");
	}
	

}
