import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
public class tree implements TreeSelectionListener
{
    tree()
    {
        JFrame f1= new JFrame();
        f1.setVisible(true);
        f1.setSize(500,500);
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Cse-MBA");  
        DefaultMutableTreeNode first_year=new DefaultMutableTreeNode("1st year");  
        DefaultMutableTreeNode second_year=new DefaultMutableTreeNode("2nd year");  
        DefaultMutableTreeNode third_year=new DefaultMutableTreeNode("3rd year");
        DefaultMutableTreeNode fourth_year=new DefaultMutableTreeNode("4th year");
        DefaultMutableTreeNode fifth_year=new DefaultMutableTreeNode("5th year");
        
        root.add(first_year);
        root.add(second_year);
        root.add(third_year);
        root.add(fourth_year);
        root.add(fifth_year);
        
        DefaultMutableTreeNode tr1=new DefaultMutableTreeNode("Trimester 1"); 
        DefaultMutableTreeNode tr2=new DefaultMutableTreeNode("Trimester 2"); 
        DefaultMutableTreeNode tr3=new DefaultMutableTreeNode("Trimester 3"); 
        DefaultMutableTreeNode tr4=new DefaultMutableTreeNode("Trimester 4"); 
        DefaultMutableTreeNode tr5=new DefaultMutableTreeNode("Trimester 5");
        DefaultMutableTreeNode tr6=new DefaultMutableTreeNode("Trimester 6");
        DefaultMutableTreeNode tr7=new DefaultMutableTreeNode("Trimester 7");
        DefaultMutableTreeNode tr8=new DefaultMutableTreeNode("Trimester 8");
        DefaultMutableTreeNode tr9=new DefaultMutableTreeNode("Trimester 9");
        DefaultMutableTreeNode t1=new DefaultMutableTreeNode("Term 1");
        DefaultMutableTreeNode t2=new DefaultMutableTreeNode("Term 2");
        DefaultMutableTreeNode t3=new DefaultMutableTreeNode("Term 3");
        DefaultMutableTreeNode t4=new DefaultMutableTreeNode("Term 4");
        DefaultMutableTreeNode t5=new DefaultMutableTreeNode("Term 5");
        DefaultMutableTreeNode t6=new DefaultMutableTreeNode("Term 6");
       
        first_year.add(tr1);
        first_year.add(tr2);
        first_year.add(tr3);
        
        second_year.add(tr4);
        second_year.add(tr5);
        second_year.add(tr6);
        
        third_year.add(tr7);
        third_year.add(tr8);
        third_year.add(tr9);
        
        fourth_year.add(t1);
        fourth_year.add(t2);
        fourth_year.add(t3);
        
        fifth_year.add(t4);
        fifth_year.add(t5);
        fifth_year.add(t6);
        DefaultMutableTreeNode phy=new DefaultMutableTreeNode("Physics"); 
        DefaultMutableTreeNode la=new DefaultMutableTreeNode("Linear Algebra"); 
        DefaultMutableTreeNode eee=new DefaultMutableTreeNode("Elements of electrical engineering"); 
        DefaultMutableTreeNode fop=new DefaultMutableTreeNode("Fundamentals of Programming"); 
        DefaultMutableTreeNode yoga=new DefaultMutableTreeNode("Yoga"); 
        tr1.add(phy);tr1.add(la);tr1.add(eee);tr1.add(fop);tr1.add(yoga);
        
        DefaultMutableTreeNode eng=new DefaultMutableTreeNode("English"); 
        DefaultMutableTreeNode be=new DefaultMutableTreeNode("Basic Electronics"); 
        DefaultMutableTreeNode sp=new DefaultMutableTreeNode("Structured Programming"); 
        DefaultMutableTreeNode eg=new DefaultMutableTreeNode("Engineering Graphics"); 
        DefaultMutableTreeNode cl=new DefaultMutableTreeNode("Calculus"); 
        tr2.add(eng);tr2.add(be);tr2.add(sp);tr2.add(eg);tr2.add(cl);
        
        DefaultMutableTreeNode oop=new DefaultMutableTreeNode("Object Oriented Programming"); 
        DefaultMutableTreeNode del=new DefaultMutableTreeNode("Digital Electronics"); 
        DefaultMutableTreeNode eng3=new DefaultMutableTreeNode("English 3"); 
        DefaultMutableTreeNode de=new DefaultMutableTreeNode("Differential Equation"); 
        DefaultMutableTreeNode dm=new DefaultMutableTreeNode("Discrete Mathematics"); 
        tr3.add(oop);tr3.add(del);tr3.add(eng3);tr3.add(de);tr3.add(dm);
        
        DefaultMutableTreeNode ooad=new DefaultMutableTreeNode("Object Oriented Application Development"); 
        DefaultMutableTreeNode dsa=new DefaultMutableTreeNode("Data Structures and Algorithm"); 
        DefaultMutableTreeNode pom=new DefaultMutableTreeNode("Principles of Management"); 
        DefaultMutableTreeNode ps=new DefaultMutableTreeNode("Probability and Statistics"); 
        DefaultMutableTreeNode pds=new DefaultMutableTreeNode("Programming in data structures"); 
        tr4.add(ooad);tr4.add(dsa);tr4.add(pom);tr4.add(ps);tr4.add(pds);
        
        DefaultMutableTreeNode a=new DefaultMutableTreeNode("Computer Architecture"); 
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("Digital Communications"); 
        DefaultMutableTreeNode c=new DefaultMutableTreeNode("Database Management System"); 
        DefaultMutableTreeNode d=new DefaultMutableTreeNode("Buisness Communication"); 
        DefaultMutableTreeNode e=new DefaultMutableTreeNode("Python Programming "); 
        tr5.add(a);tr5.add(b);tr5.add(c);tr5.add(d);tr5.add(e);
        
        DefaultMutableTreeNode f=new DefaultMutableTreeNode("Operating System"); 
        DefaultMutableTreeNode g=new DefaultMutableTreeNode("Design and Analysis of Algorithms"); 
        DefaultMutableTreeNode h=new DefaultMutableTreeNode("Software Engineering"); 
        DefaultMutableTreeNode i=new DefaultMutableTreeNode("Cyber Laws"); 
        DefaultMutableTreeNode j=new DefaultMutableTreeNode("Computer Networks"); 
        tr6.add(f);tr6.add(g);tr6.add(h);tr6.add(i);tr6.add(j);
        
        DefaultMutableTreeNode k=new DefaultMutableTreeNode("Artificial Intelligence"); 
        DefaultMutableTreeNode l=new DefaultMutableTreeNode("Machine Learning"); 
        DefaultMutableTreeNode m=new DefaultMutableTreeNode("Information Security"); 
        DefaultMutableTreeNode n=new DefaultMutableTreeNode("Software Project Management"); 
        DefaultMutableTreeNode o=new DefaultMutableTreeNode("Web Technologies"); 
        tr7.add(k);tr7.add(l);tr7.add(m);tr7.add(n);tr7.add(o);
        
        DefaultMutableTreeNode p=new DefaultMutableTreeNode("Internet of Things"); 
        DefaultMutableTreeNode q=new DefaultMutableTreeNode("Mobile OS and Applicarions"); 
        DefaultMutableTreeNode r=new DefaultMutableTreeNode("Data Mining"); 
        DefaultMutableTreeNode s=new DefaultMutableTreeNode("Blockchain Technology"); 
        DefaultMutableTreeNode t=new DefaultMutableTreeNode("Cloud Computing"); 
        tr8.add(p);tr8.add(q);tr8.add(r);tr8.add(s);tr8.add(t);
        
        DefaultMutableTreeNode u=new DefaultMutableTreeNode("Elective 1"); 
        DefaultMutableTreeNode v=new DefaultMutableTreeNode("Elective 2"); 
        DefaultMutableTreeNode w=new DefaultMutableTreeNode("Computer Engineering Project"); 
        tr9.add(u);tr9.add(v);tr9.add(w);
        
        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Financial Accounting and Reporting"); 
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Economic Analysis for Buisness Decisions"); 
        DefaultMutableTreeNode a3=new DefaultMutableTreeNode("Marketing Mangement-1"); 
        DefaultMutableTreeNode a4=new DefaultMutableTreeNode("Organizational Behaviour"); 
        DefaultMutableTreeNode a5=new DefaultMutableTreeNode("Data Analytics for Managers"); 
        DefaultMutableTreeNode a6=new DefaultMutableTreeNode("Communications for Mangers"); 
        DefaultMutableTreeNode a7=new DefaultMutableTreeNode("Operations Management-1"); 
        DefaultMutableTreeNode a8=new DefaultMutableTreeNode("Buisness Ethics"); 
        t1.add(a1);t1.add(a2);t1.add(a3);t1.add(a4);t1.add(a5);t1.add(a6);t1.add(a7);t1.add(a8);
        
        DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Corporate Finance-1"); 
        DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Macroeconomics"); 
        DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Accounting for Decision Making"); 
        DefaultMutableTreeNode b4=new DefaultMutableTreeNode("Marketing Management-2"); 
        DefaultMutableTreeNode b5=new DefaultMutableTreeNode("Operations Research");
        DefaultMutableTreeNode b6=new DefaultMutableTreeNode("Communications for Mangers"); 
        DefaultMutableTreeNode b7=new DefaultMutableTreeNode("Management Informational Sysyem"); 
        DefaultMutableTreeNode b8=new DefaultMutableTreeNode("Opearations Management-2"); 
        DefaultMutableTreeNode b9=new DefaultMutableTreeNode("Human Resource MAnagement"); 
        t2.add(b1);t2.add(b2);t2.add(b3);t2.add(b4);t2.add(b5);t2.add(b6);t2.add(b7);t2.add(b8);t2.add(b9);
        
        DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Corporate Finance-2"); 
        DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Indian Economy in Global Context"); 
        DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Buisness Research Methods"); 
        DefaultMutableTreeNode c4=new DefaultMutableTreeNode("Managing Social Projects"); 
        DefaultMutableTreeNode c5=new DefaultMutableTreeNode("Stratergic Management"); 
        DefaultMutableTreeNode c6=new DefaultMutableTreeNode("Buisness Laws"); 
        DefaultMutableTreeNode c7=new DefaultMutableTreeNode("General Electives"); 
        t3.add(c1);t3.add(c2);t3.add(c3);t3.add(c4);t3.add(c5);t3.add(c6);t3.add(c7);
        
        DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Specialisation Electives");
        t4.add(d1);
        DefaultMutableTreeNode d2=new DefaultMutableTreeNode("Specialisation Electives");
        t5.add(d2);
        DefaultMutableTreeNode d3=new DefaultMutableTreeNode("Specialisation Electives");
        t6.add(d3);
        
        
    JTree tr=new JTree(root);
    f1.add(tr);
    tr.addTreeSelectionListener(this);
    }
    public static void main(String[] args)
    {
      new tree();
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        String s =e.getNewLeadSelectionPath().toString();
        System.out.println(s);
        
    }
    
}
