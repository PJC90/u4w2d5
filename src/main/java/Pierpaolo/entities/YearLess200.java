package Pierpaolo.entities;

public class YearLess200 extends RuntimeException{
    public YearLess200(int anno){
        super(anno + " <------- è prima del 2000, troppo OLD!!!");
    }
}
