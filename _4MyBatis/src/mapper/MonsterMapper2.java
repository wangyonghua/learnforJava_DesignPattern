package mapper;

import java.util.List;

import entity.Monster2;



public interface MonsterMapper2 {

	//添加方法
	public void addMonster(Monster2 monster);
	
	//查询所有的Monster
	public List<Monster2> findAllMonster();
	

}
