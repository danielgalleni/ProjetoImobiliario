/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gonzalez
 * @author Galleni
 */

@Entity
@Table(name = "funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_funcionario;
    private String nome;
    private String endereco;
    private String estado;
    private String bairro;
    private String numero;
    private String cidade;
    private String telefone;
    private String celular;
    private String cpf;
    private String rg;
    private String cargo;
    private String setor;
    private String hora_entrada;
    private String hora_saida;
    private String salario;
    
    public Funcionario(){
    
    }
    
    public Funcionario (String nome,String endereco, String bairro, String numero, String cidade, String telefone, String celular, String cpf, String rg, String cargo, String setor, String hora_entrada, String hora_saida, String salario)throws Exception{
        if((nome != null) && (endereco != null) && (estado != null) && (bairro != null) && (numero != null) && (cidade != null) && (telefone != null) && (celular != null) && (cpf != null) && (rg != null) && (cargo != null) && (setor != null) && (hora_entrada != null) && (hora_saida != null) && (salario != null)){
            this.setNome(nome);
            this.setEndereco(endereco);
            this.setEstado(estado);
            this.setBairro(bairro);
            this.setNumero(numero);
            this.setCidade(cidade);
            this.setTelefone(telefone);
            this.setCelular(celular);
            this.setCpf(cpf);
            this.setRg(rg);
            this.setCargo(cargo);
            this.setSetor(setor);
            this.setHora_entrada(hora_entrada);  
            this.setHora_saida(hora_saida);
            this.setSalario(salario);
        }else{
            throw new Exception("Erro!\nDados obrigatórios não preenchidos, por favor verifique!");
        }
    }
    
    public int getCodigo_funcionario() {
        return codigo_funcionario;
    }

    public void setCodigo_funcionario(int codigo_funcionario) throws Exception {
        if(codigo_funcionario > 0){
            this.codigo_funcionario = codigo_funcionario;
        }else{
            throw new Exception("Erro!\nHouve algum problema com o código, por favor verifique!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome != null){
            this.nome = nome;
        }else{
            throw new Exception("Erro!\nNecessário informar o Nome do funcionário.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco)throws Exception {
        if(endereco != null){
            this.endereco = endereco;
        }else{
            throw new Exception("Erro!\nNecessário informa o Endereço do funcionário.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (estado != null){
            this.estado = estado;
        }else{
            throw new Exception ("Erro!\nNecessário informar o Estado do funcionário.");
        }
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro)throws Exception {
        if(bairro != null){
            this.bairro = bairro;
        }else{
            throw new Exception("Erro!\nNecessário informar o Bairro do funcionário.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero)throws Exception {
        if(numero != null){
            this.numero = numero;
        }else{
            throw new Exception("Erro!\nNecessário informar o Numero do funcionário.");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade)throws Exception {
        if(cidade != null){
            this.cidade = cidade;
        }else{
            throw new Exception("Erro!\nNecessário informar a Cidade do funcionário.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone)throws Exception {
        if(telefone != null){
            this.telefone = telefone;
        }else{
            throw new Exception("Erro!\nNecessário informar o Telefone do funcionário.");
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular)throws Exception {
        if(celular != null){
            this.celular = celular;
        }else{
            throw new Exception("Erro!\nNecessário informar o Celular do funcionário.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf)throws Exception {
        if(cpf != null){
            this.cpf = cpf;
        }else{
            throw new Exception("Erro!\nNecessário informar o CPF do funcionário.");
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg)throws Exception {
        if(rg != null){
            this.rg = rg;
        }else{
            throw new Exception("Erro!\nNecessário informa o RG do funcionário.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo)throws Exception {
        if(cargo != null){
            this.cargo = cargo;
        }else{
            throw new Exception("Erro!\nNecessário informar o Cargo do funcionário.");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor)throws Exception {
        if(setor != null){
            this.setor = setor;
        }else{
            throw new Exception("Erro!\nNecessário informar o Setor do funcionário.");
        }
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada)throws Exception {
        if(hora_entrada != null){
            this.hora_entrada = hora_entrada;
        }else{
            throw new Exception("Erro!\nNecessário informar a Hora de Entrada do funcionário.");
        }
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida)throws Exception {
        if(hora_saida != null){
            this.hora_saida = hora_saida;
        }else{
            throw new Exception("Erro!\nNecessário informa a Hora de Saida do funcionário.");
        }
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario)throws Exception {
        if(salario != null){
            this.salario = salario;
        }else{
            throw new Exception("Erro!\nNecessário informa o Salário do funcionário.");
        }
    }
    
}
