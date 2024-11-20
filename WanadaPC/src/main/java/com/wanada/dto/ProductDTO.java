package com.wanada.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {
	CpuDTO CPU;
	MainBoardDTO MB;
	GpuDTO GPU;
	RamDTO RAM;
	CoolerDTO COOLER;
	SsdDTO SSD;
	HddDTO HDD;
	CaseDTO CASE;
	PowerDTO POWER;
	private String image;
    private String title;
    private String price;
}
