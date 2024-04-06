
package com.ws.soon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Double  originalPrice; // 订单原始价格，即优惠前的价格
    private Double realPrice; // 订单真实价格，即优惠后的价格

}