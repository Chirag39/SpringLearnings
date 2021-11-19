package org.q2;

import java.util.Map;

public class QuestionViaMap {
	
	private int questionId;
	private String question;
	private Map<Integer,String> answers;
	public QuestionViaMap(int questionId, String question, Map<Integer,String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		
	
	}
	
	public void show() {
		System.out.println("Case c) Answers are of type Map<Integer,String>");
		System.out.println(questionId+" "+question);    
	    
	    answers.forEach((k,v)->System.out.println(k+"-"+v)); 
	}

}

