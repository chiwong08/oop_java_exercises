package com.techreturners.cats;

import javax.naming.InitialContext;

interface Cat {
    public String eat(); // interface method

    public boolean isAsleep();

    public void goToSleep();

    public void wakeUp();

    public String getSetting();

    public int getAverageHeight();
}

abstract class Cats implements Cat {
    protected boolean asleep = false;
    protected String type;
    protected int averageHeight;

    public Cats() {

    }

    public Cats(String type, int height) {
        this.type = type;
        this.averageHeight = height;
    }

    public boolean isAsleep() {
        return this.asleep;
    }

    public void goToSleep() {
        this.asleep = true;
    }

    public void wakeUp() {
        this.asleep = false;
    }

    public String getSetting() {
        return this.type;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }
}

class DomesticCat extends Cats {
    public DomesticCat() {
        super("domestic", 23);
        // this.asleep = false;
        // this.type = "domestic";
        // this.averageHeight = 23;
    }

    public String eat() {
        return ("Purrrrrrr");
    }
}

class LionCat extends Cats {
    
    public LionCat() {
        super("wild", 1100);
        // this.type = "wild";
        // this.averageHeight = 1100;
    }

    public String eat() {
        return ("Roar!!!!");
    }
}

class CheetahCat extends Cats {
    public String eat() {
        return ("Zzzzzzz");
    }
}