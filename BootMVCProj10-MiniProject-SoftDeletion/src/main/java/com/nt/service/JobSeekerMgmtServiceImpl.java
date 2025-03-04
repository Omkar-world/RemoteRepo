package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepositroy;
@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private IJobSeekerRepositroy jsRepo;
	@Override
	public Iterable<JobSeeker> showAll(){
		Iterable<JobSeeker> list=jsRepo.findAll();
		List<JobSeeker> list1 = StreamSupport.stream(list.spliterator(), true)
                .sorted((n1, n2) -> n1.getJsname().compareTo(n2.getJsname()))
                .collect(Collectors.toList());		
		return list1;
	}
	@Override
	public String registerJobseeker(JobSeeker jsinfo) {
		int idVal=jsRepo.save(jsinfo).getJsid();
		
		return "JobSeeker is registered with idVal:"+idVal;
	}
	@Override
	public JobSeeker jsFindByid(int id) {
	JobSeeker js= jsRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
	return js;
	}
	@Override
	public String updatejsByid(JobSeeker js) {
		Optional<JobSeeker> opt=jsRepo.findById(js.getJsid());
		if(opt.isPresent()) {
			JobSeeker info=opt.get();
			info.setJsadress(js.getJsadress());
			info.setJsname(js.getJsname());
			info.setJspercentage(js.getJspercentage());
			jsRepo.save(info);
			return js.getJsid()+" JobSeeker details are updated";
		}
		return js.getJsid()+" JobSeeker Details are not updeted";
	}
	@Override
	public String deletejsbyId(int id) {
		Optional<JobSeeker> opt=jsRepo.findById(id);
		if(opt.isPresent()) {
			JobSeeker js=opt.get();
			jsRepo.deleteById(id);
			return id+" JobSeeker is deleted";
		}
		return id+" JobSeeker not deleted";
		
	}

}
