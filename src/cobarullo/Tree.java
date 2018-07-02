package ta_strategi.algoritma_rullo;

public class Tree {
    private Node root;
    public void cekroot(){
        System.out.println("Nilai root : "+root.data);
    }
    
    public boolean isempty(){
        return root==null;
    }
    
    public void insert(int i){
        Node temp=new Node(i);
        Node y=null;
        Node x=root;
        
        if(isempty()){
            System.out.println("Nilai "+i+" menjadi root");
            root=temp;
        }
        else{
            while(x!=null){
                y=x;
                if(i<x.data)
                    x=x.left;
                else
                    x=x.right;
            }
            if(i<y.data){
                y.left=temp;
                System.out.println("Nilai "+i+" masuk sebelah kiri "+y.data);
            }
            else{
                y.right=temp;
                System.out.println("Nilai "+i+" masuk sebelah kanan "+y.data);
            }
        }
    }
    
    public void searching(int i){
        Node temp=root;
        boolean hasil=false;
        while(temp!=null){
            if(temp.data==i){
                hasil=true;
                break;
            }
            
            if(i<temp.data)
                temp=temp.left;
            else
                temp=temp.right;
        }
        
        if(hasil)
            System.out.println("Data ditemukan");
        else
            System.out.println("Maaf, data tidak ditemukan");
    }
    
    public void uruttree(Node i){
        Node temp=i;
        
        if(temp!=null){
            uruttree(temp.left);
            System.out.println(temp.data);
            uruttree(temp.right);
        }
    }
    
    public void urutroot(){
        System.out.println("Mengurutkan Tree : ");
        uruttree(root);
    }
    
    public Node minvalue(Node i){
        Node temp=i;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    
    public void transplanted(Node del, Node reply){
        if(del.parent==null)
            root=reply;
        else if(del==del.parent.left)
            del.parent.left=reply;
        else
            del.parent.right=reply;
        if(reply!=null){
            reply.parent=del.parent;
        }
    }
    
    public void delete(int i){
        Node y=null;
        Node x=root;
        while((x!=null)&&(x.data!=i)){
            y=x;
            if(i<x.data){
                x=x.left;
            }
            else{
                x=x.right;
            }
        }
        if(x==null){
            System.out.println("Data tidak ditemukan");
        }
        else{
            x.parent=y;
            if(x.left==null){
                transplanted(x,x.right);
            }
            else if(x.right==null){
                transplanted(x,x.left);
            }
            else{
                Node min=minvalue(x.right);
                if(x.right!=min){
                    transplanted(min,min.right);
                    min.right=x.right;
                    min.right.parent=min;
                
                    transplanted(x,min);
                    min.left=x.left;
                    min.left.parent=min;
                }
                System.out.println("Nilai "+i+" telah dihapus");
            }
        }
    }
}