package com.nology.exchange.calculators;

public class GbpToUsdCalculator implements ExchangeRateCalculator {

    private double exchangeRate = 1.22;

    @Override
    public String fromCurrency() {
        return GBP;
    }

    @Override
    public String toCurrency() {
        return USD;
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
