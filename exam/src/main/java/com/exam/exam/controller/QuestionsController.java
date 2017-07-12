package com.exam.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.exam.domain.Question;
import com.exam.exam.service.QuestionService;

@RestController
public class QuestionsController {
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping(value="/examquestions",method=RequestMethod.GET)
	Page<Question> list(Pageable pageable){
		return questionService.listAllByPage(pageable);
		 
	} 

}
