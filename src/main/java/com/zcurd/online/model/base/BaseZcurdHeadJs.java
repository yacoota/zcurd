package com.zcurd.online.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseZcurdHeadJs<M extends BaseZcurdHeadJs<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setHeadId(java.lang.Integer headId) {
		set("head_id", headId);
		return (M)this;
	}
	
	public java.lang.Integer getHeadId() {
		return getInt("head_id");
	}

	public M setPage(java.lang.String page) {
		set("page", page);
		return (M)this;
	}
	
	public java.lang.String getPage() {
		return getStr("page");
	}

	public M setSqlContent(java.lang.String sqlContent) {
		set("sql_content", sqlContent);
		return (M)this;
	}
	
	public java.lang.String getSqlContent() {
		return getStr("sql_content");
	}

	public M setJsContent(java.lang.String jsContent) {
		set("js_content", jsContent);
		return (M)this;
	}
	
	public java.lang.String getJsContent() {
		return getStr("js_content");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
