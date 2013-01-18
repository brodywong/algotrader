package com.algotrader.domain;

import java.math.BigDecimal;
import java.util.List;

public class Stock {
	private Long stockId ;
	private String ticker ;
	private String name ;
	private Double open ;
	private BigDecimal marketCap ;
	private List<ClosePrice> closePrices ;
	private Range fifityTwoWkRange ;
	private Range dayRange ;
	private BigDecimal volme ;
	private BigDecimal avg3MonthVolume ;
	private Double EPS ;
	
}
