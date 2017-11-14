package Questoes;

import dao.FuncionarioDao;
import dao.FuncionarioJpaDao;
import dao.FuncionarioMongoDao;

public class Q4Q5 {
	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioJpaDao();
		FuncionarioDao dao2 = new FuncionarioMongoDao();
		dao.Consulta();
		dao2.Consulta();
	}
}
