package pub.developers.forum.api.request.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lhs
 * @create 2024/5/11
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentCreateRequest implements Serializable {

    private Long postsId;

    private String content;

    private Long replyId;
}
