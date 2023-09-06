package com.study.boardv2.todo.service;

import com.study.boardv2.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 여러 컨트롤러들이 TodoService 객체를 통해 데이터를 주고받는 구조이기 때문에 TodoSerivce 객체를 하나만 생성한다.
public enum TodoService {
    INSTANCE;
    // INSTANCE 부분이 객체의 개수를 결정하는 부분으로 한 개만 지정되어 있으므로 하나의 객체만을 생성해서 사용한다.
    // 객체 사용 시에는 TodoService.INSTANCE로 사용 가능하다.
    // TodoService.INSTANCE는 항상 하나의 객체만을 가리키는데 이와 같은 패턴을 '싱글톤 패턴'이라고 한다.
    // 싱글톤 패턴? 객체 생성 요청이 여러번 발생하더라도 새롭게 메모리를 할당하여 인스턴스를 만드는 것이 아닌
    // 기존에 생성되어 있던 인스턴스를 참조한다. => 불필요한 메모리 사용 줄인다.

    public void register(TodoDTO todoDTO) {  // 새로운 TodoDTO 객체 받아서 확인
        System.out.println("DEBUG.........." + todoDTO);
    }

    // List 조회
    public List<TodoDTO> getList() {  // 0부터 9까지 10개의 TodoDTO 객체 만들어서 반환
        List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i -> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo..." + i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList());  // TodoDTO 객체를 리스트로 변환

        return todoDTOS;  // 생성된 TodoDTO 객체의 리스트를 반환
    }

    // 샘플용 TodoDTO 객체 생성 후 반환
    public TodoDTO get(Long tno) {
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
