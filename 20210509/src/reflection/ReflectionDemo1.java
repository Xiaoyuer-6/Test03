package reflection;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-09
 * Time: 16:00
 */
public class ReflectionDemo1 extends ReflectionParent {
    @SuppressWarnings("unused")
     private void read() {
                 System.out.println("reading...");
             }

             public void write() {
                 System.out.println("writing...");
             }

    /**
     */
             @Test
     public void testGetMethods() {
                 Method[] methods = this.getClass().getMethods();
                 for (Method m : methods) {
                         //System.out.println(m.getName());
                     }
             }

             @Test
     public void testGetDeclaredMethods() {
                 Method[] methods = this.getClass().getDeclaredMethods();
                 for (Method m : methods) {
                         System.out.println(m.getName());
                     }
             }
}
