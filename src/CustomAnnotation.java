import java.lang.annotation.*;


/*
* Document Define that, it will add at javadoc or not
* Target Define that, it will add at which point class/method/variable
* Inherited Define that, it will overriddable or not
* Retention Define that, When it will available like at Runtime,Class,Package
* */




@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String name() default "Abdul Kader";
    int age() default 30;
}
