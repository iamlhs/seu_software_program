package pub.developers.forum.api.request.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lhs
 * @create 2024/5/4
 * @desc
 **/
@Data
public class UserBaseLoginRequest implements Serializable {

    private String ua;

    private String ip;

}
