public interface Food {
    double quantity    = 15.83;
    double temparature = 65.222;

    void taste ( );

    void energy ( );
}

abstract class Food1 implements Food {
    @Override
    public void taste ( ) {
        System.out.println( "Sweet" );
    }
}

class Food2 extends Food1 {
    @Override
    public void energy ( ) {
        System.out.println( "820 Calories" );
    }
}

class Food3 implements Food {
    @Override
    public void taste ( ) {
        System.out.println( "Hot" );
    }

    @Override
    public void energy ( ) {
        System.out.println( "1020 Calories" );
    }
}