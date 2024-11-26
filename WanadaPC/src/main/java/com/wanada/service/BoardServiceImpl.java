package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.BoardDTO;
import com.wanada.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper mapper;
	
@Override
public List<BoardDTO> boardlist() {
	List<BoardDTO> list=mapper.boardlist();
	return list;
}
}
