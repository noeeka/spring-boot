package com.xiaomao.xiaomao.mapper;
import com.xiaomao.xiaomao.pojo.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface PageMapper  {
    @Select("select * from page")
    List<Page> findAll();
}
