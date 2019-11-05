<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JJ聊天室</title>
    <script src="http://cdn-hangzhou.goeasy.io/goeasy.js"></script>
    <script src="statics/boot/js/jquery-3.3.1.min.js"></script>
    <script>

        var goEasy = new GoEasy({
            appkey: "BC-268c25f44f5841ff93a8f4e6aa24193a"
        });

        $(function () {
            var pubMsg;
            //接收消息，
            goEasy.subscribe({
                channel: "testChannel",
                onMessage: function (message) {
                    // alert("Channel:" + message.channel + " content:" + message.content);
                    //    处理信息，展示在页面上
                    var subMsg = message.content;
                    // pubMsg = $("#message-input").val();
                    console.log("subMsg:"+subMsg);
                    console.log("pubMsg:"+pubMsg);
                    if(subMsg != pubMsg){
                        // alert("不相等");
                        var msgDiv = $("<div style='float:left;'>"//
                            + "<div style='border:1px solid blue;border-radius:10px; background-color: lightslategray;line-height:30px'>"
                            + message.content
                            + "</div>"
                            + "</div>");
                        $("#message-show").append(msgDiv).append("<div style='clear:both'/>").append("<br/>");
                    }else{
                        pubMsg = "";
                        console.log("---");
                        console.log(pubMsg);
                    }
                }
            });


            $("#message-send").click(function () {
                //    获取消息
                var msg = $("#message-input").val();
                pubMsg = msg;
                //    发送消息
                goEasy.publish({
                    channel: "testChannel",
                    message: msg,
                    onSuccess:function () {
                    //    发送成功
                    //    展示消息
                        var msgDiv = $("<div style='float:right;'>"
                            + "<div style='width:auto;border:1px solid blue;border-radius:10px; background-color: lawngreen;line-height:30px'>"
                            + msg
                            + "</div>"
                            + "</div>");
                        $("#message-show").append(msgDiv).append("<div style='clear:both'/>").append("<br/>");
                        //    清楚输入的信息
                        $("#message-input").val("");
                    },
                    onFailed:function (error) {
                        alert("发送失败！"+error);
                    }
                });
            })
        })

    </script>

</head>
<body>
    <h2>JJ聊天室</h2>
    <hr>
    <div style="border: 1px solid red;width: 802px;height: 600px;">
        <%--上边显示聊天信息--%>
        <div id="message-show" style="border: 1px solid green;width: 800px;height: 450px;">

        </div>
        <%--下边输入聊天信息--%>
        <div style="border: 1px solid blue;width: 800px;height: 150px;">
            <textarea id="message-input" cols="30" rows="10" style="border: 1px solid black;width: 790px;height: 120px;"></textarea>
            <button id="message-send" style="width: 80px;height: 25px;background-color: grey;float: right;margin-top: 0px;margin-right: 5px;">发送</button>
        </div>
    </div>
</body>
</html>
