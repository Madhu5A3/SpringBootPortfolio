package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.robotDAO;
import com.example.demo.robot.Robot;

@Controller
public class robotController {

	@Autowired
	robotDAO rdao;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addRobot") 
	public String addRobot(Robot r) { 
		rdao.save(r);
		return "home.jsp";
     }
	
	@RequestMapping("/getRobot") 
	public ModelAndView getRobot(@RequestParam int rid) { 
		// rdao.save(r);
		ModelAndView mv=new ModelAndView("showRobot.jsp");
		Robot robot=rdao.findById(rid).orElse(new Robot());
		mv.addObject(robot);
		return mv;
		// return "home.jsp";
     }
	
	@RequestMapping("/updateRobot")
	public ModelAndView updateRobot(Robot r) {
		ModelAndView mv = new ModelAndView("updateRobot.jsp");
		// Robot robot=rdao.findById(rid).orElse(new Robot());
		/*
		 * r.setRname(r.getRname()); mv.addObject(r);
		 */
		// System.out.println(r.getRname());
		r.setRname(r.getRname());
		System.out.println(r);
		return mv;
	}
}
