package pojo;

import java.util.ArrayList;
import java.util.List;

public class CreateCampaign {

	private int user_group_id;
	private String start_date;
	private int vertical_id;
	private int sub_vertical_id;
	private String end_date;
	private String after_expiry;
	private PublisherDetails publisher;
	private List<KeywordList> keyword_lists;
	private List<Integer> creatives;
	private List<Buckets> buckets;
	private int admin_id;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUser_group_id() {
		return user_group_id;
	}
	public void setUser_group_id(int user_group_id) {
		this.user_group_id = user_group_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public int getVertical_id() {
		return vertical_id;
	}
	public void setVertical_id(int vertical_id) {
		this.vertical_id = vertical_id;
	}
	public int getSub_vertical_id() {
		return sub_vertical_id;
	}
	public void setSub_vertical_id(int sub_vertical_id) {
		this.sub_vertical_id = sub_vertical_id;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getAfter_expiry() {
		return after_expiry;
	}
	public void setAfter_expiry(String after_expiry) {
		this.after_expiry = after_expiry;
	}
	public PublisherDetails getPublisher() {
		return publisher;
	}
	public void setPublisher(PublisherDetails publisher) {
		this.publisher = publisher;
	}
	public List<KeywordList> getKeyword_Lists() {
		return keyword_lists;
	}
	public void setKeyword_Lists(List<KeywordList> keyword_lists) {
		this.keyword_lists = keyword_lists;
	}
	public List<Integer> getCreatives() {
		return creatives;
	}
	public void setCreatives(List<Integer> creatives) {
		this.creatives = creatives;
	}
	public List<Buckets> getBuckets() {
		return buckets;
	}
	public void setBuckets(List<Buckets> buckets) {
		this.buckets = buckets;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	

	

	
}
