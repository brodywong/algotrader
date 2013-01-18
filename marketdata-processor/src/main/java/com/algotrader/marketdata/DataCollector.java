package com.algotrader.marketdata;

import java.util.Date;
import java.util.List;

import com.algotrader.domain.Quote;
import com.algotrader.domain.Stock;

public interface DataCollector {
	public Stock getStockByTicker(String sticker) ;
	public Quote getLatestQuote(Stock stock) ;
	public List<Quote> getAllQuotesAfter(Date date) ;
	
}
