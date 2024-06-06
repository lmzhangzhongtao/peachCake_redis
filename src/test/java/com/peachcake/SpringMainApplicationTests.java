package com.peachcake;

import com.peachcake.dto.Author;
import com.peachcake.mapper.PeachCakeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMainApplicationTests {
	@Autowired
	PeachCakeMapper mapper;
//	@Test
//	public void queryById() {
//		Author author= mapper.queryById("学习 PHP");
//		System.out.println(author.getRunoobAuthor());
//	}

//	@Test
//	public void insert(){
//		Author p1 = new Author();
//		p1.setRunoobAuthor("张仲涛");
//		p1.setRunoobTitle("Spring cloud");
//		p1.setSubmissionDate(new Date());
//		mapper.insertAuthor(p1);
//	}
//
//	@Test
//	public void update(){
//		Author p2 = new Author();
//		p2.setId("2");
//		p2.setRunoobAuthor("张仲涛");
//		p2.setRunoobTitle("红桃粿");
//		p2.setSubmissionDate(new Date());
//		mapper.updateAuthor(p2);
//	}

}
