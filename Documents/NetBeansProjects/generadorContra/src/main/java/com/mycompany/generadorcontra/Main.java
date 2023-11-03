/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generadorcontra;

public class Main {
    public static void main(String[] args) {
        // Uso del generador por defecto
        GeneradorContra generadorPorDefecto = new GeneradorContraDefault();
        String contraPorDefecto = generadorPorDefecto.generaContraseña();
        
        // Uso del generador configurable con un DTO de configuración
        PasswordConfigDTO config = new PasswordConfigDTO(8, 2, 2, 4, 1, true, true, true, true);
        GeneradorContra configurableGenerator = new ContraConfigurable(config);
        String contraConfigurable = configurableGenerator.generaContraseña();
        
        System.out.println("Contraseña predeterminada: " + contraPorDefecto);
        System.out.println("Contraseña configurable: " + contraConfigurable);
    }
}


