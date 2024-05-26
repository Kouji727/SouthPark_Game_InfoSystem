
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Main{

    public static void main(String[] args) {

        int delay = 3000;
        int delay1 = 5500;

        JPanel logout = new JPanel();
        logout.setLayout(null);
        logout.setVisible(false);
        logout.setSize(1280,720);

        ImageIcon lo = new ImageIcon(Main.class.getResource("/resources/Extras/loading.gif"));
        JLabel lo1 = new JLabel(lo);
        lo1.setBounds(960,410,263,263);
        lo1.setVisible(true);
        lo1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ImageIcon lobg = new ImageIcon(Main.class.getResource("/resources/BG/LogoutBG.png"));
        JLabel lobg1 = new JLabel(lobg);
        lobg1.setBounds(-10,-20,1280,720);
        lobg1.setVisible(true);
        lobg1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        logout.add(lo1);
        logout.add(lobg1);

        JFrame f = new JFrame("South Park Game Characters Info");
        Color br = new Color(0x341000);
        Color lbr = new Color(0xAD9B85);
        Color dlbr = new Color(0x38312A);
        Color sss = new Color(0x342F28);
        Color dg = new Color(0x131313);
        Color bc = new Color(0x2AACFF);
        Color br1 = new Color(0x3E1200);
        Color yellow = new Color(0xFFEB41);

        JMenuBar mb = new JMenuBar();
        mb.setBackground(lbr);
        mb.setBorderPainted(false);

        JMenu file = new JMenu("File");
        file.setFont(new Font("South Park",Font.PLAIN,15));
        file.setForeground(sss);
        JMenu about = new JMenu("About");
        about.setFont(new Font("South Park",Font.PLAIN,15));
        about.setForeground(sss);

        JMenuItem i1, i3, i4;

        i1 = new JMenuItem("Logout");
        i1.setFont(new Font("South Park",Font.PLAIN,15));
        i3 = new JMenuItem("Sources");
        i3.setFont(new Font("South Park",Font.PLAIN,15));
        i4 = new JMenuItem("Creator");
        i4.setFont(new Font("South Park",Font.PLAIN,15));


        JSeparator sp = new JSeparator();
        sp.setForeground(new java.awt.Color(0x6A5F4F));

        file.add(i1);
        about.add(i3);
        about.add(sp);
        about.add(i4);

        mb.add(file);
        mb.add(about);

        JInternalFrame info = new JInternalFrame();
        info.setBounds(0,0,1000,600);
        info.setBorder(null);
        info.setLayout(null);
        info.setBounds(130,42,1000,600);
        info.setVisible(false);

        BasicInternalFrameUI bi = (BasicInternalFrameUI)info.getUI();
        bi.setNorthPane(null);

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("JFrame");
        l1.addElement("JButton");
        l1.addElement("Image Button");
        l1.addElement("JLabel");
        l1.addElement("JOptionPane");
        l1.addElement("JTextField/TextArea");
        l1.addElement("JPasswordField");
        l1.addElement("JTable/JList");
        l1.addElement("JMenu");
        l1.addElement("JSeparator");
        l1.addElement("JScrollBar");

        JList<String> Codes = new JList<>(l1);
        Codes.setBounds(70,110,360,465);

        Codes.setFont(new Font("South Park",Font.PLAIN,30));
        Codes.setForeground(dlbr);
        Codes.setSelectionForeground(Color.WHITE);
        Codes.setOpaque(false);
        DefaultListCellRenderer renderer = new DefaultListCellRenderer();
        renderer.setOpaque(false);
        Codes.setCellRenderer(renderer);
        Codes.setFixedCellHeight(40);
        Codes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        UIManager.put("List.focusCellHighlightBorder",Codes);

        JLabel loadlabel = new JLabel();
        loadlabel.setFont(new Font("South Park",Font.PLAIN,30));
        loadlabel.setBounds(583,70,360,50);
        loadlabel.setHorizontalAlignment(JTextField.CENTER);
        loadlabel.setForeground(yellow);

        JLabel prompt = new JLabel("Required Codes to Use");
        prompt.setFont(new Font("South Park",Font.PLAIN,30));
        prompt.setBounds(70,60,500,50);
        prompt.setForeground(br);

        JButton loadresult = new JButton();
        loadresult.setBounds(600,135,325,400);
        loadresult.setContentAreaFilled(false);
        loadresult.setBorderPainted(false);
        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/pst.jpg")));

        JButton loadcode = new JButton();
        loadcode.setBounds(450,294,125,75);
        loadcode.setContentAreaFilled(false);
        loadcode.setBorderPainted(false);
        loadcode.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/loadbut.png")));
        loadcode.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loadcode.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (Codes.getSelectedIndex()!=-1){
                    data = Codes.getSelectedValue();
                    loadlabel.setText(data);

                    if (data.equalsIgnoreCase("JFrame")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jframe.jpg")));
                    }
                    if (data.equalsIgnoreCase("JButton")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jbutton.jpg")));
                    }
                    if (data.equalsIgnoreCase("image button")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jbutton.jpg")));
                    }
                    if (data.equalsIgnoreCase("jlabel")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jlabel.jpg")));
                    }
                    if (data.equalsIgnoreCase("joptionpane")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/joptionpane.jpg")));
                    }
                    if (data.equalsIgnoreCase("jtextfield/textarea")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jtf.jpg")));
                    }
                    if (data.equalsIgnoreCase("jpasswordfield")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jpf.jpg")));
                    }
                    if (data.equalsIgnoreCase("jtable/jlist")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jlist.jpg")));
                    }
                    if (data.equalsIgnoreCase("jmenu")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jmenu.jpg")));
                    }
                    if (data.equalsIgnoreCase("jseparator")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jseparator.jpg")));
                    }
                    if (data.equalsIgnoreCase("jscrollbar")){
                        loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/info/jscrollbar.jpg")));
                    }
                }
            }
        });

        info.add(prompt);
        info.add(loadresult);
        info.add(loadcode);
        info.add(Codes);
        info.add(loadlabel);

        //--------------------------------------------------------------------------------------------------------------------------
        //PANELS

        JInternalFrame aboutpanel = new JInternalFrame();
        aboutpanel.setBounds(380,180,520,310);
        aboutpanel.setVisible(false);
        aboutpanel.setBorder(null);

        BasicInternalFrameUI bi3 = (BasicInternalFrameUI)aboutpanel.getUI();
        bi3.setNorthPane(null);

        JLabel jecho = new JLabel("Jecho Be Like:");
        jecho.setBounds(35,15,310,50);
        jecho.setForeground(Color.WHITE);
        jecho.setFont(new Font("South Park", Font.PLAIN,25));
        jecho.setVisible(false);

        ImageIcon megif = new ImageIcon(Main.class.getResource("/resources/Extras/me.gif"));
        JLabel megif1 = new JLabel(megif);
        megif1.setBounds(20,20,480,270);
        megif1.setVisible(false);

        ImageIcon aboutbg = new ImageIcon(Main.class.getResource("/resources/BG/infoBG.jpg"));
        JLabel aboutbg1 = new JLabel(aboutbg);
        aboutbg1.setBounds(0,0,600,600);

        JLabel s1 = new JLabel("Sources:");
        s1.setBounds(10,60,310,50);
        s1.setFont(new Font("South Park", Font.PLAIN,25));
        s1.setVisible(false);

        JLabel s2 = new JLabel("stackoverflow.com");
        s2.setBounds(20,110,400,50);
        s2.setFont(new Font("South Park", Font.PLAIN,25));
        s2.setVisible(false);

        JLabel s3 = new JLabel("southpark.fandom.com");
        s3.setBounds(20,160,400,50);
        s3.setFont(new Font("South Park", Font.PLAIN,25));
        s3.setVisible(false);

        JButton xbutton = new JButton();
        xbutton.setBounds(480,10,30,30);
        xbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        xbutton.setContentAreaFilled(false);
        xbutton.setBorderPainted(false);
        xbutton.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/close.png")));
        xbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aboutpanel.setVisible(false);
            }
        });

        aboutpanel.add(xbutton);
        aboutpanel.add(jecho);
        aboutpanel.add(megif1);
        aboutpanel.add(s1);
        aboutpanel.add(s2);
        aboutpanel.add(s3);
        aboutpanel.add(aboutbg1);

        JPanel intro = new JPanel();
        intro.setLayout(null);
        intro.setVisible(true);
        intro.setSize(1280,720);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setVisible(false);
        mainPanel.setSize(1280,720);

        JPanel ch = new JPanel();
        ch.setLayout(null);
        ch.setVisible(false);
        ch.setSize(1280,720);

        JPanel sotPanel = new JPanel();
        sotPanel.setLayout(null);
        sotPanel.setVisible(false);
        sotPanel.setSize(1280,720);

        JPanel fbwPanel = new JPanel();
        fbwPanel.setLayout(null);
        fbwPanel.setVisible(false);
        fbwPanel.setSize(1280,720);

        //--------------------------------------------------------------------------------------------------------------------------
        // FBW CHARACTERS

        JInternalFrame fbwchar1 = new JInternalFrame();
        fbwchar1.setBounds(200,25,140,500); //120
        fbwchar1.setVisible(false);
        fbwchar1.setBorder(null);

        BasicInternalFrameUI bi2 = (BasicInternalFrameUI)fbwchar1.getUI();
        bi2.setNorthPane(null);

        JButton fbwchar2 = new JButton();
        fbwchar2.setBounds(370,25,700,500);
        fbwchar2.setVisible(false);
        fbwchar2.setContentAreaFilled(false);
        fbwchar2.setBorderPainted(false);
        fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/pscb.png")));

        JPanel fbwcharpanel = new JPanel();
        fbwcharpanel.setBounds(200,155,140,500); //120
        fbwcharpanel.setBorder(null);
        fbwcharpanel.setLayout(new BoxLayout(fbwcharpanel, BoxLayout.Y_AXIS));

        ImageIcon img6 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Captain Diabetes.png"));
        JLabel gg6 = new JLabel(img6);
        gg6.setBounds(0,0,120,140);
        gg6.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/scott.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img7 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Human Kite.png"));
        JLabel gg7 = new JLabel(img7);
        gg7.setBounds(0,0,120,140);
        gg7.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/kyle.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img8 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Mosquito.png"));
        JLabel gg8 = new JLabel(img8);
        gg8.setBounds(0,0,120,140);
        gg8.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/clyde.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img9 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Super Craig.png"));
        JLabel gg9 = new JLabel(img9);
        gg9.setBounds(0,0,120,140);
        gg9.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/craig.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img10 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/The Coon.png"));
        JLabel gg10 = new JLabel(img10);
        gg10.setBounds(0,0,120,140);
        gg10.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/cartman.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img11 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Call Girl.png"));
        JLabel gg11 = new JLabel(img11);
        gg11.setBounds(0,0,120,140);
        gg11.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/wendy.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img12 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Fastpass.png"));
        JLabel gg12 = new JLabel(img12);
        gg12.setBounds(0,0,120,140);
        gg12.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/jimmy.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img13 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Mysterion.png"));
        JLabel gg13 = new JLabel(img13);
        gg13.setBounds(0,0,120,140);
        gg13.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/kenny.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img14 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Professor Chaos.png"));
        JLabel gg14 = new JLabel(img14);
        gg14.setBounds(0,0,120,140);
        gg14.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/butters.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img15 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Toolshed.png"));
        JLabel gg15 = new JLabel(img15);
        gg15.setBounds(0,0,120,140);
        gg15.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/stan.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img16 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Tupperware.png"));
        JLabel gg16 = new JLabel(img16);
        gg16.setBounds(0,0,120,140);
        gg16.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/token.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img17 = new ImageIcon(Main.class.getResource("/resources/Characters/FBW Characters/Wonder Tweek.png"));
        JLabel gg17 = new JLabel(img17);
        gg11.setBounds(0,0,120,140);
        gg17.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/tweek.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        JScrollPane fbw1scroll = new JScrollPane(fbwcharpanel);
        fbwchar1.getContentPane().add(fbw1scroll);
        fbw1scroll.getVerticalScrollBar().setBackground(dg);
        fbw1scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() { protected void configureScrollBarColors() { this.thumbColor = bc; } });

        fbwcharpanel.add(gg6);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg7);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg8);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg9);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg10);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg11);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg12);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg13);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg14);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg15);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg16);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        fbwcharpanel.add(gg17);
        fbwcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));

        //--------------------------------------------------------------------------------------------------------------------------
        // SOT CHARACTERS

        JInternalFrame sotchar1 = new JInternalFrame();
        sotchar1.setBounds(200,155,140,500);
        sotchar1.setVisible(false);
        sotchar1.setBorder(null);

       BasicInternalFrameUI bi1 = (BasicInternalFrameUI)sotchar1.getUI();
       bi1.setNorthPane(null);

        JButton sotchar2 = new JButton();
        sotchar2.setBounds(370,155,700,500); //120
        sotchar2.setVisible(false);
        sotchar2.setContentAreaFilled(false);
        sotchar2.setBorderPainted(false);
        sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/pscy.png")));

       JPanel sotcharpanel = new JPanel();
        sotcharpanel.setBounds(200,155,140,500); //120
        sotcharpanel.setBorder(null);
        sotcharpanel.setLayout(new BoxLayout(sotcharpanel, BoxLayout.Y_AXIS));

        ImageIcon img = new ImageIcon(Main.class.getResource("/resources/Characters/SoT Characters/Paladin Butters.png"));
        JLabel gg = new JLabel(img);
        gg.setBounds(0,0,120,140);
        gg.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/butters.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img1 = new ImageIcon(Main.class.getResource("/resources/Characters/SoT Characters/Princess Kenny.png"));
        JLabel gg1 = new JLabel(img1);
        gg1.setBounds(0,0,120,140);
        gg1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/kenny.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img2 = new ImageIcon(Main.class.getResource("/resources/Characters/SoT Characters/Grand Wizard King Cartman.png"));
        JLabel gg2 = new JLabel(img2);
        gg2.setBounds(0,0,120,140);
        gg2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/cartman.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img3 = new ImageIcon(Main.class.getResource("/resources/Characters/SoT Characters/High Jew Elf King Kyle.png"));
        JLabel gg3 = new JLabel(img3);
        gg3.setBounds(0,0,120,140);
        gg3.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/kyle.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img4 = new ImageIcon(Main.class.getResource("/resources/Characters/SoT Characters/Stan Marshwalker.png"));
        JLabel gg4 = new JLabel(img4);
        gg4.setBounds(0,0,120,140);
        gg4.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/stan.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon img5 = new ImageIcon(Main.class.getResource("/resources/Characters/SoT Characters/Jimmy The Bard.png"));
        JLabel gg5 = new JLabel(img5);
        gg5.setBounds(0,0,120,140);
        gg5.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/jimmy.png")));
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                gg5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {

            }
        });

        JScrollPane sot1scroll = new JScrollPane(sotcharpanel);
        sotchar1.getContentPane().add(sot1scroll);
        sot1scroll.getVerticalScrollBar().setBackground(br1);
        sot1scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() { protected void configureScrollBarColors() { this.thumbColor = yellow; } });

        sotcharpanel.add(gg);
        sotcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        sotcharpanel.add(gg1);
        sotcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        sotcharpanel.add(gg2);
        sotcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        sotcharpanel.add(gg3);
        sotcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        sotcharpanel.add(gg4);
        sotcharpanel.add(Box.createRigidArea(new Dimension(0, 5)));
        sotcharpanel.add(gg5);

        //--------------------------------------------------------------------------------------------------------------------------
        // LOADING BACKGROUNDS

        ImageIcon mainload = new ImageIcon(Main.class.getResource("/resources/BG/MainLoading.jpg"));
        JLabel load1 = new JLabel(mainload);
        load1.setBounds(-10,-20,1280,720);
        load1.setVisible(false);
        load1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ImageIcon load = new ImageIcon(Main.class.getResource("/resources/Extras/loading.gif"));
        JLabel loadgif = new JLabel(load);
        loadgif.setBounds(960,410,263,263);
        loadgif.setVisible(false);
        loadgif.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ImageIcon load_sot = new ImageIcon(Main.class.getResource("/resources/Extras/loading.gif"));
        JLabel loadgif_sot = new JLabel(load_sot);
        loadgif_sot.setBounds(960,410,263,263);
        loadgif_sot.setVisible(false);
        loadgif_sot.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ImageIcon load_fbw = new ImageIcon(Main.class.getResource("/resources/Extras/loading.gif"));
        JLabel loadgif_fbw = new JLabel(load_fbw);
        loadgif_fbw.setBounds(960,410,263,263);
        loadgif_fbw.setVisible(false);
        loadgif_fbw.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ImageIcon sotload = new ImageIcon(Main.class.getResource("/resources/BG/SoTLoading.png"));
        JLabel sotload1 = new JLabel(sotload);
        sotload1.setBounds(-10,-20,1280,720);
        sotload1.setVisible(false);
        sotload1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ImageIcon fbwload = new ImageIcon(Main.class.getResource("/resources/BG/FBWLoading.png"));
        JLabel fbwload1 = new JLabel(fbwload);
        fbwload1.setBounds(-10,-20,1280,720);
        fbwload1.setVisible(false);
        fbwload1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        //---------------------------------------------------------------------------------------------------------------------
        // BACK BUTTON

        JButton backButton = new JButton( new ImageIcon(Main.class.getResource("/resources/Extras/back.gif")));
        backButton.setBounds(10,140,140,90);
        backButton.setVisible(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorder(null);
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                loadgif.setVisible(true);
                backButton.setVisible(false);
                sotPanel.setVisible(false);
                fbwPanel.setVisible(false);
                load1.setVisible(true);

                Timer timer = new Timer(delay, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ch.setVisible(true);
                        load1.setVisible(false);
                        loadgif.setVisible(false);
                        sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/pscy.png")));
                        fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/pscb.png")));
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        });

        JButton backButton1 = new JButton( new ImageIcon(Main.class.getResource("/resources/Extras/back.gif")));
        backButton1.setBounds(10,140,140,90);
        backButton1.setVisible(false);
        backButton1.setContentAreaFilled(false);
        backButton1.setBorder(null);
        backButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                loadgif.setVisible(true);
                backButton1.setVisible(false);
                sotPanel.setVisible(false);
                fbwPanel.setVisible(false);
                load1.setVisible(true);

                Timer timer = new Timer(delay, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ch.setVisible(true);
                        load1.setVisible(false);
                        loadgif.setVisible(false);
                        sotchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/SOT/pscy.png")));
                        fbwchar2.setIcon(new ImageIcon(Main.class.getResource("/resources/Information/FBW/pscb.png")));
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        });
        //--------------------------------------------------------------------------------------------------------------------------
        // STICK OF TRUTH PAGE

        ImageIcon sotimage = new ImageIcon(Main.class.getResource("/resources/BG/SoTBG.jpg"));
        JLabel sotbg = new JLabel(sotimage);
        sotbg.setBounds(-10,-20,1280,720);
        sotPanel.setVisible(false);
        sotbg.setVisible(false);

        ImageIcon infoBG = new ImageIcon(Main.class.getResource("/resources/BG/infoBG.jpg"));
        JLabel infopic = new JLabel(infoBG);
        infopic.setBounds(0,0,1000,600);

        JToggleButton infoButton = new JToggleButton( new ImageIcon(Main.class.getResource("/resources/Extras/infoButton.gif")));
        infoButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        infoButton.setBounds(10,580,90,89);
        infoButton.setContentAreaFilled(false);
        infoButton.setBorder(null);
        infoButton.setVisible(false);
        infoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(infoButton.isSelected()){
                    loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/pst.jpg")));
                    backButton1.setVisible(false);
                    sotchar1.setVisible(false);
                    sotchar2.setVisible(false);
                    info.setVisible(true);
                } else {
                    info.setVisible(false);
                    backButton1.setVisible(true);
                    sotchar1.setVisible(true);
                    sotchar2.setVisible(true);
                }
            }
        });

        info.add(infopic);

        //--------------------------------------------------------------------------------------------------------------------------
        // FRACTURED BUT WHOLE PAGE

        ImageIcon fbwimage = new ImageIcon(Main.class.getResource("/resources/BG/FBWBG.jpg"));
        JLabel fbwbg = new JLabel(fbwimage);
        fbwbg.setBounds(-10,-20,1280,720);
        fbwPanel.setVisible(false);
        fbwbg.setVisible(false);

        JToggleButton infoButton1 = new JToggleButton( new ImageIcon(Main.class.getResource("/resources/Extras/infoButton.gif")));
        infoButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        infoButton1.setBounds(10,580,90,89);
        infoButton1.setContentAreaFilled(false);
        infoButton1.setBorder(null);
        infoButton1.setVisible(false);
        infoButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(infoButton1.isSelected()){
                    loadresult.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/pst.jpg")));
                    info.setVisible(true);
                    backButton.setVisible(false);
                    fbwchar1.setVisible(false);
                    fbwchar2.setVisible(false);
                } else {
                    info.setVisible(false);
                    backButton.setVisible(true);
                    fbwchar1.setVisible(true);
                    fbwchar2.setVisible(true);
                }
            }
        });

        //--------------------------------------------------------------------------------------------------------------------------
        // CHOOSE PAGE

        ImageIcon image = new ImageIcon(Main.class.getResource("/resources/BG/pickBG.jpg"));
        JLabel label = new JLabel(image);
        label.setBounds(0,0,1280,720);
        ch.setVisible(false);
        label.setVisible(false);

        JButton fbwpage = new JButton();
        fbwpage.setBounds(640,0,640,720);
        fbwpage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fbwpage.setContentAreaFilled(false);
        fbwpage.setVisible(false);
        fbwpage.setBorderPainted(false);
        fbwpage.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                fbwchar2.setVisible(false);
                fbwchar1.setVisible(false);
                ch.setVisible(false);
                fbwload1.setVisible(true);
                fbwPanel.setVisible(true);
                loadgif_fbw.setVisible(true);
                infoButton1.setVisible(false);
                fbwbg.setVisible(false);
                backButton.setVisible(false);

                Timer timer = new Timer( delay, new ActionListener(){
                    public void actionPerformed( ActionEvent e ){
                        fbwchar2.setVisible(true);
                        fbwchar1.setVisible(true);
                        fbwload1.setVisible(false);
                        fbwbg.setVisible(true);
                        infoButton1.setVisible(true);
                        backButton.setVisible(true);
                        loadgif_fbw.setVisible(false);
                    }
                } );
                timer.setRepeats( false );
                timer.start();
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                fbwpage.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/trans1.png")));
            }
            public void mouseExited(MouseEvent e) {
                fbwpage.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/nothing.png")));
            }
        });

        JButton sotpage = new JButton();
        sotpage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sotpage.setBounds(0,0,640,720);
        sotpage.setContentAreaFilled(false);
        sotpage.setVisible(false);
        sotpage.setBorderPainted(false);
        sotpage.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                ch.setVisible(false);
                sotload1.setVisible(true);
                sotPanel.setVisible(true);
                loadgif_sot.setVisible(true);
                sotbg.setVisible(false);
                infoButton.setVisible(false);
                sotchar2.setVisible(false);
                sotchar1.setVisible(false);
                backButton1.setVisible(false);

                Timer timer = new Timer( delay, new ActionListener(){
                    public void actionPerformed( ActionEvent e ){
                        sotchar2.setVisible(true);
                        sotchar1.setVisible(true);
                        sotload1.setVisible(false);
                        sotbg.setVisible(true);
                        infoButton.setVisible(true);
                        backButton1.setVisible(true);
                        loadgif_sot.setVisible(false);
                        sotbg.setVisible(true);
                    }
                } );
                timer.setRepeats( false );
                timer.start();
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
                sotpage.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/trans2.png")));
            }
            public void mouseExited(MouseEvent e) {
                sotpage.setIcon(new ImageIcon(Main.class.getResource("/resources/Extras/nothing.png")));
            }
        });

        //--------------------------------------------------------------------------------------------------------------------------
        // MAIN PAGE

        JTextField uf = new JTextField();
        uf.setBounds(185,235,323,43);
        uf.setOpaque(false);
        uf.setFont(new Font("South Park", Font.PLAIN,25));
        uf.setBorder(null);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(185,363,290,43);
        pf.setOpaque(false);
        pf.setEchoChar('*');
        pf.setBorder(null);

        JButton pb2 = new JButton(new ImageIcon(Main.class.getResource("/resources/Extras/view.png")));
        pb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pb2.setBounds(475, 369, 30, 30);
        pb2.setContentAreaFilled(false);
        pb2.setBorder(null);
        pb2.setVisible(false);
        pb2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });

        JButton pb = new JButton(new ImageIcon(Main.class.getResource("/resources/Extras/hidden.png")));
        pb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pb.setBounds(475, 369, 30, 30);
        pb.setContentAreaFilled(false);
        pb.setBorder(null);
        pb.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                pf.setFont(new Font("South Park", Font.PLAIN,25));
                pf.setEchoChar((char)0);
                pb.setVisible(false);
                pb2.setVisible(true);

                pb2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        pb.setVisible(true);
                        pb2.setVisible(false);
                        pf.setFont(null);
                        pf.setEchoChar('*');
                    }
                });
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });

        JLabel upi = new JLabel("Username or Password Incorrect");
        upi.setFont(new Font("South Park", Font.PLAIN, 15));
        upi.setBounds(205,520,300,100);
        upi.setForeground(br);
        upi.setVisible(false);

        JButton lb = new JButton();
        lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lb.setBounds(209,471,275,70);
        lb.setContentAreaFilled(false);
        lb.setBorderPainted(false);
        lb.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                String uf1 = uf.getText();
                String pf1 = new String(pf.getPassword());

                if(uf1.equalsIgnoreCase("matt and trey") && pf1.equalsIgnoreCase("south park")){
                    loadgif.setVisible(true);
                    ch.setVisible(false);
                    load1.setVisible(true);
                    upi.setVisible(false);
                    mainPanel.setVisible(false);
                    label.setVisible(false);

                    Timer timer = new Timer( delay, new ActionListener(){
                        public void actionPerformed( ActionEvent e ){
                            load1.setVisible(false);
                            loadgif.setVisible(false);
                            sotpage.setVisible(true);
                            fbwpage.setVisible(true);
                            label.setVisible(true);
                            ch.setVisible(true);
                            mb.setVisible(true);
                        }
                    } );
                    timer.setRepeats( false );
                    timer.start();
                }
                else {
                    upi.setVisible(true);
                }
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });

        //----------------------------------------------------------------------------------------------------------------------

        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logout.setVisible(true);
                ch.setVisible(false);
                mainPanel.setVisible(false);
                fbwPanel.setVisible(false);
                sotPanel.setVisible(false);
                backButton.setVisible(false);
                info.setVisible(false);

                Timer timer = new Timer( delay, new ActionListener(){
                    public void actionPerformed( ActionEvent e ){
                        logout.setVisible(false);
                        mainPanel.setVisible(true);
                        mb.setVisible(false);

                    }
                } );
                timer.setRepeats( false );
                timer.start();
            }
        });

        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aboutpanel.setVisible(true);
                s1.setVisible(true);
                s2.setVisible(true);
                s3.setVisible(true);
                jecho.setVisible(false);
                megif1.setVisible(false);
                sotpage.setVisible(false);
                sotchar1.setVisible(false);
                sotchar2.setVisible(false);
                fbwpage.setVisible(false);
                fbwchar1.setVisible(false);
                fbwchar2.setVisible(false);
                infoButton.setVisible(false);
                infoButton1.setVisible(false);
                backButton.setVisible(false);
                backButton1.setVisible(false);
            }
        });

        i4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aboutpanel.setVisible(true);
                s1.setVisible(false);
                s2.setVisible(false);
                s3.setVisible(false);
                jecho.setVisible(true);
                megif1.setVisible(true);
                sotpage.setVisible(false);
                sotchar1.setVisible(false);
                sotchar2.setVisible(false);
                fbwpage.setVisible(false);
                fbwchar1.setVisible(false);
                fbwchar2.setVisible(false);
                infoButton.setVisible(false);
                infoButton1.setVisible(false);
                backButton.setVisible(false);
                backButton1.setVisible(false);
            }
        });

        xbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aboutpanel.setVisible(false);
                sotpage.setVisible(true);
                sotchar1.setVisible(true);
                sotchar2.setVisible(true);
                fbwpage.setVisible(true);
                fbwchar1.setVisible(true);
                fbwchar2.setVisible(true);
                infoButton.setVisible(true);
                infoButton1.setVisible(true);
                backButton.setVisible(true);
                backButton1.setVisible(true);
            }
        });

        //--------------------------------------------------------------------------------------------------------------------------
        // INTRO

        ImageIcon introo = new ImageIcon(Main.class.getResource("/resources/Extras/intro.gif"));
        JLabel intt = new JLabel(introo);
        intt.setBounds(-10,-20,1280,720);

        intro.add(intt);
        mb.setVisible(false);

        Timer timer = new Timer(delay1, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainPanel.setVisible(true);
                intt.setVisible(false);
                intro.setVisible(false);

            }
        });
        timer.setRepeats(false);
        timer.start();


        ImageIcon mainBgImage = new ImageIcon(Main.class.getResource("/resources/BG/LoginBG.jpg"));
        JLabel mainBG = new JLabel(mainBgImage);
        mainBG.setBounds(-10,-20,1280,720);

        f.add(aboutpanel);
        f.add(logout);
        f.add(intro);
        f.setJMenuBar(mb);
        f.add(loadgif);
        f.add(load1);
        f.add(info);
        f.add(mainPanel);
        f.add(ch);
        f.add(fbwPanel);
        f.add(sotPanel);

        sotPanel.add(backButton1);
        sotPanel.add(sotchar1);
        sotPanel.add(sotchar2);
        sotPanel.add(loadgif_sot);
        sotPanel.add(infoButton);
        sotPanel.add(sotbg);
        sotPanel.add(sotload1);

        fbwPanel.add(backButton);
        fbwPanel.add(fbwchar2);
        fbwPanel.add(fbwchar1);
        fbwPanel.add(loadgif_fbw);
        fbwPanel.add(infoButton1);
        fbwPanel.add(fbwbg);
        fbwPanel.add(fbwload1);

        mainPanel.add(upi);
        mainPanel.add(lb);
        mainPanel.add(pb2);
        mainPanel.add(pb);
        mainPanel.add(uf);
        mainPanel.add(pf);
        mainPanel.add(mainBG);

        ch.add(sotpage);
        ch.add(fbwpage);
        ch.add(label);

        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
        f.setSize(1280, 720);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(f, "Do you want to Exit ?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                else if (result == JOptionPane.NO_OPTION)
                    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });

        }
    }