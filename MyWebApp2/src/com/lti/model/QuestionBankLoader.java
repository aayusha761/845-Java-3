package com.lti.model;

import java.util.ArrayList;
import java.util.List;


public class QuestionBankLoader {

	public List<Question> loadQuestionsOnJava() {
		
		Subject subject = new Subject("Java");
		QuestionBank qb = new QuestionBank();

		List<Option> ops = new ArrayList<Option>();
		
		//first question
		ops.add(new Option("Java is a database", false));
		ops.add(new Option("Java is a Programming language", true));
		ops.add(new Option("Java is a OS", false));
		ops.add(new Option("Java is a file system", false));
		Question q = new Question("What is Java?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is G1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is C1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is D1?", Difficulty.EASY, ops);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is E1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		
		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is F1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is G1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is H1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		ops = new ArrayList<Option>();
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q = new Question("What is I1?", Difficulty.EASY, ops);
		qb.addNewQuestion(subject, q);

		
		return qb.getQuestionFor(subject);
	}

}
