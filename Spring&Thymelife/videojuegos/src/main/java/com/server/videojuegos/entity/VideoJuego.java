package com.server.videojuegos.entity;

import javax.persistence.*;

@Entity
@Table(name ="videojuego")
public class VideoJuego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    @ManyToOne //relaciona los dos objetos con la foreign Key
    @JoinColumn(name="distribuidorId") //Para indicarle manualmente la columna que es la foreign key
    private Distribuidor distribuidor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    //Sobreescribo toString para saber todos los atributos
    @Override
    public String toString() {
        return "VideoJuego{" + "id=" + id + ", nombre='" + nombre +  ", descripcion='" + descripcion +  ", imagenUrl='" + imagenUrl +  ", distribuidor=" + distribuidor + '}';
    }
}
