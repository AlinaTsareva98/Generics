import java.util.ArrayList;

public class Gen <T> {
    private T tt;
    public Gen (T t) {
        tt=t;
    }
    @Override
    public String toString (){
        return tt.toString();
    }
}
