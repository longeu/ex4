package com.sapo.edu.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public interface Atm {
    void withDraw(Customer customer, BigDecimal amount);//rút tiền//

    void printCurrentMoney();//In tiền hiện tại//

    void deposit(Customer customer, BigDecimal amount);//đặt cọc//

    void displayCustomerInfo(Customer customer);//Hiển thị thông tin khách hàng//
}
