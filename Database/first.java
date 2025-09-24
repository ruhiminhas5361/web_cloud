public int countTriangleSubstrings(String input1) {
    int count = 0;
    int n = input1.length();

    for (int i = 0; i <= n - 5; i++) {
        char a = input1.charAt(i);
        char b = input1.charAt(i + 1);
        char c = input1.charAt(i + 2);
        char d = input1.charAt(i + 3);
        char e = input1.charAt(i + 4);

        if (a < b && b < c && d < c && e < d) {
            count++;
        }
    }

    return count;
}