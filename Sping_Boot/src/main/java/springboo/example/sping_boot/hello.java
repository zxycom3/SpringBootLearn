package springboo.example.sping_boot;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import springboo.example.sping_boot.DAO.DEmp;
import springboo.example.sping_boot.JieKou.JEmp;


import java.util.List;

/*
@author zhang
@Date   2025/9/9 20:58
@description
*/
//表明请求处理类
@RestController
public class hello {
//    //这个注释是告诉浏览器是哪个类
//    @RequestMapping("hello")
//    public String he() {
//        System.out.println("hello,word");
//        return "hello,word";
//    }

    //    @RequestMapping("gett")
//    public String gett(HttpServletRequest le)
//    {
//        String name=le.getParameter("name");
//        String age=le.getParameter("age");
//        int agee=Integer.parseInt(age);
//        System.out.println(name+" "+agee);
//        return "OK";
//    }
//    @RequestMapping("/gett")
//    public String gett(User user) {
//        System.out.println(user.getName() + " " + user.getAge());
//        return "OK";
//    }
//    @RequestMapping("/gett")
//    public String gett(String[] hobbyes) {
//        System.out.println(hobbyes[0] + " " + hobbyes[1]);
//        return "OK";
//    }
//    @RequestMapping("/gett")
//    public String gett(@RequestParam ArrayList<String> hobbyes) {
//        for(int i=0;i<hobbyes.size();++i)
//        System.out.println(hobbyes.get(i));
//        return "OK";
//    }
//    @RequestMapping("/gett")
//    public String gett(@DateTimeFormat (pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime datetime) {
//        System.out.println(datetime);
//        return "OK";
//    }
//    @RequestMapping("/gett")
//    public String gett(@RequestBody User user) {
//        System.out.println(user);
//        return "OK";
//    }
//    @RequestMapping("/gett/{id}/{name}")
//    public String gett(@PathVariable Integer id,@PathVariable String name) {
//        System.out.println(id+" "+name);
//        return "OK";
//    }
//    @RequestMapping("hello")
//    public String hello()
//    {
//        return "hello,word~~~~";
//    }
//    @RequestMapping("address")
//    public address getaddress()
//    {
//        address address=new address();
//        address.setCity("长沙");
//        address.setProvince("湖南");
//        return address;
//    }
//    @RequestMapping("user")
//    public ArrayList<User> Us()
//    {
//        ArrayList<User> ar=new ArrayList<>();
//        User user=new User();
//        user.setName("张明");
//        user.setAge(18);
//        ar.add(user);
//        User user1=new User();
//        user1.setName("张三");
//        user1.setAge(19);
//        ar.add(user1);
//        return ar;
//    }
//    @RequestMapping("hello")
//    public Result hello(Result su)
//    {
//        return Result.succese("hello,word~~~~") ;
//    }
//    @RequestMapping("address")
//    public Result getaddress()
//    {
//        address address=new address();
//        address.setCity("长沙");
//        address.setProvince("湖南");
//        return Result.succese(address);
//    }
//    @RequestMapping("user")
//    public Result arr()
//    {
//        ArrayList<User> ar=new ArrayList<>();
//        User user=new User();
//        user.setName("张明");
//        user.setAge(18);
//        ar.add(user);
//        User user1=new User();
//        user1.setName("张三");
//        user1.setAge(19);
//        ar.add(user1);
//        return Result.succese(ar);
//    }
//    private DEmp DE=new DEmp();
    @Resource(name="JSServer")
    private JEmp Js;
    @RequestMapping("/listEmp")
    public Result temp()
    {
//      List<Emp> Em1=DE.Dao();
        List<Emp> Em2=Js.server();
        return Result.succese(Em2);
    }
}




























