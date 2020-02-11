package org.liuyu.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.liuyu.entity.People;
import org.liuyu.entity.PeopleExample;
import org.liuyu.mapper.PeopleMapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestExample {
    public static void main(String[] args) throws Exception {
        selectByExample();




    }
    private static void selectByExample() throws IOException {
        Reader reader = Resources.getResourceAsReader("config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession();
        PeopleMapper mapper = sqlSession.getMapper(PeopleMapper.class);
        //example查询条件
        PeopleExample pe = new PeopleExample();
        PeopleExample.Criteria criteria = pe.createCriteria();

//        criteria.andStunoBetween(0, 4);

        criteria.andStunameLike("%张%");//where stuname like '%张%'
        PeopleExample.Criteria criteria1 = pe.createCriteria();

        criteria1.andStunoLessThanOrEqualTo(5);
        criteria1.andGranameLike("%高一%");//where stuno <= 5 and graname like %高一%
        pe.or(criteria1);//where (stuname like '%张%') or (stuno <= 5 and graname like %高一%)
        List<People> people = mapper.selectByExample(pe);
        System.out.println(people);
        sqlSession.close();
    }

}
