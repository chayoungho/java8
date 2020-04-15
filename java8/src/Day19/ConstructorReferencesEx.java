package Day19;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesEx {
private void mian() {
	Function<String,Member2 > function1 =Member2 :: new;
	Member2 member1= function1.apply("angel");
	
	BiFunction<String,String,Member2> function2= Member2 ::new;
	Member2 member2= function2.apply("Ω≈√µªÁ","angel");
}
}
