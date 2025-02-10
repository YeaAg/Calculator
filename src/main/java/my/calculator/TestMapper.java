package my.calculator;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("SELECT * FROM data")
    public List<String> getDatas();
}
