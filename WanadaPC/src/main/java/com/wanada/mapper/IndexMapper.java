package com.wanada.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wanada.dto.BoardDTO;
import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PcDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.RecommandPcDTO;
import com.wanada.dto.SsdDTO;

@Mapper
public interface IndexMapper {
	public List<IndexBannerDTO> indexBannerList();
	public List<IndexGamePcDTO> indexGamePcList();
	public List<RecommandPcDTO> recommandPcGameList();
	public List<RecommandPcDTO> recommandPcPartsList();
	public List<PcDTO> indexPcList(String category);
	public PcDTO pcDetail(int product_id);
	public CpuDTO cpu(int product_id);
	public CoolerDTO cooler(int product_id);
	public MainBoardDTO mainboard(int product_id);
	public RamDTO ram(int product_id);
	public GpuDTO gpu(int product_id);
	public SsdDTO ssd(int product_id);
	public PowerDTO power(int product_id);
	public CaseDTO pc_case(int product_id);
	
	public List<BoardDTO> indexBoardList();
	public IndexBannerDTO etcPC(String category);
	public IndexGamePcDTO gamePC(String category);
	
	public List<BoardDTO> searchBoard(String text);
	
	public List<CaseDTO> searchCase(String text);
	public List<CoolerDTO> searchCooler(String text);
	public List<CpuDTO> searchCpu(String text);
	public List<GpuDTO> searchGpu(String text);
	public List<HddDTO> searchHdd(String text);
	public List<MainBoardDTO> searchMainBoard(String text);
	public List<PowerDTO> searchPower(String text);
	public List<RamDTO> searchRam(String text);
	public List<SsdDTO> searchSsd(String text);
}
