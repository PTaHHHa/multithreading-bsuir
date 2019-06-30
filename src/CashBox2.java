import java.util.logging.*;

class CashBox2 extends Thread {
    static public double tt2;
    static public int client2;
    @Override

    public void run() {
        while(Main.kol>0){
            if(tt2!=45.0 && tt2!=100.0 && tt2!=155.0 && tt2!=210 && tt2!=265 && tt2!=320){
                Main.kol--;
                tt2 += Main.t2;
                client2++;
                System.out.print("\nПОТОК 2 ОБСЛУЖИЛ "+client2+" ОСТАЛОСЬ "+Main.kol);
                try {
                    sleep((long)(Main.t2*100));
                } catch (InterruptedException ex) {
                    Logger.getLogger(CashBox2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                System.out.print("\n2ОЙ УШЁЛ НА ПЕРЕРЫВ");
                tt2+=10.0;
                try{
                    sleep((long)(1000));
                }catch(InterruptedException e){}
            }

        }


        System.out.println("\nКасса 2: "+tt2+" мин, "+client2+" чел");
    }
} 