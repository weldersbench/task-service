package br.com.projeto.task_service.enums;

public enum TaskStatus {

    TO_DO("A FAZER"),
    IN_PROGRESS("EM ANDAMENTO"),
    DONE("CONCLUIDO"),
    BLOCKED("BLOQUEADO");

    private final String descricao;

    TaskStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
