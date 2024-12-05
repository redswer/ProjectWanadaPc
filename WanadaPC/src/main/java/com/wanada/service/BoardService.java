package com.wanada.service;

import java.util.List;


import com.wanada.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardlist();
	public int boardupdate();
	public int boarddetail();
	public int boarddelete();
	public int boardinsert();

}
