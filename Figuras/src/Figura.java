
public abstract class Figura {

	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String cor;

	// =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   public Figura() {
	   
   }

    // CONSTRUTOR COM PAR�METROS

    public Figura(String cor) {
		super();
		this.cor = cor;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
	
}
