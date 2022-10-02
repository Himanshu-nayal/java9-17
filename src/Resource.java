class Res implements AutoCloseable {
    void resource() {
        System.out.println("Resource created");
    }

    public void display() {
        System.out.println("Resource displayed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closeble methdo of resource");

    }
}

    class Resource2 implements AutoCloseable{

        public Resource2() {
            System.out.println("Resource2 created");
        }

        public void display() {
            System.out.println("Resource2 displayed");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Resource2 close method invoked");
        }
    }
    public class Resource {

        public static void main(String[] args) throws Exception {
            Res resource = new Res();
            Resource2 resource2 = new Resource2();
            try(resource;resource2){
                resource.display();
                resource2.display();
            }
        }
    }

