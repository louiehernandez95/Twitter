# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* The purpose of this program is to help differentiate between HashTags (#), topics(@), and Url's (http://) in a tweeter message. In my Parse class I have 3 main functions. FindUrl, FindTopic, and FindHashes. In this class there is also 3 separate linked lists. One for each category. I made all the find methods Boolean, because I thought it would be the easiest in determining whether a part of a string is going into the Url, topics, or hashtags linkedlist respectively. What I mean by this is that it would be the easiest to test. If the function returned a string or even int it would prove to be more difficult. I made a do while for each method because I know at first each linkedlist will start out empty, and the do while loop keeps going depending whether there is an open spot in the linkedlist. I thought this would sort each linkedlist nicely. For each method I used and if statement with the contains method in order to determine whether if the string had the desired character or not. I made a separate if statement where if any of the characters are next to each other it will return false. I only made that exception because I wanted to save space. But I should have also made it so that as long as there is a space between each specific character. There is so much specifics I should have gone through but due to little experience I did not develop the program as much as I would have liked.


### Contribution guidelines ###

* Writing tests-Louie Hernandez
* Code review-Louie Hernandez
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin-Louie Hernandez