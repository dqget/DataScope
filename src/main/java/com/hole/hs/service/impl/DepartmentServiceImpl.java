package com.hole.hs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hole.hs.domain.Department;
import com.hole.hs.service.DepartmentService;
import com.hole.hs.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author PC
* @description 针对表【ds_department(部门)】的数据库操作Service实现
* @createDate 2025-01-06 15:18:51
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




