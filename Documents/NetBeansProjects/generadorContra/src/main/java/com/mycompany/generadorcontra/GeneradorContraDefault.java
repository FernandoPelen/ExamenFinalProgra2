/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generadorcontra;

/**
 *
 * @author chris
 */
import java.security.SecureRandom;

public class GeneradorContraDefault implements GeneradorContra {
    @Override
    public String generaContraseña() {
        int length = 8; // Longitud mínima requerida para la contraseña

        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitos = "0123456789";
        String caracterEspeciales = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        SecureRandom random = new SecureRandom();
        StringBuilder contra = new StringBuilder();

        // Agregar al menos un carácter de cada tipo necesario
        contra.append(minusculas.charAt(random.nextInt(minusculas.length())));
        contra.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        contra.append(digitos.charAt(random.nextInt(digitos.length())));
        contra.append(caracterEspeciales.charAt(random.nextInt(caracterEspeciales.length())));

        // Generar el resto de la contraseña con caracteres aleatorios
        for (int i = 4; i < length; i++) {
            String caracter = minusculas + mayusculas + digitos + caracterEspeciales;
            contra.append(caracter.charAt(random.nextInt(caracter.length())));
        }

        return contra.toString();
    }
}


