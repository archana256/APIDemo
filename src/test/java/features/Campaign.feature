

Feature: Validating Campaign API

  Scenario Outline: Verify campaign is being successfully added using create Campaign api
    Given Create campaign payload with "<name>" "<start_date>"  "<end_date>"  "<after_expiry>"
  #  When user calls "createcampaign" API using "Post" Http method
    Then API Call got success with status code 200
    And "status" in response body is "success"
    And verify campaign id created maps to "<name>" using "GetCampaign"
    

Examples:
     |name                                 | start_date   | end_date   |   after_expiry  |
     |test-archana-campaign-automation-1112|  2023-12-01  | 2023-12-06 |   Stop          |