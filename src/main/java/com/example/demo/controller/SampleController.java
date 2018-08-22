package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.MemberVO;
import com.example.demo.mapper.MemberMapper;
 
@Controller
@EnableAutoConfiguration
public class SampleController {
	@Autowired
    private MemberMapper mapper;
	
/*	@RequestMapping(value="/")
    @ResponseBody
    public String sampleHome() throws Exception {
        
		List<MemberVO> list = mapper.selectMemberList();
        
        for(int i=0; i<list.size(); i++){
            System.out.println("name : " + list.get(i).getName());
            System.out.println("team : " + list.get(i).getTeam());
        }        
        
        return "Hello World!";
        
    }*/
	
	@RequestMapping(value="/test")
    @ResponseBody
    public List<MemberVO> sampleHomeTest() throws Exception {
		return mapper.selectMemberList();
    }
	
	@RequestMapping(value="/jsp")
    public String sampleHomeJsp(){
		return "home"; 
    }
}
