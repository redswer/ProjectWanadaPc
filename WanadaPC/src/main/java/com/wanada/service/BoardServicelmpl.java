package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.wanada.dto.BoardDTO;
import com.wanada.mapper.BoardMapper;

@Service
@Primary
public class BoardServicelmpl implements BoardService {
 
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardDTO> boardlist() {
		List<BoardDTO> list=mapper.boardlist();
		return list;
	}

	@Override
	public int boardupdate(int idx) {
		int update=mapper.boardupdate(idx);
		return update;
	}

	@Override
	public BoardDTO boarddetail(int idx) {
		BoardDTO detail=mapper.boarddetail(idx);
		return detail;
	}

	@Override
	public int boarddelete(int idx) {
		int delete=mapper.boarddelete(idx);
		return delete;
	}

	@Override
	public int boardinsert(BoardDTO dto) {
		int insert=mapper.boardinsert(dto);
		return insert;
	}

	   @Override
	   public List<BoardDTO> boardListPerson(String person) {
	      List<BoardDTO> list = mapper.boardListPerson(person);
	      
	      return list;
	   }
}
