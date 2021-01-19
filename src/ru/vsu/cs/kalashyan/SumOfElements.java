package ru.vsu.cs.kalashyan;

public class SumOfElements {
    public SumOfElements() {
    }

    public int parityPosition(int[] arr) {

        int evenPosition = -1, unevenPosition = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                evenPosition = i;

            } else {

                unevenPosition = i;

            }
        }

        return Solution(arr, evenPosition, unevenPosition);
    }

    private int Solution(int[] arr, int evenPosition, int unevenPosition) {

        int sum = 0;

        if (evenPosition > unevenPosition && evenPosition < arr.length && unevenPosition >= 0) {

            for (int j = unevenPosition + 1; j < evenPosition; j++) {

                sum += arr[j];
            }
        }

        return sum;
    }
}
