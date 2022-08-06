/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reporteventa;

/**
 *
 * @author Henry
 */
public class ReporteVenta {

    private String vendedor;
    private double enero;
    private double febrero;
    private double marzo;
    private double abril;
    private double TotalV;

    public void setVendedor(String vendedor){
            this.vendedor=vendedor;
    }

    public String getVendedor(){
            return this.vendedor;
    }
    
    public void setEnero(double valor){
            this.enero=valor;
    }

    public double getEnero(){
            return this.enero;
    }
    
    public void setFebrero(double valor){
            this.febrero=valor;
    }

    public double getFebrero(){
            return this.febrero;
    }
    
    public void setMarzo(double valor){
            this.marzo=valor;
    }

    public double getMarzo(){
            return this.marzo;
    }
    
    public void setAbril(double valor){
            this.abril=valor;
    }

    public double getAbril(){
            return this.abril;
    }
    
     public void setTotalV(double valor){
            this.abril=valor;
    }

    public double getTotalV(){
            return this.abril;
    }

    //repetir para cada field


    public double getTotal(){
        
            return enero + febrero + marzo + abril ;
    }

    public double  getComision20(){
            return getTotal() * (getTotal() < 2001 ? 0.20 : 0);
    }

    public double getComision30(){
            return getTotal() * (getTotal() < 2001 ? 0 : 0.30);
    }

    public double getTotalMasComision(){
            return getTotal() * (getTotal() < 2001 ? 0.20 : 0.30);
    }

    public double getISR(){
            return getTotalMasComision() * 0.05;
    }

    public double getLiquido(){
            return getTotalMasComision() * 0.95;
	}
}
