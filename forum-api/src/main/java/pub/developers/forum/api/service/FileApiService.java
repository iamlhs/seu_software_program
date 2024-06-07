package pub.developers.forum.api.service;

import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.file.FileUploadImgRequest;

/**
 * @author lhs
 * @create 2024/5/23
 * @desc
 **/
public interface FileApiService {

    ResultModel<String> uploadImg(FileUploadImgRequest request);

}
