package pub.developers.forum.api.service;

import pub.developers.forum.api.model.ResultModel;

/**
 * @author lhs
 * @create 2024/5/1
 * @desc
 **/
public interface ApprovalApiService {

    ResultModel<Long> create(Long postsId);

    ResultModel<Long> delete(Long postsId);

    ResultModel<Boolean> hasApproval(Long postsId);

}
