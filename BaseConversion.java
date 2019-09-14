class BaseConversion {

    public static void main(String[] args) {

    }

    public static int value(char c) {
        if (c >= '0' && c <= '9') {
            return (int) c - '0';
        } else if (c >= 'a' && c <= 'z') {
            return (int) c - 'a';
        } else {
            return (int) c - 'A';
        }
    }
}