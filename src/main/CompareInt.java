package main;

/*
* Started working on this at 14:37
* Finished on 14:49
* 12m
* */
public class CompareInt {
    private int a;

    public CompareInt(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int compareTo (int otherInteger) {
        return this.a-otherInteger;
    }
}
