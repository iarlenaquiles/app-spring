package Questoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Funcionario;

public class Q7Json {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("/home/aluno/Documentos/dspersist_ap1_codigo/src/funcionarios.csv");
		Scanner entrada = new Scanner(is);
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ObjectMapper mapper = new ObjectMapper();
		String homeDir = System.getProperty("user.home");

		while (entrada.hasNextLine()) {
			String[] linha = entrada.nextLine().split(",");
			funcionarios.add(new Funcionario(Integer.parseInt(linha[0]), linha[1], linha[2], linha[3], linha[4],
					Double.parseDouble(linha[5])));
			mapper.writeValue(new File(homeDir + "/result.json"), funcionarios);
		}
		is.close();
	}
}
