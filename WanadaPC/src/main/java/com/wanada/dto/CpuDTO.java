package com.wanada.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Builder
@Setter
@Getter
@ToString
public class CpuDTO {
	private String CPU_NAME;
 	private String MAKER_CPU;
 	private String INTEL_CPU;
 	private String RYZEN_CPU;
 	private String CPU_IMAGE;
 	private String CPU_PRICE;
 	private String CPU_INFORMATION;
 	private String CPU_DATE;
 	private String CPU_SOCKET;
 	private String CPU_CORE;
 	private String CPU_THREAD;
 	private String CPU_MIN_CIRCUIT;
 	private String CPU_MAX_CIRCUIT;
 	private String CPU_MANUFACTURER;	
}
