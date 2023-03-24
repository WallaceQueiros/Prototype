package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Professor professor = new Professor(123, "Professor Original", new Escola("CENEC", 1), "Paracambi");

        Professor professorClone = professor.clone();
        professorClone.setMatricula(456);
        professorClone.setNome("Professor Clonado");
        professorClone.getEscola().setNumero(2);

        assertEquals("Professor{matricula=123, nome='Professor Original', escola=Escola{logradouro='CENEC', numero=1}, formacao='Paracambi'}", professor.toString());
        assertEquals("Professor{matricula=456, nome='Professor Clonado', escola=Escola{logradouro='CENEC', numero=2}, formacao='Paracambi'}", professorClone.toString());
    }

}