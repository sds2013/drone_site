package com.dw.drone.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dw.drone.vo.JoinVO;

//인터페이스는 public 만 가능 private 불가능
@Mapper
public interface MainMapper {

	public int insertUsers(JoinVO vo);
	
}
