package pub.developers.forum.portal.request;

import lombok.Data;

/**
 * @author lhs
 * @create 2024/12/2
 * @desc
 **/
@Data
public class SearchRequest extends BasePageRequest {

    private String key;
}
