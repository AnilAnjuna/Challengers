/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anil Anjuna
 */
public class TNode {
    
    int id;
    TNode left;
    TNode right;
    String fname;
    String sname;
    String title;
    String bname;
    
    
    
    
//public TNode(int id,TNode left,TNode right){
//        
//        this.id = id;
//        this.left = left;
//        this.right = right;
//        
//    }

 public TNode(int id,String fname,String sname,String title,String bname,TNode left,TNode right){
        
        this.id = id;
        this.fname=fname;
        this.sname=sname;
        this.title=title;
        this.bname = bname;
        this.left = left;
        this.right = right;
        
    }
    
}
