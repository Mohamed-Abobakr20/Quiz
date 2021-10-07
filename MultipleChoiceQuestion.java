import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
	
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		super.question = query+"\n";
		super.question += "A. "+a+"\n";
		super.question += "B. "+b+"\n";
		super.question += "C. "+c+"\n";
		super.question += "D. "+d+"\n";
		super.question += "E. "+e+"\n";
		
		super.correctAnswer = answer.toUpperCase();
	}
	
	
	// The definition of ask method
		String ask() {
			
			while(true) {
				String answer = JOptionPane.showInputDialog(super.question);
				answer = answer.toUpperCase();
				
				if(answer.equals("C")) {
					return answer;
				} else if(answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E")) {
					return answer;
				} else {
					JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
				}
			}
			
			
			
		}
		
		
		

}
