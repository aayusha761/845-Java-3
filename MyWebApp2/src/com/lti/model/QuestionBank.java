package com.lti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QuestionBank {

	private Map<String, List<Question>> questionBank = new HashMap<>();
	
	public void addNewSubject(String subjectName) {
		questionBank.put(subjectName, new ArrayList<>());
	}
	
	public void addNewQuestion(Subject subject, Question question) {
		List<Question> questions = questionBank.get(subject);
		
		questions.add(question);
	}
	
	public List<Question> getQuestionFor(Subject subject) {
		return questionBank.get(subject);
	}
	
    private static Question single_instance = null;

	public QuestionBank() {}
}