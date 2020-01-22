/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author lml
 */
public class DeclararAsignar  implements Instruccion{
    /**
     * Identificador de la variable que será declarada.
     */
    private final String id;
    /**
     * Tipo de la variable que será declarada.
     */
    Simbolo.Tipo tipo;
    /**
     * Constructor de la clase
     * @param a Identificador de la variable que será declarada
     * @param t Tipo de la clase que será declaradaç
     * @param b valor que se le va a asignar
     */
    
    private final Operacion valor;
    
    public DeclararAsignar(String a, Simbolo.Tipo t, Operacion b) {
        id=a;
        tipo=t;
        valor = b;
    }
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        ts.add(new Simbolo(id,tipo));
        ts.setValor(id,valor.ejecutar(ts));
        return null;
    }
    
}
