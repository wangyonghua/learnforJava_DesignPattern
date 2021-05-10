package adapter;
//模拟一个DispatcherServlet  
import java.util.ArrayList;  
import java.util.List;  

public class AnnotationHandlerAdapter implements HandlerAdapter {  
  
    public void handle(Object handler) {  
        ((AnnotationController)handler).doAnnotationHandler();  
    }  
  
    public boolean supports(Object handler) {  
          
        return (handler instanceof AnnotationController);  
    }  
  
}  
  
  

  
  
