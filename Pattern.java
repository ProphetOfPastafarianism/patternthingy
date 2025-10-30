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
        while (maxE>=0){
            String e = "e";
            String o = "o";
            System.out.println(e.repeat(maxE+1-maxE));
            maxE--;
        }
    }

        public static void main(String[] args){
            stars(6);
            triangle(5);
            odds(9);
            eo(6);
        }









}