package com.cdzy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.cdzy.pojo.Dormbuild;
import com.cdzy.pojo.User;

@Repository
public interface IndexDao {
	//��ѯ����¥������Ϣ
@Select("select * from tb_dormbuild")
 List<Dormbuild> findAll(Dormbuild dormbuild);
//����idɾ������¥�����Ϣ
@Delete("delete from tb_dormbuild where id=#{id}")
int deleteDormbuild(Integer id);
//������¥����������Ϣ
@Insert("insert tb_dormbuild(id,name,remark) values(0,#{name},#{remark})")
int insertDormbuild(Dormbuild dormbuild);
//����id��ת���޸�ҳ��
@Select("select * from tb_dormbuild where id=#{id} ")
Dormbuild findByIdUpdateDormbuild(Integer id);
//�޸�����¥�������Ϣ
@Update("update tb_dormbuild set name=#{name},remark=#{remark} where id=#{id} ")
boolean updateDormbuild(Dormbuild dormbuild);

//�޸�����
@Update("update tb_user set passWord=#{passWord} where name=#{name}")
int updatePwd(User user);

//ģ����ѯ
@Select("select * from tb_dormbuild where remark like '%${remark}%'")
List<Dormbuild> selectdormbuid(@Param("remark")String remark);
}
