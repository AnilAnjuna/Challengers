import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Anil Anjuna
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
//    Vector det2 = new Vector();  
//    Vector n2;
    
    String title2[]={"ID","fName","sname","title","bookname"};
    private Object[][] types = null;
    DefaultTableModel model = new DefaultTableModel(types,title2);
    
    private int current = -1;
    
    int id;
    String fname;
    String sname;
    String title;
    String bname;
    
    Tree mytree = new Tree();   // object of Tree class to using all methods
 
    
    public Home() {
        initComponents();      
        
                  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtisbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbtitle = new javax.swing.JComboBox();
        btnInsert = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnInOrder = new javax.swing.JButton();
        btnPreOrder = new javax.swing.JButton();
        btnPostOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ISBN");

        txtisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisbnActionPerformed(evt);
            }
        });

        jLabel2.setText("Author f name");

        jLabel3.setText("Author s name");

        jLabel4.setText("title");

        cmbtitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java", "Php" }));

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnInOrder.setText("InOrder");
        btnInOrder.setActionCommand("inOrder");
        btnInOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrderActionPerformed(evt);
            }
        });

        btnPreOrder.setText("PreOrder");
        btnPreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrderActionPerformed(evt);
            }
        });

        btnPostOrder.setText("PostOrder");
        btnPostOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrderActionPerformed(evt);
            }
        });

        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "fname", "sname", "title", "bookname"
            }
        ));
        tableBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBook);

        jLabel5.setText("Book Name");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtisbn)
                                    .addComponent(txtfname)
                                    .addComponent(txtsname)
                                    .addComponent(cmbtitle, 0, 233, Short.MAX_VALUE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPreOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPostOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert)
                    .addComponent(btnInOrder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreOrder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPostOrder)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void txtisbnActionPerformed(java.awt.event.ActionEvent evt) {                                        
      
        
        
    }                                       

    public void clear(){
        
        txtisbn.setText("");
        txtsname.setText("");
        txtfname.setText("");
        txtsname.setText("");
        txtbookname.setText("");
        txtsearch.setText("");
        
                
    }
    
////    private void fillForm(int position){
////        
////        
////        
////        //System.out.println("nadsadjak");
////        
////        txtisbn.setText("10");
////        
////        txtisbn.setText(types[position][0].toString());  
////        txtfname.setText(types[position][1].toString());        
////        txtsname.setText(types[position][2].toString());
////        cmbtitle.setSelectedItem(types[position][3].toString());
////        txtbookname.setText(types[position][4].toString());
////        
////        
////        
////                         }
    
        
//     public void fillTable(){
//        
////        TNode t1 = new TNode(id,fname,sname,title,bname,null,null);
////        
////        String[] arr = new String[5];       
////        
////        arr[0] = String.valueOf(t1.getId());
////        arr[1] = t1.getFname();
////        arr[2] = t1.getSname();
////        arr[3] = t1.getTitle();
////        arr[4] = t1.getBname();
//        
//////        arr[0] = "jjjj";
//////        arr[1] = "jskdjfks";
//////        arr[2] = "hadhja";
//////        arr[3] = "bhhada";
//////        arr[4] = "ndmasmnam";
//////        
//////        System.out.println(arr[0]);
//        
////        model.addRow(arr);
////        tableBook.setModel(model);
//        
//      //  tableBook.addRowSelectionInterval(id, id);
//        
////        String title2[]={"ID","fName","sname","title","bookname"};
////        DefaultTableModel model = new DefaultTableModel(t1.getId(),title2);
//           //     add
//        //tableBook.setModel(model);
//        
//                            }
    
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {                                          

        id    = Integer.parseInt(txtisbn.getText());
        fname =txtfname.getText();
        sname =txtsname.getText();
        title = cmbtitle.getSelectedItem().toString();
        bname =txtbookname.getText();
        
        TNode result = mytree.searchNode(id);    // to check whether assigning isbn is currently in tree
        
        if(result != null){        // if search method in tree output is a Node
        
        JOptionPane.showMessageDialog(null,+id+" "+"ISBN is already inserted");  //view that feedback    
            
        }
        
        else{
             
             
        mytree.insert(id,fname,sname,title,bname);
        
        TNode t1 = new TNode(id,fname,sname,title,bname,null,null);
        
        String[] arr = new String[5];       
        
        arr[0] = String.valueOf(t1.getId());
        arr[1] = t1.getFname();
        arr[2] = t1.getSname();
        arr[3] = t1.getTitle();
        arr[4] = t1.getBname();  
        
        model.addRow(arr);
        tableBook.setModel(model);
            
            
        }
        
        clear();
        
    //    mytree.insert(id,fname,sname,title,bname);
        
     //   TNode t1 = new TNode(id,fname,sname,title,bname,null,null);
        
     //   String[] arr = new String[5];       
        
     //   arr[0] = String.valueOf(t1.getId());
     //   arr[1] = t1.getFname();
      //  arr[2] = t1.getSname();
     //   arr[3] = t1.getTitle();
      //  arr[4] = t1.getBname();  
        
      //  model.addRow(arr);
      //  tableBook.setModel(model);
       // clear();

//////        n2 = new Vector();                 // create vector, to assign input data  
//////        
//////       
//////        n2.add(txtisbn.getText());
//////        n2.add(txtfname.getText());
//////        n2.add(txtsname.getText());        
//////        n2.add(cmbtitle.getSelectedItem());
//////        n2.add(txtbookname.getText());
//////
//////        det2.add(n2);                    // add n2 vector data to det2 vector
//////        System.out.println(det2);

        //add data into jtable  
//       DefaultTableModel dtm = (DefaultTableModel) tableBook.getModel();
//       dtm.addRow(det2);            
        
        
//        fillTable();
       
           
    }                                         

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        txtisbn.setText("");
        txtsname.setText("");
        txtfname.setText("");
        txtsname.setText("");
        txtbookname.setText("");
        txtsearch.setText("");
        
    }                                        

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
   
        int t1 = Integer.parseInt(txtsearch.getText());     // get searh element from textfield
        TNode findingnode = mytree.searchNode(t1);          // pass to Tree class
        
    if(findingnode != null){            
//                        System.out.println(findingnode.id);     // retrieve data and view
//            System.out.println("\n ID found complete"); 
             //JOptionPane.showMessageDialog(null,"Found Element "+" : "+findingnode.getId()+", "+findingnode.getFname()+", "+findingnode.getSname()+", "+findingnode.getTitle()+", "+findingnode.getBname());
             JOptionPane.showMessageDialog(null,"Found Element "+"\n-------------------------"+"\n ISBN - "+findingnode.getId()+"\n FName -"+findingnode.getFname()+"\n SName - "+findingnode.getSname()+"\n Title - "+findingnode.getTitle()+"\n BName - "+findingnode.getBname());    
                               }
