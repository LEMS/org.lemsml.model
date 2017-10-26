/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lemsml.model.compiler.utils;

import java.text.MessageFormat;

/**
 *
 * @author padraig
 */
public class Logger
{
    String name = null;
    
    boolean debug = false;
    
    public Logger(String name)
    {
        this.name = name;
    }
    public Logger(Class c)
    {
        this.name = c.getCanonicalName();
    }
    public void info(String i)
    {
        System.out.println(">> "+name+": "+i);
    };
    public void info(String i, String j, String k)
    {
        System.out.println(">> "+name+": "+MessageFormat.format(i,j,k));
    };
    public void error(String i)
    {
        System.out.println(">> ERR "+name+": "+i);
    };
    public void warn(String i)
    {
        System.out.println(">> WARN "+name+": "+i);
    };
    public void debug(String i)
    {
        if (debug) System.out.println(">> DEBUG "+name+": "+i);
    };
    public void debug(String i, String j)
    {
        if (debug) System.out.println(">> DEBUG "+name+": "+MessageFormat.format(i,j));
    };
}
