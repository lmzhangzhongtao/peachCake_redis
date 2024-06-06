package com.peachcake.mapper;
import com.peachcake.dto.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PeachCakeMapper
{
     Long insertAuthor(Author author);
     void updateAuthor(Author author);
     Author queryById(@Param("runoobTitle")String runoobTitle);
}