//        
        else
//             System.out.println("\n ID found not complete");
            JOptionPane.showMessageDialog(null,"\n ID is not in current Tree");       
        
        
        
    }                                         

    private void btnInOrderActionPerformed(java.awt.event.ActionEvent evt) {                                           
//          
//        Tree mytree = new Tree();     
//        
//        
//        for(int i=0; i<det1.size() ; i++)
//                                          {
//            
//        mytree.insert(Integer.parseInt(det1.get(i).toString()));
//          
//                                          }
//        
       System.out.println("\n-----------------------------------------");
       mytree.inOrderTraverse(mytree.root);
//       
    }                                          

    private void btnPreOrderActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
//        Tree mytree = new Tree();     
//        
//        
//        for(int i=0; i<det1.size() ; i++)
//                                          {
//            
//        mytree.insert(Integer.parseInt(det1.get(i).toString()));
//          
//                                          }
//        
//        System.out.println("\n-----------------------------------------");
//        mytree.preOrderTraverse(mytree.root);  
//       
    }                                           

    private void btnPostOrderActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
//        Tree mytree = new Tree();     
//        
//        
//        for(int i=0; i<det1.size() ; i++)
//                                          {
//            
//        mytree.insert(Integer.parseInt(det1.get(i).toString()));
//          
//                                          } 
//        
//        System.out.println("\n-----------------------------------------");
//        mytree.postOrderTraverse(mytree.root); 
    }                                            

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          

        int d1 = Integer.parseInt(txtsearch.getText());
        mytree.delete(d1);
        
        clear();
        
        
        
        
        
//                int t1 = Integer.parseInt(txtsearch.getText());
//                TNode findingnode = mytree.delete(t1);
//                
//        if(findingnode != null){
//            
//            System.out.println("\n ID found complete");
//                  
//            det1.remove(det1.indexOf(t1));
//            
//            
//                                 
//                               }
//        
//        else
//             System.out.println("\n ID found not complete");
//                
//                
//        
//        
//        
//        
//        
//        
    }                                         

    private void tableBookMouseClicked(java.awt.event.MouseEvent evt) {                                       
       
      
    }                                      

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Home nm = new Home();
                nm.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnInOrder;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnPostOrder;
    private javax.swing.JButton btnPreOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox cmbtitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBook;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsname;
    // End of variables declaration                   
}
