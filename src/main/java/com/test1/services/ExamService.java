package com.test1.services;

import java.util.HashMap;
import java.util.List;

import com.test1.db.beens.ExamCreators;

public interface ExamService {

	public HashMap<String, List<ExamCreators>> getExamCreators();
}
