# RdpView

通过RDP协议的远程连接WEB页面，Spring boot 整合一个Apache 开源的Guacamole框架

# 使用方式：

- docker安装：

docker run -d --name rdpview --network=host --restart=always -v /log:/log ruoniao/edu

docker run -d --name guacd--network=host --restart=always  guacamole/guacd



- 使用： 

​      访问部署地址  http://127.0.0.1:8082/connect?ip={这个是要连接的远程IP}&port={这个是要连接的远程主机端口,RDP默认3389}&username={这个是远程主机用户名}&password={这个是远程主机密码}&width={这个设置宽度}&heigh={这个是设置高度}

- 拓展：想使用VNC协议可以改Spring boot的代码，很好实现，guacamole都有很好的支持。
