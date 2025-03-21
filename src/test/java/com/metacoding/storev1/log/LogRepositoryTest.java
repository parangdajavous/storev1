package com.metacoding.storev1.log;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import com.metacoding.storev1.log.LogResponse.ListPage;

@Import(LogRepository.class)
@DataJpaTest // em IoC등록
public class LogRepositoryTest {

    @Autowired // DI하는 annotation 새로운 방법
    // DI
    private LogRepository logRepository;

    @Test // 세모버튼 생김
    public void findAllJoinStore_test() { // test할 땐 함수이름_test 매개변수에 아무것도 넣을 수 없다
        List<LogResponse.ListPage> logList = logRepository.findAllJoinStore();
        for (ListPage listPage : logList) {
            System.out.println(listPage);
        }
    }

}
