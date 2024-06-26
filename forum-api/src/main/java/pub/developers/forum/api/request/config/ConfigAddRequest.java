package pub.developers.forum.api.request.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lhs
 * @create 2024/5/11
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;

    private String name;

    private String content;

    private Date startAt;

    private Date endAt;

}
