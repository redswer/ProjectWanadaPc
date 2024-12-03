package com.wanada.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wanada.dto.BoardDTO;

@Mapper
public interface BoardMapper {
public List<BoardDTO> boardlist();

}
