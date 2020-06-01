package com.teamsavezone.smartcart;


import java.util.Date;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class UserList extends RealmObject {

    //Primary key
    int id;
    //식품명
    String name;
    //구매 일자
    Date current;
    //보관 방법
    int storage;
    //유통기한 만료일 (current + ExpList.expire)
    Date expire;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getCurrent(){
        return current;
    }

    public void setCurrent(Date current){
        this.current = current;
    }

    public int getStorage(){
        return storage;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public Date getExpire(){
        return expire;
    }

    public void setExpire(Date expire){
        this.expire = expire;
    }

    @Override
    public String toString() {
        return "품목명 : " + name +
                ", 구매 일자 : " + current +
                ", 보관 방법 : " + storage +
                ", 유통 기한 : " + expire +
                "\n";
    }
}