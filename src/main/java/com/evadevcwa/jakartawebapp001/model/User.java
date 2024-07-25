package com.evadevcwa.jakartawebapp001.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

// Anotaciones
@Entity
@Table(name = "users")
public class User {
    
    // PK
    @Id
    @Column(name = "usrid")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el valor es auto generado por la db
    private int id;
    
    @Column(name = "usrnom", nullable = false, length = 75)
    private String nombres;
    
    @Column(name = "usrape", nullable = false, length = 75)
    private String apellidos;
    
    @Column(name = "usrmail", nullable = false, length = 50, unique = true)
    private String correo;
    
    @Column(name = "usrpws", nullable = false, length = 100)
    private String contrasenia;
    
    @Column(name = "usrtel", nullable = false, length = 12, unique = true)
    private String telefono;
    
    @Column(name = "usrdir", nullable = false, length = 150)
    private String direccion;
    
    @Column(name = "usrcui", nullable = false, length = 13, unique = true)
    private String cui;
    
    @Column(name = "usrnit", nullable = false, length = 12, unique = true)
    private String nit;
    
    @Column(name = "usrest", length = 1, insertable = false)
    private String estado;
    
    @Column(name = "usrsys", insertable = false, updatable = false)
    private LocalDateTime fechaRegistro;
    
    @Column(name = "usrupd", insertable = false, updatable = false)
    private LocalDateTime fechaActualiza;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaActualiza() {
        return fechaActualiza;
    }

    public void setFechaActualiza(LocalDateTime fechaActualiza) {
        this.fechaActualiza = fechaActualiza;
    }
    
    
}
