/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import rh.ValidacaoException;

/**
 *
 * @author ra2257001
 */
public class ReajustarSalario {
    public void reajustarSalario(Funcionario f, BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(f.getSalario(), RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		f.setSalario (f.getSalario().add(aumento));
	}
        
    
}
