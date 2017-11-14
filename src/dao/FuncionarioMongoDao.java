package dao;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import model.Funcionario;

public class FuncionarioMongoDao implements FuncionarioDao {
	MongoClient client = new MongoClient();
	MongoDatabase db = client.getDatabase("prova");
	MongoCollection<Document> col = db.getCollection("persist3");

	@Override
	public void inserir(Funcionario func) {
		String json = "{'matricula' : " + func.getMatricula() + ",'nome' : '" + func.getNome() + "'," + "'email' : '"
				+ func.getEmail() + "', 'cidade':'" + func.getCidade() + "', 'uf':'" + func.getUf() + "', 'salario':"
				+ func.getSalario() + " }";
		Document doc = Document.parse(json);
		col.insertOne(doc);
	}

	@Override
	public void Consulta() {
		Document filter = Document.parse("{},{cidade:true,uf:true}");
		
		for (Document doc : col.find(filter)) {
			System.out.println("Cidade: " + doc.getString("cidade") + " UF: " + doc.getString("uf"));
		}
	}

	//db.persist3.aggregate([{$group:{_id:{cidade:"$cidade", uf:"$uf"}, total_salario:{$sum:"$salario"}, qtd_func:{$sum:1}}}])

}
