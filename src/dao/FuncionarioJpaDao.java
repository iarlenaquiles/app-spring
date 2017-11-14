package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Funcionario;
import util.JPAUtil;

public class FuncionarioJpaDao implements FuncionarioDao {
	EntityManager em = JPAUtil.getEntityManager();
	EntityTransaction tx = em.getTransaction();

	@Override
	public void inserir(Funcionario func) {
		try {
			tx.begin();
			em.persist(func);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void Consulta() {
		Query q = em.createNativeQuery(
				"select f.cidade,f.uf,count(f.matricula) as qtd_func,sum(f.salario) from funcionarios f group by f.cidade, f.uf");
		List<Object[]> l = q.getResultList();

		for (Object[] o : l) {
			System.out.println(o[0] + " " + o[1] + " " + o[2] + " " + o[3]);

		}
	}

}
