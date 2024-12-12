package com.wanada.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class SsdDTO {
	private String SSD_NAME;
	private String MAKER_SSD;
	private String FORM_FACTOR_SSD;
	private String CAPACITY_SSD;
	private String SSD_IMAGE;
 	private String SSD_PRICE;
 	private String SSD_INFORMATION;
 	private String SSD_INTERFACE;
 	private String SSD_CONTROLLER;
 	private String SSD_SEQUENTIAL_READING;
 	private String SSD_SEQUENTIAL_WRITING;
 	private String SSD_READ_IOPS;
 	private String SSD_WRITE_IOPS;
 	private String SSD_SUPPORT_FEATURES;
 	private String RELEASE_YEAR;
}
