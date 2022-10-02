import static javax.print.attribute.standard.MediaSizeName.B;

sealed class A permits B {

        void display () {
            System.out.println("printing a sealed class A");
        }
    }
final class B extends A{
            void display(){
                System.out.println("printing sealed class B");
            }

};
    public class SealedExample{
        public static void main(String[] args) {
            B obj=new B();
            obj.display();
            A obj1=new A();
            obj1.display();

        }

    }

