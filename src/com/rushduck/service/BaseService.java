package com.rushduck.service;

import java.util.List;
import java.util.Map;

import com.rushduck.bean.Comment;
import com.rushduck.bean.CommentBaseMessage;
import com.rushduck.bean.ProcessedMessage;
import com.rushduck.bean.User;
import com.rushduck.bean.UserBaseMessage;
import com.sun.istack.internal.NotNull;

public interface BaseService {
	//�����û������ȡ������Ϣ����
	UserBaseMessage getUserBaseMessage(@NotNull User user);
	
	//�������ۻ�ȡ���ۻ�����Ϣ
	CommentBaseMessage getCommentBaseMessage(@NotNull Comment comment);
	
	//�����û������б��ȡ������Ϣ�����б�
	List<UserBaseMessage> getUserBaseMessageByUserList(@NotNull List<User> users);
	
	//�����û�ID�б��ȡ������Ϣ�����б�
	List<UserBaseMessage> getUserBaseMessageByUserIdsList(@NotNull List<Integer> userIds);
	
	//����message��ȡ����֮���proccessedMessage
	ProcessedMessage getProcessedMessageByMessageId(@NotNull Integer messageId);
	
	//�����û�ID��ȡĳ���û���ҳ����Ϣ,pageNumber����ָ����ȡʲô�����͵�Message����ta�Ķ�̬��ta���ղصĶ�̬������ta����ϲ���Ķ�̬��pageNumber��0��1��2
	void getPageMessageByUserId(@NotNull Integer userId, @NotNull Integer pageNumber, Map<String, Object> map);
}
