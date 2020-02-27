package com.cowain.pms.modules.pms.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.dao.PmsRoleDao;
import com.cowain.pms.modules.pms.dto.PmsRoleDto;
import com.cowain.pms.modules.pms.entity.PmsRoleEntity;
import com.cowain.pms.modules.pms.service.PmsRoleService;
import com.cowain.pms.modules.pms.vo.PmsRoleVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service("pmsRoleService")
public class PmsRoleServiceImpl extends ServiceImpl<PmsRoleDao, PmsRoleEntity> implements PmsRoleService {

    @Override
    public PageUtils queryList(Map<String, Object> params) {
        Page<PmsRoleDto> page = new Page((int) params.get("page"), (int) params.get("limit"));
        page.setRecords(baseMapper.selectRolePageList(page, params));
        List<PmsRoleDto> list = new ArrayList<>();
        page.getRecords().forEach(pageDto -> {
            PmsRoleVo vo = new PmsRoleVo();
            BeanUtils.copyProperties(pageDto, vo);
            list.add(vo);
        });

        return new PageUtils(list, page.getTotal(), page.getCurrent(), page.getSize());
    }

    @Override
    public void updateRole(Long roleId, Integer subordinate, Integer roleType) {
       baseMapper.updateRole(subordinate, roleId, roleType);
    }

    @Override
    public int deleteRole(Integer roles) {
        int count  =  baseMapper.queryRoleNum(roles);
            if (count == 0){
                baseMapper.deleteRole(roles);
        }

        return count;
    }

    @Override
    public int deleteRoles(Integer[] ids) {

        int count  =  0;
        for (Integer id : ids) {
             count  =  baseMapper.queryRoleNum(id);
            if (count == 0){
                baseMapper.deleteRole(id);
            }
        }

        return count;
    }
}
