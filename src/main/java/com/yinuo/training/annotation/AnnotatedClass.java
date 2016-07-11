package com.yinuo.training.annotation;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-07-11
 */
@CustomAnnotationClass(date = "2016-07-11")
public class AnnotatedClass {
    @CustomAnnotationMethod(date = "2016-07-11", description = "annotated method")
    public String annotatedMethod() {
        return "nothing niente";
    }

    @CustomAnnotationMethod(author = "Bill", date = "2016-07-11", description = "annotated method")
    public String annotatedMethodFromAFriend() {
        return "nothing niente";
    }
}
