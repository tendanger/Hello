public class Hello {
    public static void main(String[] args){

    System.out.println("Hello World!");

    int [] array = new int [3];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;


    int a = array.length;
    for (int i = 0; i < 3; i++)
        System.out.println(array[i]);
    System.out.println("Length = " + a);
    System.out.println(array);

    }
}
