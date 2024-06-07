package pub.developers.forum.facade.validator;

import pub.developers.forum.api.model.PageRequestModel;
import pub.developers.forum.common.support.CheckUtil;

/**
 * @author lhs
 * @create 24/5/9
 * @desc
 **/
public class PageRequestModelValidator {

    public static void validator(PageRequestModel pageRequestModel) {
        CheckUtil.checkParamToast(pageRequestModel, "pageRequestModel");
        CheckUtil.checkParamToast(pageRequestModel.getPageNo(), "pageNo");
        CheckUtil.checkParamToast(pageRequestModel.getPageSize(), "pageSize");
        CheckUtil.checkParamToast(pageRequestModel.getFilter(), "filter");
    }

}
