package com.nt.service;

import com.nt.entity.JobSeeker;

public interface IJobSeekerMgmtService {
public Iterable<JobSeeker> showAll();
public String registerJobseeker(JobSeeker jsinfo);
public JobSeeker jsFindByid(int id);
public String updatejsByid(JobSeeker js);
public String deletejsbyId(int id);
}
