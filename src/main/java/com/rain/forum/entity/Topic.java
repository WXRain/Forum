package com.rain.forum.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Repository;

@Repository("Topic")
public class Topic implements Serializable {

	private int id;
	private int userId;
	private int sectionId;
	private int clickCount;
	private int replyCount;
	private String topicName;
	private String topicText;
	private long releaseDate;
	private long lastReplyDate;
	private int isTop;
	private int isFine;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	private String rDate;
	private String lDate;

	public Topic() {

	}

	public Topic(int id, int userId, int sectionId, int clickCount, int replyCount, String topicName, String topicText,
			long releaseDate, long lastReplyDate, int isTop, int isFine) {
		super();
		this.id = id;
		this.userId = userId;
		this.sectionId = sectionId;
		this.clickCount = clickCount;
		this.replyCount = replyCount;
		this.topicName = topicName;
		this.topicText = topicText;
		this.releaseDate = releaseDate;
		this.lastReplyDate = lastReplyDate;
		this.isTop = isTop;
		this.isFine = isFine;
		this.rDate = sdf.format(releaseDate);
		this.lDate = sdf.format(lastReplyDate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", userId=" + userId + ", sectionId=" + sectionId + ", clickCount=" + clickCount
				+ ", replyCount=" + replyCount + ", topicName=" + topicName + ", topicText=" + topicText
				+ ", releaseDate=" + releaseDate + ", lastReplyDate=" + lastReplyDate + ", isTop=" + isTop + ", isFine="
				+ isFine + ", rDate=" + rDate + ", lDate=" + lDate + "]";
	}

	public String longToString(long number) {
		return sdf.format(number);
	}

	public String getrDate() {
		return rDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getClickCount() {
		return clickCount;
	}

	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicText() {
		return topicText;
	}

	public void setTopicText(String topicText) {
		this.topicText = topicText;
	}

	public long getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(long releaseDate) {
		this.releaseDate = releaseDate;
	}

	public long getLastReplyDate() {
		return lastReplyDate;
	}

	public void setLastReplyDate(long lastReplyDate) {
		this.lastReplyDate = lastReplyDate;
	}

	public int getIsTop() {
		return isTop;
	}

	public void setIsTop(int isTop) {
		this.isTop = isTop;
	}

	public int getIsFine() {
		return isFine;
	}

	public void setIsFine(int isFine) {
		this.isFine = isFine;
	}

	public void setlDate(String lDate) {
		this.lDate = lDate;
	}

	public void setrDate(String rDate) {
		this.rDate = rDate;
	}

	public String getlDate() {
		return lDate;
	}

}
