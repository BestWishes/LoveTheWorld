package com.love.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.Video;

/**ӰƬrepository
 * @author LJJ 2016��1��26�� ����3:06:55
 *
 */
@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

	public List<Video> findAllByLevel(String level);
	public List<Video> findAllByType(String type);
	public List<Video> findAllByNameLike(String name);
}
