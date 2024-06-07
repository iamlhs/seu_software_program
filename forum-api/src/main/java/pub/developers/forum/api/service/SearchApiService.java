package pub.developers.forum.api.service;

import pub.developers.forum.api.model.PageRequestModel;
import pub.developers.forum.api.model.PageResponseModel;
import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.vo.PostsVO;

/**
 * @author lhs
 * @create 2024/12/2
 * @desc
 **/
public interface SearchApiService {

    ResultModel<PageResponseModel<PostsVO>> pagePostsSearch(PageRequestModel<String> pageRequestModel);

}
