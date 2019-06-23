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
    public void addHero(Hero hero) {
        mHeroes.add(hero);
    }
    public List <Hero> getHeroes(){
        return  mHeroes;

    }

    //Assigning an individual Hero only one squad at a time
    public boolean heroExist(Hero testHero) {
        //place the existence of a hero in a squad as false initially
        boolean exists = false;
        // loop through the Squad and for each instances of the squad , also loop through the heroes
        for(Squad squad: instances){
            for(Hero hero: squad.getHeroes()){
                //once done , check if the name of the Incoming hero is similar to the any of the Hero names given then exists state changes to true
                if (hero.getName().equals(testHero.getName())) {
                    exists = true;
                }
            }
        }
        return exists;
    }

}