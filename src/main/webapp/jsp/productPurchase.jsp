<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品购买</title>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
</head>
<body>
    <div>
        <form action="/orders/add">
            <input type="hidden" name="product.id" value="${product.id}">
            <input type="hidden" name="product.name" value="${product.name}">
            <input type="hidden" name="product.price" value="${product.price}">
            <table>
                <tr>
                    <td>商品编号:</td>
                    <td>${product.id}</td>
                </tr>
                <tr>
                    <td>名称:</td>
                    <td>${product.name}</td>
                </tr>
                <tr>
                    <td>单价（元）:</td>
                    <td>${product.price}</td>
                </tr>
                <tr>
                    <td>数量（个）:</td>
                    <td>
                        <input type="number" name="buyCounts">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit">点击生成订单</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
