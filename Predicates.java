/*
 *Predicates.java
 *@author Rich Mangan
 *@date 10th December 13
 */
 public class Predicates{
	 //data members
	 private int x, y;
	 private boolean ans;

	 //constructor
	 public Predicates(){
		 x = 0;
		 y = 0;
		 ans = true;
	 }

	 //set method(s)-one for every input
	 public void setX(int x){
		 this.x = x;
	 }

	 public void setY(int y){
		 this.y = y;
	 }

	 //compute methods
	 public void computeConjunction(){
		 if((x % 2 == 1)&&(y > 5)){
			 ans = true;
		 }
		 else{
			 ans = false;
		 }
	 }

	 public void computeDisjunction(){
		 if((x % 2 == 1)||(y > 5)){
			 ans = true;
		 }
		 else{
			 ans = false;
		 }
	 }

	 public void computeNegation(){
		 if(y > 5){
			 ans = false;
		 }
		 else{
			 ans = true;
		 }
	 }
	 //get method - one for every output
	 public boolean getAns(){
		 return ans;
	 }
 }

