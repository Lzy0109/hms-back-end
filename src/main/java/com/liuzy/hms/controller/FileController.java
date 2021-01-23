package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @Author LiuZiYi
 * @Date 2021/1/20 15:03
 * @Version 1.0
 */
@RestController
@RequestMapping("/file")
public class FileController {
    private static final Logger log = LoggerFactory.getLogger(FileController.class);

    @Value("${file.upload-folder}")
    private String uploadFolder;

    @PostMapping("/uploadCategoryImg")
    @ApiOperation("上传分类图片")
    public JsonResult uploadCategoryImage(@RequestParam("file") MultipartFile file,
                                           HttpServletRequest request) throws Exception {
        //获取文件名
        String fileName = file.getOriginalFilename() ;
        log.info("上传的文件名是："+fileName);
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf(".")) ;
        log.info("上传的文件后缀名是："+suffixName);

        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;

        log.info(basePath);
        // 文件上传路径
        String filePath = uploadFolder + "/category-images/";
        log.info("文件上传路径：" + filePath);
        // 解决重名问题
        String newFileName = UUID.randomUUID().toString();
        fileName = newFileName.replace("-","") + suffixName;
        //
        File dest = new File(filePath + fileName);
        // 检查是否存在目录
        if (!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        // 存储
        file.transferTo(dest);
        log.info(dest.getAbsolutePath());
        log.info( "上传成功");
        return null;
    }

}
