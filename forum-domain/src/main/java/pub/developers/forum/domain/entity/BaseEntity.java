package pub.developers.forum.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author lhs
 * @create 2024/10/31
 * @desc
 **/
@Data
public abstract class BaseEntity {

    private Long id;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

}
