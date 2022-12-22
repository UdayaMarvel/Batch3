Feature: Tv purchase

Background: Login
Given launch amazon url

  #Scenario: Login in to amazon
    #And enter the username and password
    #When search the tv
    #And click the tv
    #Then click the buy now
    #
     Scenario: Login in to amazon
    And enter the username and password
    When search the tv by using oned list
     |sony|lg|samsung|
    And click the tv
    Then click the buy now
    
    #Scenario: Login in to amazon
    #And enter the username and password
    #When search the tv by using oned map
     #|tv1|sony|
     #|tv2|lg|
     #|tv3|samsung|
    #And click the tv
    #Then click the buy now
    #
    #Scenario Outline: Login in to amazon
    #And enter the username and password
    #When search the "<tv>"
    #And click the tv
    #Then click the buy now
    #
    #Examples:
    #|Tv|
    #|sony|
    
    
    
		
   
    
    
 