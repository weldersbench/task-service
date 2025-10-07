package br.com.projeto.task_service.model;

import br.com.projeto.task_service.enums.TaskDescricao;
import br.com.projeto.task_service.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_id_seq")
    @SequenceGenerator(name = "task_id_seq", sequenceName = "task_id_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;
    @Enumerated(EnumType.STRING)
    private TaskDescricao descricao;
    private LocalDate dataDeNascimento;
    @Column(nullable = false)
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    @Column(nullable = false)
    private Long usuarioId;

}
