package com.wanada.service;

import java.util.List;


import com.wanada.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardlist();
	public int boardupdate(BoardDTO dto);
	public BoardDTO boarddetail(int idx);
	public int boarddelete(int idx);
	public int boardinsert(BoardDTO dto);
	public int boardIndex();
	public int boardCount(int idx);

	public List<BoardDTO> boardListPerson(String person);
}
