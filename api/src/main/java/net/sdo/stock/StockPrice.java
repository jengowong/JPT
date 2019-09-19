/*
 * Copyright (c) 2013,2014 Scott Oaks. All rights reserved.
 */

package net.sdo.stock;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 * {@link StockPrice} 某股票 某天 的价格区间
 */
public interface StockPrice {
    String getSymbol();

    Date getDate();

    BigDecimal getClosingPrice();

    BigDecimal getHigh();

    BigDecimal getLow();

    BigDecimal getOpeningPrice();

    boolean isYearHigh();

    boolean isYearLow();

    Collection<? extends StockOptionPrice> getOptions();
}
