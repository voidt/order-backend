package com.ecommerce.order.order.exception;

import com.ecommerce.common.exception.AppException;
import com.ecommerce.order.order.model.OrderId;

import static com.ecommerce.order.OrderErrorCode.PAID_PRICE_NOT_SAME_WITH_ORDER_PRICE;
import static com.google.common.collect.ImmutableMap.of;

public class PaidPriceNotSameWithOrderPriceException extends AppException {
    public PaidPriceNotSameWithOrderPriceException(OrderId id) {
        super(PAID_PRICE_NOT_SAME_WITH_ORDER_PRICE, of("orderId", id.toString()));
    }
}
