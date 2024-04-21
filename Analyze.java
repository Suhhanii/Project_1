import javax.swing.*;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*;
import java.awt.Panel; 
import javax.swing.border.Border;
class Analyze extends JFrame
{
JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,back;
JTextField out=new JTextField();
Border border = BorderFactory.createLineBorder(Color.WHITE,5);
Color color=new Color(204, 229,255);

public Analyze()
{
Toolkit kit = Toolkit.getDefaultToolkit();
Dimension screensize =kit.getScreenSize();
int screenwidth =screensize.width;
int screenheight =screensize.height;
                                                                                                                                                                                                                                                                                                                                                                                                                                                             JFrame f=new JFrame("Algorithm visualizer "); 
f.setLayout(null);
f.setSize(screenwidth,screenheight);// width,height 
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().setBackground(color);

l=new JLabel("LETS ANALYZE AN ALGORITHM");
l.setFont(new Font("Algerian", Font.BOLD, 50)); 
l.setBounds(400,2,1000,150);  //x axis, y axis, width, height
f.add(l); 

l1=new JLabel("Select the algorithm");
l1.setFont(new Font("Algerian", Font.BOLD,30));
l1.setBounds(600,3,500,300);
f.add(l1);

b1=new JButton("Bubble Sort");
b1.setBounds(300,250,150,100);
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
b1.setBorder(border);
b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
f.add(b1);
b1.addActionListener(new ActionListener()
 {
    public void actionPerformed(ActionEvent event)
     {
        f.setVisible(false);
        bubbleSort();
      }
});

b2=new JButton("Quick Sort");
b2.setBounds(700,250,150,100);
b2.setBackground(Color.BLACK);
b2.setForeground(Color.WHITE);
b2.setBorder(border);
b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
f.add(b2);
b2.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f.setVisible(false);
    quickSort();
    }
});
b3=new JButton("Merge Sort");
b3.setBounds(1100,250,150,100);
b3.setBackground(Color.BLACK);
b3.setForeground(Color.WHITE);
b3.setBorder(border);
b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
f.add(b3);
b3.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f.setVisible(false);
    mergeSort();
    }
});


b4=new JButton("Selecion Sort");
b4.setBounds(300,450,150,100);
b4.setBackground(Color.BLACK);
b4.setForeground(Color.WHITE);
b4.setBorder(border);
b4.setFont(new Font("Times New Roman", Font.BOLD, 20));
f.add(b4);
b4.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f.setVisible(false);
    selectionSort();
    }
});


b5=new JButton("Insertion Sort");
b5.setBounds(700,450,150,100);
b5.setBackground(Color.BLACK);
b5.setForeground(Color.WHITE);
b5.setBorder(border);
b5.setFont(new Font("Times New Roman", Font.BOLD, 20));
f.add(b5);
b5.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f.setVisible(false);
    insertionSort();
    }
});



b6=new JButton("Heap Sort");
b6.setBounds(1100,450,150,100);
b6.setBackground(Color.BLACK);
b6.setForeground(Color.WHITE);
b6.setBorder(border);
b6.setFont(new Font("Times New Roman", Font.BOLD, 20));
f.add(b6);
b6.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f.setVisible(false);
    heapSort();
    }
});
}
public static void main(String args[])
{
new Analyze();
}

