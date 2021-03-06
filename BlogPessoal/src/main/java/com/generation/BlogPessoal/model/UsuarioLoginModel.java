package com.generation.BlogPessoal.model;

/* A Classe UsuarioLogin não terá nenhuma annotation porque ela
 * não irá gerar tabela no banco de dados.
 * Essa classe serve de apoio ao processo de login na api. 
 */

public class UsuarioLoginModel {

	private long id;

	private String nome;

	private String usuario;

	private String senha;

	private String foto;

	private String token;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}



}
