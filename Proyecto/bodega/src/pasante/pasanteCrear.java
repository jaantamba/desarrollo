/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasante;

import clases.conectar;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jaant
 */
public class pasanteCrear extends javax.swing.JPanel {
    public String idEstudiante,correoEstudiante,cedulaEstudiante, nombreEstudiante, apellidosEstudiante,carreraEstudiante,periodoEstudiante,telefonoEstudiante,nivelEstudiante;
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    /**
     * Creates new form pasanteCrear
     */
    public pasanteCrear() {
        initComponents();
    }
    public void guardarPasante(String nombre,String cedula,String apellido,String carrera,
                               String nivel,String periodo,String telefono,String id,String correo){
     
        int opcionGuardado;
        String sql="insert into alumno (id_alum_universidad,cedula_alumno,nombres_alumno,apellidos_alumno,correo_alumno,nivel_alumno,carrera_alumno,periodo_alumno,telefono_alumno)values('"+id+"','"+cedula+"','"+nombre+"','"+apellido+"','"+correo+"','"+nivel+"','"+carrera+"','"+periodo+"','"+telefono+"');";
       try {
            
            Statement st = (Statement)cn.createStatement();
            opcionGuardado=JOptionPane.showConfirmDialog(null, "¿Esta seguro de guardar?", "Confirmar guardado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcionGuardado==0) {
                JOptionPane.showMessageDialog(null,"Guardado");
                st.executeUpdate(sql);    
            }else{
                JOptionPane.showMessageDialog(null,"No Guardado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() ,"Error", 1);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtidEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcedulaEstudiante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombresEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtapellidosEstudiante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnivelEstudiante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttelefonoEstudiante = new javax.swing.JTextField();
        txtcarreraEstudiante1 = new javax.swing.JTextField();
        txtperiodoEstudiante = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcorreoEstudiante = new javax.swing.JTextField();

        setBackground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Id de estudiante");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Cédula de estudiante");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombres de estudiante");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos de estudiante");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Nivel del estudiante");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Carrera del estudiante");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Periódo Académico");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Teléfono del estudiante");

        txttelefonoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoEstudianteActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Correo del estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtidEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(101, 101, 101)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnivelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcarreraEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtperiodoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtnivelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtcarreraEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtperiodoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtapellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txttelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcorreoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttelefonoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoEstudianteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        boolean control,nombre,apellido,vacio;
        nombreEstudiante = txtnombresEstudiante.getText();
        cedulaEstudiante = txtcedulaEstudiante.getText();
        apellidosEstudiante = txtapellidosEstudiante.getText();
        carreraEstudiante = txtcarreraEstudiante1.getText();
        nivelEstudiante = txtnivelEstudiante.getText();
        periodoEstudiante = txtperiodoEstudiante.getText();
        telefonoEstudiante = txtperiodoEstudiante.getText();
        idEstudiante = txtidEstudiante.getText();
        correoEstudiante=txtcorreoEstudiante.getText();
        control=validadorDeCedula(cedulaEstudiante);
        nombre=validarCaracteres(nombreEstudiante);
        apellido=validarCaracteres(apellidosEstudiante);

        if (nombreEstudiante.isEmpty()||apellidosEstudiante.isEmpty()||idEstudiante.isEmpty()||cedulaEstudiante.isEmpty()||
            carreraEstudiante.isEmpty()||nivelEstudiante.isEmpty()||telefonoEstudiante.isEmpty()||correoEstudiante.isEmpty()||periodoEstudiante.isEmpty()) {
            vacio=true;
            JOptionPane.showMessageDialog(null,"ALGUNOS CAMPOS ESTAN VACIOS");
        }else{
            vacio=false;
        }
        //JOptionPane.showMessageDialog(null,"Validar> "+control+nombre+apellido+vacio+periodoEstudiante.toString());
        if (control==true&&apellido==true&&nombre==true&&vacio==false) {
        guardarPasante(nombreEstudiante,cedulaEstudiante,apellidosEstudiante,carreraEstudiante,
                        nivelEstudiante,periodoEstudiante,telefonoEstudiante,idEstudiante,correoEstudiante);    
        }else{
            JOptionPane.showMessageDialog(null,"DATOS INCONRRECTOS O INCOMPLETOS");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    public Boolean validadorDeCedula(String cedula){ 
        boolean cedulaCorrecta = false;
        try {
         if (cedula.length() == 10) // ConstantesApp.LongitudCedula
          {
          int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
          if (tercerDigito < 6) {
          // Coeficientes de validaci�n c�dula
          // El d�cimo d�gito se lo considera d�gito verificador
          int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
          int verificador = Integer.parseInt(cedula.substring(9,10));
          int suma = 0;
          int digito = 0;
          for (int i = 0; i < (cedula.length() - 1); i++) {
             digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
             suma += ((digito % 10) + (digito / 10));
          }
          if ((suma % 10 == 0) && (suma % 10 == verificador)) {
             cedulaCorrecta = true;
          }
          else if ((10 - (suma % 10)) == verificador) {
              cedulaCorrecta = true;
          } else {
              cedulaCorrecta = false;
          }
          } else {
              cedulaCorrecta = false;
          }
          } else {
              cedulaCorrecta = false;
          }
          } catch (NumberFormatException nfe) {
              cedulaCorrecta = false;
          } catch (Exception err) {
              JOptionPane.showMessageDialog(null, "Cedula incorrecta Error");
              cedulaCorrecta = false;
         }
         if (!cedulaCorrecta) {
               JOptionPane.showMessageDialog(null, "Cedula incorrecta");
         }
        return cedulaCorrecta;
   }
    public boolean validarCaracteres(String caracter){
			Pattern valida=Pattern.compile("[^A-Za-z]");
			Matcher encaja=valida.matcher(caracter);
                        
			if(!encaja.find())
				return true;
			else
				return false;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellidosEstudiante;
    private javax.swing.JTextField txtcarreraEstudiante1;
    private javax.swing.JTextField txtcedulaEstudiante;
    private javax.swing.JTextField txtcorreoEstudiante;
    private javax.swing.JTextField txtidEstudiante;
    private javax.swing.JTextField txtnivelEstudiante;
    private javax.swing.JTextField txtnombresEstudiante;
    private javax.swing.JTextField txtperiodoEstudiante;
    private javax.swing.JTextField txttelefonoEstudiante;
    // End of variables declaration//GEN-END:variables
}
