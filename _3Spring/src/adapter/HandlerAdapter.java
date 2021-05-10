package adapter;
//定义一个Adapter接口  
public interface HandlerAdapter {  
    public boolean supports(Object handler);  
    public void handle(Object handler);  
}  
  
//以下是三种Controller实现  
