package com.demo.service;

import com.demo.annotation.InTransaction;
import org.springframework.stereotype.Component;

@Component
public class CurrencyServiceImpl implements CurrencyService{
    @Override
    public int changeCurrency(int currency, double rate) {
        return 0;
    }
}
