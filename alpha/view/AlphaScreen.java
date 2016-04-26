package alpha.view;

import alpha.model.Land;
import alpha.model.User;


public class AlphaScreen extends javax.swing.JPanel {

    private final Land[] lande;
    private final User bruger;
    private String nuland; 
    
    private int bpris;
    private int spris;
    
    private Boolean igang;
    
    public AlphaScreen() {
              
        lande = new Land[6];
        lande[0] = new Land();
        lande[1] = new Land();
        lande[2] = new Land();
        lande[3] = new Land();
        lande[4] = new Land();
        lande[5] = new Land();        
        
        bruger = new User();
        
        initComponents();
        
        OurCountry.addItem("Denmark");
        OurCountry.addItem("Colombia");
        OurCountry.addItem("Germany");
        OurCountry.addItem("USA");
        OurCountry.addItem("France");
        OurCountry.addItem("Afghanistan");

        nuland = "Denmark";        
        bpris = 0;
        spris = 0;
        
        ButtonGO.setEnabled(false);
        ButtonBuy.setEnabled(true);
        ButtonSell.setEnabled(true);
        ButtonEnd.setEnabled(false);
        
        visland(landindex(OurCountry.getSelectedItem().toString()));
        visbruger();
    }

    private int landindex(String navn)
    {
       int index = 0;
       
       if (navn.equals("Denmark"))       index = 0;
       if (navn.equals("Colombia"))      index = 1;
       if (navn.equals("Germany"))       index = 2;
       if (navn.equals("USA"))           index = 3;
       if (navn.equals("France"))        index = 4;
       if (navn.equals("Afghanistand"))  index = 5;      
       
       return index;
    }
    
    private void visland(int index)
    {
        TextBuy0.setText(lande[index].Stofdata(0));
        TextBuy1.setText(lande[index].Stofdata(1));
        TextBuy2.setText(lande[index].Stofdata(2));
        TextBuy3.setText(lande[index].Stofdata(3));
        TextBuy4.setText(lande[index].Stofdata(4));
        TextBuy5.setText(lande[index].Stofdata(5));
        
        igang = false;    
        B0.removeAllItems();
        B1.removeAllItems();
        B2.removeAllItems();
        B3.removeAllItems();
        B4.removeAllItems();
        B5.removeAllItems();   
        
        B0.addItem("0");
        B1.addItem("0");
        B2.addItem("0");
        B3.addItem("0");
        B4.addItem("0");
        B5.addItem("0");
        if (lande[index].getTilgængelighed(0) > 0) B0.addItem("1");
        if (lande[index].getTilgængelighed(1) > 0) B1.addItem("1");
        if (lande[index].getTilgængelighed(2) > 0) B2.addItem("1");
        if (lande[index].getTilgængelighed(3) > 0) B3.addItem("1");
        if (lande[index].getTilgængelighed(4) > 0) B4.addItem("1");
        if (lande[index].getTilgængelighed(5) > 0) B5.addItem("1");
        igang = true;        
        
        BuyPrice.setText(bpris + "");
       
    }
    
