package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class JobSeekerOpertaionController {
	@Autowired
	private IJobSeekerMgmtService jService;
@GetMapping("/")	
public String showHome() {
	return "welcome";
}

@GetMapping("/report")
public String showReport(Map<String,Object> map) {
	System.out.println("JobSeekerOpertaionController.showReport()");
	//use service
	Iterable<JobSeeker> list=jService.showAll();
	map.put("jslist", list);
	return "show_result";
	}

@GetMapping("/add")
public String showReport1(@ModelAttribute("js")JobSeeker js) {
	System.out.println("JobSeekerOpertaionController.showReport1()");
	//use service
	System.out.println();
	return "js_register_info";
	}


	/*@PostMapping("/add")
	public String showReport2(@ModelAttribute("js") JobSeeker jsInfo,Map<String,Object> map) {
		System.out.println("JobSeekerOpertaionController.showReport2()");
		//use service
		String msg=jService.registerJobseeker(jsInfo);
		attrs.addFlashAttribute("jsMsg",msg);
		return "redirect:report";
		}*/


	/*@PostMapping("/add")
	public String showReport3(@ModelAttribute("js") JobSeeker jsInfo,RedirectAttributes attrs) {
		System.out.println("JobSeekerOpertaionController.showReport2()");
		//use service
		String msg=jService.registerJobseeker(jsInfo);
		attrs.addFlashAttribute("jsMsg",msg);
		return "redirect:report";
		}*/
@PostMapping("/add")
public String showReport3(@ModelAttribute("js") JobSeeker jsInfo,HttpSession ses) {
	System.out.println("JobSeekerOpertaionController.showReport3()");
	//use service
	String msg=jService.registerJobseeker(jsInfo);
	ses.setAttribute("jsMsg",msg);
	return "redirect:report";
	}

@GetMapping("/edit")
public String editReport(@RequestParam Integer id,@ModelAttribute("js") JobSeeker jsi){
	System.out.println("JobSeekerOpertaionController.editReport()");
	JobSeeker jsinfo=jService.jsFindByid(id);
	BeanUtils.copyProperties(jsinfo,jsi);
	return "js_update_form";
	
	}
@PostMapping("/edit")
public String UpdateReport(@ModelAttribute JobSeeker js,RedirectAttributes attrs){
	System.out.println("JobSeekerOpertaionController.UpdateReport()");
	String msg=jService.updatejsByid(js);
	attrs.addFlashAttribute("jsMsg",msg);
	return "redirect:report";
	
	}
@GetMapping("/delete")
public String deleteJS(@RequestParam int id,RedirectAttributes attrs) {
	System.out.println("JobSeekerOpertaionController.deleteJS()");
	String msg=jService.deletejsbyId(id);
	attrs.addFlashAttribute("jsMsg", msg);
	return "redirect:report";
	
}

}
