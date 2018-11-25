alter session set nls_date_format='yyyy-mm-dd hh24:mi:ss';

-- ----------------------------
-- Table structure for cn_user
-- ----------------------------
DROP TABLE cn_notebook_type;
CREATE TABLE cn_user (
  cn_user_id varchar2(100),
  cn_user_name varchar2(100),
  cn_user_password varchar2(100),
  cn_user_token varchar2(100),
  cn_user_desc varchar2(1000)
);
COMMENT ON column cn_user.cn_user_id IS '用户ID';
COMMENT ON column cn_user.cn_user_name IS '用户名';
COMMENT ON column cn_user.cn_user_password IS '密码';
COMMENT ON column cn_user.cn_user_token IS '令牌';
COMMENT ON column cn_user.cn_user_desc IS '说明';
-- ----------------------------
-- Records of cn_user
-- ----------------------------
INSERT INTO cn_user VALUES ('03590914-a934-4da9-ba4d-b41799f917d1', 'zhouj', '55587a910882016321201e6ebbc9f595', null, null);
INSERT INTO cn_user VALUES ('2273f742-61ec-4440-b88a-42cf48db19ff', 'zhoujia123', '4297f44b13955235245b2497399d7a93', null, null);
INSERT INTO cn_user VALUES ('333c6d0b-e4a2-4596-9902-a5d98c2f665a', 'test1', '96e79218965eb72c92a549dd5a330112', null, null);
INSERT INTO cn_user VALUES ('39295a3d-cc9b-42b4-b206-a2e7fab7e77c', 'zhoujia', '4297f44b13955235245b2497399d7a93', null, null);
INSERT INTO cn_user VALUES ('48595f52-b22c-4485-9244-f4004255b972', 'demo', 'c8837b23ff8aaa8a2dde915473ce0991', null, null);
INSERT INTO cn_user VALUES ('524f7440-7283-4b2d-8af5-4a67570e892e', 'pc', 'e10adc3949ba59abbe56e057f20f883e', null, null);
INSERT INTO cn_user VALUES ('52f9b276-38ee-447f-a3aa-0d54e7a736e4', 'wsf', '6e7d70ed3edfb80421235af5c4ad24aa', null, null);
INSERT INTO cn_user VALUES ('6f339f0a-2068-4db1-8fef-8e68f444c72c', 'saipi', '4297f44b13955235245b2497399d7a93', null, null);
INSERT INTO cn_user VALUES ('974375a8-8557-4308-bd36-9455c7863239', 'zhoujia1231', '6a204bd89f3c8348afd5c77c717a097a', null, null);
INSERT INTO cn_user VALUES ('bf9d2885-f34e-4c78-9ae5-2723f62aa2b5', 'saipi', '4297f44b13955235245b2497399d7a93', null, null);
INSERT INTO cn_user VALUES ('ea09d9b1-ede7-4bd8-b43d-a546680df00b', 'yht', '96e79218965eb72c92a549dd5a330112', null, null);
commit;

-- ----------------------------
-- Table structure for cn_notebook_type
-- ----------------------------
DROP TABLE cn_notebook_type;
CREATE TABLE cn_notebook_type (
  cn_notebook_type_id varchar2(100),
  cn_notebook_type_code varchar2(100),
  cn_notebook_type_name varchar2(500),
  cn_notebook_type_desc varchar2(1000)
) ;
COMMENT ON column cn_notebook_type.cn_notebook_type_id IS '笔记本类型ID';
COMMENT ON column cn_notebook_type.cn_notebook_type_code IS '笔记本类型Code';
COMMENT ON column cn_notebook_type.cn_notebook_type_name IS '笔记本类型名称';
COMMENT ON column cn_notebook_type.cn_notebook_type_desc IS '笔记本类型说明';
-- ----------------------------
-- Records of cn_notebook_type
-- ----------------------------
INSERT INTO cn_notebook_type VALUES ('1', 'favorites', 'favorites', '收藏');
INSERT INTO cn_notebook_type VALUES ('2', 'recycle', 'recycle', '回收站');
INSERT INTO cn_notebook_type VALUES ('3', 'action', 'action', '活动');
INSERT INTO cn_notebook_type VALUES ('4', 'push', 'push', '推送');
INSERT INTO cn_notebook_type VALUES ('5', 'normal', 'normal', '正常');
commit;

