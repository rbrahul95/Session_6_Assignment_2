/*Assignment – Create an abstract class, called Instrument which will
contains a field name and a method called play, that must be
implemented by a sub-class.
*/

abstract class Instrument{					// abstract class
	String stringStrum = ""; //field name
	abstract public void play();	//method play	
}

class StringedInstrument extends Instrument{		//sub class of abstract class Instrument
	
	
	public StringedInstrument() {					// constructor of StringedInstrument class
		stringStrum = "Am I a Guitar.";
	}


	String numberOfStrings="";
	public void getNumberOfStrings(){				// method to be overridden by Electricguitar and ElectricBassGuitar
		System.out.println(numberOfStrings);
	}
	 
	//@Override
	public void play() {
		System.out.println(stringStrum+ " The electric guitar has 6 strings or 12 strings and the electric bass guitar has 4 strings.");
		
	}
	
}

class ElectricGuitar extends StringedInstrument{    // subclass of Stringed instrument

	
    public ElectricGuitar(){						//constructor of ElectricGuitar subclass
		numberOfStrings = "I am a 6 string electric guitar";
		
		}
	public void getNumberOfStrings() {
		
		super.getNumberOfStrings();
	}
	
	
}
class ElectricBassGuitar extends StringedInstrument{			// sub class of Stringed instrument
	public ElectricBassGuitar() {					// constructor of ElectricBassGuitar subclass
		numberOfStrings = "I am a 4 string bass guitar";
		
	}  
	//@Override
	public void getNumberOfStrings() {
		super.getNumberOfStrings();
	}
	
	
	
		
}
public class Session_6_Assignment_2 {
    public static void main(String[] args) {
		Instrument guitar = new StringedInstrument();	//Object referencing the abstract class Instrument
		guitar.play();		// invoking the method of the abstract class 
		
		StringedInstrument electric = new ElectricGuitar(); //object of ElectricGuitar referencing parent class StringedInstrument
		electric.getNumberOfStrings();
	
		StringedInstrument bass = new ElectricBassGuitar(); 
		bass.getNumberOfStrings();
	}
    
}