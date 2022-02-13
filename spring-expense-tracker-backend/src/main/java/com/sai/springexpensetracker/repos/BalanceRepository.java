package com.sai.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
