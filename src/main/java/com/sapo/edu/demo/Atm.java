package com.sapo.edu.demo;



import java.math.BigDecimal;
public interface Atm {
    void withDraw(Customer customer, BigDecimal amount);//rút tiền//

    void printCurrentMoney();//In tiền hiện tại//

    void deposit(Customer customer, BigDecimal amount);//đặt cọc//

    void displayCustomerInfo(Customer customer);//Hiển thị thông tin khách hàng//
}
