package pub.developers.forum.domain.repository;

import pub.developers.forum.domain.entity.Approval;

/**
 * @author lhs
 * @create 2024/12/1
 * @desc
 **/
public interface ApprovalRepository {

    void save(Approval approval);

    void delete(Long approvalId);

    Approval get(Long postsId, Long userId);

}
