
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//interface call other children that implements the listeners fnxs
/**
 *
 * @author Muiz
 */
public class Loop_Exec implements Runnable{
   public int loop_iteration;
   public On_RunListener on_run_listener = null;
    public int getLoop_iteration() {
        return loop_iteration;
    }

    public void setLoop_iteration(int loop_iteration) {
        this.loop_iteration = loop_iteration;
    }

    public Loop_Exec(int loop_iteration) {
        this.loop_iteration = loop_iteration;
    }

    public Loop_Exec() {
        loop_iteration = 0;
    }
  
//   public int run_Loop(int loop_number){
//    this.loop_iteration = loop_number;
//    r
//   }
   
   @Override
   public void run()
   {
       String result = "";
        for (int i = 0; i < loop_iteration; i++) {
            result += "loop "+i +'\n';
        }
       System.out.println("The thread is running");
       System.out.println(""+result);
       
       on_run_listener.on_Finish(result);
//       if (on_run_listener!=null) {
//           on_run_listener.on_Finish(result);
//       }
   }
   
   
//   interface guys    
    public interface On_RunListener{
        public void on_Finish(String result);
    }
    
    public void set_On_Finish_Listener(On_RunListener onr){
        this.on_run_listener = onr;
    }
}

