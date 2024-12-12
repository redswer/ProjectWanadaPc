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
	private String CASE_INFORMATION;
	private String CASE_IMAGE;
	private String STORAGE_DEVICE_SLOT;
	private String PCI_SLOT;
	private String COOLING_FAN;
	private String SIZE_WHD;
	private String SUPPORT_BOARD_SPECIFICATIONS;
	private String RELEASE_YEAR;
	private String CASE_PRICE;
}
