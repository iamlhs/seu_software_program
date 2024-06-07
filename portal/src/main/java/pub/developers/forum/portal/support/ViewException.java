package pub.developers.forum.portal.support;

import lombok.Data;

/**
 * @author lhs
 * @create 2024/5/2
 * @desc
 **/
@Data
public class ViewException extends RuntimeException {

    private String message;

    public static ViewException build(String message) {
        ViewException viewException = new ViewException();
        viewException.setMessage(message);
        return viewException;
    }

}
