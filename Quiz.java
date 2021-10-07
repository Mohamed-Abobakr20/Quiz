public class Quiz {
	
	public static void main(String[] args) {
		
		
		// Create an object for the first question
		Question question1 = new MultipleChoiceQuestion("Who invented the electric light bulb?", "Benjamin Franklin", "Michael Faraday",
				"Thomas Edison", "Joseph Priestley", "Thales of Miletus", "C");
		// calling the check method for the first question
		question1.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the second question
		Question question2 = new MultipleChoiceQuestion("What is the reminder of (10 % 2) ?", "0", "1",
				"undefined", "3", "1.5", "A");
		// calling the check method for the second question
		question2.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the third question
		Question question3 = new MultipleChoiceQuestion("Which one of them is not a primitive data type in Java ?", "float", "String",
				"double", "short", "int", "B");
		// calling the check method for the third question
		question3.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the fourth question
		Question question4 = new MultipleChoiceQuestion("Which one of the following Java technologies eliminates memory leaks ?", "garbage collection", "virtual machines",
				"software engineering", "object-oriented analysis and design", "just-in-time compilers", "A");
		// calling the check method for the fourth question
		question4.check();
				
				
		//------------------------------------------------------
		
		
		// Create an object for the fifth question
		Question question5 = new MultipleChoiceQuestion("A Java method gets executed when it is...", "imported", "defined",
				"declared", "compiled", "called", "E");
		// calling the check method for the fifth question
		question5.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the sixth question
		Question question6 = new TrueFalseQuestion("JAVA is high level programming language ?", "TRUE");
		// calling the check method for the sixth question
		question6.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the sixth question
		Question question7 = new TrueFalseQuestion("Constructor overloading is not possible in Java ?", "FALSE");
		// calling the check method for the sixth question
		question7.check();
		
				
		//------------------------------------------------------
		
		
		// Create an object for the sixth question
		Question question8 = new TrueFalseQuestion("Assignment operator is evaluated Left to Right ?", "FALSE");
		// calling the check method for the sixth question
		question8.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the sixth question
		Question question9 = new TrueFalseQuestion("Variable name can begin with a letter, \"$\", or \"_\" ?", "TRUE");
		// calling the check method for the sixth question
		question9.check();
		
		
		//------------------------------------------------------
		
		
		// Create an object for the sixth question
		Question question10 = new TrueFalseQuestion("Garbage Collection is manual process ?", "FALSE");
		// calling the check method for the sixth question
		question10.check();
		
		
		//------------------------------------------------------
		
		
		// showing the results of the quiz
		question10.showResults();
		
		
		
	}
	
	
	
}
