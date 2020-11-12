
package home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;


public class playgame2 extends JPanel {

    private final ImageIcon b1 = new ImageIcon(this.getClass().getResource("sky4.gif"));
    private final ImageIcon b2 = new ImageIcon(this.getClass().getResource("playbg2.png"));
    private final JLabel score1 = new JLabel();
    private final ImageIcon b3 = new ImageIcon(this.getClass().getResource("sky5.gif"));
    private final ImageIcon b4 = new ImageIcon(this.getClass().getResource("sky6.gif"));
    public ImageIcon Dogg = new ImageIcon(this.getClass().getResource("Dog.gif"));
    private final ImageIcon b5 = new ImageIcon(this.getClass().getResource("gameend2.jpg"));
    private final ImageIcon ed = new ImageIcon(this.getClass().getResource("back2.png"));
    public JButton Bbacktostart2 = new JButton(ed);
    public int timess = 100;
    boolean timestartt = true;
    boolean paralyze11 = false;
    int time_paralyzee = 5;
    boolean startballl = false;
    int scorr = 0;
 
    Dog Dd = new Dog();
    
    public ArrayList<up> ba11 = new ArrayList<up>();
    public ArrayList<left> ba22 = new ArrayList<left>();
    public ArrayList<down> ba33 = new ArrayList<down>();
    public ArrayList<right> ba44 = new ArrayList<right>();
    public ArrayList<delectscoreright> de11 = new ArrayList<delectscoreright>();
    public ArrayList<delectscoreup> de22 = new ArrayList<delectscoreup>();
    public ArrayList<delectscoredown> de33 = new ArrayList<delectscoredown>();
    public ArrayList<delectscoreleft> de44 = new ArrayList<delectscoreleft>();
    public ArrayList<starup> st11 = new ArrayList<starup>();
    public ArrayList<starleft> st22 = new ArrayList<starleft>();
    public ArrayList<starright> st33 = new ArrayList<starright>();
    public ArrayList<stardown> st44 = new ArrayList<stardown>();
    public ArrayList<stoneup> sto11 = new ArrayList<stoneup>();
    public ArrayList<stoneleft> sto22 = new ArrayList<stoneleft>();
    public ArrayList<stoneright> sto33 = new ArrayList<stoneright>();
    public ArrayList<stonedown> sto44 = new ArrayList<stonedown>();
    
