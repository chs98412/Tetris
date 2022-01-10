public class threadtest extends Thread {

    // Thread로 동작할 내용을 동작할 메서드
    public void run(){
        // 0.5초 마다 숫자를 하나씩 증가시키고 숫자와 Thread의 이름을 출력한다
        for(int i=0; i<10; i++){
            try{

                Thread.sleep(500);
                System.out.println(getName() + ":" + i);

            }catch(Exception e){

                System.out.println(e.getMessage());

            }

        }
    }
}


