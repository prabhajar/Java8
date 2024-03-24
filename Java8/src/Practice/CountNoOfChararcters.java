package Practice;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfChararcters {
	public static void main(String[] args) {
		String str = "Prabhakar"; // output = "a7b2c1d2f2f1g1"
		String charcount = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.map(x->x.getKey()+x.getValue())
		.collect(Collectors.joining(" "));
		System.out.println(charcount);
		

}}
