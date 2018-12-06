<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新商品</title>
    <script type="application/javascript" src="../static/js/jquery.min.js"></script>
</head>
<body>
    <div>
        <form action="/product/add">
            <table>
                <tr>
                    <td>名称：</td>
                    <td>
                        <input type="text" autocomplete="off" required name="name">
                    </td>
                </tr>
                <tr>
                    <td>价格：</td>
                    <td>
                        <input type="text" autocomplete="off" required name="price">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit">添加商品</button>
                    </td>
                </tr>
            </table>
        </form>
        <div>
            <span>
                <button id="find-all">点击查看所有商品</button>
            </span>
            <hr>
            <div id="product-list">

            </div>
        </div>
    </div>
    <script>
        $(document).ready(() => {
            $("#find-all").click(() => {
                $("#product-list").empty();
                $.get("/product/findAll", (data) => {
                    let str = "";
                    data.forEach((product, index) => {
                        str += product.name + "\t" + product.price + "元 </br>";
                    });
                    $("#product-list").append(str);
                });
            });
        });
    </script>
</body>
</html>
