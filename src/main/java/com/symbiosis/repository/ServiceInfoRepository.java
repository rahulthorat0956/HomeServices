package com.symbiosis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.model.ServiceInfo;

@Repository
public interface ServiceInfoRepository extends JpaRepository<ServiceInfo, Integer>{

}
