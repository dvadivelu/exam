package com.exam.exam.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question implements Serializable {

	@Override
	public String toString() {
		return "Question [questionNumber=" + questionNumber + ", question=" + question + ", answer=" + answer
				+ ", choice1=" + choice1 + ", choice2=" + choice2 + ", choice3=" + choice3 + ", choice4=" + choice4
				+ ", difficulty=" + difficulty + "]";
	}
	
	public Question(){
		
	}

	public Question(Integer questionNumber, String question, String answer, String choice1, String choice2,
			String choice3, String choice4, Difficulty difficulty) {
		super();
		this.questionNumber = questionNumber;
		this.question = question;
		this.answer = answer;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.difficulty = difficulty;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	private static final long serialVersionUID = 3657085932908816160L;

	@Id
	@GeneratedValue
	private Integer questionNumber;

	public Integer getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public String getChoice4() {
		return choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "QUESTION")
	private String question;

	@Column(name = "ANSWER")
	private String answer;

	@Column(name = "CHOICE1")
	private String choice1;

	@Column(name = "CHOICE2")
	private String choice2;

	@Column(name = "CHOICE3")
	private String choice3;

	@Column(name = "CHOICE4")
	private String choice4;

	@Column(name = "DIFFICULTY")
	private Difficulty difficulty;

}
