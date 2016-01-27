package com.love.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.love.main.entity.Video;
import com.love.service.VideoServie;
import com.love.util.Constants;
import com.love.util.enums.UserRoleEnum;

/**影片handler
 * @author LJJ 2016年1月26日 下午4:43:19
 *
 */
@Controller
public class VideoHandler {

	@Autowired
	private VideoServie videoServie;

	@ResponseBody
	@RequestMapping("/videolist")
	public String getVideoListString(HttpSession httpSession){
		String role=(String)httpSession.getAttribute(Constants.SESSION_USER_ROLE);
		if(role==null||role.isEmpty()){
			role=UserRoleEnum.ADMIN.getValue();
		}
		return videoServie.getVideos(role);
		
	}
	
	@RequestMapping("getaddvideo")
	public String getAddVideo(HttpSession httpSession){

		return "video/addvideo";

	}
	@ResponseBody
	@RequestMapping("addvideo")
	public String addVideo(Video video,HttpSession httpSession,HttpServletRequest request,HttpServletResponse response) throws FileUploadException{
		
//		videoServie.addVideo(video);
		return "video/addvideo";

	}
	
	@RequestMapping("/videoplay")
	public void videoPlay(@RequestParam(value="path",required=true) String path,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException{
		if(path!=null&&!path.isEmpty()){
			
			File file=new File(path);
			if(file.exists()&&file.isFile()){
				
				httpServletResponse.reset();
				httpServletResponse.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(httpServletRequest.getParameter("path"), "UTF-8"));
	            InputStream inputStream=new FileInputStream(path);
	            OutputStream outputStream=httpServletResponse.getOutputStream();
	            byte[] buffer=new byte[1024];
	            int len=0;
	            while((len=inputStream.read(buffer))>0){
	                outputStream.write(buffer, 0, len);
	            }
	            inputStream.close();
	            outputStream.close();
			}
			
			
			
		}
	}
	
	public VideoServie getVideoServie() {
		return videoServie;
	}

	public void setVideoServie(VideoServie videoServie) {
		this.videoServie = videoServie;
	}
	
}
