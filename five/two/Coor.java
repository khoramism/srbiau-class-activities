package two;

public class Coor<first, sec, third> implements Clonable {
    public first name;
    public second age;
    public third Id;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
}