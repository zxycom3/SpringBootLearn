package springboo.example.sping_boot.DAO;

import jakarta.validation.constraints.Null;
import lombok.Data;
import springboo.example.sping_boot.entity.Uuser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
@author zhang
@Date   2025/9/27 15:38
@description
*/
@Data
public class UserVo {
    private Long id;
    private String username;
    private String email;
    private String nickname;
    private String createdAt;
    private String updateAt;
    private String stausText;

    public  static  UserVo fromEntity(Uuser uuser)
    {
        UserVo vo=new UserVo();
        vo.setId(uuser.getId());
        vo.setUsername(uuser.getUsername());
        vo.setEmail(uuser.getEmail());
        vo.setNickname(uuser.getNikename());
        vo.setCreatedAt(uuser.getCreatedAt());
        vo.setUpdateAt(uuser.getUpdateAt());
        vo.setStausText(uuser.getStausText());
        return vo;
    }


    private  static  String formatDatatime(LocalDateTime dataTime){
        if(dataTime== null)
        {
            return "";
        }
        return dataTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
