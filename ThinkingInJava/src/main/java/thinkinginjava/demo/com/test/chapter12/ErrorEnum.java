package thinkinginjava.demo.com.test.chapter12;

public enum ErrorEnum implements IEnum {

    OK(0, "OK"),

    INPUT_ERROR(1001, "参数校验错误"),

    APP_KEY_ERROR(1002, "无效的appKey或者appSecret"),

    SERVER_ERROR(1003, "服务器错误"),

    INTERNAL_NETWORK_ERROR(1004, "内部网络错误"),

    TOKEN_ERROR(1005, "accessToken错误"),

    LOCKED(1006, "已被锁定，请稍后重试"),

    DUPLICATED(1007, "违反唯一性约束"),

    CIA_ERROR(2001, "CIA异常"),

    COUPON_DEFINITION_NOT_EXIST(4001, "优惠定义不存在"),

    UNLIMITED_CUUPON_COUNT(4002, "优惠不限量"),

    DIRECT_COUPON_CONFLICT(4003, "直接优惠定义冲突"),

    COUPON_TARGET_CANNOT_APPLIED(5001, "优惠不适用产品"),

    CONSTRAINT_VIOLATION(5002, "违反使用限制条件"),

    PRECONDITION_VIOLATION(5003, "违反前提条件"),

    STATUS_VIOLATION(5004, "当前状态无法使用"),

    SALESPROMOTION_NOTEXIST(3001, "活动不存在"),

    SALESPROMOTION_NOTALLOWEDCHANGE(3002, "活动状态不为初始化"),

    SALESPROMOTION_NOT_ONLINE(3003, "活动状态不为上架状态"),

    TICKETCOUPONTYPE_NOTEXIST(3004, "优惠券类型不能为空"),

    TICKET_COUPON_EXHAUSE(3005, "优惠券已发放完成"),

    USER_TICKET_COUPON_EXHAUST(3006, "领取的优惠券数量已达上限"),

    USER_TICKET_COUPON_NOT_EXIST(3007, "优惠券不存在"),

    USER_TICKET_COUPON_INVALIDED(3008, "优惠券当前无效"),

    EXIST_MULTI_NONE_GIFT_DIRECT_COUPON(3009, "同一个产品不允许使用多个非赠品直接优惠"),

    EXIST_MULTI_TICKET_COUPON(3010, "同一个产品不允许同时使用多个优惠券"),

    EXCLUDE_TICKETS_COUPON(3011,"当前直接优惠排斥优惠券"),

    USER_TICKET_COUPON_EXPIRED(3012, "优惠券已过期"),

    COUPON_DEFINITION_IS_DIRECT(3013, "优惠定义不为优惠券类型"),

    COUPON_IS_SELECTED(3014, "优惠处于选择状态"),

    COUPON_IS_AVAILABLE(3015, "优惠处于可用状态"),

    BSVC_ERROR(6001, "BSVC异常"),

    ;

    private Integer code;

    private String displayName;

    private ErrorEnum(Integer code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

}
