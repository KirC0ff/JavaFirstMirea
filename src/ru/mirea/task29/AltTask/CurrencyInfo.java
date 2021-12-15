package ru.mirea.task29.AltTask;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private final Date date;
    private final Map<String, Double> currencies = new HashMap<>();

    public CurrencyInfo(Date date) {
        this.date = date;
    }

    public void addCurrency(String currency, Double value)  {
        if (value >= 0) {
            currencies.put(currency, value);
        } else {
            currencies.put(currency, 0.0);
        }
    }

    public Map<String, Double> getCurrencies() {
        return currencies;
    }

    public Double getExchangeRate(String currency)  {
        return currencies.getOrDefault(currency, 0.0);
    }

    public String toString() {
        return "Информация о валютах\n" +
                "Дата: " + date +
                "\nВалюты:\n" + currencies;
    }
}