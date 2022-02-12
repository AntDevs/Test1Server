package com.test1.db.beens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T010_ExamCreators")
public class ExamCreators {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CreatorID")
	private Long creatorID;

	@Column(name = "CreatorName")
	private String creatorName;

	public Long getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(Long creatorID) {
		this.creatorID = creatorID;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

}
