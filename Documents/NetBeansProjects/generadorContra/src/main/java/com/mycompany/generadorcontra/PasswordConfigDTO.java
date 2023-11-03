/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generadorcontra;

/**
 *
 * @author chris
 */
public class PasswordConfigDTO {
    
    
    private int minLargo;
    private int minDigitos;
    private int minLetrasMayus;
    private int minLetrasMinus;
    private int minCaracterNoAlfa;
    private boolean restricMinDigitos;
    private boolean restricMinMayus;
    private boolean restricMinMinus;
    private boolean restricMinCaracNoAlfa;

    
    public PasswordConfigDTO(int minLargo, int minDigitos, int minLetrasMayus, int minLetrasMinus,
                             int minCaracterNoAlfa, boolean restricMinDigitos, boolean restricMinMayus,
                             boolean restricMinMinus, boolean restricMinCaracNoAlfa) {
        this.minLargo = minLargo;
        this.minDigitos = minDigitos;
        this.minLetrasMayus = minLetrasMayus;
        this.minLetrasMinus = minLetrasMinus;
        this.minCaracterNoAlfa = minCaracterNoAlfa;
        this.restricMinDigitos = restricMinDigitos;
        this.restricMinMayus = restricMinMayus;
        this.restricMinMinus = restricMinMinus;
        this.restricMinCaracNoAlfa = restricMinCaracNoAlfa;
    }

    public int getMinLargo() {
        return minLargo;
    }

    public void setMinLargo(int minLargo) {
        this.minLargo = minLargo;
    }
    
    public int getMinDigitos() {
        return minDigitos;
    }

    public void setMiDigitos(int minDigitos) {
        this.minDigitos = minDigitos;
    }

    public int getMinLetrasMayus() {
        return minLetrasMayus;
    }

    public void setMinLetrasMayus(int minLetrasMayus) {
        this.minLetrasMayus = minLetrasMayus;
    }

    public int getMinLetrasMinus() {
        return minLetrasMinus;
    }

    public void setMinLetrasMinus(int minLetrasMinus) {
        this.minLetrasMinus = minLetrasMinus;
    }

    public int getMinCaracterNoAlfa() {
        return minCaracterNoAlfa;
    }

    public void setMinCaracterNoAlfa(int minCaracterNoAlfa) {
        this.minCaracterNoAlfa = minCaracterNoAlfa;
    }

    public boolean isRestricMinDigitos() {
        return restricMinDigitos;
    }

    public void setRestricMinDigitos(boolean restricMinDigitos) {
        this.restricMinDigitos = restricMinDigitos;
    }

    public boolean isRestricMinMayus() {
        return restricMinMayus;
    }

    public void setRestricMinMayus(boolean restricMinMayus) {
        this.restricMinMayus = restricMinMayus;
    }

    public boolean isRestricMinMinus() {
        return restricMinMinus;
    }

    public void setRestricMinMinus(boolean restricMinMinus) {
        this.restricMinMinus = restricMinMinus;
    }

    public boolean isRestricMinCaracNoAlfa() {
        return restricMinCaracNoAlfa;
    }

    public void setRestricMinCaracNoAlfa(boolean restricMinCaracNoAlfa) {
        this.restricMinCaracNoAlfa = restricMinCaracNoAlfa;
    }

    boolean restricMinMayus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getrestricMinMayus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}