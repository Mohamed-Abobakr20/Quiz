import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	
	TrueFalseQuestion(String question, String answer){
		super.question = "TRUE or FALSE: "+question;
		super.correctAnswer = answer;
	}
	
	@Override
	String ask() {
		
		while(true) {
			String answer = JOptionPane.showInputDialog(super.question);
			answer = answer.toUpperCase();
			
			if( answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
				answer = "TRUE";
				return answer;
			} else if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
				answer = "FALSE";
				return answer;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
			}
		}
	}
	

}
