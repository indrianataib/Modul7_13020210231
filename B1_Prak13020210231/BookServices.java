
package B1_Prak13020210231;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;


public class BookServices extends javax.swing.JFrame {
    
       private String menu ="";
       private ArrayList<String> bookName = new ArrayList<>();
       private ArrayList<String> authorName = new ArrayList<>();
       
       
       private void changeAllVisible(boolean value ){
           fieldBookName.setVisible(value);
           fieldAuthorName.setVisible(value);
           fieldId.setVisible(false);
           
           btnSet.setVisible(value);
       }
       
       private void changeAllVisibleUpdate(boolean value){
           fieldBookName.setVisible(value);
           fieldAuthorName.setVisible(value);
           fieldId.setVisible(value);
           
           btnSet.setVisible(value);
       }
       void changeBookNameVisible(boolean value){
           changeAllVisible(false);
           fieldBookName.setVisible(value);
           btnSet.setVisible(value);         
}
       void addBook(){
           bookName.add(fieldBookName.getText());
           authorName.add(fieldAuthorName.getText());
       }
       
       void findListBook(){
           DefaultListModel<String> model = new DefaultListModel<>();
           
           for (int i = 0; i< bookName.size(); i++) {
           String outputText ="";
           outputText += (i + 1) + ". ";
           outputText += "Nama Buku: " + bookName.get(i)+ ", ";
           outputText += "Nama Author: "+  authorName.get(i);
           model.addElement(outputText);
           }
           
         
       
       }
       void findListBookById(int i){
           DefaultListModel<String> model = new DefaultListModel<>();
           
           String outputText ="";
           outputText +=(i) + ". ";
           outputText += "Nama Buku: " + bookName.get(i-1) + ", ";
           outputText += "Nama Author: " + authorName.get(i);
           model.addElement(outputText);
          
       
      
}
       void deleteBook(int i){
           bookName.remove(i - 1);
           
       }
      void changeMenu(String menu){
          this.menu=menu;
      }          
      void updateBook(){
          int id = Integer.parseInt(fieldId.getText()) -1;
          bookName.set(id, fieldBookName.getText());
          authorName.set(id, fieldAuthorName.getText());       
      }
   
       
   public BookServices() {
        initComponents();
        changeAllVisible(false);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFindById = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFindBook = new javax.swing.JButton();
        fieldAuthorName = new javax.swing.JTextField();
        fieldBookName = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnSet = new javax.swing.JButton();
        fieldId = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perpustakaan Usman Bin Affan");

        btnAdd.setText("Add Book");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Book");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFindById.setText("Find Book By ID");
        btnFindById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByIdActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Book");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFindBook.setText("Find Book List");
        btnFindBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindBookActionPerformed(evt);
            }
        });

        fieldAuthorName.setText("Author name");
        fieldAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAuthorNameActionPerformed(evt);
            }
        });

        fieldBookName.setText("Book name");
        fieldBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBookNameActionPerformed(evt);
            }
        });

        btnSet.setText("Set");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        fieldId.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFindBook, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBookName))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFindBook, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      changeAllVisible(false);
      changeAllVisibleUpdate(true);
      changeMenu("Update");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFindBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindBookActionPerformed
        findListBook();
        changeAllVisible(false);
        
    }//GEN-LAST:event_btnFindBookActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        fieldBookName.setText("Book name");
        changeBookNameVisible(false);
        changeAllVisible(true);
        changeMenu("add");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFindByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByIdActionPerformed
        fieldBookName.setText("ID Book");
        changeBookNameVisible(true);
        changeMenu("findById");
        findListBook();
    }//GEN-LAST:event_btnFindByIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       fieldBookName.setText("ID Book");
       changeAllVisible(false);
       
       changeBookNameVisible(true);
       changeMenu("delete");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void fieldBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBookNameActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        switch (menu){
            case "add":
                addBook();
                break;
                
            case "delete":
            deleteBook(Integer.parseInt(fieldBookName.getText()));
            break;
            
            case "update":
                    updateBook();
                    break;
                    
            case "findById":
                findListBookById(Integer.parseInt(fieldBookName.getText()));
                break;
        }
    }//GEN-LAST:event_btnSetActionPerformed

    private void fieldAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAuthorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAuthorNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindBook;
    private javax.swing.JButton btnFindById;
    private javax.swing.JButton btnSet;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField fieldAuthorName;
    private javax.swing.JTextField fieldBookName;
    private javax.swing.JButton fieldId;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
    }

