package com.formation.view;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import org.primefaces.PrimeFaces;
@ManagedBean
public class ValidationView {
     
    private String text;
    private String description;
    private Integer integer;
    private String Email;
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
 
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Integer getInteger() {
        return integer;
    }
    public void setInteger(Integer integer) {
        this.integer = integer;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    
     public void openLevel1() {
            Map<String,Object> options = new HashMap<String, Object>();
            options.put("modal", true);
            PrimeFaces.current().dialog().openDynamic("level1", options, null);
        }
       
    }