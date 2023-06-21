package project.rlozi.domain.tasks;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity


public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    private String status;

    private Long client_id_ref;

    private Long user_id_ref;

    private String author;

    private LocalDateTime reg_date;

    private LocalDateTime start_date;

    private LocalDateTime end_date;

    @Builder
    public Tasks (String title, String status, Long client_id_ref, Long user_id_ref) {
        this.title = title;
        this.status = status;
        this.client_id_ref = client_id_ref;
        this.user_id_ref = user_id_ref;
        this.reg_date = LocalDateTime.now();
    }



}
