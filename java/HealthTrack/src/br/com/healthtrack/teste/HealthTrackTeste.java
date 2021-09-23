package br.com.healthtrack.teste;

import br.com.healthtrack.entidades.Usuario;
public class HealthTrackTeste {
    public static void main(String[] args) {
        Usuario user = new Usuario();

        user.setCdUsuario(1);
        
        user.setNome("Jose");
        user.setSobrenome("dos Testes");
        user.setTelCelular(96425-3545);
        user.setIdade(25);
        user.setEmail("testes_jose@gmail.com");

        System.out.println("O codigo do usuario é: " + user.getCdUsuario() + " O nome é: " + user.getNome() + " " + user.getSobrenome() + " O numero do celular é " + user.getTelCelular() 
        + " A idade é: " + user.getIdade() + " e o email é : " + user.getEmail());

    }
}
