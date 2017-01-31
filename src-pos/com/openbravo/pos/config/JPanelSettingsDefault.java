/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.config;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ComboBoxValModel;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.user.DirtyManager;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.BeanFactoryApp;
import com.openbravo.pos.forms.BeanFactoryException;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.JPanelView;
import java.util.Properties;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author tt-01
 */
public class JPanelSettingsDefault extends javax.swing.JPanel implements JPanelView, BeanFactoryApp {

    /**
     * Creates new form JPanelSettingsDefault
     */
    public JPanelSettingsDefault() {
        initComponents();
        
        jTxtPrefCustCard.getDocument().addDocumentListener(m_Dirty);
        jTxtPrefUserCard.getDocument().addDocumentListener(m_Dirty);
        jTxtDollarValue.getDocument().addDocumentListener(m_Dirty);
        jTxtOrderNumber.getDocument().addDocumentListener(m_Dirty);
        jTxtResetOrderNumber.getDocument().addDocumentListener(m_Dirty);
        
        jCmbWarehouse.addActionListener(m_Dirty);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanelPreffix = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtPrefCustCard = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtPrefUserCard = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtDollarValue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtOrderNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtResetOrderNumber = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCmbWarehouse = new javax.swing.JComboBox<>();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pos_messages"); // NOI18N
        jButSave.setText(bundle.getString("Button.Save")); // NOI18N
        jButSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButSave)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButSave)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanelPreffix.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("Label.Prefix"))); // NOI18N

        jLabel1.setText(bundle.getString("label.prefix.card.customer")); // NOI18N

        jLabel2.setText(bundle.getString("label.prefix.card.user")); // NOI18N

        jLabel4.setText(bundle.getString("Label.Currency.Dollar")); // NOI18N

        jLabel5.setText(bundle.getString("Label.OrderNumber")); // NOI18N

        jLabel6.setText(bundle.getString("Label.ResetOrderNumber")); // NOI18N

        javax.swing.GroupLayout jPanelPreffixLayout = new javax.swing.GroupLayout(jPanelPreffix);
        jPanelPreffix.setLayout(jPanelPreffixLayout);
        jPanelPreffixLayout.setHorizontalGroup(
            jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPreffixLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtPrefCustCard)
                    .addComponent(jTxtPrefUserCard, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jTxtDollarValue)
                    .addComponent(jTxtOrderNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtResetOrderNumber)
                .addGap(205, 205, 205))
        );
        jPanelPreffixLayout.setVerticalGroup(
            jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPreffixLayout.createSequentialGroup()
                .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtPrefCustCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPreffixLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDollarValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jTxtPrefUserCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPreffixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTxtResetOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("Label.Select"))); // NOI18N

        jLabel3.setText(bundle.getString("label.warehouse")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jCmbWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCmbWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPreffix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPreffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSaveActionPerformed
        saveProperties();        
    }//GEN-LAST:event_jButSaveActionPerformed

    @Override
    public String getTitle() {
        return AppLocal.getIntString("Menu.DefaultSet");
    }

    @Override
    public void activate() throws BasicException {
        jTxtPrefCustCard.setText(m_Prop.getProperty("customercard"));
        jTxtPrefUserCard.setText(m_Prop.getProperty("usercard"));
        jTxtDollarValue.setText(m_Prop.getProperty("dollar.amount"));
        jTxtOrderNumber.setText(m_Prop.getProperty("orderNumber"));
        jTxtResetOrderNumber.setText(m_Prop.getProperty("resetOrderNumber"));
        
        m_SentListWarehouse = m_DLSales.getLocationsList();
        m_ComBoxModWarehouse = new ComboBoxValModel(m_SentListWarehouse.list());
        jCmbWarehouse.setModel(m_ComBoxModWarehouse);
        m_ComBoxModWarehouse.setSelectedKey(m_Prop.getProperty("location"));
        
        m_Dirty.setDirty(false);
    }

    @Override
    public boolean deactivate() {
        if(m_Dirty.isDirty()) {
            int res = JOptionPane.showConfirmDialog(
                    this, 
                    AppLocal.getIntString("message.wannasave"), 
                    AppLocal.getIntString("title.defaultparam"), 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
            if(res == JOptionPane.YES_OPTION) {
                saveProperties();
                return true;
            } else {
                return res == JOptionPane.NO_OPTION;
            }
        }
        
        return true;
    }

    @Override
    public JComponent getComponent() {
        return this;
    }

    @Override
    public void init(AppView app) throws BeanFactoryException {
        m_DLSystem = (DataLogicSystem) app.getBean(DataLogicSystem.class.getName());
        m_DLSales = (DataLogicSales) app.getBean(DataLogicSales.class.getName());
        m_AppProp = app.getProperties();
        m_Prop = m_DLSystem.getResourceAsProperties(m_AppProp.getHost() + "/properties");
    }

    @Override
    public Object getBean() {
        return this;
    }

    private void saveProperties() {
        m_Prop.setProperty("customercard", jTxtPrefCustCard.getText());
        m_Prop.setProperty("usercard", jTxtPrefUserCard.getText());
        m_Prop.setProperty("location", m_ComBoxModWarehouse.getSelectedKey().toString()); 
        m_Prop.setProperty("dollar.amount", jTxtDollarValue.getText());
        
        m_Prop.setProperty("orderNumber", jTxtOrderNumber.getText());
        m_Prop.setProperty("resetOrderNumber", jTxtResetOrderNumber.getText());
        
        m_DLSystem.setResourceAsProperties(m_AppProp.getHost() + "/properties", m_Prop);
        
        JOptionPane.showMessageDialog(
                this, 
                AppLocal.getIntString("message.defaultparam.save"), 
                AppLocal.getIntString("title.defaultparam"), 
                JOptionPane.INFORMATION_MESSAGE);
        
        m_Dirty.setDirty(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButSave;
    private javax.swing.JComboBox<String> jCmbWarehouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPreffix;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtDollarValue;
    private javax.swing.JTextField jTxtOrderNumber;
    private javax.swing.JTextField jTxtPrefCustCard;
    private javax.swing.JTextField jTxtPrefUserCard;
    private javax.swing.JTextField jTxtResetOrderNumber;
    // End of variables declaration//GEN-END:variables
    
    private final DirtyManager m_Dirty = new DirtyManager();
    private DataLogicSystem m_DLSystem;
    private DataLogicSales m_DLSales;
    private AppProperties m_AppProp;
    private Properties m_Prop;
    private SentenceList m_SentListWarehouse;
    private ComboBoxValModel m_ComBoxModWarehouse;
}
