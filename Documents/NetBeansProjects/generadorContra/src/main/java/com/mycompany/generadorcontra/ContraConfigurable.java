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
public class ContraConfigurable implements GeneradorContra {
    private final PasswordConfigDTO config;

    public ContraConfigurable(PasswordConfigDTO config) {
        this.config = config;
    }

    @Override
    public String generaContraseña() {
        int length = config.getMinLargo();  // Obtener la longitud mínima para la contraseña

        StringBuilder contra = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Lógica para generar la contraseña basada en la configuración
        // Agregar caracteres basados en las restricciones del PasswordConfigDTO
        if (config.restricMinMayus()) {
            for (int i = 0; i < config.getrestricMinMayus(); i++) {
                contra.append((char) (random.nextInt(26) + 'a'));
            }
        }
        // Agregar el resto de las letras minúsculas
        for (int i = 0; i < length - contra.length(); i++) {
            contra.append((char) (random.nextInt(26) + 'a'));
        }
        // Otros tipos de caracteres (mayúsculas, dígitos, caracteres especiales) se pueden generar de manera similar

        return contra.toString();
    }
}