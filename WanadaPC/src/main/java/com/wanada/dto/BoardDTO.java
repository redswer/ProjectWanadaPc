package com.wanada.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private int board_index;
	private String theme;
	private String content;
	private String person;
	private String enterdate;
	private int count;
}
