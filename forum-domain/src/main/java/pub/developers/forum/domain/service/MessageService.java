package pub.developers.forum.domain.service;

import pub.developers.forum.domain.entity.Message;

/**
 * @author lhs
 * @create 2024/10/22
 * @desc
 **/
public interface MessageService {

    void send(Message message);

}
