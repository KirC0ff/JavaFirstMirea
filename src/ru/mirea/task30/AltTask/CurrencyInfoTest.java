package ru.mirea.task30.AltTask;

import org.junit.Assert;
import ru.mirea.task29.AltTask.CurrencyInfo;

import java.util.Date;

public class CurrencyInfoTest {

    @org.junit.Test
    public void addCurrency() {
        CurrencyInfo currencyInfo = new CurrencyInfo(new Date());
        currencyInfo.addCurrency("RUB", 1.0);
        currencyInfo.addCurrency("USD", 73.47);
        currencyInfo.addCurrency("CHF", 79.62);
        currencyInfo.addCurrency("JPY", 0.64);
        currencyInfo.addCurrency("UAH", 2.72);

        Assert.assertNotNull(currencyInfo.getCurrencies());
    }

    @org.junit.Test
    public void equals() {
        CurrencyInfo currencyInfo1 = new CurrencyInfo(new Date());
        CurrencyInfo currencyInfo2 = new CurrencyInfo(new Date());

        currencyInfo1.addCurrency("KZT", 0.17);
        currencyInfo2.addCurrency("KZT", 0.17);

        Assert.assertEquals(currencyInfo1, currencyInfo2);

        currencyInfo1.addCurrency("Сингапурский доллар", 53.6864);
    }
}
