package com.wanada.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class SsdDTO {
	private String SSD_NAME;
	private String MAKER_SSD;
	private String FORM_FACTOR_SSD;
	private String CAPACITY_SSD;
	private String SSD_IMAGE;
 	private String SSD_PRICE;
 	private String SSD_INFORMATION;
}
