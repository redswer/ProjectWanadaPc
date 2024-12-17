package com.wanada.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wanada.dto.BoardDTO;

@Mapper
public interface BoardMapper {
public List<BoardDTO> boardlist();
public int boardupdate(BoardDTO dto);
public int boardinsert(BoardDTO dto);
public BoardDTO boarddetail(int idx);
public int boarddelete(int idx);
public int boardIndex();

public List<BoardDTO> boardListPerson(String person);
}
