package resources;

import java.util.ArrayList;

import pojo.Buckets;
import pojo.CreateCampaign;
import pojo.KeywordList;
import pojo.Keywords;
import pojo.PublisherDetails;

public class TestDataBuild {
	
	public CreateCampaign createCampaignPayload(String name, String start_date, String end_date, String after_expiry) {
		CreateCampaign c = new CreateCampaign();
		c.setName(name);
		c.setUser_group_id(63);
		c.setStart_date(start_date);
		c.setVertical_id(15);
		c.setSub_vertical_id(929);
		c.setEnd_date(end_date);
		c.setAfter_expiry(after_expiry);
		c.setPublisher(null);
		c.setAdmin_id(9934);
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10381);
		list.add(10380);
		c.setCreatives(list);
		//add buckets
		Buckets b = new Buckets();
		Buckets b1 = new Buckets();
		
		ArrayList MyList =new ArrayList<>();
		MyList.add(b);
		MyList.add(b1);
		
		
		b.setIs_catch_all(true);
		b.setName("CatchAll");
		b.setPercentage(0);
		b.setAd_provider(27);
		b.setKeyword_list(12865);
		b.setDevice("All");
		b.setIs_payable_to_publisher("No");
		b.setTemplate(31766);
		
		b1.setIs_catch_all(false);
		b1.setName("B1");
		b1.setPercentage(100);
		b1.setAd_provider(30);
		b1.setKeyword_list(12865);
		b1.setDevice("All");
		b1.setIs_payable_to_publisher("No");
		b1.setTemplate(31766);
		
		c.setBuckets(MyList);
		
		
		//Add keywords
		
		ArrayList l =new ArrayList<>();
		
		
		Keywords k =new Keywords();
		k.setId(146643);
		k.setPercentage(100);
		
		l.add(k);
		
		KeywordList kw =new KeywordList();
		kw.setId(12865);
		kw.setKeywords(l);
		ArrayList l2 =new ArrayList<>();
		l2.add(kw);
		
		c.setKeyword_Lists(l2);
		
		//set publisher details
		
		PublisherDetails pd =new PublisherDetails();
		pd.setId("9CUHTG7TY");
		pd.setPayout_type("rev");
		pd.setPayout_value("0.1");
		pd.setExpected_impressions(100);
		pd.setMax_impressions(100);
		pd.setDomain_id(3123);
		pd.setTq_tracking("perpublisherperbucket");
		
		c.setPublisher(pd);
		return c;
	}
	

}
