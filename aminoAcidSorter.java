import java.util.ArrayList;

public class aminoAcidSorter extends bubblesort{
	
	public static void main(String[] args){

 String aminoAcidCodes = "MNGTEGPNFYVPFSNKTGVVRSPFEAPQYYLAEPWQFSMLAAYMFLLIMLGFPINFLTLYVTVQHKKLRTPLNYILLNLAVADLFMVFGGFTTTLYTSLHGYFVFGPTGCNLEGFFATLGGEIALWSLVVLAIERYVVVCKPMSNFRFGENHAIMGVAFTWVMALACAAPPLVGWSRYIPEGMQCSCGIDYYTPHEETNNESFVIYMFVVHFIIPLIVIFFCYGQLVFTVKEAAAQQQESATTQKAEKEVTRMVIIMVIAFLICWLPYAGVAFYIFTHQGSDFGPIFMTIPAFFAKTSAVYNPVIYIMMNKQFRNCMVTTLCCGKNPLGDDEASTTVSKTETSQVAPA";
 String[] storage = aminoAcidCodes.split("");
 ArrayList<Integer> counting = new ArrayList<Integer>();
 ArrayList<String> label = new ArrayList<String>();
 int count = 0;
 for(int i = 0; i < aminoAcidCodes.length()-1; i++){
	 storage = sortStringBubble(storage);
	  count++;
	 if(i == aminoAcidCodes.length()-2){
		 counting.add(count);
		 label.add(storage[i]);
	 }
	 if(!(storage[i].equals(storage[i+1]))){
		 counting.add(count);
		 label.add(storage[i]);
		 count = 0;
	 }
 }
 int sum = 0;
	for(int j = 0; j < counting.size()-1; j++){
		sum += (int)counting.get(j);
		System.out.println(label.get(j) + " " +counting.get(j));
	}
	System.out.println("Y " + (aminoAcidCodes.length()-sum));
}
	
	
	  public static String[] sortStringBubble( String x[]){
            int j;
            boolean flag = true;
            String temp;
            while (flag){
            flag=false;
             for (j = 0;  j< x.length- 1;j++ ){
              if(x[j].compareToIgnoreCase(x[j+1])>0){                                            
                       temp=x[j];
                       x[j]=x[j+1];    
                       x[j+1]=temp; 
                       flag = true;
                           } 
                   } 
            }
			return x; 
      } 
	}

