package com.test1.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test1.db.beens.ExamCreators;
import com.test1.db.repository.ExamCreatorsRepository;

@Service
public class ExamServiceIml implements ExamService {

	@Autowired
	ExamCreatorsRepository examCreatorsRepository;
	
	public HashMap<String, List<ExamCreators>> getExamCreators() {
		HashMap<String, List<ExamCreators>> ret = new HashMap<String, List<ExamCreators>>();
		List<ExamCreators> examCreatorsList = examCreatorsRepository.findAll();
		ret.put("result", examCreatorsList);
		return ret;
	}
	
}
