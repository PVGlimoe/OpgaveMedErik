package test;

public class Tennisball extends Ball{

    public Tennisball(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean isTennisball() {
        return true;
    }
}
