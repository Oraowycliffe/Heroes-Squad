package models;

import java.util.ArrayList;
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

}
