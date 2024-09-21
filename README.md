Amazon Automation Testing

Overview
This project automates two test scenarios on the Amazon website using Selenium WebDriver and Java. It applies the Page Object Model (POM) design pattern for better maintainability and structure.

Task Scenarios
Scenario 1: Adding Car Accessories to Cart
1-Open Amazon's homepage.
2-Search for "car accessories."
3-Select the first item from the search results.
4-Add the item to the shopping cart.
5-Verify that the item has been successfully added to the cart.
Scenario 2: Adding Item from Today's Deals
1-Open Amazon's "Today's Deals" section.
2-Apply filters from the left side for:
"Headphones"
"Grocery"
3-Apply the discount filter for "10% off or more."
4-Navigate to the fourth page of the filtered results.
5-Select any item and add it to the cart.
6-Verify that the item has been successfully added to the cart.

Key Features
Automated Search and Cart Operations: Automated interactions with Amazon's search, filtering, and cart functionalities.
Page Object Model (POM): Uses the POM design pattern for scalable and maintainable test automation.
Assertions: Ensures that items are added to the cart successfully through validation checks.

Tools and Technologies
Selenium WebDriver: For browser automation.
Java: Programming language used for automation.
TestNG: Testing framework for assertions and test management.
Page Object Model (POM): Design pattern for enhancing maintainability.

How to Run
Set up the project with necessary dependencies (Selenium WebDriver, TestNG).
Run the test scenarios from your IDE or via Maven commands.
The tests will automatically open the Amazon website, perform the actions, and check that the cart operations are successful.
Conclusion
This project automates key user actions on Amazon, ensuring the ability to navigate, search, apply filters, and add items to the cart. The use of the POM design pattern ensures that the tests are maintainable and easy to extend.

