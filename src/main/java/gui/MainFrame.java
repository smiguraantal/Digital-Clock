package gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.util.GregorianCalendar;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

public class MainFrame extends JFrame {

    private GregorianCalendar calendar = new GregorianCalendar();

    private TimePanel hourPanel;
    private TimePanel minutePanel;
    private TimePanel secondPanel;
    private TimeManager timeManager = new TimeManager(this);
    private JPanel contentPane;

    public MainFrame() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        initComponent();
    }

    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.setTitle("Digital clock");
        contentPane = (JPanel)this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        contentPane.add(hourPanel = new TimePanel(calendar.get(GregorianCalendar.HOUR_OF_DAY)), BorderLayout.WEST);
        contentPane.add(new ColonPanel(), BorderLayout.CENTER);
        contentPane.add(minutePanel = new TimePanel(calendar.get(GregorianCalendar.MINUTE)), BorderLayout.EAST);
        contentPane.add(new ColonPanel(), BorderLayout.CENTER);
        contentPane.add(secondPanel = new TimePanel(calendar.get(GregorianCalendar.SECOND)), BorderLayout.EAST);

        timeManager.start();
    }

    public void refreshTime() {
        calendar = new GregorianCalendar();
        hourPanel.setTime(calendar.get(GregorianCalendar.HOUR_OF_DAY));
        minutePanel.setTime(calendar.get(GregorianCalendar.MINUTE));
        secondPanel.setTime(calendar.get(GregorianCalendar.SECOND));
    }

    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);

        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
}