package model;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;

public class Employee {
    private String employeeId;
    private List<Order> orderList;
    private List<Customer> customersList;
    private Date timeOut;

    public Employee() {
        orderList = new ArrayList<>();
        customersList = new ArrayList<>();
    }

    public Employee(String employeeId, List<Order> orderList, List<Customer> customersList, Date timeOut) {
        this.employeeId = employeeId;
        this.orderList = orderList;
        this.customersList = customersList;
        this.timeOut = timeOut;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customer> customersList) {
        this.customersList = customersList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", orderList=" + orderList +
                ", timeOut=" + timeOut +
                '}';
    }
}
