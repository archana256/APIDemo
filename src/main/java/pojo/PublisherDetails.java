package pojo;

public class PublisherDetails {

	private String id;
	private String payout_type;
	private String payout_value;
	private int expected_impressions;
	private int max_impressions;
	private String tq_tracking;
	private int domain_id;

	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getPayout_type() {
		return payout_type;
	}
	public void setPayout_type(String payout_type) {
		this.payout_type = payout_type;
	}
	public String getPayout_value() {
		return payout_value;
	}
	public void setPayout_value(String payout_value) {
		this.payout_value = payout_value;
	}
	public int getExpected_impressions() {
		return expected_impressions;
	}
	public void setExpected_impressions(int expected_impressions) {
		this.expected_impressions = expected_impressions;
	}
	public int getMax_impressions() {
		return max_impressions;
	}
	public void setMax_impressions(int max_impressions) {
		this.max_impressions = max_impressions;
	}
	public String getTq_tracking() {
		return tq_tracking;
	}
	public void setTq_tracking(String tq_tracking) {
		this.tq_tracking = tq_tracking;
	}
	public int getDomain_id() {
		return domain_id;
	}
	public void setDomain_id(int domain_id) {
		this.domain_id = domain_id;
	}

	}


