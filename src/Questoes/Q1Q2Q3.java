package Questoes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import dao.FuncionarioDao;
import dao.FuncionarioJpaDao;
import dao.FuncionarioMongoDao;
import model.Funcionario;

public class Q1Q2Q3 {
	public static void main(String[] args) throws IOException {
		FuncionarioDao dao = new FuncionarioJpaDao();
		FuncionarioDao daoMongo = new FuncionarioMongoDao();
		
		String homeDir = System.getProperty("user.home");
		
		InputStream is = new FileInputStream(homeDir+"/funcionarios.csv");
		Scanner entrada = new Scanner(is);
		
		while (entrada.hasNextLine()) {
			String[] linha = entrada.nextLine().split(",");
			dao.inserir(new Funcionario(Integer.parseInt(linha[0]), linha[1], linha[2], linha[3], linha[4],
					Double.parseDouble(linha[5])));
			daoMongo.inserir(new Funcionario(Integer.parseInt(linha[0]), linha[1], linha[2], linha[3], linha[4],
					Double.parseDouble(linha[5])));
		}

		is.close();
	}
}
