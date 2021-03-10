package org.example.sourceClass;

import java.util.ArrayList;


public class Head {

    public ArrayList<OrgansOfTheHead> organHead= new ArrayList<OrgansOfTheHead>();

    public Head(String healthy){
        organHead.add(new Brain(healthy));
        organHead.add(new Nose());
        organHead.add(new Mouth());
        organHead.add(new Ear());
    }

}
