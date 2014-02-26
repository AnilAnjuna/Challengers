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
    
    public boolean isEmpty(){        //to check array is empty and get boolean return true or false
        
        return root == null;
        
                            }
    
    public void insert(int id,String fname,String sname,String title,String bname){   //get parameters from home which is inputed by textfields
        
                
        TNode newnode = new TNode(id,fname,sname,title,bname,null,null);     //pass the data to TNode class with to nulls because of left , right variables
        
        if(isEmpty())           
            root = newnode;             // check whwther tree is empty
        
        else{
            
            TNode temp = root;         //assign root to two elements as parent and temp
            TNode parent = root; 
            
             while(temp != null)       //is there root 
             {
                 parent = temp;
                 if(temp.id > id)              // check temp.id(value) and flow through program while checking left and right nodes
                     temp = temp.left;
                  else
                     temp = temp.right;           
             }
             
             if (parent.id > id)              // assign the real place to that comming node
                 
                 parent.left = newnode;
             else
                 parent.right = newnode;             
                      
             count++;                     //increment count
            
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
    
    public boolean searchNode(int id){                   //search node with getting parameter from home
         
        boolean status = false;                          //to get return 
        TNode temp = root;                               //root element get in to the variable as temp
        System.out.println("root id = "+temp.id);      
        
        
        while(temp!=null){                          //checking whther till there is no root
            
            if(temp.id == id)      
                                              //we can assume there is an one node hi hi hi
                break;        
                
            else{                              // checking left to righ elements
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
                                  
    public void delete(int k)                //get parameter from home eith search text box                   
     {
         if (isEmpty())
             //System.out.println("Tree is Empty");
             JOptionPane.showMessageDialog(null,"Tree is Empty");    //
         else if (searchNode(k) != true)
             System.out.println(+k+" "+"is not in the tree");          //check there is this node so pass the parameter to serach method
         else
         {
             root = delete(root, k);                                 //else pass the element to delete method 
             //System.out.println(k+ " deleted from the tree");
       
         }
         
     }
     
     private TNode delete(TNode root, int k)    //getting data from void type delete method
     {
         TNode p, p2, n                        //allocate the variables
         if (root.getId() == k) 
         
         {
             TNode left, right;
             left = root.getLeft();                 //get left element to this variable
             right = root.getRight();               //get right
              if (left == null && right == null)    //check those are null
                 return null;
             
         }
         
         
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
