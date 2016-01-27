package com.love.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.Video;

/**影片repository
 * @author LJJ 2016年1月26日 下午3:06:55
 *
 */
@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

	public List<Video> findAllByLevel(String level);
	public List<Video> findAllByType(String type);
	public List<Video> findAllByNameLike(String name);
}
