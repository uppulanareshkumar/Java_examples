package predefined_functional_example;

 

import java.util.function.Function;

 

public class functional_ex {

 

	public static void main(String args[]){
		Function<String,Integer> function = (str)->str.length();
		System.out.println(function.apply("NARESH"));

		Function<String,String> function1 = (str)->str.toLowerCase();
		System.out.println(function1.apply("NARESH"));
	}
}