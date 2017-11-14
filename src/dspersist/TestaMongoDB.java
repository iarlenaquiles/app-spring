package dspersist;

import com.mongodb.MongoClient;

public class TestaMongoDB {
	public static void main(String[] args) {
		MongoClient client = new MongoClient();
		for (String s: client.listDatabaseNames()) {
			System.out.println(s);
		}
	
		client.close();
	}
}
