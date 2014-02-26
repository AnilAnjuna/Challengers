
import javax.swing.JOptionPane;


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
    
 
    public TNode searchNode(int id){
        
        TNode temp = root;
        
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
        
        return temp;
        
        }

    
     public void delete(int k)
     {
         if (isEmpty())
             
             JOptionPane.showMessageDialog(null,"Tree is Empty");
         else if (searchNode(k) == null)
            
             JOptionPane.showMessageDialog(null,+k+" "+"is not in the current tree");
         else
         {
             root = delete(root, k);
             
             JOptionPane.showMessageDialog(null,+k+" "+" deleted from the tree");
             
         }
     }
      
     private TNode delete(TNode root, int k)
     {
         TNode p, p2, n;
         if (root.getId() == k)
         {
             TNode left, right;
             left = root.getLeft();
             right = root.getRight();        
             if (left == null && right == null)                 
                 return null;                                               
             else if (left == null)
             {
                 p = right;
                 
                 return p;
             }
             else if (right == null)
             {
                 p = left;
                 
                 return p;
             }
             else
             {
                 p2 = right;
                 p = right;
                 while (p.getLeft() != null)
                     p = p.getLeft();
                 p.setLeft(left);
                 return p2;
             }
         }
         if (k < root.getId())
         {
             n = delete(root.getLeft(), k);
             root.setLeft(n);
         }
         else
         {
             n = delete(root.getRight(), k);
             root.setRight(n);             
         }
         return root;
         
     }
    

     public TNode getRoot(){
         
         return root;
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
                preOrderTraverse(n.left);
                preOrderTraverse(n.right);                
                
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

    
     
    
    
    
                              }
