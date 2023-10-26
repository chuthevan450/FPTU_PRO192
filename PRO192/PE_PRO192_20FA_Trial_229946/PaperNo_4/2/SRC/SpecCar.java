
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuth
 */
public class SpecCar extends Car {
    Scanner sc = new Scanner(System.in);
    int type;
    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }   

    

    @Override
    public String toString(){
        return maker+", "+price+", "+type;
    }
    public void setData(){
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(super.getPrice() + 20);
    }
    public int getValue(){
        int inc;
        if(type<7){
            inc = 10;
        }
        else inc = 15;
        return price+inc;
    }
}