    Thread time = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(900);
                } catch (Exception e) {
                }

                if (timestartt == false) {
                    repaint();
                }
            }
        }
    });
    
    Thread t = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestartt == false) {
                    timess = (timess - 1);
                    if (paralyze11) {
                        time_paralyzee--;
                    }
                }
                try {
                    Thread.sleep(900);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    
    Thread paralyze = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (time_paralyzee < 1) {
                    paralyze11 = false;
                    time_paralyzee = 5;
                }
                try {
                    Thread.sleep(900);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    
       Thread upp = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*5000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            ba11.add(new up());
            }
        }
        }
       });  
       
       Thread leftt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*5000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            ba22.add(new left());
            }
        }
        }
       });   
       
       Thread downn = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*5000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            ba33.add(new down());
            }
        }
        }
       }); 
       
       Thread rightt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*5000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            ba44.add(new right());
            }
        }
        }
       }); 
       
        Thread delectscorerightt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*20000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            de11.add(new delectscoreright());
            }
        }
        }
       });  
       
       Thread delectscoreupp = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*20000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            de22.add(new delectscoreup());
            }
        }
        }
       });   
       
       Thread delectscoredownn = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*20000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            de33.add(new delectscoredown());
            }
        }
        }
       }); 
       
       Thread delectscoreleftt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*20000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            de44.add(new delectscoreleft());
            }
        }
        }
       }); 
       Thread starupp = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*70000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            st11.add(new starup());
            }
        }
        }
       });  
       
       Thread starleftt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*70000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            st22.add(new starleft());
            }
        }
        }
       });   
       
       Thread stardownn = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*70000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            st44.add(new stardown());
            }
        }
        }
       }); 
       
       Thread starrightt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*70000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            st33.add(new starright());
            }
        }
        }
       });
       Thread stoneupp = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*90000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            sto11.add(new stoneup());
            }
        }
        }
       });  
       
       Thread stoneleftt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*90000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            sto22.add(new stoneleft());
            }
        }
        }
       });   
       
       Thread stonedownn = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*90000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            sto44.add(new stonedown());
            }
        }
        }
       }); 
       
       Thread stonerightt = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startballl == false){
                Thread.sleep((long)(Math.random()*90000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startballl == false){
                            sto33.add(new stoneright());
            }
        }
        }
       });
       
       
        
    playgame2(){
        this.setFocusable(true);
        this.setLayout(null);
        Bbacktostart2.setBounds(120,500,600,300);
        Bbacktostart2.setOpaque(false);
        Bbacktostart2.setBorderPainted(false);
        Bbacktostart2.setContentAreaFilled(false);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int a = e.getKeyCode();
                if (a == KeyEvent.VK_LEFT) {
                    Dd.x -= 10;
                } else if (a == KeyEvent.VK_RIGHT) {
                    Dd.x += 10;
                } 
            }
        });

            
        Dd.x = 400;
        Dd.y = 470;
        this.add(score1);
        time.start();
        t.start();
        paralyze.start();
        this.setSize(1355, 888);
        setLayout(null);
        upp.start();
        leftt.start();
        downn.start();
        rightt.start();
        delectscorerightt.start();
        delectscoredownn.start();
        delectscoreupp.start();
        delectscoreleftt.start();
        starupp.start();
        starleftt.start();
        stardownn.start();
        starrightt.start();
        stoneupp.start();
        stoneleftt.start();
        stonedownn.start();
        stonerightt.start();
	}
           
    
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            if (timess <= 0) {
            this.setLayout(null);
            this.add(Bbacktostart2);
            g.drawImage(b5.getImage(), 0, 0,getWidth(),getHeight(),this);
            g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 100));
            g.setColor(Color.BLACK);
            g.drawString("" + scorr, 140 , 440);
            }
            else{
            if (timess <= 100){
            g.drawImage(b1.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawImage(b2.getImage(),0,0,getWidth(),getHeight(),this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
            g.drawString("SCORE =  " + scorr, 80 , 100);
            g.drawImage(Dogg.getImage(),Dd.x, 650, 300, 200, this);
            g.drawString("Time :" + timess, 80, 200);
            
            for(int i=0 ; i<ba11.size();i++){
                    g.drawImage( ba11.get(i).getImage() ,ba11.get(i).getX(),ba11.get(i).getY(),100,100,this);
                    if (Intersect(ba11.get(i).getbound(),Dd.getbound())){
                        scorr += 15;
                        ba11.remove(i);
                    }
                    
            }
            for(int i=0 ; i<ba22.size();i++){
                    g.drawImage( ba22.get(i).getImage() ,ba22.get(i).getX(),ba22.get(i).getY(),100,100,this);
                   if (Intersect(ba22.get(i).getbound(),Dd.getbound())){
                        scorr += 40;
                        ba22.remove(i);
                    }
            }
            for(int i=0 ; i<ba33.size();i++){
                    g.drawImage( ba33.get(i).getImage() ,ba33.get(i).getX(),ba33.get(i).getY(),100,100,this);
                    if (Intersect(ba33.get(i).getbound(),Dd.getbound())){
                        scorr += 105;
                        ba33.remove(i);
                    }
                    
                    
            }
            for(int i=0 ; i<ba44.size();i++){
                    g.drawImage( ba44.get(i).getImage() ,ba44.get(i).getX(),ba44.get(i).getY(),100,100,this);
                    if (Intersect(ba44.get(i).getbound(),Dd.getbound())){
                        scorr += 15;
                        ba44.remove(i);
                    }
            }
            for(int i=0 ; i<de11.size();i++){
                    g.drawImage( de11.get(i).getImage() ,de11.get(i).getX(),de11.get(i).getY(),100,100,this);
                    if (Intersect(de11.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de11.remove(i);
                    }
            }
            for(int i=0 ; i<de22.size();i++){
                    g.drawImage( de22.get(i).getImage() ,de22.get(i).getX(),de22.get(i).getY(),100,100,this);
                    if (Intersect(de22.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de22.remove(i);
                    }
            }
             for(int i=0 ; i<de33.size();i++){
                    g.drawImage( de33.get(i).getImage() ,de33.get(i).getX(),de33.get(i).getY(),100,100,this);
                    if (Intersect(de33.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de33.remove(i);
                    }
            }
              for(int i=0 ; i<de44.size();i++){
                    g.drawImage( de44.get(i).getImage() ,de44.get(i).getX(),de44.get(i).getY(),100,100,this);
                    if (Intersect(de44.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de44.remove(i);
                    }
            }
              for(int i=0 ; i<st11.size();i++){
                    g.drawImage( st11.get(i).getImage() ,st11.get(i).getX(),st11.get(i).getY(),100,100,this);
                    if (Intersect(st11.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st11.remove(i);
                    }
            }
            for(int i=0 ; i<st22.size();i++){
                    g.drawImage( st22.get(i).getImage() ,st22.get(i).getX(),st22.get(i).getY(),100,100,this);
                    if (Intersect(st22.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st22.remove(i);
                    }
            }
             for(int i=0 ; i<st33.size();i++){
                    g.drawImage( st33.get(i).getImage() ,st33.get(i).getX(),st33.get(i).getY(),100,100,this);
                    if (Intersect(st33.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st33.remove(i);
                    }
            }
              for(int i=0 ; i<st44.size();i++){
                    g.drawImage( st44.get(i).getImage() ,st44.get(i).getX(),st44.get(i).getY(),100,100,this);
                    if (Intersect(st44.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st44.remove(i);
                    }
            }
               for(int i=0 ; i<sto11.size();i++){
                    g.drawImage( sto11.get(i).getImage() ,sto11.get(i).getX(),sto11.get(i).getY(),100,100,this);
                    if (Intersect(sto11.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto11.remove(i);
                    }
            }
            for(int i=0 ; i<sto22.size();i++){
                    g.drawImage( sto22.get(i).getImage() ,sto22.get(i).getX(),sto22.get(i).getY(),100,100,this);
                    if (Intersect(sto22.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto22.remove(i);
                    }
            }
             for(int i=0 ; i<sto33.size();i++){
                    g.drawImage( sto33.get(i).getImage() ,sto33.get(i).getX(),sto33.get(i).getY(),100,100,this);
                    if (Intersect(sto33.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto33.remove(i);
                    }
            }
              for(int i=0 ; i<sto44.size();i++){
                    g.drawImage( sto44.get(i).getImage() ,sto44.get(i).getX(),sto44.get(i).getY(),100,100,this);
                    if (Intersect(sto44.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto44.remove(i);
                    }
            }
            }
            
            if (timess <= 50) {
            g.drawImage(b3.getImage(), 0, 0,getWidth(),getHeight(),this);
            g.drawImage(b2.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawString("SCORE =  " + scorr, 80 , 100);
            g.drawImage(Dogg.getImage(),Dd.x, 650, 300, 200, this);
            g.drawString("Time :" + timess, 80, 200);
            for(int i=0 ; i<ba11.size();i++){
                    g.drawImage( ba11.get(i).getImage() ,ba11.get(i).getX(),ba11.get(i).getY(),100,100,this);
                    if (Intersect(ba11.get(i).getbound(),Dd.getbound())){
                        scorr += 15;
                        ba11.remove(i);
                    }
                    
            }
            for(int i=0 ; i<ba22.size();i++){
                    g.drawImage( ba22.get(i).getImage() ,ba22.get(i).getX(),ba22.get(i).getY(),100,100,this);
                   if (Intersect(ba22.get(i).getbound(),Dd.getbound())){
                        scorr += 40;
                        ba22.remove(i);
                    }
            }
            for(int i=0 ; i<ba33.size();i++){
                    g.drawImage( ba33.get(i).getImage() ,ba33.get(i).getX(),ba33.get(i).getY(),100,100,this);
                    if (Intersect(ba33.get(i).getbound(),Dd.getbound())){
                        scorr += 95;
                        ba33.remove(i);
                    }
                    
                    
            }
            for(int i=0 ; i<ba44.size();i++){
                    g.drawImage( ba44.get(i).getImage() ,ba44.get(i).getX(),ba44.get(i).getY(),100,100,this);
                    if (Intersect(ba44.get(i).getbound(),Dd.getbound())){
                        scorr += 65;
                        ba44.remove(i);
                    }
            }
            for(int i=0 ; i<de11.size();i++){
                    g.drawImage( de11.get(i).getImage() ,de11.get(i).getX(),de11.get(i).getY(),100,100,this);
                    if (Intersect(de11.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de11.remove(i);
                    }
            }
            for(int i=0 ; i<de22.size();i++){
                    g.drawImage( de22.get(i).getImage() ,de22.get(i).getX(),de22.get(i).getY(),100,100,this);
                    if (Intersect(de22.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de22.remove(i);
                    }
            }
             for(int i=0 ; i<de33.size();i++){
                    g.drawImage( de33.get(i).getImage() ,de33.get(i).getX(),de33.get(i).getY(),100,100,this);
                    if (Intersect(de33.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de33.remove(i);
                    }
            }
              for(int i=0 ; i<de44.size();i++){
                    g.drawImage( de44.get(i).getImage() ,de44.get(i).getX(),de44.get(i).getY(),100,100,this);
                    if (Intersect(de44.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de44.remove(i);
                    }
            }
               for(int i=0 ; i<st11.size();i++){
                    g.drawImage( st11.get(i).getImage() ,st11.get(i).getX(),st11.get(i).getY(),100,100,this);
                    if (Intersect(st11.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st11.remove(i);
                    }
            }
            for(int i=0 ; i<st22.size();i++){
                    g.drawImage( st22.get(i).getImage() ,st22.get(i).getX(),st22.get(i).getY(),100,100,this);
                    if (Intersect(st22.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st22.remove(i);
                    }
            }
             for(int i=0 ; i<st33.size();i++){
                    g.drawImage( st33.get(i).getImage() ,st33.get(i).getX(),st33.get(i).getY(),100,100,this);
                    if (Intersect(st33.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st33.remove(i);
                    }
            }
              for(int i=0 ; i<st44.size();i++){
                    g.drawImage( st44.get(i).getImage() ,st44.get(i).getX(),st44.get(i).getY(),100,100,this);
                    if (Intersect(st44.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st44.remove(i);
                    }
            }
              for(int i=0 ; i<sto11.size();i++){
                    g.drawImage( sto11.get(i).getImage() ,sto11.get(i).getX(),sto11.get(i).getY(),100,100,this);
                    if (Intersect(sto11.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto11.remove(i);
                    }
            }
            for(int i=0 ; i<sto22.size();i++){
                    g.drawImage( sto22.get(i).getImage() ,sto22.get(i).getX(),sto22.get(i).getY(),100,100,this);
                    if (Intersect(sto22.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto22.remove(i);
                    }
            }
             for(int i=0 ; i<sto33.size();i++){
                    g.drawImage( sto33.get(i).getImage() ,sto33.get(i).getX(),sto33.get(i).getY(),100,100,this);
                    if (Intersect(sto33.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto33.remove(i);
                    }
            }
              for(int i=0 ; i<sto44.size();i++){
                    g.drawImage( sto44.get(i).getImage() ,sto44.get(i).getX(),sto44.get(i).getY(),100,100,this);
                    if (Intersect(sto44.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto44.remove(i);
                    }
            }
            }
            
            if (timess <= 25) {
            g.drawImage(b4.getImage(), 0, 0,getWidth(),getHeight(),this);
            g.drawImage(b2.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawString("SCORE =  " + scorr, 80 , 100);
            g.drawImage(Dogg.getImage(),Dd.x, 650, 300, 200, this);
            g.drawString("Time :" + timess, 80, 200);
            
            for(int i=0 ; i<ba11.size();i++){
                    g.drawImage( ba11.get(i).getImage() ,ba11.get(i).getX(),ba11.get(i).getY(),100,100,this);
                    if (Intersect(ba11.get(i).getbound(),Dd.getbound())){
                        scorr += 10;
                        ba11.remove(i);
                    }
                    
            }
            for(int i=0 ; i<ba22.size();i++){
                    g.drawImage( ba22.get(i).getImage() ,ba22.get(i).getX(),ba22.get(i).getY(),100,100,this);
                   if (Intersect(ba22.get(i).getbound(),Dd.getbound())){
                        scorr += 40;
                        ba22.remove(i);
                    }
            }
            for(int i=0 ; i<ba33.size();i++){
                    g.drawImage( ba33.get(i).getImage() ,ba33.get(i).getX(),ba33.get(i).getY(),100,100,this);
                    if (Intersect(ba33.get(i).getbound(),Dd.getbound())){
                        scorr += 35;
                        ba33.remove(i);
                    }
                    
                    
            }
            for(int i=0 ; i<ba44.size();i++){
                    g.drawImage( ba44.get(i).getImage() ,ba44.get(i).getX(),ba44.get(i).getY(),100,100,this);
                    if (Intersect(ba44.get(i).getbound(),Dd.getbound())){
                        scorr += 90;
                        ba44.remove(i);
                    }
            }
            for(int i=0 ; i<de11.size();i++){
                    g.drawImage( de11.get(i).getImage() ,de11.get(i).getX(),de11.get(i).getY(),100,100,this);
                    if (Intersect(de11.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de11.remove(i);
                    }
            }
            for(int i=0 ; i<de22.size();i++){
                    g.drawImage( de22.get(i).getImage() ,de22.get(i).getX(),de22.get(i).getY(),100,100,this);
                    if (Intersect(de22.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de22.remove(i);
                    }
            }
             for(int i=0 ; i<de33.size();i++){
                    g.drawImage( de33.get(i).getImage() ,de33.get(i).getX(),de33.get(i).getY(),100,100,this);
                    if (Intersect(de33.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de33.remove(i);
                    }
            }
              for(int i=0 ; i<de44.size();i++){
                    g.drawImage( de44.get(i).getImage() ,de44.get(i).getX(),de44.get(i).getY(),100,100,this);
                    if (Intersect(de44.get(i).getbound(),Dd.getbound())){
                        scorr -= 100;
                        de44.remove(i);
                    }
            }
               for(int i=0 ; i<st11.size();i++){
                    g.drawImage( st11.get(i).getImage() ,st11.get(i).getX(),st11.get(i).getY(),100,100,this);
                    if (Intersect(st11.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st11.remove(i);
                    }
            }
            for(int i=0 ; i<st22.size();i++){
                    g.drawImage( st22.get(i).getImage() ,st22.get(i).getX(),st22.get(i).getY(),100,100,this);
                    if (Intersect(st22.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st22.remove(i);
                    }
            }
             for(int i=0 ; i<st33.size();i++){
                    g.drawImage( st33.get(i).getImage() ,st33.get(i).getX(),st33.get(i).getY(),100,100,this);
                    if (Intersect(st33.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st33.remove(i);
                    }
            }
              for(int i=0 ; i<st44.size();i++){
                    g.drawImage( st44.get(i).getImage() ,st44.get(i).getX(),st44.get(i).getY(),100,100,this);
                    if (Intersect(st44.get(i).getbound(),Dd.getbound())){
                        scorr += 500;
                        st44.remove(i);
                    }
            }
              for(int i=0 ; i<sto11.size();i++){
                    g.drawImage( sto11.get(i).getImage() ,sto11.get(i).getX(),sto11.get(i).getY(),100,100,this);
                    if (Intersect(sto11.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto11.remove(i);
                    }
            }
            for(int i=0 ; i<sto22.size();i++){
                    g.drawImage( sto22.get(i).getImage() ,sto22.get(i).getX(),sto22.get(i).getY(),100,100,this);
                    if (Intersect(sto22.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto22.remove(i);
                    }
            }
             for(int i=0 ; i<sto33.size();i++){
                    g.drawImage( sto33.get(i).getImage() ,sto33.get(i).getX(),sto33.get(i).getY(),100,100,this);
                    if (Intersect(sto33.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto33.remove(i);
                    }
            }
              for(int i=0 ; i<sto44.size();i++){
                    g.drawImage( sto44.get(i).getImage() ,sto44.get(i).getX(),sto44.get(i).getY(),100,100,this);
                    if (Intersect(sto44.get(i).getbound(),Dd.getbound())){
                        scorr -= 500;
                        sto44.remove(i);
                    }
            }
	}  
    }
    }
    public boolean Intersect(Rectangle2D a, Rectangle2D b) {
        return (a.intersects(b));
    } 
}

    


