package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String mName;
    private int mAge;
    private String mStrength;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int mId;

    public Hero(String name , int age, String strength, String weakness){
        this.mName = name;
        this.mAge = age;
        this.mStrength = strength;
        this.mWeakness = weakness;
        this.instances.add(this);
        this.mId = instances.size();
    }
    public String getName(){
        return mName;
    }
}
