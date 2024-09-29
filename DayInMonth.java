package javaapplicaton4;
import java.util.Scanner;




	public class javaapplicaton4 {
		
		    public static void main(String[] args) {
		        String[] thang1= {"January","Jan","Jan.", "1"};
		        String[] thang2= {"February","Feb","Feb.", "2"};
		        String[] thang3= {"March","Mar","Mar.", "3"};
		        String[] thang4= {"April","Apr","Apr.", "4"};
		        String[] thang5= {"May", "5"};
		        String[] thang6= {"June","Jun", "6"};
		        String[] thang7= {"July","Jul", "7"};
		        String[] thang8= {"August","Aug","Aug.", "8"};
		        String[] thang9= {"September","Sep","Sept.", "9"};
		        String[] thang10= {"October","Oct","Oct.", "10"};
		        String[] thang11= {"November","Nov","Nov.", "11"};
		        String[] thang12= {"December","Dec","Dec.", "12"};
		        
		       
		        Scanner scanner = new Scanner(System.in);
		        System.out.print(" nhap thang can tim: ");
		        String t = scanner.next();
		        // Nhập chiều cao của tam giác cân từ người dùng
		       int k=0;
		       while(k==0)
		       {
		           for(int i=0 ; i <thang1.length;i++)
		           {
		               if(thang1[i].equals(t))
		               {    k=1;
		                    break;
		               }
		               
		           }
		           if(k!=0)
		               break;
		           for(int i=0 ; i <thang2.length;i++)
		           {
		               if(thang2[i].equals(t))
		               {    k=2;
		                    break;
		               }
		           }
		           if(k!=0)
		               break;
		           for(int i=0 ; i <thang3.length;i++)
		           {
		               if(thang3[i].equals(t))
		               {    k=3;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang4.length;i++)
		           {
		               if(thang4[i].equals(t))
		               {    k=4;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang5.length;i++)
		           {
		               if(thang5[i].equals(t))
		               {    k=5;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang6.length;i++)
		           {
		               if(thang6[i].equals(t))
		               {    k=6;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang7.length;i++)
		           {
		               if(thang7[i].equals(t))
		               {    k=7;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang8.length;i++)
		           {
		               if(thang8[i].equals(t))
		               {    k=8;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang9.length;i++)
		           {
		               if(thang9[i].equals(t))
		               {    k=9;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang10.length;i++)
		           {
		               if(thang10[i].equals(t))
		               {    k=10;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang11.length;i++)
		           {
		               if(thang11[i].equals(t))
		               {    k=11;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           for(int i=0 ; i <thang12.length;i++)
		           {
		               if(thang12[i].equals(t))
		               {    k=12;
		                    break;
		               }
		           }if(k!=0)
		               break;
		           k=13;
		           
		       }    
		       if(k==13)
		       {
		           System.out.println("ban da nhap sai");
		           System.exit(0);
		       }
		        System.out.print(" nhap nam can tim: ");
		        int n = scanner.nextInt();
		        if (n<0)
		        { System.out.println("nam ban nhap khong hop le");
		        System.exit(0);}
		        int m;
		        if(n%4 == 0 && n%400 ==0)
		            m=0;
		        else 
		            m=1;
		        
		        if(k==1 || k==3 || k==5 || k==7 ||k==8|| k == 10|| k==12)
		        {
		            System.out.println("31 ngay");
		        }
		        else if(k== 4 || k==6|| k==9 || k==11)
		        {
		            System.out.println("30 ngay");
		        }
		        else 
		        {
		            if(m==0)
		                System.out.println("29 ngay");
		            else 
		                System.out.println("28 ngay");
		        }
		        
		        
		        
		    }
		    
		}
