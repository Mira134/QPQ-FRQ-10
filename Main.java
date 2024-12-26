public int findMissingNumber(int[] arr){
    int sum = 0;

    for(int num : arr){
        sum += num;
    }

    int expectedSum = arr.length * (arr.length + 1) / 2;

    return expectedSum - sum;
}