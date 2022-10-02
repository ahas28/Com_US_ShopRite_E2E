package My_Automation_Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicate {
	
	//removing duplicate by using inbuilt methods. 
	
	public static void main(String[] args) {
		
		List<Object> num = new ArrayList<>(); 
		
		num.add(23);
		num.add(23); //remove duplicate 1
		num.add(34);
		num.add(45);
		num.add(77);
		num.add(23); //remove duplicate 2
		num.add(null);
		num.add("Hash");
		num.add("Bankim");
		num.add("Islam");
		num.add("Islam"); //remove duplicate Islam
		num.add(null); //remove duplicate null
		num.add(null); //remove duplicate null 
		num.add(null);
		
												//remove duplicate
		List<Object> MyNumbers = num.stream().distinct().collect(Collectors.toList());
		System.out.println(MyNumbers);
	}

}
