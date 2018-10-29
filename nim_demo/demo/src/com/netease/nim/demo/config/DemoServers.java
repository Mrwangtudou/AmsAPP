package com.netease.nim.demo.config;

public class DemoServers {

    //
    // 好友列表信息服务器地址
    //
    private static final String API_SERVER_TEST = "http://10.0.2.2:8080/api/"; // 测试
    private static final String API_SERVER = "http://10.0.2.2:8080/api/"; // 线上

    public static String apiServer() {
        return ServerConfig.testServer() ? API_SERVER_TEST : API_SERVER;

    }

    public static String chatRoomAPIServer() {
        return apiServer() + "chatroom/";
    }
}
