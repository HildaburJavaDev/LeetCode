package medium;

import java.util.Arrays;

// task № 274

public class H_Index {
	public static void main(String[] args) {
		System.out.println(hIndex(new int[] { 0 }));
	}

	public static int hIndex(int[] citations) {
		Arrays.sort(citations);
		int length = citations.length;
		int hIndex = 1;
		for (int i = length - 1; i >= 0; i--) {
			if (citations[i] < hIndex)
				return hIndex - 1;
			hIndex++;
		}
		return hIndex > citations.length ? citations.length : hIndex;
	}
}
