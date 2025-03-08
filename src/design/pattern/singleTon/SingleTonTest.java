package design.pattern.singleTon;

public class SingleTonTest {
    static boolean isSingleTone;
    static SingleTonTest getRefSingleTon(){
        if(!isSingleTone)
            return new SingleTonTest();
        return null;
    }

    private SingleTonTest(){

    }
}
