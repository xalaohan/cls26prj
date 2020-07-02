package com.woniu.vueserver.mapper;

import com.woniu.vueserver.entity.Zone;
import com.woniu.vueserver.entity.ZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int countByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int deleteByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int insert(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int insertSelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    List<Zone> selectByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int updateByExampleSelective(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    int updateByExample(@Param("record") Zone record, @Param("example") ZoneExample example);
}