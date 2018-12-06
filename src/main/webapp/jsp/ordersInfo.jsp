<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品购买</title>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
</head>
<body>
    <div>
        <form action="/orders/goAlipay" method=post
              target="_blank">
            <input type="hidden" name="id" value="${orders.id}">
            <table>
                <tr>
                    <td>订单号:</td>
                    <td>${orders.orderNum}</td>
                </tr>
                <tr>
                    <td>商品名称:</td>
                    <td>${orders.product.name}</td>
                </tr>
                <tr>
                    <td>商品单价（元）:</td>
                    <td>${orders.product.price}</td>
                </tr>
                <tr>
                    <td>数量（个）:</td>
                    <td>${orders.buyCounts}</td>
                </tr>
                <tr>
                    <td>总金额（元）:</td>
                    <td>${orders.orderAmount}</td>
                </tr>
                <tr>
                    <td>描述:</td>
                    <td>
                        <input type="text" name="ordersDesc">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit">去支付宝付款</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
