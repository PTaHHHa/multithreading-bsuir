import java.util.logging.*;

class CashBox3 extends Thread {
    static public double tt3;
    static public int client3=0;

    @Override

    public void run() {
        while(Main.kol>0){
            if(tt3!=44.79999999999999 && tt3!=99.59999999999995 && tt3!=144.39999999999998
                    && tt3!=189.20000000000016 && tt3!=234 && tt3!=278.8){
                Main.kol--;
                tt3 += Main.t3;
                client3++;
                System.out.print("\nПОТОК 3 ОБСЛУЖИЛ "+client3+" ОСТАЛОСЬ "+Main.kol);
                try {
                    sleep((long)(Main.t3*100));
                } catch (InterruptedException ex) {
                    Logger.getLogger(CashBox2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                System.out.print("\n3ИЙ УШЁЛ НА ПЕРЕРЫВ");
                tt3+=10.0;
                try{
                    sleep((long)(1000));
                }catch(InterruptedException e){}
            }

        }


        System.out.println("\nКасса 3: "+tt3+" мин, "+client3+" чел");
    }
} 