package com.pxp.SQLite.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxp.SQLite.demo.entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long>  {

	List<LoanApplication> findByUserId(String userId);

	LoanApplication findByApplicationId(Long applicationId);
}
