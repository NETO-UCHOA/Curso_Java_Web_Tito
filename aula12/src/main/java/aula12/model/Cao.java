package aula12.model;

public class Cao extends Animal {
	private String raca;
	
	public Cao() {}
	
	public Cao(String nome, String raca, String sexo) {
		super(nome,sexo);
		this.setRaca(raca);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void validar()throws Exception {
		if(this.raca==null || this.raca.equals("") || this.raca.isEmpty()) {
			throw new Exception();
		}
		if(this.getNome()==null || this.getNome().equals("") || this.getNome().isEmpty()) {
			throw new Exception();
		}
		if(this.getSexo()==null || this.getSexo().equals("") || this.getSexo().isEmpty()) {
			throw new Exception();
		}
	}
	
}
