package com.uniasia.ent.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import tk.mybatis.mapper.common.Mapper;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.pojo.GisEnterprise;
@MapperScan
public interface GisEnterpriseMapper extends Mapper<GisEnterprise>{

	List<GisEnterprise> queryForPage(Page<GisEnterprise> page);

}
