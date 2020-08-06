package com.lti.model;

import java.util.List;

public class Question {
	private String question;
	private Difficulty difficulty;
	private List<Option> options;
	
	public Question() {	}

	public Question(String question, Difficulty difficulty, List<Option> options) {
		super();
		this.question = question;
		this.difficulty = difficulty;
		this.options = options;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	
	
}
