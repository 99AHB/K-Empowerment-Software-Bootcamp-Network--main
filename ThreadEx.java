// 연습문제 2번 답안본 버전
public class ThreadEx {
    public static void main(String[] args) {
        int alphabet = 'a';
        Thread worker = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("작업 스레드 : " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignored) {
            }
        });
        worker.start();
        try {
            while (worker.isAlive()) {
                System.out.println("메인 스레드 : " + (char) alphabet++);
                Thread.sleep(500);
            }
        } catch (InterruptedException ignored) {
        }
    }
}
