package pub.developers.forum.domain.repository;

import pub.developers.forum.common.model.PageResult;
import pub.developers.forum.domain.entity.Article;
import pub.developers.forum.domain.entity.value.PostsPageQueryValue;

/**
 * @author lhs
 * @create 2024/5/31
 * @desc
 **/
public interface ArticleRepository {

    void save(Article article);

    Article get(Long id);

    void update(Article article);

    PageResult<Article> page(Integer pageNo, Integer pageSize, PostsPageQueryValue pageQueryValue);
}
