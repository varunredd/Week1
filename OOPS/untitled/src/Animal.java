public class Animal {
    double height;
    double weight;
    String category;

    public void moveOn ( ) {
        System.out.println( "Move On" );
    }

    public void sound ( ) {
        System.out.println( "Sounds" );
    }

}

class Dog extends Animal {
    @Override
    public void sound ( ) {
        System.out.println( "Bark" );
    }
}