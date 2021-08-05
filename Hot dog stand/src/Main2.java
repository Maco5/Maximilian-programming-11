public class Main2 {
    public static void main(String[] args){
        System.out.println("Index\t"+"Value");
        int[]integers = new int[6];
        for (int i=1;i<integers.length;i++){
            integers[i]=i*2;
            integers[2]=5;
            integers[1]=3;
            integers[3]=7;
            integers[4]=9;
            System.out.println(i+"\t\t"+integers[i]);
        }
    }
}