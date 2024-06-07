package pub.developers.forum.domain.repository;

import pub.developers.forum.common.enums.FollowedTypeEn;

import java.util.List;

/**
 * @author lhs
 * @create 2024/12/3
 * @desc
 **/
public interface UserFollowRepository {

    List<Long> getAllFollowerIds(Long follower, FollowedTypeEn type);
}
