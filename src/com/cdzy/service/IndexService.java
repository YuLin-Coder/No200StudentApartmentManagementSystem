package com.cdzy.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.cdzy.pojo.Dormbuild;
import com.cdzy.pojo.User;
@Repository
public interface IndexService {
	//��ѯ����¥������Ϣ
	List<Dormbuild> findAll(Dormbuild dormbuild);
	//����idɾ������¥�����Ϣ
	int deleteDormbuild(Integer id);
	//������¥����������Ϣ
	int insertDormbuild(Dormbuild dormbuild);
	//����id��ת���޸�ҳ��
	Dormbuild findByIdUpdateDormbuild(Integer id);
	//�޸�����¥�������Ϣ
	boolean updateDormbuild(Dormbuild dormbuild);
	
	int updatePwd(User user);
	
	List<Dormbuild> selectdormbuid(@PathVariable("remark")String remark);
}
