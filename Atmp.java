import java.awt.*;
import java.awt.event.*;

import java.lang.*;
import java.io.*;

public class Atmp extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,bd,bn,bt,bp,bf,bw;
	TextField t1,t2,t3,t4,t5,t6,k1,k2;
	TextField x1,x2,x3,x5,x6,x10;
	int a=0,b=0,c=0,d=0,h=0,l=0,q=0,w=0;
	int e=0;
	String s1=new String();
	String s2=new String();
	String s3=new String();
	String s4=new String();
	String g1=new String();
	String g2=new String();
	String g3=new String();
	String g4=new String();
	String n1=new String("NISHA");
	String n2=new String("NIKITA");
	String n3=new String("RACHNA");
	String n4=new String("SHASHI");
	String n5=new String("LOKI");
	int money[]={10000,10000,10000,10000,10000};
	int z[]={5197,5198,5199,5200,5196};
	int p[]={97,98,99,20,96};
	
	Atmp()
	{ 
		Label m1=new Label("Enter your Account Number ");
		m1.setBounds(50,150,500,40);
		Font my = new Font("Bulmer",Font.BOLD,30);
		this.k1=new TextField();
		k1.setBounds(600,150,200,40);
		m1.setFont(my);
		add(k1);
		add(m1);

		Label m2=new Label("Enter you pin number");
		m2.setBounds(50,250,500,40);
		this.k2=new TextField();
		k2.setBounds(600,250,200,40);
		m2.setFont(my);
				
		bn=new Button("Done");
		bn.setBounds(650,400,100,50);	
		bn.addActionListener(this);
		add(bn);
		add(k2);
		add(m2);
		//setBackground(Color.BLUE);
		setSize(1600,1600);
		setLayout(null);
		setVisible(true);
}

	public void mainpage()
	{
	

		Frame fra=new Frame();
		b1=new Button("Deposit");
		b2=new Button("Transfer");
		b3=new Button("Pin Change");
		b4=new Button("Fast Cash");
		b5=new Button("Cash Withdrawal");
		b6=new Button("Balance Inquiry");
		b7=new Button("Mini Statement");
		b8=new Button("Print");
		b1.setBounds(50,150,200,80);
		b2.setBounds(50,300,200,80);
		b3.setBounds(50,450,200,80);
		b4.setBounds(50,600,200,80);
		b5.setBounds(1100,150,250,80);
		b6.setBounds(1100,300,250,80);
		b7.setBounds(1100,450,250,80);
		b8.setBounds(1100,600,250,80);
		Font myFont = new Font("Bulmer", Font.BOLD,26);
		b1.setFont(myFont);
		b1.setBackground(Color.lightGray);
		b2.setFont(myFont);
		b2.setBackground(Color.lightGray);
		b3.setFont(myFont);
		b3.setBackground(Color.lightGray);
		b4.setFont(myFont);
		b4.setBackground(Color.lightGray);
		b5.setFont(myFont);
		b5.setBackground(Color.lightGray);
		b6.setFont(myFont);
		b6.setBackground(Color.lightGray);
		b7.setFont(myFont);
		b7.setBackground(Color.lightGray);
		b8.setFont(myFont);
		b8.setBackground(Color.lightGray);

		b1.addActionListener(this);	fra.add(b1);
		b2.addActionListener(this);	fra.add(b2);
		b3.addActionListener(this);	fra.add(b3);
		b4.addActionListener(this);	fra.add(b4);
		b5.addActionListener(this);	fra.add(b5);
		b6.addActionListener(this);	fra.add(b6);
		b7.addActionListener(this);	fra.add(b7);
		b8.addActionListener(this);	fra.add(b8);
		Label l1,l2;
		l1=new Label("Welcome to ATM");
		l1.setBounds(500,150,450,90);
		Font myFon = new Font("Comic Sans",Font.BOLD,50);
		l1.setFont(myFon);
		l2=new Label("Click your choice");
		l2.setBounds(500,300,450,90);
		l2.setFont(myFon);
		fra.add(l1);
		fra.add(l2);
		//fra.setBackground(Color.WHITE);
		fra.setSize(1600,1600);
		fra.setLayout(null);
		fra.setVisible(true);
		addWindowListener(new WindowAdapter()
               {	public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
     		});

	
}
	public void deposit()
	{
		Frame fra1=new Frame();
		Label d1,d2;
		d1=new Label("Enter the amount to be deposited");
		d1.setBounds(50,150,500,40);
		Font myFo = new Font("Bulmer",Font.BOLD,30);
		
		this.t1=new TextField();
		t1.setBounds(600,150,200,40);
		d1.setFont(myFo);
		
		fra1.add(d1);
		fra1.add(t1);
		
		bd=new Button("Done");
		bd.setBounds(600,400,100,50);	
		fra1.add(bd);
		bd.addActionListener(this);	
		//fra1.setBackground(Color.WHITE);
		fra1.setSize(1600,1600);
		fra1.setLayout(null);
		fra1.setVisible(true);

	
}
	public void transfer()
	{
		Frame fra2=new Frame();
		Label tr1,tr2;
		
		tr1=new Label("Enter the Account number ");
		tr1.setBounds(50,150,500,40);
		Font myF = new Font("Bulmer",Font.BOLD,30);
		t2=new TextField();
		t2.setBounds(600,150,200,40);
		tr1.setFont(myF);
		fra2.add(tr1);
		fra2.add(t2);

		tr2=new Label("Enter the amount to be Transfered");
		tr2.setBounds(50,250,500,40);
		t3=new TextField();
		t3.setBounds(600,250,200,40);
		tr2.setFont(myF);
		fra2.add(tr2);
		fra2.add(t3);

		bt=new Button("Done");
		bt.setBounds(600,400,100,50);	
		fra2.add(bt);
		bt.addActionListener(this);

		//fra2.setBackground(Color.WHITE);
		fra2.setSize(1600,1600);
		fra2.setLayout(null);
		fra2.setVisible(true);
	}
	public void pin()
	{
		Frame fra3=new Frame();
		Label vp1,vp2,vp3;
		
		vp1=new Label("Enter your old Pin Number ");
		vp1.setBounds(50,150,500,40);
		Font myFon = new Font("Bulmer",Font.BOLD,30);
		t4=new TextField();
		t4.setBounds(600,150,200,40);
		vp1.setFont(myFon);
		fra3.add(vp1);
		fra3.add(t4);

		vp2=new Label("Enter your new Pin Number ");
		vp2.setBounds(50,250,500,40);
		
		t5=new TextField();
		t5.setBounds(600,250,200,40);
		vp2.setFont(myFon);
		fra3.add(vp2);
		fra3.add(t5);

		bp=new Button("Done");
		bp.setBounds(600,400,100,50);	
		fra3.add(bp);
		bp.addActionListener(this);

		//fra3.setBackground(Color.WHITE);
		fra3.setSize(1600,1600);
		fra3.setLayout(null);
		fra3.setVisible(true);
	}
	public void fast_cash()
	{
		Frame fra4=new Frame();

		Label fc1=new Label("    Click on Done to Withdraw 500 Rupees ");
		fc1.setBounds(50,150,700,40);
		Font my = new Font("Bulmer",Font.BOLD,30);
		fra4.add(fc1);
		fc1.setFont(my);


		bf=new Button("Done");
		bf.setBounds(600,250,100,50);	
		fra4.add(bf);
		bf.addActionListener(this);
		this.x1=new TextField();
		x1.setBounds(500,350,300,30);
		fra4.add(x1);

		//fra4.setBackground(Color.WHITE);
		fra4.setSize(1600,1600);
		fra4.setLayout(null);
		fra4.setVisible(true);
	}
	public void withdrawal()
	{
		Frame fra5=new Frame();

		Label wi1=new Label(" Enter amount to be Withdrawn");
		wi1.setBounds(50,150,600,40);
		Font my = new Font("Bulmer",Font.BOLD,30);
		fra5.add(wi1);
		wi1.setFont(my);

		this.x10=new TextField();
		x10.setBounds(700,150,200,30);
		fra5.add(x10);
		bw=new Button("Done");
		bw.setBounds(600,400,100,50);	
		fra5.add(bw);
		bw.addActionListener(this);

		//fra5.setBackground(Color.WHITE);
		fra5.setSize(1600,1600);
		fra5.setLayout(null);
		fra5.setVisible(true);
	}
	public void inquiry()
	{
		Frame fra8=new Frame();
		Label i1=new Label("   Current Balance is ");
		i1.setBounds(50,150,300,40);
		Font my = new Font("Bulmer",Font.BOLD,30);
		fra8.add(i1);
		i1.setFont(my);

		this.x2=new TextField();
		x2.setBounds(400,150,200,30);
		fra8.add(x2);

		//fra8.setBackground(Color.WHITE);
		fra8.setSize(1600,1600);
		fra8.setLayout(null);
		fra8.setVisible(true);
	}
	public void statement()
	{
		Frame fra6=new Frame();
		
		Font my = new Font("Bulmer",Font.BOLD,20);
		/*Label st1=new Label("  "+n1);
		st1.setBounds(100,150,300,40);
		fra6.add(st1);
		st1.setFont(my);*/

		Label st2=new Label(" Account Number:  "+b);
		st2.setBounds(300,200,400,40);
		fra6.add(st2);
		st2.setFont(my);
		  for(int i=0;i<=4;i++)
		    	 {
			if(p[i]==c)
			  {
		Label st3=new Label("Deposited Amount : "+a);
		st3.setBounds(100,250,600,40);
		fra6.add(st3);
		st3.setFont(my);
		Label st4=new Label("\nTransfered Amount: "+q);
		st4.setBounds(100,300,600,40);
		fra6.add(st4);
		st4.setFont(my);
		Label st5=new Label("\nFast cash Taken: "+l);
		st5.setBounds(100,350,600,40);
		fra6.add(st5);
		st5.setFont(my);
		Label st6=new Label("Current 	Balance: "+money[i]);
		st6.setBounds(100,400,600,40);
		fra6.add(st6);
		st6.setFont(my);
		Label st7=new Label("Withdrawn Amount: "+w);
		st7.setBounds(100,450,600,40);
		fra6.add(st7);
		st7.setFont(my);}}

		//fra6.setBackground(Color.WHITE);
		fra6.setSize(1600,1600);
		fra6.setLayout(null);
		fra6.setVisible(true);
	}
	public void other()
	{
		Frame fra7=new Frame();
		//fra7.setBackground(Color.WHITE);
		fra7.setSize(1600,1600);
		fra7.setLayout(null);
		fra7.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==bn)	//mainpage
		     {
			int k=0;
			g1=k1.getText();
			b=Integer.parseInt(g1);
			g2=k2.getText();
			c=Integer.parseInt(g2);
			for(int i=0;i<=4;i++)
			{if(z[i]==b && p[i]==c)
			  k++;}
			 if(k==1)
			    mainpage();
			else 
			 {
				bn.addActionListener(new ActionListener()
		
	   			           {
	public void actionPerformed(ActionEvent e)
			
	                			   {
	setVisible(false);
	}
		
				});

			}
		      }
		if(e.getSource()==b1)
			deposit();
		if(e.getSource()==b2)
			transfer();
		if(e.getSource()==b3)
			pin();
		if(e.getSource()==b4)
			fast_cash();
		if(e.getSource()==b5)
			withdrawal();
		if(e.getSource()==b6)	//balance
		{  inquiry();
		{
		   for(int i=0;i<=4;i++)
		    	 {
			if(p[i]==c)
			  {
			 System.out.println("Your current Balance is:  "+money[i]);
			 x2.setText("  "+money[i]);
			}
			}
		}
		}
			
		if(e.getSource()==b7)
			statement();
		if(e.getSource()==b8)
			other();
		if(e.getSource()==bd)	//deposit
		{
		s1=t1.getText();
		a=Integer.parseInt(s1);	
		      for(int i=0;i<=4;i++)
			{
			    if(p[i]==c)
			    {
				money[i]=money[i]+a;
			     }		
			}
		System.out.println("Deposited amount is: "+a);

		}
		if(e.getSource()==bp)	//pin
		 {	
			int k=0;
			g3=t4.getText();
			//d=Integer.parseInt(g3);
			g4=t5.getText();
			//e=Integer.parseInt(g4);
			
			for(int i=0;i<=4;i++)
			{
			    if(p[i]==c)
			    {
			 	p[i]=Integer.parseInt(g4);
			 	 System.out.println("\nPin number has been changed Sucessfully.");
			 	 k++;
			     } 
			}
			if(k!=1)
			System.out.println("Enter correct Pin Number");
		       }
		if(e.getSource()==bf)		//fastcash
		   {	l++;
			for(int i=0;i<=4;i++)
			{
			    if(p[i]==c)
			    {
			 	money[i]=money[i]-500;
			 	System.out.println("\n500 Rupees has been Withdrawn\nCurrent balance:  "+money[i]);

				x1.setText("500 Rupees has been Withdrawn");
			     } 
			}	
		}
		



		if(e.getSource()==bt)		//transfer
		
		{
		int k=0,i;
		s2=t2.getText();
		h=Integer.parseInt(s2);
		s3=t3.getText();
		q=Integer.parseInt(s3);	
		      for(i=0;i<=4;i++)
			{
			    if(p[i]==c)
			    {
			       money[i]=money[i]-q;
			      System.out.println("Transfered amount is: "+q); break;
			}}
			 for(i=0;i<=4;i++)
			{	
			    if(h==z[i])
			     {  money[i]=money[i]+q;
			         System.out.println("Amount is transfered to Account  Number: "+z[i]);
				k++;}}
			if(k==0)
			System.out.println("Amount is transfered to an account in another bank");

		}
		if(e.getSource()==bw)
		{
		s4=x10.getText();
		w=Integer.parseInt(s4);	
		      for(int i=0;i<=4;i++)
			{
			    if(p[i]==c)
			    {
				money[i]=money[i]-w;
				System.out.println(w+"  amount has been withdrawn");
			     }		
			}}
}
	public static void main(String[] args) 
	{
		
		Atmp f=new Atmp();
		//public deposit();
	}

}