public void bubbleSort()
   {
        JFrame f1=new JFrame("Bubble Sort"); 
        f1.setVisible(true);
f1.setLayout(null);
 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize =kit.getScreenSize();
        int screenwidth =screensize.width;
        int screenheight =screensize.height;                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        f1.setSize(screenwidth,screenheight);// width,height 
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.getContentPane().setBackground(color);

l3=new JLabel("BUBBLE SORT");
l3.setFont(new Font("Times New Roman", Font.BOLD, 25)); 
l3.setBounds(650,1,1500,50);  //x axis, y axis, width, height
f1.add(l3); 


String s="Bubble Sort works by repeatedly going through the list, comparing adjacent elements, and swapping them if they are in the wrong order. This process is repeated until the list is sorted ";
l4=new JLabel(s);
l4.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l4.setBounds(30,1,1500,100);  //x axis, y axis, width, height
f1.add(l4); 

String s1="In Bubble Sort algorithm";
l5=new JLabel(s1);
l5.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l5.setBounds(30,30,1500,100);  //x axis, y axis, width, height
f1.add(l5); 

String s2="1. Traverse from left and compare adjacent elements and the higher one is placed at right side.";
l6=new JLabel(s2);
l6.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l6.setBounds(30,60,1500,100);  //x axis, y axis, width, height
f1.add(l6); 

String s3="2. In this way, the largest element is moved to the rightmost end at first. ";
l7=new JLabel(s3);
l7.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l7.setBounds(30,90,1500,100);  //x axis, y axis, width, height
f1.add(l7); 

String s4="3. This process is then continued to find the second largest and place it and so on until the data is sorted.";
l8=new JLabel(s4);
l8.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l8.setBounds(30,120,1500,100);  //x axis, y axis, width, height
f1.add(l8); 

String s5="Let's Analyze this with an example:";
l9=new JLabel(s5);
l9.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
l9.setBounds(30,160,1500,100);  //x axis, y axis, width, height
f1.add(l9);

String s6="Enter The Array Elements Separated By Spaces:";
l10=new JLabel(s6);
l10.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l10.setBounds(520,190,1500,100);  //x axis, y axis, width, height
f1.add(l10); 
  

t1=new JTextField();
t1.setBounds(600,260,200,30);
f1.add(t1); 

b7=new JButton("Submit");
b7.setBounds(650,310,100,40);
f1.add(b7);

b8=new JButton("TIME COMPLEXITY");
//b8.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
b8.setBounds(625,370,150,30);  //x axis, y axis, width, height
f1.add(b8);

b7.addActionListener(new ActionListener() {
            String ans=null;
            @Override
            public void actionPerformed(ActionEvent e) {
           
            String input=null;
            String[] inputArray =null;
            input = t1.getText();
            inputArray= input.split(" ");
            
            int[] dataArray =null;
            dataArray= new int[inputArray.length];
            try{
            for (int i = 0; i < inputArray.length; i++) {
            dataArray[i] = Integer.parseInt(inputArray[i]);
            } }
            catch(Exception E)
            {
            JOptionPane.showMessageDialog(rootPane,"Wrong Input","ERROR MESSAGE",0);
            }
            
BubbleSort bs=new BubbleSort();
            ans=null;
ans=bs.bubbleSort(dataArray);


b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

out.setText("");
out.setText(ans);
out.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
out.setBounds(670,410,70,30);  //x axis, y axis, width, height
f1.add(out);

            }
        });


            }
        });
  
