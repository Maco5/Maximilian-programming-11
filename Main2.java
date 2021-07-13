public class Main2 {
    public static void main(String[] args) {
        String name= "Hello";
        for (int i=0;i<name.length();i++){
            if (i==name.length()-1){
                System.out.println(name.substring(i,i+1)+name+"\bay");
            }
        }
        System.out.println(name);
        }
}