class thr6 {
    public static void main(String[] args) {
        System.out.println("NI DEKHENGE");
        Thread t1 = new Thread(() -> {
            System.out.println("hello");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("hiiii");

        });
        t1.start();
        t2.start();
    }
}

