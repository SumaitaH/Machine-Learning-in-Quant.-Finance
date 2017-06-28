import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GMM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csvFile = "/Users/Syeeda/Documents/workspace/ProfitValue/src/testData.txt";
		BufferedReader br = null; 
        String line = "";
        String cvsSplitBy = ",";
        try {

            br = new BufferedReader(new FileReader(csvFile));
            br.readLine(); 
            while ((line = br.readLine()) != null) {

                // use comma as separator
//                String[] data = line.split(cvsSplitBy);
//                if(data[1].contentEquals(data[2])){
//                	portValue++; 
//                	System.out.println("Portfolio Value: , " + portValue);
//                	iterator++;
//                }
//                else{
//                	portValue--; 
//                	System.out.println("Portfolio Value: , " + portValue);
//                	iterator++;
//                }
//                String dateYear = data[0].substring(0, 4);
//                try{
//                int yearUsed = Integer.valueOf(dateYear);
//                if (yearUsed == year && data[1].contentEquals("Positive")){
//                	portValue++;
//                	System.out.println("Date: " + data[0] + " , Portfolio Value: , " + portValue);
//                	iterator++; 
//                }
//                else if (yearUsed == year && data[1].contentEquals("Negative")){
//                	portValue--; 
//                	System.out.println("Date: " + data[0] + " , Portfolio Value: , " + portValue);
//                	iterator++; 
//                }
//                } catch(NumberFormatException e) {}
//                		
//            }}

            }} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
