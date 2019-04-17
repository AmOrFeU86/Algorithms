import java.util.ArrayList;
import java.util.List;

class NSA {
	public List<String> bubbleSort(List<String> array) {
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i).compareTo(array.get(j)) < 0) {
					String a = array.get(i);
					String tmp = array.get(j);
					array.set(j, a);
					array.set(i, tmp);
				}
			}
		}
		return array;
	}

	public List<String> calculateAllSuffixes(String input) {
		List<String> suffixes = new ArrayList<String>();
		for (int i = 1; i <= input.length(); i++) {
			suffixes.add(input.substring(input.length() - i, input.length()));
		}
		return suffixes;
	}

	public void printArray(List<String> a) {
		for (String s: a) {
			System.out.println(s);
		}
	}
}

public class NaiveSuffixArray {
	public static void main(String[] args) {
		NSA sa = new NSA();
		List<String> a = sa.calculateAllSuffixes("banana");
		a = sa.bubbleSort(a);
		sa.printArray(a);
	}
}