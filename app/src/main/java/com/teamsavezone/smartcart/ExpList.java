package com.teamsavezone.smartcart;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ExpList extends RealmObject {
    String name;
    //보관 방법 (0:상온 1:냉장 2:냉동)
    int storage;
    //유통 기한
    Date expire;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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
}