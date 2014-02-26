/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anil Anjuna
 */
public class Tree {
    
    TNode root;
    int count;
    
    public Tree(){
        
        root = null;
        count = 0;
        
                 }
    
    public boolean isEmpty(){        
        
        return root == null;
        
                            }
    
    public void insert(int id,String fname,String sname,String title,String bname){
        
                
        TNode newnode = new TNode(id,fname,sname,title,bname,null,null);
        
        if(isEmpty())           
            root = newnode;
        
        else{
            
            TNode temp = root;
            TNode parent = root;
            
             while(temp != null)
             {
                 parent = temp;
                 if(temp.id > id)
                     temp = temp.left;
                  else
                     temp = temp.right;           
             }
             
             if (parent.id > id)
                 
                 parent.left = newnode;
             else
                 parent.right = newnode;             
                      
             count++;    
            
            } 
            
        }
    

//    
//    public void inOrderTraverse(TNode n){
//        if (n == null)
//            return;
//            else
//              {
//                inOrderTraverse(n.left);
//                System.out.print(n.id + "\t");                
//                inOrderTraverse(n.right);                
//                
//              }          
//                                         }
//    
//     public void preOrderTraverse(TNode n){
//        if (n == null)
//            return;
//            else
//              {
//                System.out.print(n.id + "\t");
//                postOrderTraverse(n.left);
//                postOrderTraverse(n.right);                
//                
//              }          
//                                         }
//    
//    public void postOrderTraverse(TNode n){
//            
//            if (n == null)
//            return;
//            else
//              {
//                postOrderTraverse(n.left);
//                postOrderTraverse(n.right);
//                System.out.print(n.id + "\t");
//                
//                }  
//                                          }
//    

    
//    public TNode searchNode(int id){
//        
//        TNode temp = root;
//        
//        while(temp!=null){
//            
//            if(temp.id == id)
//                break;
//            else{
//                if(temp.id>id)
//                    temp = temp.left;
//                else 
//                    temp = temp.right;
//                
//            }
//            
//        }
//        
//        return temp;   
//        
//        
//                                  }
    
    public boolean searchNode(int id){
         
        boolean status = false;
        TNode temp = root;
        System.out.println("root id = "+temp.id);
        
        
        while(temp!=null){
            
            if(temp.id == id)      
                                              
                break;        
                
            else{
                if(temp.id>id)
                    temp = temp.left;
                else 
                    temp = temp.right;
                
                }
            
        
        }
        
         if(temp != null){
                        System.out.println("\n ID found complete");
                        System.out.println("search element"+": "+temp.id+", "+temp.fname+", "+temp.sname+", "+temp.title+", "+temp.bname);
                        status = true;
                         }
        
        else
             System.out.println("\n ID found not complete");
        
        return status;   
        
        
                                  }
    public void delete(int k)
     {
         if (isEmpty())
             //System.out.println("Tree is Empty");
             JOptionPane.showMessageDialog(null,"Tree is Empty");
       
     }
    
   
    
//    public TNode delete(int id){
//        
//                TNode temp = root;
//        
//        while(temp!=null){
//            
//            if(temp.id == id)
//                break;
//            else{
//                if(temp.id>id)
//                    temp = temp.left;
//                else 
//                    temp = temp.right;
//                
//            }
//            
//        }
//        
//        return temp; 
//        
//                              }
    
    
    
    
                              }
