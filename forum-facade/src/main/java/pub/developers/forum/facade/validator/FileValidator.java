package pub.developers.forum.facade.validator;

import pub.developers.forum.api.request.file.FileUploadImgRequest;
import pub.developers.forum.common.support.CheckUtil;

/**
 * @author lhs
 * @create 2024/5/23
 * @desc
 **/
public class FileValidator {

    public static void uploadImg(FileUploadImgRequest request) {
        CheckUtil.checkParamToast(request, "request");
        CheckUtil.checkParamToast(request.getBase64(), "base64");
        CheckUtil.checkParamToast(request.getFileName(), "fileName");
    }
}
