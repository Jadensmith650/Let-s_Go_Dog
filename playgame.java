
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


public class playgame extends JPanel {

    private final ImageIcon bg1 = new ImageIcon(this.getClass().getResource("sky.gif"));
    private final ImageIcon bg2 = new ImageIcon(this.getClass().getResource("playbg.png"));
    private final JLabel score = new JLabel();
    private final ImageIcon bg3 = new ImageIcon(this.getClass().getResource("sky2.gif"));
    private final ImageIcon bg4 = new ImageIcon(this.getClass().getResource("sky3.gif"));
    public ImageIcon Dog = new ImageIcon(this.getClass().getResource("Dog.gif"));
    private final ImageIcon bg5 = new ImageIcon(this.getClass().getResource("gameend.jpg"));
    private final ImageIcon end = new ImageIcon(this.getClass().getResource("back2.png"));
    public JButton Bbacktostart = new JButton(end);
    public int times;
    boolean timestart = true;
    boolean paralyze1 = false;
    int time_paralyze = 5;
    boolean startball = false;
    int scor = 0;
 
    Dog D = new Dog();
    
    public ArrayList<up> ba1 = new ArrayList<up>();
    public ArrayList<left> ba2 = new ArrayList<left>();
    public ArrayList<down> ba3 = new ArrayList<down>();
    public ArrayList<right> ba4 = new ArrayList<right>();
    public ArrayList<delectscoreright> de1 = new ArrayList<delectscoreright>();
    public ArrayList<delectscoreup> de2 = new ArrayList<delectscoreup>();
    public ArrayList<delectscoredown> de3 = new ArrayList<delectscoredown>();
    public ArrayList<delectscoreleft> de4 = new ArrayList<delectscoreleft>();
    public ArrayList<starup> st1 = new ArrayList<starup>();
    public ArrayList<starleft> st2 = new ArrayList<starleft>();
    public ArrayList<starright> st3 = new ArrayList<starright>();
    public ArrayList<stardown> st4 = new ArrayList<stardown>();
    public ArrayList<stoneup> sto1 = new ArrayList<stoneup>();
    public ArrayList<stoneleft> sto2 = new ArrayList<stoneleft>();
    public ArrayList<stoneright> sto3 = new ArrayList<stoneright>();
    public ArrayList<stonedown> sto4 = new ArrayList<stonedown>();
     
    
    Thread time = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(900);
                } catch (Exception e) {
                }

                if (timestart == false) {
                    repaint();
                }
            }
        }
    });
    
    Thread t = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestart == false) {
                    times = (times - 1);
                    if (paralyze1) {
                        time_paralyze--;
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
                if (time_paralyze < 1) {
                    paralyze1 = false;
                    time_paralyze = 5;
                }
                try {
                    Thread.sleep(900);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    
       Thread up = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*10000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            ba1.add(new up());
            }
        }
        }
       });  
       
       Thread left = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*10000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            ba2.add(new left());
            }
        }
        }
       });   
       
       Thread down = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*10000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            ba3.add(new down());
            }
        }
        }
       }); 
       
       Thread right = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*10000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            ba4.add(new right());
            }
        }
        }
       }); 
       
       Thread delectscoreright = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*40000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            de1.add(new delectscoreright());
            }
        }
        }
       });  
       
       Thread delectscoreup = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*40000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            de2.add(new delectscoreup());
            }
        }
        }
       });   
       
       Thread delectscoredown = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*40000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            de3.add(new delectscoredown());
            }
        }
        }
       }); 
       
       Thread delectscoreleft = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*40000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            de4.add(new delectscoreleft());
            }
        }
        }
       }); 
       Thread starup = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*80000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            st1.add(new starup());
            }
        }
        }
       });  
       
       Thread starleft = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*80000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            st2.add(new starleft());
            }
        }
        }
       });   
       
       Thread stardown = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*80000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            st4.add(new stardown());
            }
        }
        }
       }); 
       
       Thread starright = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*80000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            st3.add(new starright());
            }
        }
        }
       });
       
       Thread stoneup = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*100000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            sto1.add(new stoneup());
            }
        }
        }
       });  
       
       Thread stoneleft = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*100000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            sto2.add(new stoneleft());
            }
        }
        }
       });   
       
       Thread stonedown = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*100000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            sto4.add(new stonedown());
            }
        }
        }
       }); 
       
       Thread stoneright = new Thread(new Runnable(){
            public void run() {
                while(true){
                    try{
                            if(startball == false){
                Thread.sleep((long)(Math.random()*100000)+200);
                            }
            }catch(InterruptedException e){
                            e.printStackTrace();
            }
            if(startball == false){
                            sto3.add(new stoneright());
            }
        }
        }
       });
       
        
    playgame(){
        this.setFocusable(true);
        this.setLayout(null);
        Bbacktostart.setBounds(120,500,600,300);
        Bbacktostart.setOpaque(false);
        Bbacktostart.setBorderPainted(false);
        Bbacktostart.setContentAreaFilled(false);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int a = e.getKeyCode();
                if (a == KeyEvent.VK_LEFT) {
                    D.x -= 10;
                } else if (a == KeyEvent.VK_RIGHT) {
                    D.x += 10;
                } 
            }
        });

            
        D.x = 400;
        D.y = 470;
        this.add(score);
        time.start();
        t.start();
        paralyze.start();
        this.setSize(1355, 888);
        setLayout(null);
        up.start();
        left.start();
        down.start();
        right.start();
        delectscoreright.start();
        delectscoredown.start();
        delectscoreup.start();
        delectscoreleft.start();
        starup.start();
        starleft.start();
        stardown.start();
        starright.start();
        stoneup.start();
        stoneleft.start();
        stonedown.start();
        stoneright.start();
	}
           
    
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            if (times <= 0) {
            this.setLayout(null);
            this.add(Bbacktostart);
            g.drawImage(bg5.getImage(), 0, 0,getWidth(),getHeight(),this);
            g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 100));
            g.setColor(Color.BLACK);
            g.drawString("" + scor, 140 , 440);
            }
            else{
            if (times <= 100){
            g.drawImage(bg1.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawImage(bg2.getImage(),0,0,getWidth(),getHeight(),this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
            g.drawString("SCORE =  " + scor, 80 , 100);
            g.drawImage(Dog.getImage(),D.x, 650, 300, 200, this);
            g.drawString("Time :" + times, 80, 200);
            
            for(int i=0 ; i<ba1.size();i++){
                    g.drawImage( ba1.get(i).getImage() ,ba1.get(i).getX(),ba1.get(i).getY(),100,100,this);
                    if (Intersect(ba1.get(i).getbound(),D.getbound())){
                        scor += 50;
                        ba1.remove(i);
                    }
                    
            }
            for(int i=0 ; i<ba2.size();i++){
                    g.drawImage( ba2.get(i).getImage() ,ba2.get(i).getX(),ba2.get(i).getY(),100,100,this);
                   if (Intersect(ba2.get(i).getbound(),D.getbound())){
                        scor += 100;
                        ba2.remove(i);
                    }
            }
            for(int i=0 ; i<ba3.size();i++){
                    g.drawImage( ba3.get(i).getImage() ,ba3.get(i).getX(),ba3.get(i).getY(),100,100,this);
                    if (Intersect(ba3.get(i).getbound(),D.getbound())){
                        scor += 35;
                        ba3.remove(i);
                    }
                    
                    
            }
            for(int i=0 ; i<ba4.size();i++){
                    g.drawImage( ba4.get(i).getImage() ,ba4.get(i).getX(),ba4.get(i).getY(),100,100,this);
                    if (Intersect(ba4.get(i).getbound(),D.getbound())){
                        scor += 40;
                        ba4.remove(i);
                    }
            }
            for(int i=0 ; i<de1.size();i++){
                    g.drawImage( de1.get(i).getImage() ,de1.get(i).getX(),de1.get(i).getY(),100,100,this);
                    if (Intersect(de1.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de1.remove(i);
                    }
            }
            for(int i=0 ; i<de2.size();i++){
                    g.drawImage( de2.get(i).getImage() ,de2.get(i).getX(),de2.get(i).getY(),100,100,this);
                    if (Intersect(de2.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de2.remove(i);
                    }
            }
             for(int i=0 ; i<de3.size();i++){
                    g.drawImage( de3.get(i).getImage() ,de3.get(i).getX(),de3.get(i).getY(),100,100,this);
                    if (Intersect(de3.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de3.remove(i);
                    }
            }
              for(int i=0 ; i<de4.size();i++){
                    g.drawImage( de4.get(i).getImage() ,de4.get(i).getX(),de4.get(i).getY(),100,100,this);
                    if (Intersect(de4.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de4.remove(i);
                    }
            }
               for(int i=0 ; i<st1.size();i++){
                    g.drawImage( st1.get(i).getImage() ,st1.get(i).getX(),st1.get(i).getY(),100,100,this);
                    if (Intersect(st1.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st1.remove(i);
                    }
            }
            for(int i=0 ; i<st2.size();i++){
                    g.drawImage( st2.get(i).getImage() ,st2.get(i).getX(),st2.get(i).getY(),100,100,this);
                    if (Intersect(st2.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st2.remove(i);
                    }
            }
             for(int i=0 ; i<st3.size();i++){
                    g.drawImage( st3.get(i).getImage() ,st3.get(i).getX(),st3.get(i).getY(),100,100,this);
                    if (Intersect(st3.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st3.remove(i);
                    }
            }
              for(int i=0 ; i<st4.size();i++){
                    g.drawImage( st4.get(i).getImage() ,st4.get(i).getX(),st4.get(i).getY(),100,100,this);
                    if (Intersect(st4.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st4.remove(i);
                    }
            }
              for(int i=0 ; i<sto1.size();i++){
                    g.drawImage( sto1.get(i).getImage() ,sto1.get(i).getX(),sto1.get(i).getY(),100,100,this);
                    if (Intersect(sto1.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto1.remove(i);
                    }
            }
            for(int i=0 ; i<sto2.size();i++){
                    g.drawImage( sto2.get(i).getImage() ,sto2.get(i).getX(),sto2.get(i).getY(),100,100,this);
                    if (Intersect(sto2.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto2.remove(i);
                    }
            }
             for(int i=0 ; i<sto3.size();i++){
                    g.drawImage( sto3.get(i).getImage() ,sto3.get(i).getX(),sto3.get(i).getY(),100,100,this);
                    if (Intersect(sto3.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto3.remove(i);
                    }
            }
              for(int i=0 ; i<sto4.size();i++){
                    g.drawImage( sto4.get(i).getImage() ,sto4.get(i).getX(),sto4.get(i).getY(),100,100,this);
                    if (Intersect(sto4.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto4.remove(i);
                    }
            }
            }
            
            if (times <= 50) {
            g.drawImage(bg3.getImage(), 0, 0,getWidth(),getHeight(),this);
            g.drawImage(bg2.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawString("SCORE =  " + scor, 80 , 100);
            g.drawImage(Dog.getImage(),D.x, 650, 300, 200, this);
            g.drawString("Time :" + times, 80, 200);
            for(int i=0 ; i<ba1.size();i++){
                    g.drawImage( ba1.get(i).getImage() ,ba1.get(i).getX(),ba1.get(i).getY(),100,100,this);
                    if (Intersect(ba1.get(i).getbound(),D.getbound())){
                        scor += 10;
                        ba1.remove(i);
                    }
                    
            }
            for(int i=0 ; i<ba2.size();i++){
                    g.drawImage( ba2.get(i).getImage() ,ba2.get(i).getX(),ba2.get(i).getY(),100,100,this);
                   if (Intersect(ba2.get(i).getbound(),D.getbound())){
                        scor += 30;
                        ba2.remove(i);
                    }
            }
            for(int i=0 ; i<ba3.size();i++){
                    g.drawImage( ba3.get(i).getImage() ,ba3.get(i).getX(),ba3.get(i).getY(),100,100,this);
                    if (Intersect(ba3.get(i).getbound(),D.getbound())){
                        scor += 50;
                        ba3.remove(i);
                    }
                    
                    
            }
            for(int i=0 ; i<ba4.size();i++){
                    g.drawImage( ba4.get(i).getImage() ,ba4.get(i).getX(),ba4.get(i).getY(),100,100,this);
                    if (Intersect(ba4.get(i).getbound(),D.getbound())){
                        scor += 20;
                        ba4.remove(i);
                    }
            }
            for(int i=0 ; i<de1.size();i++){
                    g.drawImage( de1.get(i).getImage() ,de1.get(i).getX(),de1.get(i).getY(),100,100,this);
                    if (Intersect(de1.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de1.remove(i);
                    }
            }
            for(int i=0 ; i<de2.size();i++){
                    g.drawImage( de2.get(i).getImage() ,de2.get(i).getX(),de2.get(i).getY(),100,100,this);
                    if (Intersect(de2.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de2.remove(i);
                    }
            }
             for(int i=0 ; i<de3.size();i++){
                    g.drawImage( de3.get(i).getImage() ,de3.get(i).getX(),de3.get(i).getY(),100,100,this);
                    if (Intersect(de3.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de3.remove(i);
                    }
            }
              for(int i=0 ; i<de4.size();i++){
                    g.drawImage( de4.get(i).getImage() ,de4.get(i).getX(),de4.get(i).getY(),100,100,this);
                    if (Intersect(de4.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de4.remove(i);
                    }
            }
                 for(int i=0 ; i<st1.size();i++){
                    g.drawImage( st1.get(i).getImage() ,st1.get(i).getX(),st1.get(i).getY(),100,100,this);
                    if (Intersect(st1.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st1.remove(i);
                    }
            }
            for(int i=0 ; i<st2.size();i++){
                    g.drawImage( st2.get(i).getImage() ,st2.get(i).getX(),st2.get(i).getY(),100,100,this);
                    if (Intersect(st2.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st2.remove(i);
                    }
            }
             for(int i=0 ; i<st3.size();i++){
                    g.drawImage( st3.get(i).getImage() ,st3.get(i).getX(),st3.get(i).getY(),100,100,this);
                    if (Intersect(st3.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st3.remove(i);
                    }
            }
              for(int i=0 ; i<st4.size();i++){
                    g.drawImage( st4.get(i).getImage() ,st4.get(i).getX(),st4.get(i).getY(),100,100,this);
                    if (Intersect(st4.get(i).getbound(),D.getbound())){
                        scor += 550;
                        st4.remove(i);
                    }
            }
                for(int i=0 ; i<sto1.size();i++){
                    g.drawImage( sto1.get(i).getImage() ,sto1.get(i).getX(),sto1.get(i).getY(),100,100,this);
                    if (Intersect(sto1.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto1.remove(i);
                    }
            }
            for(int i=0 ; i<sto2.size();i++){
                    g.drawImage( sto2.get(i).getImage() ,sto2.get(i).getX(),sto2.get(i).getY(),100,100,this);
                    if (Intersect(sto2.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto2.remove(i);
                    }
            }
             for(int i=0 ; i<sto3.size();i++){
                    g.drawImage( sto3.get(i).getImage() ,sto3.get(i).getX(),sto3.get(i).getY(),100,100,this);
                    if (Intersect(sto3.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto3.remove(i);
                    }
            }
              for(int i=0 ; i<sto4.size();i++){
                    g.drawImage( sto4.get(i).getImage() ,sto4.get(i).getX(),sto4.get(i).getY(),100,100,this);
                    if (Intersect(sto4.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto4.remove(i);
                    }
            }
            }
            
            if (times <= 25) {
            g.drawImage(bg4.getImage(), 0, 0,getWidth(),getHeight(),this);
            g.drawImage(bg2.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawString("SCORE =  " + scor, 80 , 100);
            g.drawImage(Dog.getImage(),D.x, 650, 300, 200, this);
            g.drawString("Time :" + times, 80, 200);
            
            for(int i=0 ; i<ba1.size();i++){
                    g.drawImage( ba1.get(i).getImage() ,ba1.get(i).getX(),ba1.get(i).getY(),100,100,this);
                    if (Intersect(ba1.get(i).getbound(),D.getbound())){
                        scor += 20;
                        ba1.remove(i);
                    }
                    
            }
            for(int i=0 ; i<ba2.size();i++){
                    g.drawImage( ba2.get(i).getImage() ,ba2.get(i).getX(),ba2.get(i).getY(),100,100,this);
                   if (Intersect(ba2.get(i).getbound(),D.getbound())){
                        scor += 45;
                        ba2.remove(i);
                    }
            }
            for(int i=0 ; i<ba3.size();i++){
                    g.drawImage( ba3.get(i).getImage() ,ba3.get(i).getX(),ba3.get(i).getY(),100,100,this);
                    if (Intersect(ba3.get(i).getbound(),D.getbound())){
                        scor += 30;
                        ba3.remove(i);
                    }
                    
                    
            }
            for(int i=0 ; i<ba4.size();i++){
                    g.drawImage( ba4.get(i).getImage() ,ba4.get(i).getX(),ba4.get(i).getY(),100,100,this);
                    if (Intersect(ba4.get(i).getbound(),D.getbound())){
                        scor += 10;
                        ba4.remove(i);
                    }
            }
            for(int i=0 ; i<de1.size();i++){
                    g.drawImage( de1.get(i).getImage() ,de1.get(i).getX(),de1.get(i).getY(),100,100,this);
                    if (Intersect(de1.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de1.remove(i);
                    }
            }
            for(int i=0 ; i<de2.size();i++){
                    g.drawImage( de2.get(i).getImage() ,de2.get(i).getX(),de2.get(i).getY(),100,100,this);
                    if (Intersect(de2.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de2.remove(i);
                    }
            }
             for(int i=0 ; i<de3.size();i++){
                    g.drawImage( de3.get(i).getImage() ,de3.get(i).getX(),de3.get(i).getY(),100,100,this);
                    if (Intersect(de3.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de3.remove(i);
                    }
            }
              for(int i=0 ; i<de4.size();i++){
                    g.drawImage( de4.get(i).getImage() ,de4.get(i).getX(),de4.get(i).getY(),100,100,this);
                    if (Intersect(de4.get(i).getbound(),D.getbound())){
                        scor -= 50;
                        de4.remove(i);
                    }
            }
                 for(int i=0 ; i<st1.size();i++){
                    g.drawImage( st1.get(i).getImage() ,st1.get(i).getX(),st1.get(i).getY(),100,100,this);
                    if (Intersect(st1.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st1.remove(i);
                    }
            }
            for(int i=0 ; i<st2.size();i++){
                    g.drawImage( st2.get(i).getImage() ,st2.get(i).getX(),st2.get(i).getY(),100,100,this);
                    if (Intersect(st2.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st2.remove(i);
                    }
            }
             for(int i=0 ; i<st3.size();i++){
                    g.drawImage( st3.get(i).getImage() ,st3.get(i).getX(),st3.get(i).getY(),100,100,this);
                    if (Intersect(st3.get(i).getbound(),D.getbound())){
                        scor += 500;
                        st3.remove(i);
                    }
            }
              for(int i=0 ; i<st4.size();i++){
                    g.drawImage( st4.get(i).getImage() ,st4.get(i).getX(),st4.get(i).getY(),100,100,this);
                    if (Intersect(st4.get(i).getbound(),D.getbound())){
                        scor += 550;
                        st4.remove(i);
                    }
            }
                for(int i=0 ; i<sto1.size();i++){
                    g.drawImage( sto1.get(i).getImage() ,sto1.get(i).getX(),sto1.get(i).getY(),100,100,this);
                    if (Intersect(sto1.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto1.remove(i);
                    }
            }
            for(int i=0 ; i<sto2.size();i++){
                    g.drawImage( sto2.get(i).getImage() ,sto2.get(i).getX(),sto2.get(i).getY(),100,100,this);
                    if (Intersect(sto2.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto2.remove(i);
                    }
            }
             for(int i=0 ; i<sto3.size();i++){
                    g.drawImage( sto3.get(i).getImage() ,sto3.get(i).getX(),sto3.get(i).getY(),100,100,this);
                    if (Intersect(sto3.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto3.remove(i);
                    }
            }
              for(int i=0 ; i<sto4.size();i++){
                    g.drawImage( sto4.get(i).getImage() ,sto4.get(i).getX(),sto4.get(i).getY(),100,100,this);
                    if (Intersect(sto4.get(i).getbound(),D.getbound())){
                        scor -= 500;
                        sto4.remove(i);
                    }
            }
	}
            
        
    }
    }
    public boolean Intersect(Rectangle2D a, Rectangle2D b) {
        return (a.intersects(b));
    }
    
}

    


