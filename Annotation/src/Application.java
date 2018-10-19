public class Application {

    public static void main(String[] args) {

        Service service = new Service();
        ServiceAnnotation serviceAnnotation =  service.getClass().getAnnotation(ServiceAnnotation.class);
        System.out.println(serviceAnnotation.defaultEndpoint()+" - "+serviceAnnotation.key());


    }
}
