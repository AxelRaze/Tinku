package com.example.recyclerview.model;

import java.io.Serializable;

public class ItemList implements Serializable {
    private String titulo;
    private String descripcion;
    private String telefono;
    private String Direccion;
    private int Mapa;
    private int imgResource;
    private String Correo;
    private String instagram;
    private String FaceB;
    private String MessengerFace;
    private String whatsapp;

    public ItemList(String titulo, String descripcion, int imgResource, String telefono, String Direccion, int Mapa, String Correo, String instagram, String FaceB, String whatsapp, String MessengerFace) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgResource = imgResource;
        this.telefono = telefono;
        this.Direccion = Direccion;
        this.Mapa = Mapa;
        this.Correo = Correo;
        this.instagram = instagram;
        this.FaceB = FaceB;
        this.MessengerFace = MessengerFace;
        this.whatsapp = whatsapp;



    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDirec() {
        return Direccion;
    }

    public int getMapa() {return Mapa;}

    public int getImgResource() { return imgResource; }

    public String getCorreo() {
        return  Correo;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getFaceB() {
        return FaceB;
    }

    public String getMessengerFace() {
        return MessengerFace;
    }

    public String getWhatsapp() { return whatsapp;}






}
