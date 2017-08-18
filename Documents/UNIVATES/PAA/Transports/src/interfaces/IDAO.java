/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDAO {

    ArrayList<Object> objs = new ArrayList<>();
    Object obj = new Object();

    public String salvar(Object o, char op);

    public String atualizar(Object o);

    public String excluir(int id);

    public ArrayList<Object> consultarTodos();
   
    public boolean registroUnico(Object o) throws SQLException;

    public ArrayList<Object> consultar(String criterio);

    public Object consultarId(int id);
    
    public boolean consultar (Object o);
}

