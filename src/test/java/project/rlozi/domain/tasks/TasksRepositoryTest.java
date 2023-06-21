package project.rlozi.domain.tasks;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.Builder;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasksRepositoryTest {
    @Autowired
    TasksRepository tasksRepository;

    @After
    public void cleanup() {
        tasksRepository.deleteAll();
    }

    @Test
    public void 할일저장_불러오기() {
        String title = "할일 제목";
        String status = "진행 전";
        long client_id_ref = 1;
        long user_id_ref = 1;

        tasksRepository.save(Tasks.builder()
                .title(title)
                .status(status)
                .client_id_ref(client_id_ref)
                .user_id_ref(user_id_ref)
                .build());

        List<Tasks> tasksList = tasksRepository.findAll();

        Tasks tasks = tasksList.get(0);
        assertThat(tasks.getTitle()).isEqualTo(title);
        assertThat(tasks.getStatus()).isEqualTo(status);
    }
}
