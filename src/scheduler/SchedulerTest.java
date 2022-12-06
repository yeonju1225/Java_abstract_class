package scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 82 || ch == 114) {
            scheduler = new RoundRobin();
        } else if(ch == 76 || ch == 108) {
            scheduler = new LeastJob();
        } else if(ch == 81 || ch == 112) {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
