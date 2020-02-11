package org.liuyu.entity;

public class Peoplecard {
    private Integer cardid;

    private String cardinfo;

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public String getCardinfo() {
        return cardinfo;
    }

    public void setCardinfo(String cardinfo) {
        this.cardinfo = cardinfo == null ? null : cardinfo.trim();
    }
}