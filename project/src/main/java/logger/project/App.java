package logger.project;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.info("Select an option that you want to do : ");
    	logger.info("1.Calculating Interests"+"\n"+"2.Estimating Construction Cost");
    	Scanner in = new Scanner(System.in);
    	int op = in.nextInt();
    	if(op == 1) {
            Logger_interest interestObject = new Logger_interest();
            System.out.print("Enter principle : ");
            float principle = in.nextFloat();
            System.out.print("Enter rate of interest : ");
            int rate = in.nextInt();
            System.out.print("Enter time in years : ");
            int timeInYears = in.nextInt();
            logger.info("Simple Interest : " + interestObject.simpleInterest(principle,timeInYears,rate));
            System.out.printf("Compound Interest : %.2f",interestObject.compoundInterest(principle,timeInYears,rate));
    	}
    	else if(op == 2) {
    		logger.info("Select a type of material  standard : "+"\n"+"1.standard materials"+"\n"+"2.above standard materials"+"\n"+"3.high standard material"+"\n"+"4.high standard material and fully\r\n" + 
    				"automated home");
    		int type = in.nextInt();
    		logger.info("Enter Area : ");
    		int area = in.nextInt();
    		Logger_Estimation estimationObject = new Logger_Estimation(type,area);
    		logger.info("Your estimated cost is "+estimationObject.costEstimation());
    	}
    	else {
    		logger.info("Invalid option");
    	}
    	in.close();
    }
}

