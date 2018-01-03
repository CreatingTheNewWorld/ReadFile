public class SortArrays {

	public static void main(String[] args) {
		int arr[][] = { { 2, 1, 5, 0 }, { 8, 7, 4, 3 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int n = 0; n < arr[k].length; n++) {
						if (arr[k][n] > arr[i][j]) {
							int first = arr[k][n];
							int second = arr[i][j];
							arr[k][n] = second;
							arr[i][j] = first;
						}

					}

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");

			}
			System.out.println();

		}
	}
}
