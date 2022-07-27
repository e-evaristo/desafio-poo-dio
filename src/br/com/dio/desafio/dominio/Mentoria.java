package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private final DateTimeFormatter formatter;
    public Mentoria() {
        super();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MENTORIA: " + getTitulo() + " - '" + getDescricao() + "' - Data: " + data.format(formatter);
    }
}
