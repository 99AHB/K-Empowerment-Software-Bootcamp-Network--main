class Worker extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("작업 스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadEx {
    public static void main(String[] args) {
        int alphabet = 'a';
        Worker worker = new Worker();
        worker.start();

        for(int i = 0; i<26; i++){
            System.out.println("메인 스레드 : " +(char)alphabet++);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
