package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class Ex02 {
	//Viết chương trình tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
	//Nếu tồn tại các ký tự có số lần xuất hiện bằng nhau. In ra các ký tự đó cách nhau bởi dấu
	//phẩy. Yêu cầu chuỗi chỉ gồm các ký tự trong phạm vi [a-zA-Z]
	public static void main(String[] args) {
		String str = "aaaaccdcec";
		
		char[] chArray = str.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for (char ch : chArray) {
			if (countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			} else {
				countMap.put(ch, 1);
			}
			
		}
		final int max = countMap.entrySet().stream()
				.max((entry1, entry2) -> (entry1.getValue() > entry2.getValue() ? 1 : -1))
				.get().getValue();
		Set<Character> characterSet = countMap.entrySet().stream()
						   .filter(entry -> (entry.getValue() == max))
						   .map(Entry::getKey)
						   .collect(Collectors.toSet());
		characterSet.forEach(c -> System.out.print(c +", "));
							
	}
}
