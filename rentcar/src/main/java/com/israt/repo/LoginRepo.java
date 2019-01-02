package com.israt.repo;


import com.israt.entity.LogIn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<LogIn,Long> {


}
