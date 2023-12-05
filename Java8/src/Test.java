import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Test {
	public static void main(String[] args) {
		
		System.out.println("------------	");
		List<Integer> nos = Arrays.asList(1,2,3,4,5,3,5);
		HashSet<Integer> hs= new HashSet<>();
		/*List<Integer>  duplicates= nos.stream()
				.filter(n->!hs.add(n)).collect(Collectors.toList());
		System.out.println(duplicates);*/
		
		for(Integer no: nos) {
			if(nos.contains(no)) {
				
			}else {
				hs.add(no);
			}
			
		}
		System.out.println(hs);
	}

}
