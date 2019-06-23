package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Squad {
    private String mName;
    private int mSize;
    private String mReason;
    private static List<Squad> instances = new ArrayList<>();
    private int mId;
    private List <Hero> mHeroes;

    public Squad (String name, int size, String reason){
        this.mName = name;
        this.mSize = size;
        this.mReason = reason;
        this.instances.add(this);
        this.mId = instances.size();
        this.mHeroes = new ArrayList<Hero>();

    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public String getName() {
        return mName;
    }

    public int getSize() {
        return mSize;
    }

    public String getReason() {
        return mReason;
    }

    public int getId() {
        return mId;
    }

    public static Squad find(int id) {
        return instances.get(id-1);
    }
    public List <Hero> getHeroes(){
        return  mHeroes;

    }
}
