public class Pattern {

    public static void main(String[] args) {
       for (int i = 1; i<10; i++){
            for (int j=1; j<10-i; j++){
                System.out.print(" ");
            }
            for (int k = 0;k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a=1;a<10;a++){
            for (int c=10; c<10-a; c--){
                System.out.print("-");
            }

            for (int b = 0 ;b<2*10-2*a-1; b++){
                System.out.print("*");
            }


            System.out.println();
        }

    }


}
