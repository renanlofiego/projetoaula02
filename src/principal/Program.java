package principal;

import java.util.Date;

import entities.Funcao;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario(1, "Renan Lofiego", "333.333.333-33", "12345", 2000.0, new Date());

		Funcao funcao = new Funcao(1, "PROG", "Programador JAVA");

		funcionario.setFuncao(funcao);

		System.out.println("\nDADOS DE FUNCION�RIO:\n");

		System.out.println("ID............: " + funcionario.getId());
		System.out.println("NOME..........: " + funcionario.getNome());
		System.out.println("CPF...........: " + funcionario.getCpf());
		System.out.println("Matricula.....: " + funcionario.getMatricula());
		System.out.println("Sal�rio.......: " + funcionario.getSalario());
		System.out.println("Admiss�o......: " + funcionario.getDataAdmissao());

		System.out.println("ID da Fun��o..: " + funcionario.getFuncao().getId());
		System.out.println("Sigla.........: " + funcionario.getFuncao().getSigla());
		System.out.println("Descri��o.....: " + funcionario.getFuncao().getDescricao());

	}

}
