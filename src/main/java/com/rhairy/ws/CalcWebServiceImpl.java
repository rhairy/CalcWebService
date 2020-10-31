package com.rhairy.ws;
 
import javax.jws.WebService;
 
@WebService(endpointInterface = "com.rhairy.ws.CalcWebServiceInterface")
public class CalcWebServiceImpl implements CalcWebServiceInterface{

    @Override
    public int add(int a, int b) {
        return a + b;
    }
 
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
 
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
 
    @Override
    public int divide(int a, int b) {
        return a / b;
    } 
}
