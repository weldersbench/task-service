package br.com.projeto.task_service.dto;

import br.com.projeto.task_service.enums.TaskDescricao;
import br.com.projeto.task_service.enums.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TaskRequestDTO {

    @NotBlank(message = "O título é obrigatório.")
    @Size(max = 100, message = "O título deve ter no máximo 100 caracteres.")
    private String titulo;

    @NotNull(message = "O status é obrigatório.")
    private TaskStatus status;

    @Size(max = 500, message = "A descrição deve ter no máxima 500 caracteres.")
    private String descricaoTarefa;

    private TaskDescricao descricao;

    @NotNull(message = "O ID do usuário responsável é obrigatório.")
    private Long usuarioId;
}
