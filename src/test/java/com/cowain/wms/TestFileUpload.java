//package com.cowain.pms;
//
//import org.csource.fastdfs.ClientGlobal;
//
//public class TestFileUpload {
//
//    @Test
//    public void uploadFile() throws Exception {
//        //1、添加fastdfs_client.jar
//        //2、创建配置文件，说明tracker_server的地址
//        //3、加载配置文件
//        ClientGlobal.init("C:/个人文件/taotao/taotao-manager-web/src/main/resources/fastdfs/conf.properties");
//        //4、创建trackerClient对象
//        TrackerClient trackerClient = new TrackerClient();
//        //5、获取trackerServer
//        TrackerServer trackerServer = trackerClient.getConnection();
//        //6、创建storageServer
//        StorageServer storageServer = null;
//        //7、创建一个StorageClient对象，需要两个参数TrackerServer对象、StorageServer的引用
//        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
//        //8、使用StorageClient对象上传图片。
//        String[] adds = storageClient.upload_file("C:\\Users\\Liu-Zhoujian\\Pictures\\hacker.jpg", "jpg", null);
//        //9、返回地址
//        for (String string : adds) {
//            System.out.println(string);
//        }
//    }
//}
