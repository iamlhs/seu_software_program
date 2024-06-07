package pub.developers.forum.api.request.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lhs
 * @create 2024/5/9
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleAuthorPageRequest implements Serializable {

    private Long userId;

}
