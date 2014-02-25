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
    
    public void inOrderTraverse(TNode n){
        if (n == null)
            return;
            else
              {
                inOrderTraverse(n.left);
                System.out.print(n.id + "\t");                
                inOrderTraverse(n.right);                
                
              }          
                                         }
    
     public void preOrderTraverse(TNode n){
        if (n == null)
            return;
            else
              {
                System.out.print(n.id + "\t");
                postOrderTraverse(n.left);
                postOrderTraverse(n.right);                
                
              }          
                                         }
    
    public void postOrderTraverse(TNode n){
            
            if (n == null)
            return;
            else
              {
                postOrderTraverse(n.left);
                postOrderTraverse(n.right);
                System.out.print(n.id + "\t");
                
                }  
                                          }
