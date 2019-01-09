package com.youliang.thomas.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = -1656662139268877524L;
    /**
     * ID
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtModified;
}
