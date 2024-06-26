package pub.developers.forum.api.service;

import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.github.GithubOauthLoginRequest;

/**
 * @author lhs
 * @create 2024/5/15
 * @desc
 **/
public interface GithubApiService {

    ResultModel<String> oauthLogin(GithubOauthLoginRequest request);

}
