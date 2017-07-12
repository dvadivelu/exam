package com.exam.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.exam.exam.domain.Question;
import com.exam.exam.repo.QuestionRepository;

@Service
public class QuestionService{

	private QuestionRepository questionRepository;

	@Autowired
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	public Question createQuestion(Question question) {
		if (!questionRepository.exists(question.getQuestionNumber())) {
			questionRepository.save(question);
		}
		return null;
	}

	public Iterable<Question> lookUp() {
		return questionRepository.findAll();
	}
	
	public Page<Question> listAllByPage(Pageable pageable){
		return questionRepository.findAll(pageable);
	}
	

}
