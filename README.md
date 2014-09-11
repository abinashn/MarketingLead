SAP Cloud for Customer Integration with Facebook using SAP HANA Cloud Platform for Marketing Lead Creation
=============

Prerequisites:
=============
1.	Eclipse Kepler IDE installed
2.	JDK 1.7 is available as an Installed JRE in Windows->Preferences->Java->Installed JREs
3.	SAP HANA Cloud JAVA EE6 Web profile is available as a runtime environment Windows->Preferences->Server-> Runtime Environments
4.	A Facebook application is available of type APP for Pages and the required app access token and page access token are available.

What is it about?
=============
This project integrates Facebook with SAP Cloud for Customer for creation of marketing lead based on user likes for a specific promotion.

A promotion is created as a Facebook post in a page to which a Facebook app is bound. When a user who has subscribed to this app likes the Facebook post, the user information is captured from Facebook via real time subscription and a marketing lead is created in the SAP Cloud for Customer through a web service call.

How to deploy the application?
=============

Step 1: Clone the Git repository

Step 2: Import the project as a maven project into your eclipse workspace.

Step 3: Run Maven goal clean install 

Step 4: In the Input.properties file (under \\ PromotionalCompanyApp\WebContent\WEB-INF\input.properties)adapt all the values:

VERIFY_TOKEN, APP_ACCESS_TOKEN, PAGE_ACCESS_TOKEN, USERNAME and PASSWORD

Step 5: Replace the \PromotionalCompanyApp\src\com\cfc\fb\client\MarketingLead.wsdl with wsdl from your SAP Cloud for Customer tenant specifc WSDL for the ManageMarketingLeadIn WSDL

Step 6: Build and deploy your application

Step 7: In the Facebook app subscribe to the HANA Cloud Platform APP ConsumerAPP servlet in the real time subscription
