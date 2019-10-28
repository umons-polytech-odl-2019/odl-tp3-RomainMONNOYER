package exercise1;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) throws Value42Exception {
			if(value==42){
				throw new Value42Exception();
			}
	}
}
