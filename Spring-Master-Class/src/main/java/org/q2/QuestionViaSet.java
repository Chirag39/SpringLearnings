package org.q2;

import java.util.Set;

public class QuestionViaSet {
	
	private int questionId;
	private String question;
	private Set<String> answers;
	public QuestionViaSet(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	
	public void show() {
		System.out.println("Case b) Answers are of type Set<String>");
		System.out.println(questionId+") "+question);  	    
	    for (String a : answers) {
			System.out.println("-> " +a);
		}  
	    System.out.println("---------------------------------------");
	}

}
