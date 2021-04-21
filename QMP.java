class Atuendo {
    List<Prenda> prendas;

    void Atuendo(prendas) {
        this.prendas = prendas;
    }
}

class PrendaBuilder {

    Prenda prenda;

    void PrendaBuilder(){
        prenda = new Prenda();
    }

    void agregarCategoria(Categoria categoria) {
        prenda.setCategoria(checkNotNull(categoria, 'La categoria no puede ser nula'));
    }
    void agregarMaterial(Material material) {
        prenda.setMaterial(checkNotNull(material, 'El material no puede ser nulo'));
    }
    void agregarColorPrimario(Color colorPrimario) {
        prenda.setColorPrimario(checkNotNull(colorPrimario, 'El color primario no puede ser nulo'))
    }
    void agregarTipo(TipoPrenda tipo) {
        prenda.setTipo(checkNotNull(tipo, 'El tipo no puede ser nulo'))
    }


    Prenda getPrenda() {
        return prenda;
    }

}

class PrendaDirector {
    
    PrendaBuilder builder;

    void PrendaDirector(){
        builder = new PrendaBuilder();
    }

 
    void ConstruirPrenda(categoria, material, color, tipo)
    {
        
        if(!tipo.esDeCategoria(categoria))
            throw new Exception(message= 'El tipo de prenda no coincide con la categoria');

        builder.agregarCategoria(categoria);
        builder.agregarMaterial(material);
        builder.agregarColorPrimario(color);
        builder.agregarTipo(tipo);

    }
 
    public Vehiculo GetPrenda()
    {
        return builder.GetPrenda();
    }

}

class Prenda {
    
    Categoria categoria;
    Material material;
    Color colorPrimario;
    TipoPrenda tipo;
    Color colorSecundario;

    void setCategoria(categoria) {
        this.categoria = categoria
    }
    void setMaterial(material) {
        this.material = material
    }
    void setColorPrimario(color) {
        this.colorPrimario = color
    }
    void setTipo(tipo) {
        this.tipo = tipo
    }
  
    void agregarColorSecundario(Color colorSecundario) {
        this.colorSecundario = checkNotNull(colorSecundario, 'El tipo no puede ser nulo');
    }

}

class TipoPrenda {
    Categoria categoria;

    esDeCategoria(unaCategoria) {
        return unaCategoria == this.categoria;
    }
}

Enum Categoria {
    PARTESUPERIOR,
    CALZADO, 
    PARTEINFERIOR, 
    ACCESORIOS,
}

Enum Material {
    ALGODON, 
    HILO,
}

Enum Color {
    AMARILLO,
    AZUL,
    ROJO,
    ROSA,
    VIOLETA,
    NEGRO,
    BLANCO,
}
