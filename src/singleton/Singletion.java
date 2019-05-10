package singleton;

public class Singletion {
    private static Singletion singletion = null;
    private Singletion(){

    }
    public static Singletion getSingletion(){
        if(singletion==null){
            singletion = new Singletion();
        }
        return singletion;
    }

}
