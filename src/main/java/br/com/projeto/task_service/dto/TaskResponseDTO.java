package br.com.projeto.task_service.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class TaskResponseDTO {

    private Long id; // ID gerado pelo banco.
    private String titulo;
    private String descricaoTarefa;

    // Retornamos os enums como string
    private String status;
    private String descricao;

    private Long usuarioId;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private LocalDate dataNascimento;
}
