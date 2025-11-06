public class Pattern{
//magnus november 6th 2025 period 7
//declaring my variables
int rows;
int start;
int maxE;
    public static void stars(int rows){
        //Pre-condition: rows must be a number and not negative
          // dont do a super duper long equation as the input number
        //Post-condition: it will print out the rows of stars until it reaches the number you put in.
        int i = 0;
        //make the word to print
        String starstr = "*";
        while (rows>=i){
            System.out.println(starstr.repeat(i));
            i++;
        }
    }
    public static void triangle(int rows){
          //Pre-condition: rows must be a number and not negative
          // dont do a super duper long equation as the input number
        //Post-condition: it will print out the number it is and it will do that the same ammount of times as it is a number until it reaches the number you put in.

         int i = 1;
      
        while (rows>=i){
             String tri = ""+i;
            System.out.println(tri.repeat(i));
            i++;
        }
    }
    public static void odds(int start){
        //Pre-condition: start must be a number and not negative
          // dont do a super duper long equation as the input number
        //Post-condition: it will print out the rows of start until it reaches a number equal or less than 1.
        for (int i = start; i>=0; i-=2){
              String startt = ""+i;
            System.out.println(startt.repeat(i));
        }
    }
    public static void eo(int maxE){
        //Pre-condition: rows must be a number and not negative
          // dont do a super duper long equation as the input number
        //Post-condition: it will print out e and o until it reaches the max number you gave it, then it will go down from there until it reaches 1.
        String e = "o";
            String o = "e";
            int i = 0;
            int ogmaxE=maxE;
    while(i<ogmaxE){
        if (maxE%2==0){
        maxE++;
        i++;
        System.out.println(e.repeat(i));
        }
        if (maxE%2!=0){
        maxE++;
        i++;
        System.out.println(o.repeat(i));
        }
    }
    while (i>0) {
        i--;
        System.out.println(e.repeat(i));
      i--;
        System.out.println(o.repeat(i));
       

    }
}
    public static void pyramid(int rows){
        //Pre-condition: rows must be a number and not negative
          // dont do a super duper long equation as the input number
        //Post-condition: it will print out a pyramid of the numbers given from greatest at the top and least at the bottom
        int x =1;
        int ogrows = rows;
       
        String space = " ";
        while (x<=ogrows){
            String num = ""+(rows);
          int eviltwo=rows*2-1;
            System.out.println((space.repeat(x))+(num.repeat(eviltwo)));
            rows--;
            x++;

        }

    }

        public static void main(String[] args){
            stars(6);
            triangle(7);
            odds(9);
            eo(6);
            pyramid(6);
        }









}