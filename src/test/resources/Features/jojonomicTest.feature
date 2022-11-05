Feature: Order Amazon

  Scenario: Search 1
	When navigate to url 
  And click locationus
  And click search box
  And click search icon
  Then validate site
  
  
  Scenario: Search 2
  When navigate to url 2
  And click locationus
  And click search box 2
  And click search icon 2
  And click mcville
  Then validate site 2