package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepositroy extends CrudRepository<JobSeeker, Integer>{

}