back=new JButton("BACK");
back.setBounds(30,700,100,50);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBorder(border);
back.setFont(new Font("Times New Roman", Font.BOLD, 20));
f1.add(back);
back.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f1.setVisible(false);
    new Analyze();

}
});
      
}
public void quickSort()
   {
        JFrame f1=new JFrame("Quick Sort");
        f1.setVisible(true);
f1.setLayout(null);
 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize =kit.getScreenSize();
        int screenwidth =screensize.width;
        int screenheight =screensize.height;                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        f1.setSize(screenwidth,screenheight);// width,height 
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.getContentPane().setBackground(color);

l3=new JLabel("QUICK SORT");
l3.setFont(new Font("Times New Roman", Font.BOLD, 25)); 
l3.setBounds(650,1,1500,50);  //x axis, y axis, width, height
f1.add(l3); 


String s="<html>Quick Sort follows the divide and conquers approach since the pivot element first divides the range of numbers into sub-arrays and then returns a sorted array as the final step by gathering all the numbers.</html>";
l4=new JLabel(s);
l4.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l4.setBounds(30,1,1500,100);  //x axis, y axis, width, height
f1.add(l4); 

String s1="-> In Quick sort algorithm";
l5=new JLabel(s1);
l5.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l5.setBounds(30,35,1500,100);  //x axis, y axis, width, height
f1.add(l5); 

String s2="1.Consider an element as a pivot element. ";
l6=new JLabel(s2);
l6.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l6.setBounds(30,60,1500,100);  //x axis, y axis, width, height
f1.add(l6); 

String s3="2. Assign the lowest and highest index in the array to low and high variables and pass it in the QuickSort function. ";
l7=new JLabel(s3);
l7.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l7.setBounds(30,90,1500,100);  //x axis, y axis, width, height
f1.add(l7); 

String s4="3. Increment low until array[low] greater than pivot then stop.";
l8=new JLabel(s4);
l8.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l8.setBounds(30,120,1500,100);  //x axis, y axis, width, height
f1.add(l8); 

String s5="4. Decrement high until array[high] less than pivot then stop.";
l9=new JLabel(s5);
l9.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l9.setBounds(30,150,1500,100);  //x axis, y axis, width, height
f1.add(l9);

String s6="5. Swap low and high and repeat the process until the second last element.";
l10=new JLabel(s6);
l10.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l10.setBounds(30,180,1500,100);  //x axis, y axis, width, height
f1.add(l10);

String s7="6. Swap pivot and second last element then you will get an array that completed the first partition.";
l11=new JLabel(s7);
l11.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l11.setBounds(30,210,1500,100);  //x axis, y axis, width, height
f1.add(l11);

String s8="7. Repeat the same process for the two arrays that are obtained until you can no more divide the array.";
l12=new JLabel(s8);
l12.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l12.setBounds(30,240,1500,100);  //x axis, y axis, width, height
f1.add(l12);

String s9="Let's Analyze this with an example:";
l13=new JLabel(s9);
l13.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
l13.setBounds(30,270,1500,100);  //x axis, y axis, width, height
f1.add(l13);

String s10="Enter The Array Elements Separated By Spaces:";
l14=new JLabel(s10);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(520,290,1500,100);  //x axis, y axis, width, height
f1.add(l14); 
  

t1=new JTextField();
t1.setBounds(600,360,200,30);
f1.add(t1); 

b7=new JButton("Submit");
b7.setBounds(650,410,100,30);
f1.add(b7);

b8=new JButton("TIME COMPLEXITY");
//b8.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
b8.setBounds(625,450,150,30);  //x axis, y axis, width, height
f1.add(b8);

b7.addActionListener(new ActionListener() {
String ans=null;
            @Override
            public void actionPerformed(ActionEvent e) {
            String input=null;
            input = t1.getText();
            String[] inputArray =null;
            inputArray= input.split(" ");

            int[] dataArray =null;
            dataArray= new int[inputArray.length];
            try{
            for (int i = 0; i < inputArray.length; i++) {
            dataArray[i] = Integer.parseInt(inputArray[i]);
            }}
             catch(Exception E)
            {
            JOptionPane.showMessageDialog(rootPane,"Wrong Input","ERROR MESSAGE",0);
            }

QuickSort Qs=new QuickSort();
           ans=null;
int n=dataArray.length;
ans=Qs.quickSort(dataArray,0,n-1);


b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            /*l14=new JLabel(ans);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(660,450,1500,100);  //x axis, y axis, width, height
f1.add(l14); */

out.setText("");
out.setText(ans);
out.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
out.setBounds(655,490,100,30);  //x axis, y axis, width, height
f1.add(out);


            }
        });

            }
        });

back=new JButton("BACK");
back.setBounds(30,700,100,50);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBorder(border);
back.setFont(new Font("Times New Roman", Font.BOLD, 20));
f1.add(back);
back.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f1.setVisible(false);
    new Analyze();

}
});



        
}
public void mergeSort()
   {
        JFrame f1=new JFrame("Merge Sort");
        f1.setVisible(true);
f1.setLayout(null);
 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize =kit.getScreenSize();
        int screenwidth =screensize.width;
        int screenheight =screensize.height;                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        f1.setSize(screenwidth,screenheight);// width,height 
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.getContentPane().setBackground(color);



l3=new JLabel("MERGE SORT");
l3.setFont(new Font("Times New Roman", Font.BOLD, 25)); 
l3.setBounds(650,1,1500,50);  //x axis, y axis, width, height
f1.add(l3); 


String s="<html>Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively dividing the input array into smaller subarrays and sorting those subarrays then merging them back together to obtain the sorted array.<html/>";
l4=new JLabel(s);
l4.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l4.setBounds(30,5,1500,100);  //x axis, y axis, width, height
f1.add(l4); 

String s1="# In Merge sort algorithm";
l5=new JLabel(s1);
l5.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l5.setBounds(32,40,1500,100);  //x axis, y axis, width, height
f1.add(l5); 

String s2="<html><b>Step 1: Divide</b><br>~Initially, we divide the array into two equal halves.These subarrays are further divided into smaller halves.These subarrays are further divided into smaller halves.This process continues until we have subarrays of unit length (which are always sorted).<html/>";
l6=new JLabel(s2);
l6.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l6.setBounds(32,80,1500,120);  //x axis, y axis, width, height
f1.add(l6); 

String s3="<html><b>Step 2: Recursively Solve</b><br>~We sort each subarray using recursion.The recursive sorting ensures that each subarray is correctly ordered.<html/> ";
l7=new JLabel(s3);
l7.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l7.setBounds(30,150,1500,100);  //x axis, y axis, width, height
f1.add(l7); 

String s4="<html><b>Step 3: Combine (Merge)</b><br>~The merge() function is used to combine the subarrays.It compares elements from both subarrays and merges them into a larger sorted subarray.This merging process continues until we obtain the final sorted array.</html>";
l8=new JLabel(s4);
l8.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l8.setBounds(30,210,1500,100);  //x axis, y axis, width, height
f1.add(l8); 

String s5="<html><b>Guaranteed worst-case performance:</b><br> Merge sort has a worst-case time complexity of<b> O(N logN)</b>, which means it performs well even on large datasets.<html/>";
l9=new JLabel(s5);
l9.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l9.setBounds(30,265,1500,100);  //x axis, y axis, width, height
f1.add(l9);

String s10="TIME COMPLEXITY  : O(n log2 n)";
l14=new JLabel(s10);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(30,310,1500,100);  //x axis, y axis, width, height
f1.add(l14); 


String s11="SPACE COMPLEXITY : O(n), Additional space is required for the temporary array used during merging.";
l15=new JLabel(s11);
l15.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l15.setBounds(30,335,1500,100);  //x axis, y axis, width, height
f1.add(l15); 

back=new JButton("BACK");
back.setBounds(30,700,100,50);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBorder(border);
back.setFont(new Font("Times New Roman", Font.BOLD, 20));
f1.add(back);
back.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f1.setVisible(false);
    new Analyze();

}
});

}


