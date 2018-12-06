<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表</title>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
</head>
<body>
    <div>
        <table>
            <thead>
                <tr>
                    <th>名称</th>
                    <th>价格</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="product">
                    <tr>
                        <td>${product.name}</td>
                        <td>${product.price}</td>
                        <td>
                            <a href="/product/purchase?id=${product.id}">购买</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
