package org.q4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}
