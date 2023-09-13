package predefined_functional_example;

 

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

 

public class predicate {

 

	public static void main(String[] args) {

		Predicate<Integer> predicate = num->num%2==0;
		System.out.println(predicate.test(4));

		Predicate<String> predicate1 = str->str.length()>5;
		System.out.println(predicate1.test("Yamini"));

		List<String> names = Arrays.asList("Naresh","Sailu","ABC");
		BiPredicate<String,Integer> bipredicate = (str,length)->length%2==0 && length>5;
		List<String> result = names.stream()
				                   .filter(str->bipredicate.test(str,str.length()))
				                   .collect(Collectors.toList());		
		System.out.println(result);
	}

 

}