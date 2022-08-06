/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reporteventa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henry
 */
public class Program {
    public static void main(String[] arg){
        List<ReporteVenta> reporteVentas = new ArrayList<>();
        ReporteVenta reporteVenta = null;

        //repetir este codigo 5 veces
        reporteVenta = new ReporteVenta();
        reporteVenta.setVendedor("Vinicio");
        reporteVenta.setEnero(10.5);
        reporteVenta.setFebrero(10.5);
        reporteVenta.setMarzo(10.5);
        reporteVenta.setAbril(10.5);
        reporteVentas.add(reporteVenta);

        reporteVenta = new ReporteVenta();
        reporteVenta.setVendedor("Jassiel");
        reporteVenta.setEnero(11.5);
        reporteVenta.setFebrero(11.5);
        reporteVenta.setMarzo(11.5);
        reporteVenta.setAbril(11.5);
        reporteVentas.add(reporteVenta);
        
        reporteVenta = new ReporteVenta();
        reporteVenta.setVendedor("Nicolas");
        reporteVenta.setEnero(11.5);
        reporteVenta.setFebrero(11.5);
        reporteVenta.setMarzo(11.5);
        reporteVenta.setAbril(11.5);
        reporteVentas.add(reporteVenta);
        
        reporteVenta = new ReporteVenta();
        reporteVenta.setVendedor("Lorenzo");
        reporteVenta.setEnero(11.5);
        reporteVenta.setFebrero(11.5);
        reporteVenta.setMarzo(11.5);
        reporteVenta.setAbril(11.5);
        reporteVentas.add(reporteVenta);
        
        reporteVenta = new ReporteVenta();
        reporteVenta.setVendedor("Jonatan");
        reporteVenta.setEnero(11.5);
        reporteVenta.setFebrero(11.5);
        reporteVenta.setMarzo(11.5);
        reporteVenta.setAbril(11.5);
        reporteVentas.add(reporteVenta);
        
       
        System.out.println("Vendedor - Enero - Febrero - Marzo - Abril - Total Ventas - 20% - 30% - Total Ventas y comision - ISR - Liquido a recibir ");
        //
        String resultado = null;
        for(ReporteVenta reporte : reporteVentas ){
            //String resultado = String.format("{} - {} - {} - {} - ", reporte.getVendedor(), reporte.getEnero());
            
            resultado = reporte.getVendedor() + " - ";
            resultado += String.valueOf(reporte.getEnero()) + " - ";
            resultado += String.valueOf(reporte.getFebrero()) + " - ";
            resultado += String.valueOf(reporte.getMarzo()) + " - ";
            resultado += String.valueOf(reporte.getAbril()) + " - ";
            resultado += String.valueOf(reporte.getTotal()) + " - ";
            resultado += String.valueOf(reporte.getComision20()) + " - ";
            resultado += String.valueOf(reporte.getComision30()) + " - ";
            resultado += String.valueOf(reporte.getTotalMasComision()) + " - ";
            resultado += String.valueOf(reporte.getISR()) + " - ";
            resultado += String.valueOf(reporte.getLiquido()) + " - " ;
            System.out.println(resultado);
        }
    }
}
