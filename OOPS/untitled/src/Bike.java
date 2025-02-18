public class Bike {
    void functionality ( String a, String b ) {
        System.out.println( "Functionality " + a + " " + b );

    }

    void functionality ( String a, String b, String c ) {
        System.out.println( "Functionality " + a + " " + b + " " + c );

    }

    void functionality ( double a, String b ) {
        System.out.println( "Functionality " + b + " " + a );

    }

//    int functionality(String a, String b, String c){
//        return 1;
//    }

}

class RoyalEnfield extends Bike {
    @Override
    void functionality ( String a, String b ) {
        System.out.println( "Functionality Updated " + a + " " + b );
    }
}
