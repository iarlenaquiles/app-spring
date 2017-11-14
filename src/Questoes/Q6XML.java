package Questoes;

import java.io.IOException;

import org.w3c.dom.Document;

public class Q6XML {
	Document dom;

	public static void main(String[] args) throws IOException {
		
	}

//	private void createDocument() {
//
//		// get an instance of factory
//		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//		try {
//
//			// get an instance of builder
//
//			DocumentBuilder db = dbf.newDocumentBuilder();
//
//			// create an instance of DOM
//
//			dom = db.newDocument();
//
//		} catch (ParserConfigurationException pce) {
//
//			// dump it
//
//			System.out.println("Error	while	trying	to	instantiate DocumentBuilder	" + pce);
//
//			System.exit(1);
//		}
//
//	}
//
//	private void createDOMTree() {
//
//		// create the root element
//		Element rootEle = (Element) dom.createElement("Funcionarios");
//		Node appendChild = dom.appendChild((Node) rootEle);
//
//		Object myData;
//		// No enhanced for
//		Iterator it = ((Object) myData).iterator();
//		while (it.hasNext()) {
//
//			Funcionario f = (Funcionario) it.next();
//
//			// For each Book object create element
//
//			// and attach it to root
//
//			Element func = createFuncionarioElement(f);
//
//			rootEle.appendChild(func);
//		}
//	}
//
//	private Element createFuncionarioElement(Funcionario f) {
//
//		Element func = (Element) dom.createElement("Funcionario");
//		Text matriculaText = dom.createTextNode("" + f.getMatricula());
//
//		Element nome = (Element) dom.createElement("Nome");
//		Text nomeText = dom.createTextNode(f.getNome());
//
//		Element email = (Element) dom.createElement("Email");
//		Text emailText = dom.createTextNode(f.getEmail());
//
//		Element cidade = (Element) dom.createElement("Cidade");
//		Text cidadeText = dom.createTextNode(f.getCidade());
//
//		Element uf = (Element) dom.createElement("UF");
//		Text ufText = dom.createTextNode(f.getUf());
//
//		Element salario = (Element) dom.createElement("Salario");
//		Text salarioText = dom.createTextNode("" + f.getSalario());
//
//		return func;
//	}
//
//	public void printToFile() {
//
//		try {
//			// print
//			OutputFormat format = new OutputFormat();
//			((Object) format).setIndenting(true);
//
//			// to generate output to console use this serializer
//			XMLSerializer serializer = new XMLSerializer(System.out, format);
//
//			// to generate a file output use fileoutputstream instead of system.out
//			XMLSerializer serializer = new XMLSerializer(
//
//					new FileOutputStream(new File("book.xml")), format);
//
//			serializer.serialize(dom);
//		} catch (IOException ie) {
//			ie.printStackTrace();
//		}
	
}
