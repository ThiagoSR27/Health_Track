package br.com.healthtrack.teste;

import java.util.Scanner;

import br.com.healthtrack.Usuario;
public class HealthTrackTeste {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Usuario user = new Usuario();

        user.setCdUsuario(1);
        System.out.println(user.getCdUsuario());
    }
}
