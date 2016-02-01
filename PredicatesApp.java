/*
 *PredicatesApp.java
 *@author Rich Mangan
 *@date 10th December 13
 */
 import javax.swing.JOptionPane;
 public class PredicatesApp{
	 public static void main(String args[]){
		//declare variables
		int x, y, option;
		boolean ans;
		//declare object
		Predicates myPredicates;
		//create object
		myPredicates = new Predicates();
		//input
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a value for P(x)"));
		myPredicates.setX(x);
		y = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a value for Q(y)"));
		myPredicates.setY(y);
		option = Integer.parseInt(JOptionPane.showInputDialog(null, "Please pick an option \n 1.Conjunction of P(x) and Q(y) \n 2.Disjunction of P(x) and Q(y) \n 3.Negation of Q(y)"));
		//process
		if(option == 1){	//conjunction of P(x) and Q(y)
			myPredicates.setX(x);
			myPredicates.setY(y);
			myPredicates.computeConjunction();
			ans = myPredicates.getAns();
			}

		else if(option == 2){	//disjunction of P(x) and Q(y)
			myPredicates.setX(x);
			myPredicates.setY(y);
			myPredicates.computeDisjunction();
			ans = myPredicates.getAns();
			}
		else if(option == 3){	//negation of Q(y)
			myPredicates.setY(y);
			myPredicates.computeNegation();
			ans = myPredicates.getAns();
			}
		else{
			JOptionPane.showMessageDialog(null, "That is an invalid option");
		}
		 //output
		 ans = myPredicates.getAns();
		 JOptionPane.showMessageDialog(null, "The answer is " +ans);
	 }
 }