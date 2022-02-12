package com.test1.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test1.db.beens.ExamCreators;

@Repository
public interface ExamCreatorsRepository extends JpaRepository<ExamCreators, Long> {

	List<ExamCreators> findByCreatorName(String creatorName);

	ExamCreators findById(long id);
	
}
