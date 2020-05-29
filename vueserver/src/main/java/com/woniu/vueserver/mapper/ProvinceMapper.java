package com.woniu.vueserver.mapper;

import com.woniu.vueserver.entity.Province;
import com.woniu.vueserver.entity.ProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper  {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int countByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int deleteByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int insert(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int insertSelective(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    List<Province> selectByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);
}