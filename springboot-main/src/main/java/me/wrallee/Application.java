package me.wrallee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    public static void main(String[] args) throws IOException {
//        SpringApplication application = new SpringApplication(Application.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
//        application.run(args);
//    }

//    @Bean
//    public Holoman holoman() {
//        Holoman holoman = new Holoman();
//        holoman.setName("wrallee");
//        holoman.setHowLong(60);
//        return holoman;
//    }

//    public static void main(String[] args) throws LifecycleException, IOException {
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        String docBase = Files.createTempDirectory("tomcat-basedir").toString();
//
//        Context context = tomcat.addContext("/", docBase);
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//                PrintWriter writer = resp.getWriter();
//                writer.println(("<h1>Hello Tomcat</h1>"));
//            }
//        };
//
//        String servletName = "helloServlet";
//        tomcat.addServlet("/", servletName, servlet);
//        context.addServletMappingDecoded("/hello", servletName);
//
//        tomcat.start();
//        tomcat.getServer().await();
//    }
}
