package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wanada.dto.BoardDTO;
import com.wanada.mapper.BoardMapper;

public class BoardServicelmpl implements BoardService {
 
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardDTO> boardlist() {
		List<BoardDTO> list=mapper.boardlist();
		return list;
	}

	@Override
	public int boardupdate() {
		int upadate=mapper.boardupdate();
		return upadate;
	}

	@Override
	public int boarddetail() {
		int detail=mapper.boarddetail();
		return 0;
	}

	@Override
	public int boarddelete() {
		int delete=mapper.boarddelete();
		return 0;
	}

	@Override
	public int boardinsert() {
		int insert=mapper.boardinsert();
		return 0;
	}

}
