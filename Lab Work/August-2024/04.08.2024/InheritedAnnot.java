import java.lang.annotation.*;
import java.lang.reflect.AnnotatedElement;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
 
@interface CustomAnnotation
{
    String value() default "R-CAT";
}
 
@CustomAnnotation(value = "Rainbow and Raining")
class Super 
{
}

class Test extends Super 
{
	public static void main(String[] arg) throws Exception
    	{
         	System.out.println(new Test().getClass().getAnnotation(CustomAnnotation.class));
 
        	System.out.println(new Super().getClass().getAnnotation(CustomAnnotation.class));
	}
}