package test;

import java.util.Objects;

public abstract class Ball implements Comparable<Ball> {
    private String name;
    private int size;

    public Ball(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String extraInfo(){
       return this.getClass().getName();
    }

    public boolean isTennisball(){
        return false;
    }


    @Override
    public int compareTo(Ball o) {

         if (o.isTennisball() && !this.isTennisball()){
             return 1;
         } else {
             if (this.isTennisball() && !o.isTennisball()){
                 return -1;
             } else {
                 Integer ii = this.getSize();
                return ii.compareTo(o.getSize());
             }
         }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return size == ball.size &&
                Objects.equals(name, ball.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' + this.extraInfo() +
                ", size=" + size +
                '}';
    }
}
