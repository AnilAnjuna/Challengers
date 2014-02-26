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
    
    
    
    

 public TNode(int id,String fname,String sname,String title,String bname,TNode left,TNode right){
        
        this.id = id;
        this.fname=fname;
        this.sname=sname;
        this.title=title;
        this.bname = bname;
        this.left = left;
        this.right = right;
        
    }
    
     public int getId() {
        return id;                          //generate getters and setters to easy implmentations
    }

    public void setId(int id) {
        this.id = id;
    }

    public TNode getLeft() {
        return left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
 
    
}
