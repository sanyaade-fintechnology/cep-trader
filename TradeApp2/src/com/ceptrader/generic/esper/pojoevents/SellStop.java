package com.ceptrader.generic.esper.pojoevents;


public class SellStop extends TriggeredOrder implements DataItem {
	private static final long	serialVersionUID	= 1L;
	
	@Deprecated
	public SellStop() {
		setSide(Side.SELL);
	}
	
	public SellStop(
	        final int ref,
	        final String ticker,
	        final double level,
	        final int size,
	        final String goodUntil) {
		setSide(Side.SELL);
		this.ref = ref;
		this.ticker = ticker;
		this.level = level;
		this.size = size;
		this.goodUntil = goodUntil;
	}
	
	public SellStop(
	        final int ref,
	        final String ticker,
	        final long timeStamp,
	        final double level,
	        final int size,
	        final String goodUntil) {
		setSide(Side.SELL);
		this.ref = ref;
		this.ticker = ticker;
		this.timeStamp = timeStamp;
		this.level = level;
		this.size = size;
		this.goodUntil = goodUntil;
	}
}