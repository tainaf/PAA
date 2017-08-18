/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transports;

import apoio.ConexaoBD;
import javax.swing.JOptionPane;
import tela.JanelaPrincipal;
import tela.Login;

public class Transports {

//    public static Connection conexao;

    /**
     * @param args the command line arguments
     *  if (ConexaoBD.getInstance().getConnection() != null) {
            FrmPrincipal frmPrincipal = new FrmPrincipal();
            DlgLogin dlgLogin = new DlgLogin(frmPrincipal, true);
            dlgLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco!");
        }
    }
     */
    public static void main(String[] args) {
        if (ConexaoBD.getInstance().getConnection() != null) {
            JanelaPrincipal frmPrincipal = new JanelaPrincipal();
            Login Login = new Login(frmPrincipal, true);
            Login.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco!");
        }
        
        
//        if (abrirConexao()) {
//        if (ConexaoBD.getInstance().getConnection() != null) {
////            JOptionPane.showMessageDialog(null, "Abriu!");
//            new JanelaPrincipal().setVisible(true);
//        } else {
//            JOptionPane.showMessageDialog(null, "Erro ao abrir conexão!");
//        }
    }

}
