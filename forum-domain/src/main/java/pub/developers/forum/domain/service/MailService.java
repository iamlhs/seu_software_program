package pub.developers.forum.domain.service;

import pub.developers.forum.domain.entity.Message;

/**
 * @author lhs
 * @create 2024/5/7
 * @desc
 **/
public interface MailService {

    void sendHtml(Message mailMessage);

    void sendText(Message mailMessage);

}
