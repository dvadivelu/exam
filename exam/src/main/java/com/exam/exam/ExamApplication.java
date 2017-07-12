package com.exam.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.exam.domain.Difficulty;
import com.exam.exam.domain.Question;
import com.exam.exam.service.QuestionService;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {

	@Autowired
	private QuestionService questionService;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		questionService.createQuestion(
				new Question(1, "Question1", "Answer1", "Choice1", "Choice2", "Choice3", "Choice4", Difficulty.Easy));
		questionService.createQuestion(
				new Question(2, "Question2", "Answer2", "Choice1", "Choice2", "Choice3", "Choice4", Difficulty.Medium));
		questionService.createQuestion(new Question(3, "Question3", "Answer3", "Choice1", "Choice2", "Choice3",
				"Choice4", Difficulty.Difficult));
		questionService.createQuestion(
				new Question(4, "Question4", "Answer4", "Choice1", "Choice2", "Choice3", "Choice4", Difficulty.Easy));
		questionService.createQuestion(
				new Question(5, "Question5", "Answer5", "Choice1", "Choice2", "Choice3", "Choice4", Difficulty.Medium));
		
		questionService.lookUp();

	}
}
