/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Seven
 */
public class A
{
    private String A;
    
    public A(String A)
    {
        this.A = A;
        System.out.println("Holaaaaaaa");
    }

    public String getA()
    {
        return A;
    }

    public void setA(String A)
    {
        this.A = A;
    }

    @Override
    public String toString()
    {
        return "A{" + "A=" + A + '}';
    }
    
    
}
