package com.example.demo.dao;

import com.example.demo.dto.classDTO;
import com.example.demo.dto.deptInfoDTO;
import com.example.demo.dto.memberDTO;
import com.example.demo.dto.userClassDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface memberDAO {
    void join(memberDTO dto);
    memberDTO login(memberDTO dto);
    int modify(memberDTO dto);
    void modifySemester(memberDTO dto);
    int calMine(memberDTO dto);
    int calTotal(deptInfoDTO dto);
    void cinput(userClassDTO dto);
    List<classDTO> userTotalClass(int id);
    List<userClassDTO> userClass(int id);
    List<userClassDTO> userCreditsGroupingField(int id);
    List<userClassDTO> avgCreditsGroupingField(memberDTO dto);
    int countForAvg(memberDTO dto);
    deptInfoDTO fieldTotal(memberDTO dto);
}
