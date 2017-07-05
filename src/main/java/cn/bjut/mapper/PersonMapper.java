package cn.bjut.mapper;

import cn.bjut.entity.Person;

import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    List<Person> selectAllPersons();

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}