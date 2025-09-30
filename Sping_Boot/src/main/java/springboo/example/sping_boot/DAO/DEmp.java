package springboo.example.sping_boot.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springboo.example.sping_boot.Emp;
import springboo.example.sping_boot.JieKou.JEmp;
import springboo.example.sping_boot.XmlParserUtils;

import java.util.List;

/*
@author zhang
@Date   2025/9/16 21:46
@description
*/
@Repository
public class DEmp implements JEmp {
    @Override
    public List<Emp> Dao() {
        String File="D:\\SpingLearing\\Sping_Boot\\src\\main\\resources\\emp.xml";
        List<Emp> Em= XmlParserUtils.parse(File, Emp.class);
        return Em;
    }
    @Override
    public List<Emp> server() {
        return List.of();
    }
}
