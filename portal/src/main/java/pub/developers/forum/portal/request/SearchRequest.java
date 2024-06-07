package pub.developers.forum.portal.request;

import lombok.Data;

/**
 * @author lhs
 * @create 2024/5/2
 * @desc
 **/
@Data
public class SearchRequest extends BasePageRequest {

    private String key;
}
