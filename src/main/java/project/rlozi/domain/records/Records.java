package project.rlozi.domain.records;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@NoArgsConstructor
@Entity

public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    private String start_time;

    private String end_time;

    private String spend_time;

    private Long task_id_ref;
    private Long user_id_ref;

    @Column(length = 500, nullable = false)
    private String content;

    private LocalDateTime reg_date;

    private LocalDateTime mod_date;

    @Builder
    public Records(String title, String start_time, String end_date, String spend_time, Long task_id_ref, Long user_id_ref, LocalDateTime reg_date) {
        this.title = title;
        this.start_time = start_time;
        this.task_id_ref = task_id_ref;
        this.user_id_ref = user_id_ref;




    }



}
