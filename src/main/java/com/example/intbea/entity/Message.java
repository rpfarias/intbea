package com.example.intbea.entity;

public class Message {

    private String msg;
    private String prefixo;

    public Message(String msg, String prefixo) {
        this.msg = msg;
        this.prefixo = prefixo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
}