public void insertionSort()
   {
        JFrame f1=new JFrame("Insertion Sort");
        f1.setVisible(true);
f1.setLayout(null);
 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize =kit.getScreenSize();
        int screenwidth =screensize.width;
        int screenheight =screensize.height;                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        f1.setSize(screenwidth,screenheight);// width,height 
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.getContentPane().setBackground(color);

l3=new JLabel("INSERTION SORT");
l3.setFont(new Font("Times New Roman", Font.BOLD, 25)); 
l3.setBounds(650,1,1500,50);  //x axis, y axis, width, height
f1.add(l3); 

String s="<html>Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output.</html>";
l4=new JLabel(s);
l4.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l4.setBounds(30,10,1500,100);  //x axis, y axis, width, height
f1.add(l4); 

String s1="# In Insertion sort algorithm";
l5=new JLabel(s1);
l5.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l5.setBounds(30,50,1500,100);  //x axis, y axis, width, height
f1.add(l5); 

String s2="1. We have to start with second element of the array as first element in the array is assumed to be sorted.";
l6=new JLabel(s2);
l6.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l6.setBounds(30,80,1500,100);  //x axis, y axis, width, height
f1.add(l6); 

String s3="2. Compare second element with the first element and check if the second element is smaller then swap them.";
l7=new JLabel(s3);
l7.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l7.setBounds(30,110,1500,100);  //x axis, y axis, width, height
f1.add(l7); 

String s4="3. Move to the third element and compare it with the second element, then the first element and swap as necessary to put it in the correct position among the first three elements.";
l8=new JLabel(s4);
l8.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l8.setBounds(30,140,1500,100);  //x axis, y axis, width, height
f1.add(l8); 

String s5="4. Continue this process, comparing each element with the ones before it and swapping as needed to place it in the correct position among the sorted elements.";
l9=new JLabel(s5);
l9.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l9.setBounds(30,170,1500,100);  //x axis, y axis, width, height
f1.add(l9);

String s6="5.Repeat until the entire array is sorted.";
l10=new JLabel(s6);
l10.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l10.setBounds(30,200,1500,100);  //x axis, y axis, width, height
f1.add(l10);

String s9="Let's Analyze this with an example:";
l13=new JLabel(s9);
l13.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
l13.setBounds(30,240,1500,100);  //x axis, y axis, width, height
f1.add(l13);

String s10="Enter The Array Elements Separated By Spaces:";
l14=new JLabel(s10);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(520,290,1500,100);  //x axis, y axis, width, height
f1.add(l14); 
  

t1=new JTextField();
t1.setBounds(600,360,200,30);
f1.add(t1); 

b7=new JButton("Submit");
b7.setBounds(650,410,100,30);
f1.add(b7);

b8=new JButton("TIME COMPLEXITY");
//b8.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
b8.setBounds(625,450,150,30);  //x axis, y axis, width, height
f1.add(b8);

b7.addActionListener(new ActionListener() {
String ans=null;
            @Override
            public void actionPerformed(ActionEvent e) {
            String input=null;
            input = t1.getText();
            String[] inputArray =null;
            inputArray= input.split(" ");

            int[] dataArray =null;
            dataArray= new int[inputArray.length]; 
            try{
            for (int i = 0; i < inputArray.length; i++) {
            dataArray[i] = Integer.parseInt(inputArray[i]);
            }}
             catch(Exception E)
            {
            JOptionPane.showMessageDialog(rootPane,"Wrong Input","ERROR MESSAGE",0);
            }

InsertionSort is=new InsertionSort();
           ans=null;
int n=dataArray.length;
ans=is.insertionSort(dataArray);


b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           /* l14=new JLabel(ans);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(670,450,1500,100);  //x axis, y axis, width, height
f1.add(l14); */
 
out.setText("");
out.setText(ans);
out.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
out.setBounds(670,490,70,30);  //x axis, y axis, width, height
f1.add(out);


            }
        });

            }
        });

