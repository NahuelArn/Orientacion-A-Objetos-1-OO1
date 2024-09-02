package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private String texto_publicar = "Undefined post";
	private int cant_likes;
	private boolean marca_destacado;
	
	/*Retorna el texto descriptivo de la publicacion
	 */
	public String getText() {
		return this.texto_publicar;
	}
	/*Asigna el texto descriptivo de la publicacion 
	 */
	public void setText(String descripcionText) {
		this.texto_publicar = descripcionText;
	}
	/*
	 * Retorna la cantidad de "Me gusta"
	 */
	public int getLikes() {
		return this.cant_likes;
	}
	/*
	 * Incrementa la cantidad de likes en uno
	 */
	public void like() {
		this.cant_likes +=1;
	}
	/*
	 * Decrementa en uno la cantidad de likes
	 */
	public void dislike() {
		if(this.cant_likes >0) {
			this.cant_likes -= 1;
		}
	}
	/*
	 * Retorna true si el post esta marcado como descado, false en caso contrario
	 */
	public boolean isFeatured() {
		return this.marca_destacado;
	}
	/*
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	public void toggleFeatured() {
		this.marca_destacado = !this.marca_destacado;
	}
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
