package com.woniu.cls26prj.filter;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class MyRequest extends HttpServletRequestWrapper {

    public MyRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        value = filterString(value);
        return value;
    }

    public String filterString(String value){
        if(value!=null){
            value=value.replaceAll("<", "&lt;");
            value=value.replaceAll(">", "&gt;");
            value=value.replaceAll("gp", "*");
            value=value.replaceAll("pf", "*");
            value=value.replaceAll("fuck", "*");
        }
        return value;
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values =super.getParameterValues(name);
        if(values!=null){
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                value = filterString(value);
                values[i] = value;
            }
        }
        return values ;
    }
}
