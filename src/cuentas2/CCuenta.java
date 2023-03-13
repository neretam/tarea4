package cuentas2;
/**
 * Simulador de una cuenta bancaria
 * 
 * @author nerea
 * @version 2.0
 * 
 */
public class CCuenta {
	/**
	 * Atributos
	 */
	public String nombre;
	public String cuenta;
	public double saldo;
    public double tipoInterés;
    /**
     * @param nom String, nombre del titular
     * @param cue String, nº de cuenta
     * @param sal double, Saldo de la cuenta
     * @param tipo double, Tipo de interés
     */  
    public CCuenta()
    {
    }  
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }  
    /**
     * 
     * @return Saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad, cantidad a ingresar de la cuenta
     * @throws Exception, respuesta ante una cantidad negativa
     */   
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad, cantidad a ingresar de la cuenta
     * @throws Exception, respuesta ante una cantidad negativa
     */   
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }   
    /**
     * 
     * @return nombre, nombre del titular
     */
	String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre, nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return cuenta, nº de cuenta
	 */
	String getCuenta() {
		return cuenta;
	}
	/**
	 * 
	 * @param cuenta, nº de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * 
	 * @return saldo, Saldo de la cuenta
	 */
	double getSaldo() {
		return saldo;
	}
	/**
	 * 
	 * @param saldo, Saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * 
	 * @return tipoInterés, ripo de interés
	 */
	double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * 
	 * @param tipoInterés, tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}


}
