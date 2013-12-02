import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class LoginForm extends JFrame implements ActionListener
{
 JButton SUBMIT;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  txtUser,txtPass;
 LoginForm(){
  label1 = new JLabel();
  label1.setText("Username:");
  txtUser = new JTextField(15);

  label2 = new JLabel();
  label2.setText("Password:");
  txtPass = new JPasswordField(15);
 
  SUBMIT=new JButton("SUBMIT");
  
  panel=new JPanel(new GridLayout(3,1));
  panel.add(label1);
  panel.add(txtUser);
  panel.add(label2);
  panel.add(txtPass);
  panel.add(SUBMIT);
  add(panel,BorderLayout.CENTER);
  SUBMIT.addActionListener(this);
  setTitle("LOGIN FORM");
  }
 public void actionPerformed(ActionEvent ae)
  {
  String userInput=txtUser.getText();
  String passInput=txtPass.getText();
  if (userInput.equals("roseindia") && passInput.equals("roseindia")) {
  NextPage page=new NextPage();
  page.setVisible(true);
  JLabel label = new JLabel("Welcome: "+userInput);
  page.getContentPane().add(label);
  }
  else{
  System.out.println("enter the valid username and password");
  JOptionPane.showMessageDialog(this,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
}
}
 class Login
{
  public static void main(String arg[])
  {
  try
  {
  LoginFrame frame=new LoginFrame();
  frame.setSize(300,100);
  frame.setVisible(true);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}
