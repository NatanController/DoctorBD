package ifrn.pi.doctorbd.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CasaSaude {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String nome; 
	private Long telefone; 
	private String senha; 
	private Long cnpj; 
	private int num_estabele;
	private String rua;
	private Long cep;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public int getNum_estabele() {
		return num_estabele;
	}
	public void setNum_estabele(int num_estabele) {
		this.num_estabele = num_estabele;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "CasaSaude [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", senha=" + senha + ", cnpj="
				+ cnpj + ", num_estabele=" + num_estabele + ", rua=" + rua + ", cep=" + cep + "]";
	}
	
	
	
	
}
