package com.exam.exam.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.exam.exam.domain.Question;

public interface QuestionRepository extends PagingAndSortingRepository<Question, Integer>{

 
}
