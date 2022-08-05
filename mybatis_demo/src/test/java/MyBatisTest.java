import mybatis.mapper.EmpAllMapper;
import mybatis.pojo.EmpAll;
import mybatis.pojo.EmpAllExample;
import mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyBatisTest {
    private EmpAllExample example;

    /*@Test
    public void mybatisTest() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        *//*int i = mapper.insertUser();
        System.out.println("result:"+i);*//*
        List<User> list = mapper.getAll();
        list.forEach(user -> System.out.println(user));
    }*/

    @Test
    public void empTest(){
        SqlSession sqlSession = SqlSessionUtil.setSqlSession();
        EmpAllMapper mapper = sqlSession.getMapper(EmpAllMapper.class);
        int insert = mapper.insert(new EmpAll(null, 4402, "李四", "男",
                "123456789012345688", "大学", "是", "生产部门",
                "普通员工", new Date(3940 - 10 - 10), null, "123456",
                "123456@qq.com", 44, 2, "希望路", "广州大学",
                "网络工程", new Date(3880 - 3 - 10), 40));
        System.out.println("result:"+insert);
/*
        List<EmpAll> list = mapper.selectByExample(null);
        list.forEach(empAll -> System.out.println(empAll));*/
    }
}
