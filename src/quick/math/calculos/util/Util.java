/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick.math.calculos.util;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Util {

    private int getNumeroMaximoPorNivel(int nivel, char operacao) {
        // Para multiplicação
        if (Character.valueOf('*').equals(operacao)) {
            switch (nivel) {
                case 0:
                    return 10;
                case 1:
                    return 12;
                case 2:
                    return 15;
                default:
                    return 10;
            }

        } else {
            //Outras Operações
            switch (nivel) {
                case 0:
                    return 20;
                case 1:
                    return 30;
                case 2:
                    return 40;
                default:
                    return 20;

            }
        }
    }

    public Integer gerarNumeroAleatorio(int nivel, char operacao) {
        return 1 + (int) (Math.random() * getNumeroMaximoPorNivel(nivel, operacao));
    }

    public Integer gerarNumeroErrado(Integer numeroCorreto) {
        Integer numeroErrado = null;
        Integer numeroMinimo = numeroCorreto > 10 ? numeroCorreto - 10 : numeroCorreto / 2;
        Integer numeroMaximo = numeroCorreto + 10;
        
        while (numeroErrado == null || numeroErrado.equals(numeroCorreto)) {
            numeroErrado = new Random().nextInt(numeroMaximo - numeroMinimo) + numeroMinimo;
        }
        return numeroErrado;
    }
}
