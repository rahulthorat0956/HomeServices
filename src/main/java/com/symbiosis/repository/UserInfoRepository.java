package com.symbiosis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

}
