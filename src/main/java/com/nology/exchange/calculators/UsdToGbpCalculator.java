package com.nology.exchange.calculators;
public class UsdToGbpCalculator implements ExchangeRateCalculator {

    private double exchangeRate = 0.82;

    @Override
    public String fromCurrency() {
        return USD;
    }

    @Override
    public String toCurrency() {
        return GBP;
    }

    @Override
    public double calculate(double fromAmount) {
        return fromAmount * exchangeRate;
    }

    @Override
    public double getExchangeRate() {
        return this.exchangeRate;
    }
}

