import java.util.logging.*;

class CashBox1 extends Thread {
    static public double tt1;
    static public int client1;
    @Override

    public void run() {
        while(Main.kol>0){
            if(tt1!=45.0 && tt1!=100.0 && tt1!=155.0 && tt1!=210 && tt1!=265 && tt1!=320){
                Main.kol--;
                tt1 += Main.t1;
                client1++;
                System.out.print("\nПОТОК 1 ОБСЛУЖИЛ "+client1+" ОСТАЛОСЬ "+Main.kol);
                try {
                    sleep((long)(Main.t1*100));
                } catch (InterruptedException ex) {
                    Logger.getLogger(CashBox2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                System.out.print("\n1ЫЙ УШЁЛ НА ПЕРЕРЫВ");
                tt1+=10.0;
                try{
                    sleep((long)(1000));
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

        }


        System.out.println("\nКасса 1: "+tt1+" мин, "+client1+" чел");
    }
} 