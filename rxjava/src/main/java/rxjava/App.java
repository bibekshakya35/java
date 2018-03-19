package rxjava;
import io.reactivex.*;
public class App {
    public String getGreeting(){
        return "Hello World";
    }
    public static void main(String[] args){
        Observable.just("Hello World")
                .subscribe(line->System.out.println(line));
    }
}
