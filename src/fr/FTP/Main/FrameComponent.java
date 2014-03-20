package fr.FTP.Main;

import javax.swing.*;

/**
 * User: Alexandre
 */
public class FrameComponent  extends JFrame {

	/**
	 * Adds JButton
	 * @param ButtonName            Butotn Object
	 * @param args                  Arguments for
	 * @param ToolTip               Tooltip when hover
	 * @param FocusedPainted
	 * @param Opaque
	 * @param ContentAreaFilled
	 * @param BorderPainted
	 */
	public void addJButton(JButton ButtonName, String args, String ToolTip, boolean FocusedPainted, boolean Opaque, boolean ContentAreaFilled, boolean BorderPainted){

		ButtonName.addActionListener(new ActionFrame());

		ButtonName.setToolTipText(ToolTip);
		ButtonName.setFocusPainted(FocusedPainted);
		ButtonName.setOpaque(Opaque);
		ButtonName.setContentAreaFilled(ContentAreaFilled);
		ButtonName.setBorderPainted(BorderPainted);

		add(ButtonName, args);

		//TODO add custom Layout add
	}

	/**
	 * Add JLabel
	 * @param LabelName
	 * @param args
	 * @param ToolTip
	 */
	public void addLabel(JLabel LabelName, String args, String ToolTip){

		LabelName.setToolTipText(ToolTip);

		add(LabelName, args);
	}