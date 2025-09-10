import java.util.List;

public class ImmutableList {
    public static void main(String[]args){
        List<String> fruits = List.of("Banana","Apple", "Mango");

         for(int i = 0; i< fruits.size();i++){
            System.out.println(fruits.get(i));
         }
    
    }
}