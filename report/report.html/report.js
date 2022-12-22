$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Mobile.feature");
formatter.feature({
  "name": "Amazon.mobilePurchase",
  "description": "//@smoke ",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonMobiles.launch_amazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login to amazon",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonMobiles.login_to_amazon()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebElement.sendKeys(java.lang.CharSequence[])\" because \"element\" is null\r\n\tat com.amazon.resources.commonActions.insertTextEnter(commonActions.java:47)\r\n\tat com.amazon.stepdefenition.AmazonMobiles.login_to_amazon(AmazonMobiles.java:33)\r\n\tat ✽.login to amazon(src/test/resources/Features/Mobile.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Mobile Purchase",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "search the mobile",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonMobiles.search_the_mobile()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select the first mobile",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonMobiles.select_the_first_mobile()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the selected mobile",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonMobiles.validate_the_selected_mobile()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select the buynow",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonMobiles.select_the_buynow()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the selected mobile name",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonMobiles.validate_the_selected_mobile_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});