package com.wanada.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class PowerDTO {

	private String POWER_NAME;
	private String MAKER_POWER;
	private String OUTPUT_POWER;
	private String CERTIFICATION_POWER;
	private String POWER_PRICE;
	private String POWER_INFORMATION;
	private String POWER_IMAGE;
	private String POWER_OUTPUT_METHOD;
	private String POWER_PFC_CIRCUIT;
	private String COOLING_FAN_SIZE;
	private String POWER_BEARING;
	private String POWER_AS_INFORMATION;
	private String POWER_SATA;
	private String POWER_PROTECTION_CIRCUIT;
	private String RELEASE_YEAR;
}
