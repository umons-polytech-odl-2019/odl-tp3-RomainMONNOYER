package exercise1;

public class ExceptionCatcher {
	private final ExceptionThrower exceptionThrower;

	public ExceptionCatcher(ExceptionThrower exceptionThrower) {
		this.exceptionThrower = exceptionThrower;
	}

	void executeExceptionThrowerSafely(int value)throws Value42Exception {
		try {
			exceptionThrower.throwACustomExceptionWhenValueIs42(value);
		} catch (RuntimeException e) {
		}
	}
}
