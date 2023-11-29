package resources;

public enum APIResources {

	createcampaign("/api/campaign"),
    GetKeywordList("/keyword-list"),
	GetCampaign("/api/campaign");
  
	private String resource;
   
    APIResources(String resource){
        this.resource=resource;
    }

    public String getResource(){
        return resource;
    }
}
