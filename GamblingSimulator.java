public class GamblingSimulator{
 public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;
	
	public static void main(String[] args){

       public void gamblingSituationProblemUC2(){
        double random_num = Math.random();
        int remg_amt = INITIAL_BET_STAKE;
        if (random_num>0.5){
            remg_amt += BET_AMT;
            System.out.println("The Gambler wins the bet and he has $"
            +remg_amt+ " with him after one bet.");
        }else if (random_num<=0.5){
            remg_amt -= BET_AMT;
            System.out.println("The Gambler loses the bet and he has $"
            +remg_amt+ " with him after one bet.");
        } 
      }
    }
}