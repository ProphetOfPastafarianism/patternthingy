public class Pattern{

int rows;
int start;
int maxE;
    public static void stars(int rows){
        int i = 0;
        String starstr = "*";
        while (rows>=i){
            System.out.println(starstr.repeat(i));
            i++;
        }
    }
    public static void triangle(int rows){
         int i = 1;
      
        while (rows>=i){
             String tri = ""+i;
            System.out.println(tri.repeat(i));
            i++;
        }
    }
    public static void odds(int start){
        for (int i = start; i>=0; i-=2){
              String startt = ""+i;
            System.out.println(startt.repeat(i));
        }
    }
    public static void eo(int maxE){
        String e = "e";
            String o = "o";
            int i = 0;
    while(i<maxE){
        i++;
        System.out.println(e.repeat(i));
        i++;
        System.out.println(o.repeat(i));
     
    }
    while (i>0) {
        i--;
        System.out.println(e.repeat(i));
      i--;
        System.out.println(o.repeat(i));
       

    }
}
    public static void pyramid(int rows){

    }

        public static void main(String[] args){
            stars(6);
            triangle(5);
            odds(9);
            eo(5);
            pyramid(6);
        }









}