package com.wanada.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@ToString
public class CaseDTO {
	private String CASE_NAME;
	private String MAKER_CASE;
	private String TYPE_CASE;
	private String SIZE_CASE;
	private String CASE_IMAGE;
 	private String CASE_PRICE;
 	private String CASE_IMFORMATION;

}
