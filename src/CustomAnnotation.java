import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String name() default "Abdul Kader";
    String age() default "30";
}
