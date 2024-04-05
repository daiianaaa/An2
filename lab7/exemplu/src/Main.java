import java.util.*;

class  nume<T> {
    public void Print(T data) {
        System.out.println(data.getClass());
    }
}

class Main{
    public static void main(String[] args) {
       nume <Integer> obj=new nume<>();
       obj.Print(10);

       nume <String> obj2=new nume<>();
       obj2.Print(String.valueOf('a'));

    }
}