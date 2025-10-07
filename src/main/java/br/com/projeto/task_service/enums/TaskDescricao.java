package br.com.projeto.task_service.enums;

public enum TaskDescricao {

    HIGH("BAIXO"),
    MEDIUM("MEDIO"),
    LOW("ALTO");

    private final String descricao;

    TaskDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
