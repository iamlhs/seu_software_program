package pub.developers.forum.domain.service;

import pub.developers.forum.common.model.PageRequest;
import pub.developers.forum.common.model.PageResult;
import pub.developers.forum.domain.entity.Posts;
import pub.developers.forum.domain.entity.Search;

/**
 * @author lhs
 * @create 2024/5/2
 * @desc
 **/
public interface SearchService {

    void deleteByPostsId(Long postsId);

    void save(Search search);

    PageResult<Posts> pagePosts(PageRequest<String> pageRequest);

}
