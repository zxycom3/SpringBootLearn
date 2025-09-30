package springboo.example.sping_boot.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import springboo.example.sping_boot.DAO.DEmp;
import springboo.example.sping_boot.Emp;
import springboo.example.sping_boot.JieKou.JEmp;

import java.util.List;

/*
@author zhang
@Date   2025/9/19 20:57
@description
*/
@Service("JSServer")
public class JSServer implements JEmp {
    @Autowired
    private DEmp DE;
    @Override
    public List<Emp> Dao() {
        return List.of();
    }
    @Override
    public List<Emp> server() {
        List <Emp> Em=DE.Dao();
        for(int i=0;i<Em.size();++i) {
            Emp temp = Em.get(i);
            String name = temp.getName();
            temp.setName(name);
            Integer age = temp.getAge();
            temp.setAge(age);
            String img = temp.getImage();
            temp.setImage(img);
            String gender = temp.getGender();
            if ("1".equals(gender)) {
                temp.setGender("男士");
            } else if ("2".equals(gender)) {
                temp.setGender("女士");
            }
            String job = temp.getJob();
            if ("1".equals(job)) temp.setJob("讲师");
            else if ("2".equals(job)) temp.setJob("班主任");
            else if ("3".equals(job)) temp.setJob("就业指导");
        }
        return Em;
    }
}
