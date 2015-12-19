package com.sitech.market.service.trading.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.sitech.market.dbo.common.inter.IMkSmplotteryInfo;
import com.sitech.market.service.trading.inter.IHDMAct;
@Path("/hdmact")
public class HDMAct implements IHDMAct{

	private IMkSmplotteryInfo mkSmplotteryInfo;
	
	
	@POST
	@Path("/createSmpLotteryInfo") 
    @Override
    public String createSmpLotteryInfo(String par) {
        System.out.println("hello createSmpLotteryInfo");
        System.out.println("par : "+par);
        mkSmplotteryInfo.getSome(par);
        return "0";
    }
    
	public void setMkSmplotteryInfo(IMkSmplotteryInfo mkSmplotteryInfo) {
		this.mkSmplotteryInfo = mkSmplotteryInfo;
	}
    
}
