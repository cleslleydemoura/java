package textShow;

public class Main {
	  public static void main(String[] args) throws Exception { // conexão entre o java e banco de dados
	    ConnectBD dao = new ConnectBD();
	    dao.readDataBase();
	    
	    // A camada DAO significa "Data Access Object", ou seja, é uma camada onde você deve 
	    // centralizar todo o acesso ao bando ce dados do seu sistema.
	  }
	}
