package com.yinuo.training.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-07-11
 */
public class Application {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Class<AnnotatedClass> object = AnnotatedClass.class;
        // Retrieve all annotations from the class
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // Checks if an annotation is present
        if (object.isAnnotationPresent(CustomAnnotationClass.class)) {

            // Gets the desired annotation
            Annotation annotation = object.getAnnotation(CustomAnnotationClass.class);

            System.out.println(annotation);

        }
        // the same for all methods of the class
        for (Method method : object.getDeclaredMethods()) {

            if (method.isAnnotationPresent(CustomAnnotationMethod.class)) {

                Annotation annotation = method.getAnnotation(CustomAnnotationMethod.class);

                System.out.println(annotation);

            }

        }

        System.out.println("is true: " + AnnotatedSuperClass.class.isAnnotationPresent(InheritedAnnotation.class));

        System.out.println("is true: " + AnnotatedSubClass.class.isAnnotationPresent(InheritedAnnotation.class));

        System.out.println("is true: " + AnnotatedInterface.class.isAnnotationPresent(InheritedAnnotation.class));

        System.out.println("is true: " + AnnotatedImplementedClass.class.isAnnotationPresent(InheritedAnnotation.class));
    }

    @SuppressWarnings("unused")
    public void methodAnnotated(@TypeAnnotated int parameter) {
        System.out.println("do nothing");
    }

    @SuppressWarnings("unused")
    public void declareMethod() {
        // type def
        @TypeAnnotated
        String cannotBeEmpty = null;

        // type
        List<@TypeAnnotated String> myList = new ArrayList<String>();

        // values
        String myString = new @TypeAnnotated String("this is annotated in java 8");

        MyCustomInterface myFuncInterfaceLambdas = (x) -> (x * 10);
    }
}