back=new JButton("BACK");
back.setBounds(30,700,100,50);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBorder(border);
back.setFont(new Font("Times New Roman", Font.BOLD, 20));
f1.add(back);
back.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f1.setVisible(false);
    new Analyze();

}
});


}

public void selectionSort()
   {
        JFrame f1=new JFrame("Selection Sort");
        f1.setVisible(true);
f1.setLayout(null);
 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize =kit.getScreenSize();
        int screenwidth =screensize.width;
        int screenheight =screensize.height;                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        f1.setSize(screenwidth,screenheight);// width,height 
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.getContentPane().setBackground(color);

l3=new JLabel("SELECTION SORT");
l3.setFont(new Font("Times New Roman", Font.BOLD, 25)); 
l3.setBounds(650,1,1500,50);  //x axis, y axis, width, height
f1.add(l3); 


String s="<html>Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list. <html/>";
l4=new JLabel(s);
l4.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l4.setBounds(30,10,1500,100);  //x axis, y axis, width, height
f1.add(l4); 

String s1="# In Selection sort algorithm";
l5=new JLabel(s1);
l5.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l5.setBounds(32,42,1500,100);  //x axis, y axis, width, height
f1.add(l5); 

String s2="<html><b>Step 1: Initialization:</b><br>~Start with the entire list as unsorted.Define a boundary between the sorted and unsorted parts of the list.<html/>";
l6=new JLabel(s2);
l6.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l6.setBounds(32,80,1500,120);  //x axis, y axis, width, height
f1.add(l6); 

String s3="<html><b>Step 2: Find the Minimum Element:</b><br>~Search the unsorted part of the list to find the minimum element.Swap this minimum element with the first element in the unsorted part.<html/> ";
l7=new JLabel(s3);
l7.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l7.setBounds(30,150,1500,100);  //x axis, y axis, width, height
f1.add(l7); 

String s4="<html><b>Step 3: Expand the Sorted Portion:</b><br>~Move the boundary of the sorted part one element to the right. Now, the first element in the unsorted part becomes part of the sorted portion.</html>";
l8=new JLabel(s4);
l8.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l8.setBounds(30,210,1500,100);  //x axis, y axis, width, height
f1.add(l8); 

String s5="<html><b>Step 4: Repeat Steps 2 and 3:</b><br>~Continue finding the minimum element in the remaining unsorted portion.Swap it with the first element in the unsorted part. Keep expanding the sorted portion until the entire list is sorted.<html/>";
l9=new JLabel(s5);
l9.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l9.setBounds(30,265,1500,100);  //x axis, y axis, width, height
f1.add(l9);

String s10="TIME COMPLEXITY ";
l14=new JLabel(s10);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(30,310,1500,100);  //x axis, y axis, width, height
f1.add(l14); 


String s11="<html><b>The time complexity of Selection Sort is O(N2)</b>as there are two nested loops:One loop to select an element of Array one by one = O(N) Another loop to compare that element with every other Array element = O(N) Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)</html>";
l15=new JLabel(s11);
l15.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l15.setBounds(30,340,1500,100);  //x axis, y axis, width, height
f1.add(l15);

String s12="SPACE COMPLEXITY ";
l14=new JLabel(s12);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(30,380,1500,100);  //x axis, y axis, width, height
f1.add(l14);

String s13="<html><b>Auxiliary Space: O(1)</b> as the only extra memory used is for temporary variables while swapping two values in Array. The selection sort never makes more than O(N) swaps and can be useful when memory writing is costly. </html>";
l15=new JLabel(s13);
l15.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l15.setBounds(30,410,1500,100);  //x axis, y axis, width, height
f1.add(l15);
 
back=new JButton("BACK");
back.setBounds(30,700,100,50);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBorder(border);
back.setFont(new Font("Times New Roman", Font.BOLD, 20));
f1.add(back);
back.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f1.setVisible(false);
    new Analyze();

}
});

}