-- ----------------------------
-- Table structure for cn_notebook
-- ----------------------------
DROP TABLE cn_notebook;
CREATE TABLE cn_notebook (
  cn_notebook_id varchar2(100),
  cn_user_id varchar2(100),
  cn_notebook_type_id varchar2(100),
  cn_notebook_name varchar2(500),
  cn_notebook_desc varchar2(1000),
  cn_notebook_createtime date default sysdate
) ;
COMMENT ON column cn_notebook.cn_notebook_id IS '笔记本ID';
COMMENT ON column cn_notebook.cn_user_id IS '用户ID';
COMMENT ON column cn_notebook.cn_notebook_type_id IS '笔记本类型ID';
COMMENT ON column cn_notebook.cn_notebook_name IS '笔记本名';
COMMENT ON column cn_notebook.cn_notebook_desc IS '笔记本说明';
-- ----------------------------
-- Records of cn_notebook
-- ----------------------------
INSERT INTO cn_notebook VALUES ('0037215c-09fe-4eaa-aeb5-25a340c6b39b', '52f9b276-38ee-447f-a3aa-0d54e7a736e4', '5', 'wsf', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('01e24d89-15ab-4b6a-bf6f-2e5ad10b2041', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', '笔记本1111', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('049d4cd3-943b-4fc0-97cf-520cd788fe85', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', '笔记本1', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('0b11444a-a6d6-45ff-8d46-282afaa6a655', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', '笔记本1', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('0cd94778-4d52-486d-a35d-263b3cfe6de9', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'zhoujia_test', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('12119052-874c-4341-b85d-6529e171ed83', '48595f52-b22c-4485-9244-f4004255b972', '5', '测试——5', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('1755013b-05fc-4218-83cf-956287a81b49', 'ea09d9b1-ede7-4bd8-b43d-a546680df00b', '4', 'push', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('1b05c9c7-f1cd-4842-beae-15ed95a1febb', '03590914-a934-4da9-ba4d-b41799f917d1', '3', 'action', null, '2014-07-09 17:16:45');
INSERT INTO cn_notebook VALUES ('1d46f5db-f569-4c05-bdba-75106108fcba', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '1', 'favorites', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('1db556b9-d1dc-4ed9-8274-45cf0afbe859', '48595f52-b22c-4485-9244-f4004255b972', '3', 'action', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('1ea71525-2a72-4115-abb0-197b78e92f29', '524f7440-7283-4b2d-8af5-4a67570e892e', '5', 'sssss', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('1ecf916f-61b8-409a-8173-1e548ac65d89', 'ea09d9b1-ede7-4bd8-b43d-a546680df00b', '3', 'action', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('1fdb7adb-5da0-41f7-8f4e-5a512dbed9fc', '52f9b276-38ee-447f-a3aa-0d54e7a736e4', '4', 'push', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('20b4cbec-bd55-4c21-9c41-3a11ada2b803', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '3', 'action', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('2a4ca5bb-3073-4194-9d4e-5db0ec5c0998', '48595f52-b22c-4485-9244-f4004255b972', '2', 'recycle', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('2c0bda01-b6bb-48b3-92e5-89f42cda6d27', '333c6d0b-e4a2-4596-9902-a5d98c2f665a', '4', 'push', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('4acb305b-5def-47ae-8832-c2a188662085', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '4', 'push', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('516f6f4f-eaa3-4c76-84ff-530b92c7f64d', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'hadoop', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('5612df0f-2b3a-4a8c-8df7-e1de67b6abcd', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'time_test', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('59b354f8-47ae-437d-a432-7d28736bd894', '48595f52-b22c-4485-9244-f4004255b972', '5', '333', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('64639e62-9241-4efb-874b-01e97257cb6e', '333c6d0b-e4a2-4596-9902-a5d98c2f665a', '5', 'test_1', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('6666666666666666666666666666666666', '524f7440-7283-4b2d-8af5-4a67570e892e', '3', 'avtion', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('6d763ac9-dca3-42d7-a2a7-a08053095c08', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '2', 'recycle', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('6dc39e41-8c9e-4791-9c13-52a8e537fe64', '524f7440-7283-4b2d-8af5-4a67570e892e', '5', '测试笔记本——2', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('738202b0-41de-4aee-9278-5f2134091ae2', '333c6d0b-e4a2-4596-9902-a5d98c2f665a', '3', 'action', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('8844559e-9d93-459b-a9db-2afcb8a592c8', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'klsfj', null, '2014-07-18 17:39:32');
INSERT INTO cn_notebook VALUES ('885bbeab-ab12-4048-adb2-c6fd9c3e9be8', '03590914-a934-4da9-ba4d-b41799f917d1', '2', 'recycle', null, '2014-07-09 17:16:45');
INSERT INTO cn_notebook VALUES ('8888888888888888888888888888888888', '524f7440-7283-4b2d-8af5-4a67570e892e', '1', 'favorites', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('8be77c36-3cd5-4727-a8a9-071316a2eb11', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'zhoujia-111', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('94730716-2002-4952-ba23-aeb1e92ea00a', '52f9b276-38ee-447f-a3aa-0d54e7a736e4', '1', 'favorites', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('97a87189-c661-4a14-8081-faf011904499', '03590914-a934-4da9-ba4d-b41799f917d1', '4', 'push', null, '2014-07-09 17:16:45');
INSERT INTO cn_notebook VALUES ('9999999999999999999999999999999999', '524f7440-7283-4b2d-8af5-4a67570e892e', '2', 'recycle', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('9c68ca1a-830f-4a81-a8ec-d148d2df4f7f', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'dddd ', null, '2014-06-27 15:18:32');
INSERT INTO cn_notebook VALUES ('a1358ece-bd30-48a2-a53c-0fe195609fd2', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'wsf', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('a1669286-b171-4a06-b2fc-2dfe5afdb0ec', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'Hello', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('a20ac761-c1eb-462a-8ed9-c0a9fb412e70', '03590914-a934-4da9-ba4d-b41799f917d1', '1', 'favorites', null, '2014-07-09 17:16:45');
INSERT INTO cn_notebook VALUES ('a248decc-0fb6-402c-83e9-ea33a276968a', '333c6d0b-e4a2-4596-9902-a5d98c2f665a', '1', 'favorites', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('ab2a2058-8d8f-41a1-b7c4-b4a7b6f95fc3', '333c6d0b-e4a2-4596-9902-a5d98c2f665a', '2', 'recycle', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('af8be968-66bb-4b75-ac5d-d7deb772640f', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', '而成的', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('b6887c05-7316-4088-8d67-c451f1474575', 'ea09d9b1-ede7-4bd8-b43d-a546680df00b', '5', '笔记1', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('b800156e-42b6-4ca6-b1d4-16901635e431', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'Demo', null, '2014-07-07 17:19:46');
INSERT INTO cn_notebook VALUES ('b8080f1b-bb1e-4929-853c-b1cd1e2ff7a5', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', '发大水发', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('bfe73e2c-289f-4eab-82b2-b82ba17c1396', '48595f52-b22c-4485-9244-f4004255b972', '4', 'push', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('c3cc0f49-5f58-4585-85aa-675ce38a2368', '524f7440-7283-4b2d-8af5-4a67570e892e', '5', '得得得得得', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('c7f7fcdb-37c0-4d04-8dea-99123c672d4a', '524f7440-7283-4b2d-8af5-4a67570e892e', '5', '22222222222222222', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('c8d81ee5-f8cd-49e8-b2e6-ab174a926d95', '48595f52-b22c-4485-9244-f4004255b972', '5', '测试——22222', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('cce17f11-6b90-4a17-87a2-74df0f5d4991', 'ea09d9b1-ede7-4bd8-b43d-a546680df00b', '5', '笔记2', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('d0b0727f-a233-4a1f-8600-f49fc1f25bc9', '48595f52-b22c-4485-9244-f4004255b972', '1', 'favorites', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('d0e7ce0d-4893-4705-a51a-9a73d259bc70', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', '别基本3', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('d92e6b86-e48a-485d-8f11-04a93818bb42', '48595f52-b22c-4485-9244-f4004255b972', '5', '测试——1', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('db31c93f-957f-4f3c-ae67-cd443d5c0d06', 'ea09d9b1-ede7-4bd8-b43d-a546680df00b', '1', 'favorites', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('dd7fd38c-3d22-4206-bcdd-324c1cb8983b', '52f9b276-38ee-447f-a3aa-0d54e7a736e4', '3', 'action', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('e46239d6-4f54-426c-a448-f7a0d45f9425', 'ea09d9b1-ede7-4bd8-b43d-a546680df00b', '2', 'recycle', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('f34edc18-df1e-4a32-9fa6-242e4729481d', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', '5', 'Demo', null, '2014-07-07 17:19:39');
INSERT INTO cn_notebook VALUES ('f45f368b-6558-426e-a58e-a7b819d29ca9', '52f9b276-38ee-447f-a3aa-0d54e7a736e4', '2', 'recycle', null, '2014-06-27 15:18:59');
INSERT INTO cn_notebook VALUES ('fa8d3d9d-2de5-4cfe-845f-951041bcc461', '524f7440-7283-4b2d-8af5-4a67570e892e', '5', '测试笔记本——3', null, '2014-06-27 15:18:59');
commit;

-- ----------------------------
-- Table structure for cn_note
-- ----------------------------
DROP TABLE cn_note;
CREATE TABLE cn_note (
  cn_note_id varchar2(100),
  cn_notebook_id varchar2(100),
  cn_user_id varchar2(100),
  cn_note_status_id varchar2(100),
  cn_note_type_id varchar2(100),
  cn_note_title varchar2(500),
  cn_note_body varchar2(1000),
  cn_note_create_time number,
  cn_note_last_modify_time number
) ;
COMMENT ON column cn_note.cn_note_id IS '笔记ID';
COMMENT ON column cn_note.cn_notebook_id IS '笔记本ID';
COMMENT ON column cn_note.cn_user_id IS '用户ID';
COMMENT ON column cn_note.cn_note_status_id IS '笔记状态ID:备用';
COMMENT ON column cn_note.cn_note_type_id IS '笔记本类型ID：备用';
COMMENT ON column cn_note.cn_note_title IS '笔记标题';
COMMENT ON column cn_note.cn_note_body IS '笔记内容';
COMMENT ON column cn_note.cn_note_create_time IS '笔记创建时间';
COMMENT ON column cn_note.cn_note_last_modify_time IS '笔记最近修改时间';
-- ----------------------------
-- Records of cn_note
-- ----------------------------
INSERT INTO cn_note VALUES ('003ec2a1-f975-4322-8e4d-dfd206d6ac0c', '516f6f4f-eaa3-4c76-84ff-530b92c7f64d', null, null, null, 'title1...', '笔记笔记。。。', '1403252773281', '1403252773281');
INSERT INTO cn_note VALUES ('019cd9e1-b629-4d8d-afd7-2aa9e2d6afe0', '4b86d1f9-6345-4532-bc50-ee86442f004b', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', null, null, '默认1', '', '1402538216250', '1402538216250');
INSERT INTO cn_note VALUES ('01da5d69-89d5-4140-9585-b559a97f9cb0', '6d763ac9-dca3-42d7-a2a7-a08053095c08', '39295a3d-cc9b-42b4-b206-a2e7fab7e77c', null, null, '大方地爱上撒旦发斯蒂芬', '', '1402562696503', '1402562696503');
commit;

-- ----------------------------
-- Table structure for cn_share
-- ----------------------------
DROP TABLE cn_share;
CREATE TABLE cn_share (
  cn_share_id varchar2(100),
  cn_share_title varchar2(500),
  cn_share_body varchar2(1000),
  cn_note_id varchar2(100)
) ;
COMMENT ON column cn_share.cn_share_id IS '共享ID';
COMMENT ON column cn_share.cn_share_title IS '共享标题';
COMMENT ON column cn_share.cn_share_body IS '共享内容';
COMMENT ON column cn_share.cn_note_id IS '笔记id';
-- ----------------------------
-- Records of cn_share
-- ----------------------------
INSERT INTO cn_share VALUES ('009d6943-223e-450d-aa26-3aa25edfc8a4', '1——1', '<p>1——11——11——11——11——11——11——11——11——11——11——11——11——1</p>', 'e633e99d-c8dd-44f3-8d8e-5b0966e0927c');
INSERT INTO cn_share VALUES ('0a02ba3e-a74c-41b8-8494-01b2e3632f99', '1——1', '<p>1——11——11——11——11——11——11——11——11——11——11——11——11——1</p>', 'e633e99d-c8dd-44f3-8d8e-5b0966e0927c');
INSERT INTO cn_share VALUES ('0c031c50-0e95-42ea-8d20-f2f37ca056ef', 'dddd', '<p>阿斯顿发送到阿斯顿发撒旦法</p><p>sadfsadfasdfasd</p><p>士大夫</p><p>阿斯蒂芬asd飞asdf</p><p>撒旦f爱上d撒</p><p>撒地方</p><p>撒地方</p><p>阿斯蒂芬</p><p>阿斯蒂芬</p><p>撒地方</p><p>撒旦</p><p>爱上</p><p>阿萨德f阿萨德</p><p>阿斯蒂芬</p><p><br/></p>', 'b4f82f9f-bc0f-480a-b8f2-335164d69945');
commit;

-- ----------------------------
-- Table structure for cn_activity
-- ----------------------------
DROP TABLE cn_activity;
CREATE TABLE cn_activity (
  cn_activity_id varchar2(100),
  cn_activity_title varchar2(500),
  cn_activity_body varchar2(1000),
  cn_activity_end_time number
) ;
COMMENT ON column cn_activity.cn_activity_id IS '活动ID';
COMMENT ON column cn_activity.cn_activity_title IS '活动标题';
COMMENT ON column cn_activity.cn_activity_body IS '活动介绍(html片段)';
COMMENT ON column cn_activity.cn_activity_end_time IS '活动结束时间';
-- ----------------------------
-- Records of cn_activity
-- ----------------------------
INSERT INTO cn_activity VALUES ('1', 'Java', 'Java技术征文', null);
INSERT INTO cn_activity VALUES ('2', '.net', '.net技术征文', null);
INSERT INTO cn_activity VALUES ('3', 'C++', 'C++技术征文', null);
INSERT INTO cn_activity VALUES ('4', 'IOS', 'IOS技术征文', null);
commit;

-- ----------------------------
-- Table structure for cn_activity_status
-- ----------------------------
DROP TABLE cn_activity_status;
CREATE TABLE cn_activity_status (
  cn_activity_status_id varchar2(100),
  cn_activity_id varchar2(100),
  cn_activity_status_code varchar2(500),
  cn_activity_status_name varchar2(500)
) ;
COMMENT ON column cn_activity_status.cn_activity_status_id IS '活动状态ID';
COMMENT ON column cn_activity_status.cn_activity_id IS '活动ID';
COMMENT ON column cn_activity_status.cn_activity_status_code IS '活动状态Code';
COMMENT ON column cn_activity_status.cn_activity_status_name IS '活动状态名称';
-- ----------------------------
-- Records of cn_activity_status
-- ----------------------------
INSERT INTO cn_activity_status VALUES ('1', '1', 'normal', 'normal');
commit;

-- ----------------------------
-- Table structure for cn_note_activity
-- ----------------------------
DROP TABLE cn_note_activity;
CREATE TABLE cn_note_activity (
  cn_note_activity_id varchar2(100),
  cn_activity_id varchar2(100),
  cn_note_id varchar2(100),
  cn_note_activity_up number(11),
  cn_note_activity_down number(11),
  cn_note_activity_title varchar2(500),
  cn_note_activity_body varchar2(1000)
) ;
COMMENT ON column cn_note_activity.cn_note_activity_id IS '投稿ID';
COMMENT ON column cn_note_activity.cn_activity_id IS '活动ID';
COMMENT ON column cn_note_activity.cn_note_id IS '笔记ID';
COMMENT ON column cn_note_activity.cn_note_activity_up IS '投稿赞:增加数';
COMMENT ON column cn_note_activity.cn_note_activity_down IS '投稿踩:增加数';
-- ----------------------------
-- Records of cn_note_activity
-- ----------------------------
INSERT INTO cn_note_activity VALUES ('0533bce4-0341-4d07-a953-3e6bbb402c75', '8', '737a9a27-b02f-4cc2-b447-eba0f047cd0d', '0', '0', 'aaaa', '<p>顶顶顶顶顶顶顶顶顶顶顶顶顶顶<br/></p>');
INSERT INTO cn_note_activity VALUES ('07468f36-fe97-4033-aa77-88c867a4fc3b', '3', '046b0110-67f9-48c3-bef3-b0b23bda9d4e', '0', '0', '啊啊啊啊', '<p>灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌嘎嘎灌灌灌灌灌灌灌灌灌灌嘎嘎嘎嘎灌灌灌灌灌灌灌灌灌灌嘎嘎灌灌灌灌灌灌灌灌灌灌灌灌灌灌嘎嘎灌灌灌</p><p>灌灌灌灌灌灌灌过嘎嘎嘎嘎灌灌灌灌灌灌灌灌灌灌嘎嘎灌灌灌灌灌灌灌灌灌灌嘎嘎嘎嘎嘎嘎个灌灌灌灌嘎嘎灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌嘎嘎灌灌灌灌灌灌灌灌灌灌嘎嘎灌灌灌灌灌灌灌灌灌灌</p><p>阿萨德飞洒地方撒的发生大撒地方盛大撒旦阿斯蒂芬撒的发生大阿斯蒂芬阿萨德阿斯蒂芬阿萨德阿斯蒂芬阿斯蒂芬撒地方阿斯蒂芬阿斯蒂芬阿斯蒂芬阿斯蒂芬<br/></p>');
INSERT INTO cn_note_activity VALUES ('0c6b43f6-ada8-4eba-a859-c7f3ad68ea10', '1', '326f17e8-ff04-4a79-b33b-ae4bb3bb5f1b', '0', '0', '测试收藏活动笔记——1', '<p>测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1测试收藏活动笔记——1</p>');
commit;

-- ----------------------------
-- Table structure for cn_note_status
-- ----------------------------
DROP TABLE cn_note_status;
CREATE TABLE cn_note_status (
  cn_note_status_id varchar2(100),
  cn_note_status_code varchar2(100),
  cn_note_status_name varchar2(500)
) ;
COMMENT ON column cn_note_status.cn_note_status_id IS '笔记状态ID';
COMMENT ON column cn_note_status.cn_note_status_code IS '笔记状态Code';
COMMENT ON column cn_note_status.cn_note_status_name IS '笔记状态名字';
-- ----------------------------
-- Records of cn_note_status
-- ----------------------------
INSERT INTO cn_note_status VALUES ('1', 'normal', 'normal');
commit;

-- ----------------------------
-- Table structure for cn_note_type
-- ----------------------------
DROP TABLE cn_note_type;
CREATE TABLE cn_note_type (
  cn_note_type_id varchar2(100),
  cn_note_type_code varchar2(100),
  cn_note_type_name varchar2(500),
  cn_note_type_desc varchar2(1000)
) ;
COMMENT ON column cn_note_type.cn_note_type_id IS '笔记本类型ID';
COMMENT ON column cn_note_type.cn_note_type_code IS '笔记本类型Code';
COMMENT ON column cn_note_type.cn_note_type_name IS '笔记本类型名称';
COMMENT ON column cn_note_type.cn_note_type_desc IS '笔记本类型说明';
-- ----------------------------
-- Records of cn_note_type
-- ----------------------------
INSERT INTO cn_note_type VALUES ('1', 'normal', 'normal', null);
commit;