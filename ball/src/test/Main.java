package test;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Ball> getBalls(){
        ArrayList<Ball> balls = new ArrayList<>();
        Football fb = new Football("Select", 3);
        balls.add(fb);
        Tennisball tb = new Tennisball("Tretorn", 2);
        balls.add(tb);
        balls.add(new Football("Wilson", 3));
        balls.add(new Tennisball("Nike", 3));
        balls.add(new Football("Hummel", 4));
        balls.add(new Tennisball("Adidas", 3));
        Football fbFind = new Football("Jakke", 3);
        balls.add(fbFind);

        int i = balls.indexOf(fbFind);


        System.out.println(i);

        System.out.println("Antal bolde = " + balls.size());
        System.out.println(balls);

        return balls;
    }

    public static ArrayList<Integer> getInts(){
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);

        System.out.println(ints);
        int min = Collections.min(ints);
        System.out.println("min= " + min);
        return ints;
    }

    public static void main(String[] args) {

        ArrayList<Ball> balls = getBalls();

        Ball mindsteBold = Collections.min(balls);

        System.out.println(mindsteBold);

        Collections.sort(balls);

        System.out.println(balls);

        for (int i = balls.size() -1; i >= 0 ; i--) {
            Ball b = balls.get(i);
            if (b.isTennisball()){
                balls.remove(i);
            }
        }
        System.out.println("DENNE HER !! " + balls);

        ArrayList<Tennisball> tbList = new ArrayList<>();

        for (Ball b : balls){
                if (b instanceof Tennisball){
                tbList.add((Tennisball) b);
            }
        }



    }
}
