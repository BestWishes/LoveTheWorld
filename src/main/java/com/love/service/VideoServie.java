package com.love.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.love.main.entity.Video;
import com.love.model.VideoAttributesModel;
import com.love.model.VideoModel;
import com.love.repository.VideoRepository;
import com.love.util.enums.UserRoleEnum;
import com.love.util.enums.VideoTypeEnum;

/**影片service
 * @author LJJ 2016年1月26日 下午3:18:30
 *
 */
@Service
public class VideoServie {

	@Autowired
	private VideoRepository videoRepository;

	public String getVideos(String role){
		if(role==null||role.isEmpty()){
			role=UserRoleEnum.ADMIN.getValue();
		}
		List<VideoModel> videoModels=new ArrayList<VideoModel>();
		VideoModel root1=new VideoModel();
		root1.setId(0l);
		root1.setAttributes(null);
		root1.setChecked(false);
		root1.setIconCls("icon-save");
		root1.setState("open");
		root1.setText("真人");
		
		VideoModel root2=new VideoModel();
		root2.setId(0l);
		root2.setAttributes(null);
		root2.setChecked(false);
		root2.setIconCls("icon-save");
		root2.setState("open");
		root2.setText("动漫");
		
		videoModels.add(root1);
		videoModels.add(root2);
		
		List<VideoModel> root1C=new ArrayList<VideoModel>();
		VideoModel root1_C1=new VideoModel();
		root1_C1.setId(0l);
		root1_C1.setAttributes(null);
		root1_C1.setChecked(false);
		root1_C1.setIconCls("icon-save");
		root1_C1.setState("open");
		root1_C1.setText("精彩电影");
		root1C.add(root1_C1);
	
		VideoModel root1_C2=new VideoModel();
		root1_C2.setId(0l);
		root1_C2.setAttributes(null);
		root1_C2.setChecked(false);
		root1_C2.setIconCls("icon-save");
		root1_C2.setState("open");
		root1_C2.setText("H影片");
		root1C.add(root1_C2);
		root1.setChildren(root1C);
		
		
		
		List<VideoModel> root2C=new ArrayList<VideoModel>();
		VideoModel root2_C1=new VideoModel();
		root2_C1.setId(0l);
		root2_C1.setAttributes(null);
		root2_C1.setChecked(false);
		root2_C1.setIconCls("icon-save");
		root2_C1.setState("open");
		root2_C1.setText("H动漫");
		root2C.add(root2_C1);
		VideoModel root2_C2=new VideoModel();
		root2_C2.setId(0l);
		root2_C2.setAttributes(null);
		root2_C2.setChecked(false);
		root2_C2.setIconCls("icon-save");
		root2_C2.setState("open");
		root2_C2.setText("H_3D");
		root2C.add(root2_C2);
		root2.setChildren(root2C);
		
		
		List<Video> movie=new ArrayList<Video>();
		movie=videoRepository.findAllByType(VideoTypeEnum.MOVIE.getValue());
		if(movie!=null){
			List<VideoModel> root1_C1_C1=new ArrayList<VideoModel>();
			for (Video video : movie) {
				VideoModel videoModel=new VideoModel();
				VideoAttributesModel videoAttributesModel=new VideoAttributesModel();
				videoAttributesModel.setLevel(video.getLevel());
				videoAttributesModel.setPath(video.getPath());
				videoAttributesModel.setType(video.getType());
				videoModel.setId(video.getId());
				videoModel.setAttributes(videoAttributesModel);
				videoModel.setChecked(false);
				videoModel.setIconCls("icon-save");
				videoModel.setState("open");
				videoModel.setText(video.getName());
				root1_C1_C1.add(videoModel);
			}
			root1_C1.setChildren(root1_C1_C1);
		}
		
		
		List<Video> hMovie=new ArrayList<Video>();
		hMovie=videoRepository.findAllByType(VideoTypeEnum.HMOVIE.getValue());
		if(hMovie!=null){
			List<VideoModel> root1_C2_C1=new ArrayList<VideoModel>();
			for (Video video : hMovie) {
				VideoModel videoModel=new VideoModel();
				VideoAttributesModel videoAttributesModel=new VideoAttributesModel();
				videoAttributesModel.setLevel(video.getLevel());
				videoAttributesModel.setPath(video.getPath());
				videoAttributesModel.setType(video.getType());
				videoModel.setId(video.getId());
				videoModel.setAttributes(videoAttributesModel);
				videoModel.setChecked(false);
				videoModel.setIconCls("icon-save");
				videoModel.setState("open");
				videoModel.setText(video.getName());
				root1_C2_C1.add(videoModel);
			}
			root1_C2.setChildren(root1_C2_C1);
		}
		
		
		List<Video> hComic=new ArrayList<Video>();
		hComic=videoRepository.findAllByType(VideoTypeEnum.HCOMIC.getValue());
		if(hComic!=null){
			List<VideoModel> root2_C1_C1=new ArrayList<VideoModel>();
			for (Video video : hComic) {
				VideoModel videoModel=new VideoModel();
				VideoAttributesModel videoAttributesModel=new VideoAttributesModel();
				videoAttributesModel.setLevel(video.getLevel());
				videoAttributesModel.setPath(video.getPath());
				videoAttributesModel.setType(video.getType());
				videoModel.setId(video.getId());
				videoModel.setAttributes(videoAttributesModel);
				videoModel.setChecked(false);
				videoModel.setIconCls("icon-save");
				videoModel.setState("open");
				videoModel.setText(video.getName());
				root2_C1_C1.add(videoModel);
			}
			root2_C1.setChildren(root2_C1_C1);
		}
		
		List<Video> h3D=new ArrayList<Video>();
		h3D=videoRepository.findAllByType(VideoTypeEnum.H3D.getValue());
		if(h3D!=null){
			List<VideoModel> root2_C2_C1=new ArrayList<VideoModel>();
			for (Video video : h3D) {
				VideoModel videoModel=new VideoModel();
				VideoAttributesModel videoAttributesModel=new VideoAttributesModel();
				videoAttributesModel.setLevel(video.getLevel());
				videoAttributesModel.setPath(video.getPath());
				videoAttributesModel.setType(video.getType());
				videoModel.setId(video.getId());
				videoModel.setAttributes(videoAttributesModel);
				videoModel.setChecked(false);
				videoModel.setIconCls("icon-save");
				videoModel.setState("open");
				videoModel.setText(video.getName());
				root2_C2_C1.add(videoModel);
			}
			root2_C2.setChildren(root2_C2_C1);
		}
		
		
		return JSON.toJSONString(videoModels);
	}
	
	
	public Video addVideo(Video video){
		return videoRepository.save(video);
	}
	public VideoRepository getVideoRepository() {
		return videoRepository;
	}

	public void setVideoRepository(VideoRepository videoRepository) {
		this.videoRepository = videoRepository;
	}
	
	
}
