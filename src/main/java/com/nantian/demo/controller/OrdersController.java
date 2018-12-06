package com.nantian.demo.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.nantian.demo.domain.Orders;
import com.nantian.demo.service.OrdersService;
import com.nantian.demo.utils.AlipayConfig;
import com.nantian.demo.utils.UUIdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@RequestMapping("/add")
	public String add(Orders orders, Model model) {
		orders.setId(UUIdUtils.next());
		orders.setOrderNum(UUIdUtils.next());
		orders.setOrderStatus("10");
		Integer singlePrice = Integer.parseInt(orders.getProduct().getPrice());
		orders.setOrderAmount((singlePrice * orders.getBuyCounts()) + "");
		orders.setCreateTime(new Date());
		ordersService.add(orders);
		model.addAttribute("orders", orders);
		return "ordersInfo";
	}

	@ResponseBody
	@RequestMapping("/goAlipay")
	public String goAlipay(Orders orders, String ordersDesc) throws Exception {
		orders = ordersService.findById(orders.getId());
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		//商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = orders.getOrderNum();
		//付款金额，必填
		String total_amount = orders.getOrderAmount();
		//订单名称，必填
		String subject = orders.getProduct().getName();
		//商品描述，可空
		//String body = ordersDesc == null ? "" : ordersDesc;

		// 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
		String timeout_express = "1c";

		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
				+ "\"total_amount\":\""+ total_amount +"\","
				+ "\"subject\":\""+ subject +"\","
				//+ "\"body\":\""+ body +"\","
				+ "\"timeout_express\":\""+ timeout_express +"\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

		//请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();

		return result;
	}


}
