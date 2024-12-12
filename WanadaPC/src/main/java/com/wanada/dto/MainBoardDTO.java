package com.wanada.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class MainBoardDTO {
	private String MB_NAME ;
	private String MAKER_MAINBOARD ;
	private String TYPE_MAINBOARD ;
	private String SOCKET_MAINBOARD ;
	private String MB_IMAGE;
 	private String MB_PRICE;
 	private String MB_INFORMATION;
 	private String MB_FORM_FACTOR;
 	private String MB_SINGLE_POWER;
 	private String MB_MEMORY_TYPE;
 	private String MB_MEMORY_SLOT;
 	private String MB_MEMORY_CAPACITY;
 	private String MB_PCIE_VERSION;
 	private String MB_M2_CONNECTIONS;
 	private String RELEASE_YEAR;
}
