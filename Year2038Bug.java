import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;


public class Year2038Bug extends JFrame
{
   private Timer secondsTimer = new Timer(1000, event -> dateTimeDisplay () );
   private int   secVal;

   private JButton jumpBackButton  = new JButton ("Jump to 5 sec prior");
   private JLabel  binaryLabel     = new JLabel ();
   private JLabel  octalLabel      = new JLabel ();
   private JLabel  decimalLabel    = new JLabel ();
   private JLabel  hexLabel        = new JLabel ();
   private JLabel  dateTimeLabel   = new JLabel ();


   public Year2038Bug ()
   {
      setLayout (new BorderLayout() );

      JPanel gridPanel = new JPanel (new GridLayout (6, 1) );

      gridPanel.add (binaryLabel);
      gridPanel.add (octalLabel);
      gridPanel.add (decimalLabel);
      gridPanel.add (hexLabel);
      gridPanel.add (dateTimeLabel);
      gridPanel.add (jumpBackButton);

      jumpBack ();

      add (gridPanel,  BorderLayout.CENTER);

      jumpBackButton.addActionListener (event -> jumpBack () );

      secondsTimer.start();
   }

   private void jumpBack ()
   {
      secVal = Integer.MAX_VALUE;
      secVal = secVal - 5; // 5 seconds before cruch time.
   }

   private void dateTimeDisplay ()
   {
      Date currDateTime = new Date ((long) secVal * 1000);

      SimpleDateFormat dateTimeFormat = new SimpleDateFormat ("EEE, dd-MMM-yyyy, hh:mm:ss aa");

      binaryLabel.setText   ("  Binary:    " + Integer.toUnsignedString (secVal,  2) );
      octalLabel.setText    ("  Octal:     " + Integer.toUnsignedString (secVal,  8) );
      decimalLabel.setText  ("  Decimal:   " + Integer.toUnsignedString (secVal, 10) );
      hexLabel.setText      ("  Hex:       " + Integer.toUnsignedString (secVal, 16) );
      dateTimeLabel.setText ("  Date/Time: " + dateTimeFormat.format (currDateTime)  );

      secVal++;
   }

   public static void main (String[] args)
   {
      //Scanner kb = new Scanner (System.in);
      //kb.nextLine();

      Year2038Bug app = new  Year2038Bug();
      app.setSize (500, 300);
      app.setVisible (true);
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