    private void visbruger()
    {
        TextSell0.setText("Cocaine         " + bruger.getBeholdning(0));
        TextSell1.setText("Heroine         " + bruger.getBeholdning(1));
        TextSell2.setText("Amphetamine     " + bruger.getBeholdning(2));
        TextSell3.setText("Acid            " + bruger.getBeholdning(3));
        TextSell4.setText("Angel dust      " + bruger.getBeholdning(4));
        TextSell5.setText("Crystal Meth    " + bruger.getBeholdning(5));                
        
        TextCash.setText(bruger.getPenge() + "");
        TextNr.setText(bruger.getBesogt() + "");
        
        igang = false;       
        S0.removeAllItems();
        S1.removeAllItems();
        S2.removeAllItems();
        S3.removeAllItems();
        S4.removeAllItems();
        S5.removeAllItems();
        
        S0.addItem("0");
        S1.addItem("0");
        S2.addItem("0");
        S3.addItem("0");
        S4.addItem("0");
        S5.addItem("0");        
        if (bruger.getBeholdning(0) > 0) S0.addItem("1");
        if (bruger.getBeholdning(1) > 0) S1.addItem("1");
        if (bruger.getBeholdning(2) > 0) S2.addItem("1");
        if (bruger.getBeholdning(3) > 0) S3.addItem("1");
        if (bruger.getBeholdning(4) > 0) S4.addItem("1");
        if (bruger.getBeholdning(5) > 0) S5.addItem("1");
        igang = true;
        
        
        SellPrice.setText(spris + "");
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelChoose = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        OurCountry = new javax.swing.JComboBox<>();
        ButtonGO = new javax.swing.JButton();
        TextBuy0 = new javax.swing.JTextField();
        TextBuy1 = new javax.swing.JTextField();
        TextBuy2 = new javax.swing.JTextField();
        TextBuy3 = new javax.swing.JTextField();
        TextBuy4 = new javax.swing.JTextField();
        TextBuy5 = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        B0 = new javax.swing.JComboBox<>();
        B1 = new javax.swing.JComboBox<>();
        B2 = new javax.swing.JComboBox<>();
        B3 = new javax.swing.JComboBox<>();
        B4 = new javax.swing.JComboBox<>();
        B5 = new javax.swing.JComboBox<>();
        jLabelView = new javax.swing.JLabel();
        BuyPrice = new javax.swing.JTextField();
        ButtonBuy = new javax.swing.JButton();
        jPanelP = new javax.swing.JPanel();
        jLabelN = new javax.swing.JLabel();
        TextSell1 = new javax.swing.JTextField();
        TextSell2 = new javax.swing.JTextField();
        TextSell3 = new javax.swing.JTextField();
        TextSell4 = new javax.swing.JTextField();
        TextSell5 = new javax.swing.JTextField();
        jLabelA = new javax.swing.JLabel();
        S0 = new javax.swing.JComboBox<>();
        S1 = new javax.swing.JComboBox<>();
        S2 = new javax.swing.JComboBox<>();
        S3 = new javax.swing.JComboBox<>();
        S4 = new javax.swing.JComboBox<>();
        S5 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        SellPrice = new javax.swing.JTextField();
        ButtonSell = new javax.swing.JButton();
        TextSell0 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextCash = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextNr = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LastInfo = new javax.swing.JTextField();
        ButtonEnd = new javax.swing.JButton();

        PanelChoose.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Choose your country");

        OurCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OurCountryActionPerformed(evt);
            }
        });

        ButtonGO.setText("GO");
        ButtonGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGOActionPerformed(evt);
            }
        });

        TextBuy0.setEditable(false);
        TextBuy0.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextBuy1.setEditable(false);
        TextBuy1.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextBuy2.setEditable(false);
        TextBuy2.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextBuy3.setEditable(false);
        TextBuy3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextBuy4.setEditable(false);
        TextBuy4.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextBuy5.setEditable(false);
        TextBuy5.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        jLabelName.setText("Name");

        jLabelPrice.setText("Price ($)");

        jLabelAmount.setText("Amount");

        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        jLabelView.setText("Bought for ($)");

        BuyPrice.setEditable(false);

        ButtonBuy.setBackground(new java.awt.Color(102, 0, 0));
        ButtonBuy.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuy.setText("BUY");
        ButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChooseLayout = new javax.swing.GroupLayout(PanelChoose);
        PanelChoose.setLayout(PanelChooseLayout);
        PanelChooseLayout.setHorizontalGroup(
            PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChooseLayout.createSequentialGroup()
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelChooseLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelChooseLayout.createSequentialGroup()
                                .addComponent(OurCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonGO)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChooseLayout.createSequentialGroup()
                                .addComponent(BuyPrice)
                                .addGap(98, 98, 98)
                                .addComponent(ButtonBuy)
                                .addGap(43, 43, 43))
                            .addGroup(PanelChooseLayout.createSequentialGroup()
                                .addComponent(jLabelView, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelChooseLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B1, 0, 44, Short.MAX_VALUE)
                                    .addComponent(B2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextBuy5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(TextBuy4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextBuy0, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChooseLayout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPrice)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAmount))
                            .addComponent(TextBuy1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextBuy2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextBuy3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19)))
                .addContainerGap())
            .addGroup(PanelChooseLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelChooseLayout.setVerticalGroup(
            PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChooseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OurCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jLabelName)
                    .addComponent(jLabelAmount))
                .addGap(18, 18, 18)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextBuy0, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuy4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuy5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelView)
                .addGap(5, 5, 5)
                .addGroup(PanelChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuy))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanelP.setBackground(new java.awt.Color(204, 204, 204));

        jLabelN.setText("Name");

        TextSell1.setEditable(false);
        TextSell1.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextSell2.setEditable(false);
        TextSell2.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextSell3.setEditable(false);
        TextSell3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextSell4.setEditable(false);
        TextSell4.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        TextSell5.setEditable(false);
        TextSell5.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        jLabelA.setText("Amount");

        S0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S0ActionPerformed(evt);
            }
        });

        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S4ActionPerformed(evt);
            }
        });

        S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Sold for ($)");

        SellPrice.setEditable(false);

        ButtonSell.setBackground(new java.awt.Color(102, 0, 0));
        ButtonSell.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSell.setText("SELL");
        ButtonSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSellActionPerformed(evt);
            }
        });

        TextSell0.setEditable(false);
        TextSell0.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanelPLayout = new javax.swing.GroupLayout(jPanelP);
        jPanelP.setLayout(jPanelPLayout);
        jPanelPLayout.setHorizontalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(S5, javax.swing.GroupLayout.Alignment.TRAILING, 0, 45, Short.MAX_VALUE)
                    .addComponent(S4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(S1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(S0, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(S3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(S2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelA)
                        .addGap(22, 22, 22))
                    .addComponent(TextSell0, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(TextSell1)
                    .addComponent(TextSell2)
                    .addComponent(TextSell3)
                    .addComponent(TextSell4)
                    .addComponent(TextSell5))
                .addGap(24, 24, 24))
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPLayout.createSequentialGroup()
                        .addComponent(SellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(ButtonSell)
                        .addGap(32, 32, 32))))
        );
        jPanelPLayout.setVerticalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelN)
                    .addComponent(jLabelA))
                .addGap(18, 18, 18)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSell0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSell4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSell5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSell))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Cash left ($)");

        TextCash.setEditable(false);

        jLabel2.setText("Travelled (times)");

        TextNr.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(TextCash, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(TextNr, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        LastInfo.setEditable(false);
        LastInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastInfoActionPerformed(evt);
            }
        });

        ButtonEnd.setBackground(new java.awt.Color(153, 0, 0));
        ButtonEnd.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEnd.setText("END");
        ButtonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LastInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(ButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEnd))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void ButtonGOActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        
            this.nuland = OurCountry.getSelectedItem().toString();
    
            lande[landindex(nuland)].Reberegn_stoffer();
            
            visland(landindex(nuland));
        
            ButtonGO.setEnabled(false);
            ButtonBuy.setEnabled(true);
            ButtonSell.setEnabled(true);                        
            
            bruger.Go();
            visbruger();
            
            if (bruger.getBesogt() == 20)
            {
               ButtonGO.setEnabled(false);
               ButtonBuy.setEnabled(false);
               ButtonSell.setEnabled(false);
               ButtonEnd.setEnabled(true);
            }
            
            bpris = 0;
            BuyPrice.setText(bpris + "");
   
            spris = 0;
            SellPrice.setText(spris + "");
            
        
    }                                        

    private void OurCountryActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if (OurCountry.getSelectedItem().toString().equals(nuland) == false)
        {
            ButtonGO.setEnabled(true);
            ButtonBuy.setEnabled(false);
            ButtonSell.setEnabled(false);        
        } 
        else
        {
            ButtonGO.setEnabled(false);
            ButtonBuy.setEnabled(true);
            ButtonSell.setEnabled(true);                        
        }     
        
    }                                          

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           bpris = lande[index].Regn_pris(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
           BuyPrice.setText(bpris + "");
        }
    }                                  

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           bpris = lande[index].Regn_pris(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
           BuyPrice.setText(bpris + "");
        }
    }                                  

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           bpris = lande[index].Regn_pris(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
           BuyPrice.setText(bpris + "");
        }
    }                                  

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           bpris = lande[index].Regn_pris(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
           BuyPrice.setText(bpris + "");
        }
    }                                  

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           bpris = lande[index].Regn_pris(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
           BuyPrice.setText(bpris + "");
        }
    }                                  

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           bpris = lande[index].Regn_pris(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
           BuyPrice.setText(bpris + "");
        }
    }                                  

    private void S0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           spris = lande[index].Regn_pris(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
           SellPrice.setText(spris + "");
        }
    }                                  

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           spris = lande[index].Regn_pris(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
           SellPrice.setText(spris + "");
        }
    }                                  

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           spris = lande[index].Regn_pris(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
           SellPrice.setText(spris + "");
        }
    }                                  

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           spris = lande[index].Regn_pris(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
           SellPrice.setText(spris + "");
        }
    }                                  

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       
        if (igang == true)
        {
           int index = landindex(nuland);
           spris = lande[index].Regn_pris(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
           SellPrice.setText(spris + "");
        }
    }                                  

    private void S5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if (igang == true)
        {
           int index = landindex(nuland);
           spris = lande[index].Regn_pris(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
           SellPrice.setText(spris + "");
        }
    }                                  

    private void ButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        int index = landindex(nuland);
        
        if (bpris <= bruger.getPenge())
        {
        bruger.Buy(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()),bpris);
        
        lande[index].Buy(Integer.parseInt(B0.getSelectedItem().toString()),
                                          Integer.parseInt(B1.getSelectedItem().toString()),
                                          Integer.parseInt(B2.getSelectedItem().toString()),
                                          Integer.parseInt(B3.getSelectedItem().toString()),
                                          Integer.parseInt(B4.getSelectedItem().toString()),
                                          Integer.parseInt(B5.getSelectedItem().toString()));
        
        
        bpris = 0;
        BuyPrice.setText(bpris + "");
          
        visland(landindex(nuland));
        visbruger();
        }
    }                                         

    private void ButtonSellActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        
        int index = landindex(nuland);
        
        
        bruger.Sell(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()),spris);
        lande[index].Sell(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()));
        
        
        spris = 0;
        SellPrice.setText(spris + "");
        
        visland(landindex(nuland));
        visbruger();
    }                                          

    private void ButtonEndActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        this.nuland = OurCountry.getSelectedItem().toString();
        bruger.Sell(Integer.parseInt(S0.getSelectedItem().toString()),
                                          Integer.parseInt(S1.getSelectedItem().toString()),
                                          Integer.parseInt(S2.getSelectedItem().toString()),
                                          Integer.parseInt(S3.getSelectedItem().toString()),
                                          Integer.parseInt(S4.getSelectedItem().toString()),
                                          Integer.parseInt(S5.getSelectedItem().toString()),spris);
        System.out.println("Her er prisen:"  );
    }                                         

    private void LastInfoActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        LastInfo.setText(nuland);
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> B0;
    private javax.swing.JComboBox<String> B1;
    private javax.swing.JComboBox<String> B2;
    private javax.swing.JComboBox<String> B3;
    private javax.swing.JComboBox<String> B4;
    private javax.swing.JComboBox<String> B5;
    private javax.swing.JButton ButtonBuy;
    private javax.swing.JButton ButtonEnd;
    private javax.swing.JButton ButtonGO;
    private javax.swing.JButton ButtonSell;
    private javax.swing.JTextField BuyPrice;
    private javax.swing.JTextField LastInfo;
    private javax.swing.JComboBox<String> OurCountry;
    private javax.swing.JPanel PanelChoose;
    private javax.swing.JComboBox<String> S0;
    private javax.swing.JComboBox<String> S1;
    private javax.swing.JComboBox<String> S2;
    private javax.swing.JComboBox<String> S3;
    private javax.swing.JComboBox<String> S4;
    private javax.swing.JComboBox<String> S5;
    private javax.swing.JTextField SellPrice;
    private javax.swing.JTextField TextBuy0;
    private javax.swing.JTextField TextBuy1;
    private javax.swing.JTextField TextBuy2;
    private javax.swing.JTextField TextBuy3;
    private javax.swing.JTextField TextBuy4;
    private javax.swing.JTextField TextBuy5;
    private javax.swing.JTextField TextCash;
    private javax.swing.JTextField TextNr;
    private javax.swing.JTextField TextSell0;
    private javax.swing.JTextField TextSell1;
    private javax.swing.JTextField TextSell2;
    private javax.swing.JTextField TextSell3;
    private javax.swing.JTextField TextSell4;
    private javax.swing.JTextField TextSell5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelP;
    // End of variables declaration                   
}
