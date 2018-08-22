package com.example.demo.mapper;

import java.util.List;

import com.example.demo.vo.MemberVO;

public interface MemberMapper {
	public List<MemberVO> selectMemberList() throws Exception;
}
