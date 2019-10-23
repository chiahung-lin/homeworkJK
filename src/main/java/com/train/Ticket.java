package com.train;

public class Ticket {

    int ticketSum = 0;
    int rtSum = 0;
    public Ticket(){

    }
    public Ticket(int ticketSum,int rtSum){
        //V2使用
        this.ticketSum = ticketSum;
        this.rtSum = rtSum;
    }
    public int moneySumV1(int ticketSum,int rtSum){
        return (ticketSum-rtSum)*1000+rtSum*1800;
    }
    public String moneySumV2(){
        if (ticketSum<rtSum){
            return new String("Input error ticket numbers!!");
        }
        return Integer.toString(((ticketSum - rtSum) * 1000 + rtSum * 1800));
    }

}
