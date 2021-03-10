package org.example.sourceClass;

import java.util.Random;

public class Ear extends OrgansOfTheHead{

    private String earring;

    public Ear(){
        Random rand = new Random();
        final int arraySize[] = {15, 115, 130, 89, 20, 10, 1, 67};
        final String mouthType[] = {"Чёрная", "Тунель", "Золотая", "Дырка в ухе"};

        this.weight = arraySize[rand.nextInt(8)];
        this.earring = mouthType[rand.nextInt(4)];
    }

    public String hear(String kpd){

        if(kpd == "Здоровый") {
            final String[] mouthTypeMessageHear = {"Звуки воды", "Звуки костра", "Звуки леса"};
            Random rand = new Random();

            return mouthTypeMessageHear[rand.nextInt(3)];
        }
        else if(kpd == "Приболел"){
            final String[] mouthTypeMessageHear = {"Звуки чайника", "Звуки таблеток", "Звуки света"};
            Random rand = new Random();

            return mouthTypeMessageHear[rand.nextInt(3)];
        }
        else{
            final String[] mouthTypeMessageHear = {"Крик", "Ааааа", "Лабы?"};
            Random rand = new Random();

            return mouthTypeMessageHear[rand.nextInt(3)];
        }

    }

    public void setParameter(){
        Random rand = new Random();
        final int arraySize[] = {15, 115, 130, 89, 20, 10, 1, 67};
        final String mouthType[] = {"Чёрная", "Тунель", "Золотая", "Дырка в ухе"};

        this.weight = arraySize[rand.nextInt(8)];
        this.earring = mouthType[rand.nextInt(4)];
    }

    public String getEarring(){
        return this.earring;
    }
}
