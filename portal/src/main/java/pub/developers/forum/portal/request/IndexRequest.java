package pub.developers.forum.portal.request;

import lombok.Data;

/**
 * @author lhs
 * @create 2024/10/24
 * @desc
 **/
@Data
public class IndexRequest extends BasePageRequest {

    private String type;

    private String toast;

    private String token;
}
