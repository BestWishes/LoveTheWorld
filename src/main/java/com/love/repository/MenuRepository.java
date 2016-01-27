package com.love.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

	public List<Menu> findAllMenusByRole(String role);
}
