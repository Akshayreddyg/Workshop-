public class GamblingSimulator {
   
    public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;

    public void GamblingSimulatorUC2(){
        double random_num = Math.random();
        int remg_amt = INITIAL_BET_STAKE;
        if (random_num>0.5){
            remg_amt += BET_AMT;
            System.out.println("The Gambler wins the bet and he has Rs "
                    +remg_amt+ " with him after one bet.");
        }else if (random_num<=0.5){
            remg_amt -= BET_AMT;
            System.out.println("The Gambler loses the bet and he has Rs "
                    +remg_amt+ " with him after one bet.");
        }
    }
  
    public void GamblingSimulatorUC3(){
       int margin_perct=0;
        double uppr_margin = INITIAL_BET_STAKE + margin_perct*INITIAL_BET_STAKE/100;
        double lowr_margin = INITIAL_BET_STAKE - margin_perct*INITIAL_BET_STAKE/100;
        double avail_amt = INITIAL_BET_STAKE;
        
        while ((avail_amt<uppr_margin) && (avail_amt>lowr_margin)){
            double random_num = Math.random();
          
            if (random_num>0.5){
                avail_amt += BET_AMT;
            }else if (random_num<=0.5){
                avail_amt -= BET_AMT;
            }
        }
        System.out.println("The gambler resigns for the day after he has Rs "
                + avail_amt + " with him.");
    }
   
    public void GamblingSimulatorUC4(){
        int NO_OF_BETS = 100;
        double uppr_margin = 0.5*INITIAL_BET_STAKE;
        double lowr_margin = -0.5*INITIAL_BET_STAKE;
        double tot_amt_won_lost = 0;

        for (int i=0;i<20;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;

            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;

                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
            tot_amt_won_lost += daily_amt_won_lost;
        }

        if (tot_amt_won_lost>0){
            System.out.println("The total amount won in 20 days = "+ tot_amt_won_lost);
        }
        else if (tot_amt_won_lost==0){
            System.out.println("There is no net gain in last 20 days");
        }
        else if (tot_amt_won_lost<0){
            System.out.println("The total amount lost in last 20 days = "+ Math.abs(tot_amt_won_lost));
        }
    }
  
    public void GamblingSimulatorUC5(){
        int NO_OF_BETS = 100;
        double uppr_margin = 0.5*INITIAL_BET_STAKE;
        double lowr_margin = -0.5*INITIAL_BET_STAKE;
        double tot_amt_won_lost = 0;
        
        for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;

            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;
                
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }

            if (daily_amt_won_lost>0){
                System.out.println("The amount won on day "+ i + " = Rs "+daily_amt_won_lost);
            }
            else if (daily_amt_won_lost==0){
                System.out.println("There is no net gain or loss on day "+ i);
            }
            else if (daily_amt_won_lost<0){
                System.out.println("The amount lost on day "+ i + " = Rs " + Math.abs(daily_amt_won_lost));
            }
        }
    }

    public void GamblingSimulatorUC6(){
        
        int NO_OF_BETS = 100;
        double uppr_margin = 0.5*INITIAL_BET_STAKE;
        double lowr_margin = -0.5*INITIAL_BET_STAKE;
        int luck_day = 0;
        double luck_day_amt = 0;
        int unluck_day = 0;
        double unluck_day_amt = 0;
        
        for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;

            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;
               
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
          
            if (luck_day_amt<daily_amt_won_lost){
                luck_day_amt = daily_amt_won_lost;
                luck_day = i;
            }
            
            if (unluck_day_amt>daily_amt_won_lost){
                unluck_day_amt = daily_amt_won_lost;
                unluck_day = i;
            }
        }
       
        System.out.println("The luckiest day for gambler is "+ luck_day +
                "th day, on which he won Rs "+luck_day_amt);
        System.out.println(" And the unluckiest day for gambler is "+ unluck_day +
                "th day, on which he lost Rs "+Math.abs(unluck_day_amt));
    }
   
    public void GamblingSimulatorUC7(){
        
        int NO_OF_BETS = 100;
        double uppr_margin = 0.5*INITIAL_BET_STAKE;
        double lowr_margin = -0.5*INITIAL_BET_STAKE;
        double tot_amt_won_lost = 0;

         for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;
             
            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;

                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
            tot_amt_won_lost += daily_amt_won_lost;
        }

        /
        if (tot_amt_won_lost>0){
           
            double random_num1 = Math.random();

             if (random_num1>0.5){
                System.out.println("The gambler has won Rs "+ tot_amt_won_lost+
                        " last month and he should play in this month too");
            }
           
            else if (random_num1<=0.5){
                System.out.println("The gambler has won Rs "+ tot_amt_won_lost+
                        " last month and he should stop gambling now.");
            }
        }
      
        else if (tot_amt_won_lost<=0){
            System.out.println("The gambler has lost in last month Rs "
                    + Math.abs(tot_amt_won_lost)+
                    " and to avoid further losses he should stop playing now.");
        }
    }

    public static void main(String []args){
        GamblingSimulator gs2 = new GamblingSimulator();
        gs2.GamblingSimulatorUC2();
       GamblingSimulator gs3 = new GamblingSimulator();
        gs3.GamblingSimulatorUC3();
        GamblingSimulator gs4 = new GamblingSimulator();
        gs4.GamblingSimulatorUC4();
        GamblingSimulator gs5 = new GamblingSimulator();
        gs5.GamblingSimulatorUC5();
        GamblingSimulator gs6 = new GamblingSimulator();
        gs6.GamblingSimulatorUC6();
        GamblingSimulator gs7 = new GamblingSimulator();
        gs7.GamblingSimulatorUC7();

    }
}
