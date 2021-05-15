package reflection;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-09
 * Time: 15:58
 */
public class ReflectionParent {
    public void start() {
                System.out.println("starting...");
             }

    protected void eat() {

        System.out.println("eating...");
             }
             void end() {

        System.out.println("ending...");
             }

            @SuppressWarnings("unused")
     private void sing() {

        System.out.println("sing...");
             }
}
