import javax.swing.JOptionPane;

public abstract class Question {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	
	
	// The definition of check method
	void check() {
		nQuestions++;
		
		// calling the ask function and if it returns a value, it will be stored in the variable string.
		String answer = ask();
		
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer);
		}
	}
	
	
	// The definition of show results method
	static void showResults() {
		// showing the number of questions and number of correct ones.
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
	
	
	abstract String ask();

}