public void heapSort()
   {
        JFrame f1=new JFrame("Heap Sort");
        f1.setVisible(true);
f1.setLayout(null);
 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize =kit.getScreenSize();
        int screenwidth =screensize.width;
        int screenheight =screensize.height;                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        f1.setSize(screenwidth,screenheight);// width,height 
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.getContentPane().setBackground(color);

l3=new JLabel("HEAP SORT");
l3.setFont(new Font("Times New Roman", Font.BOLD, 25)); 
l3.setBounds(650,1,1500,50);  //x axis, y axis, width, height
f1.add(l3); 


String s="<html>Heap sort is one of the sorting algorithms used to arrange a list of elements in order. Heapsort algorithm uses one of the tree concepts called Heap Tree. In this sorting algorithm, we use Max Heap to arrange list of elements in Descending order and Min Heap to arrange list elements in Ascending order.<html/>";
l4=new JLabel(s);
l4.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l4.setBounds(30,10,1500,100);  //x axis, y axis, width, height
f1.add(l4); 

String s1="# The Heap sort algorithm to arrange a list of elements in ascending order is performed using following steps...";
l5=new JLabel(s1);
l5.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l5.setBounds(32,45,1500,100);  //x axis, y axis, width, height
f1.add(l5); 

String s2="<html>Step 1 - Construct a Binary Tree with given list of Elements.<br>Step 2 - Transform the Binary Tree into Min Heap.<html/>";
l6=new JLabel(s2);
l6.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l6.setBounds(32,80,1500,120);  //x axis, y axis, width, height
f1.add(l6); 

String s3="<html>Step 3 - Delete the root element from Min Heap using Heapify method.<br>Step 4 - Put the deleted element into the Sorted list.<html/> ";
l7=new JLabel(s3);
l7.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l7.setBounds(30,130,1500,120);  //x axis, y axis, width, height
f1.add(l7); 

String s4="<html>Step 5 - Repeat the same until Min Heap becomes empty.<br>Step 6 - Display the sorted list.</html>";
l8=new JLabel(s4);
l8.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l8.setBounds(30,180,1500,120);  //x axis, y axis, width, height
f1.add(l8);
 

String s5="<html><b># Complexity of the Heap Sort Algorithm</b><br>To sort an unsorted list with 'n' number of elements, following are the complexities...<html/>";
l9=new JLabel(s5);
l9.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l9.setBounds(30,250,1500,100);  //x axis, y axis, width, height
f1.add(l9);

String s10="<html>~Worst Case : O(n log n)<br>~Best Case : O(n log n)<br>~Average Case : O(n log n)</html>";
l14=new JLabel(s10);
l14.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
l14.setBounds(30,300,1500,100);  //x axis, y axis, width, height
f1.add(l14); 


String s11="<html><b>~Auxiliary Space: O(log n)</b>, due to the recursive call stack. However, auxiliary space can be O(1) for iterative implementation.</html>";
l15=new JLabel(s11);
l15.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
l15.setBounds(30,340,1500,100);  //x axis, y axis, width, height
f1.add(l15);

back=new JButton("BACK");
back.setBounds(30,700,100,50);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBorder(border);
back.setFont(new Font("Times New Roman", Font.BOLD, 20));
f1.add(back);
back.addActionListener(new ActionListener()
{ public void actionPerformed(ActionEvent event)
   {
    f1.setVisible(false);
    new Analyze();

}
});
 
}
 class BubbleSort { 
 public int count=0;
 String bubbleSort(int arr[]) 
    {   
        int n =0;
        n= arr.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) 
               { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    count++;
                } 
    if(count<=n)
    return("O(n)");
    else 
    return("O(n^2)");
    } 
}

class QuickSort{
   static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
       int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static String quickSort(int[] arr, int low, int high)
    {String ans="O(n log2 n)";
        if (low < high) {
            int pi = partition(arr, low, high);
            if(pi==(arr.length-1))
            ans="O(N^2)";
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);

                         }
     return ans;
     }
          }

class InsertionSort{
  static String insertionSort(int arr[])
    {   int count=0;
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
        }
     if(count==0)
     return ("O(n)");
     else
     return ("O(n^2)");
    }

}

}