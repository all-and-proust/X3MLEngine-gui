/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.forth.ics.isl.x3ml.x3mlengine.gui;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.io.File;
import java.util.stream.Collectors;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * @author marketak
 */
@Log4j
public class GuiRunner extends javax.swing.JDialog {
    public static StringBuilder HTML_OUTPUT=new StringBuilder();
    Multimap<X3MLResourceType,Pair<File,String>> selectedResources;
    /**
     * Creates new form GuiRunner
     */
    public GuiRunner(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.selectedResources=HashMultimap.create();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        loadedFilesLabel = new javax.swing.JLabel();
        loadFilesButton = new javax.swing.JButton();
        uuidSizeLabel = new javax.swing.JLabel();
        uuidSizeTextField = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        outputFormatComboBox = new javax.swing.JComboBox<>();
        outputFolderTextField = new javax.swing.JTextField();
        outputFolderBrowseButton = new javax.swing.JButton();
        transformButton = new javax.swing.JButton();
        loadedFilesPanel = new javax.swing.JPanel();
        loadedFilesTextLabel = new javax.swing.JLabel();
        showErrorsCheckBox = new javax.swing.JCheckBox();
        resultsPanel = new javax.swing.JScrollPane();
        resultsLabel = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        clearMenuItem = new javax.swing.JMenuItem();
        transformMenuItem = new javax.swing.JMenuItem();
        fileMenuSeparator = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("X3ML Engine");
        setLocation(new java.awt.Point(150, 150));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setSize(new java.awt.Dimension(700, 700));

        titlePanel.setToolTipText("");
        titlePanel.setName(""); // NOI18N

        titleLabel.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/X3ML-Engine-log_small.png"))); // NOI18N
        titleLabel.setText("  X3ML Engine");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loadedFilesLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        loadedFilesLabel.setText("Loaded Files");

        loadFilesButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        loadFilesButton.setText("Load Files");
        loadFilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFilesButtonActionPerformed(evt);
            }
        });

        uuidSizeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        uuidSizeLabel.setText("UUID Size:");

        uuidSizeTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        uuidSizeTextField.setText("Default");

        outputLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        outputLabel.setText("Output:");

        outputFormatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RDF", "N3", "TRIG", "TURTLE" }));

        outputFolderBrowseButton.setText("...");
        outputFolderBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFolderBrowseButtonActionPerformed(evt);
            }
        });

        transformButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        transformButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/gears.png"))); // NOI18N
        transformButton.setText("Transform");
        transformButton.setEnabled(false);
        transformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformButtonActionPerformed(evt);
            }
        });

        loadedFilesPanel.setBackground(new java.awt.Color(255, 255, 255));

        loadedFilesTextLabel.setBackground(new java.awt.Color(255, 255, 255));
        loadedFilesTextLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        loadedFilesTextLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout loadedFilesPanelLayout = new javax.swing.GroupLayout(loadedFilesPanel);
        loadedFilesPanel.setLayout(loadedFilesPanelLayout);
        loadedFilesPanelLayout.setHorizontalGroup(
            loadedFilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadedFilesPanelLayout.createSequentialGroup()
                .addComponent(loadedFilesTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loadedFilesPanelLayout.setVerticalGroup(
            loadedFilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadedFilesTextLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        loadedFilesTextLabel.getAccessibleContext().setAccessibleName("text");

        showErrorsCheckBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        showErrorsCheckBox.setText("Show Errors");
        showErrorsCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        showErrorsCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addComponent(loadedFilesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadedFilesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uuidSizeLabel)
                                    .addComponent(outputLabel))
                                .addGap(18, 18, 18)
                                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(dataPanelLayout.createSequentialGroup()
                                        .addComponent(uuidSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(loadFilesButton))
                                    .addGroup(dataPanelLayout.createSequentialGroup()
                                        .addComponent(outputFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(outputFolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(outputFolderBrowseButton))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                                .addComponent(showErrorsCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadedFilesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(loadedFilesLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uuidSizeLabel)
                        .addComponent(uuidSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loadFilesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLabel)
                    .addComponent(outputFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputFolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputFolderBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transformButton)
                    .addComponent(showErrorsCheckBox)))
        );

        resultsLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        resultsLabel.setText("Ready...");
        resultsLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        resultsPanel.setViewportView(resultsLabel);

        fileMenu.setText("File");

        clearMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        clearMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/erase.png"))); // NOI18N
        clearMenuItem.setText("Clear");
        clearMenuItem.setToolTipText("");
        clearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(clearMenuItem);

        transformMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        transformMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/gears.png"))); // NOI18N
        transformMenuItem.setText("Transform");
        transformMenuItem.setEnabled(false);
        transformMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(transformMenuItem);
        fileMenu.add(fileMenuSeparator);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/exit.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        mainMenuBar.add(fileMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/about.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        //
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void clearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuItemActionPerformed
        loadedFilesTextLabel.setText("");
        uuidSizeTextField.setText(Resources.GUI_LABELS_DEFAULT);
        outputFormatComboBox.setSelectedIndex(0);
        outputFolderTextField.setText("");
        resultsLabel.setText("");
        this.transformButton.setEnabled(false);
        this.transformMenuItem.setEnabled(false);
    }//GEN-LAST:event_clearMenuItemActionPerformed

    private void outputFolderBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFolderBrowseButtonActionPerformed
        DirChooser dirChooser=new DirChooser(false);
        outputFolderTextField.setText(dirChooser.getFolderPath());
        
    }//GEN-LAST:event_outputFolderBrowseButtonActionPerformed

    private void transformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformButtonActionPerformed
        transformButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/status_running.gif")));
        transformButton.setText(Resources.GUI_LABELS_RUNNING);
        transformButton.setEnabled(false);
        GuiRunner.HTML_OUTPUT=new StringBuilder();
        resultsLabel.setText("");
        
        Thread timerThread=new Thread(){
            @Override
            public void run(){
                while(true){
                    resultsLabel.setText("<HTML>"+GuiRunner.HTML_OUTPUT.toString().replaceAll("\n", "<BR>") +"</HTML>");
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException ex){
                        log.error("An error occured while refreshing results panel.",ex);
                    } 
                }
            }
        };
        
        Thread engineThread=new Thread(){
            @Override
            public void run(){
                X3MLEngineRunner engineRunner=new X3MLEngineRunner(selectedResources.get(X3MLResourceType.X3ML_MAPPINGS).stream().map(Pair::getLeft).collect(Collectors.toList()),
                                                                   selectedResources.get(X3MLResourceType.XML_INPUT).stream().map(Pair::getLeft).collect(Collectors.toList()), 
                                                                   selectedResources.get(X3MLResourceType.GENERATOR_POLICY).stream().map(Pair::getLeft).findFirst().get(),
                                                                   outputFolderTextField.getText(),
                                                                   outputFormatComboBox.getSelectedItem().toString(),
                                                                   uuidSizeTextField.getText(),
                                                                   showErrorsCheckBox.isSelected());
                engineRunner.run();
                transformButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/forth/ics/isl/x3ml/x3mlengine/icons/gears.png")));
                transformButton.setText(Resources.GUI_LABELS_TRANSFORM);
                transformButton.setEnabled(true);
            }
        };
        timerThread.start();
        engineThread.start();
    }//GEN-LAST:event_transformButtonActionPerformed

    private void loadFilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFilesButtonActionPerformed
        DirChooser dirChooser=new DirChooser(true);
        this.selectedResources.putAll(Utils.identifyFileResources(dirChooser.getSelectedFiles()));
        loadedFilesTextLabel.setText(Utils.beautifyFileResourcesLabels(this.selectedResources));
        if(this.selectedResources.containsKey(X3MLResourceType.X3ML_MAPPINGS) && this.selectedResources.containsKey(X3MLResourceType.XML_INPUT)){
            this.transformButton.setEnabled(true);
            this.transformMenuItem.setEnabled(true);
        }else{
            this.transformButton.setEnabled(false);
            this.transformMenuItem.setEnabled(false);
        }
    }//GEN-LAST:event_loadFilesButtonActionPerformed

    private void transformMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformMenuItemActionPerformed
        transformButtonActionPerformed(evt);
    }//GEN-LAST:event_transformMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuiRunner dialog = new GuiRunner(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem clearMenuItem;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileMenuSeparator;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton loadFilesButton;
    private javax.swing.JLabel loadedFilesLabel;
    private javax.swing.JPanel loadedFilesPanel;
    private javax.swing.JLabel loadedFilesTextLabel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JButton outputFolderBrowseButton;
    private javax.swing.JTextField outputFolderTextField;
    private javax.swing.JComboBox<String> outputFormatComboBox;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JScrollPane resultsPanel;
    private javax.swing.JCheckBox showErrorsCheckBox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton transformButton;
    private javax.swing.JMenuItem transformMenuItem;
    private javax.swing.JLabel uuidSizeLabel;
    private javax.swing.JTextField uuidSizeTextField;
    // End of variables declaration//GEN-END:variables
}
