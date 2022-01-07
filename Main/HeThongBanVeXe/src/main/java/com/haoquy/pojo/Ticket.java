/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.pojo;

/**
 *
 * @author HaoQuy
 */
public class Ticket {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    private int id;
    private int price;
    private String time;
    private String date;
    private Customer cs;
    private Bus bs;
    private Seat st;

    /**
     * @return the cs
     */
    public Customer getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(Customer cs) {
        this.cs = cs;
    }

    /**
     * @return the bs
     */
    public Bus getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(Bus bs) {
        this.bs = bs;
    }

    /**
     * @return the st
     */
    public Seat getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Seat st) {
        this.st = st;
    }
}
