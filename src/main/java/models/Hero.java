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
    public int getAge(){
        return mAge;
    }
    public String getStrength(){
        return  mStrength;
    }
    public String getWeakness(){
        return  mWeakness;
    }

    public static List <Hero> all(){
         return instances;
    }
    public static void clear() {
         instances.clear();
    }
    public int getId(){
        return mId;
    }

//    public static Hero find(int id){
//        return instances.get(id-1);
//    }
}
