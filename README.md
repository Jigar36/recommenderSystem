CS 535
Fall 2016
Semester Long Project

Total Points: 100


This is a semester-long project, encouraging students to dive into the research in data mining. Specifically, this project concerns with the research on developing a recommender system. The project has three phases. 

The first phase begins at the beginning of the semester when you have received the assignment. You are asked to conduct the research on recommender systems independently by yourself.

Recommender systems have been studied extensively in the literature and have also been found popularly useful in many real-world applications. A recommender system is considered in the scenario where we have m different users and n different items in a specific application (e.g., in an E-commerce application we have n different customers potentially intending to buy m different commercial items) where a user i may give an item j a rating value k based on this user’s preference (i ∈ [1,… , m]; j ∈[1,…,n]; k∈[1,…,K]). Essentially, the whole user preference rating data can be represented as a matrix of n by m where each element of this matrix is the value k if the user in question gave a rating for the item in question, and 0 if no such rating was given yet. Initially, all the elements of this matrix are 0. After we have collected a certain amount of such user preference rating data, this matrix becomes partially filled out with different non-zero values. The goal of a recommender system is that, after we have collected a certain amount of the user preference rating data, the system is able to predict the rating value k of user i for item j if user i has not yet given such a rating. In other words, given such a partially filled out matrix, a recommender system shall be able to fill out all the predicted rating values for those elements with the current value of 0. That is, a recommender system mathematically is a solution to a matrix value completion problem.

In this phase, you dive into the research on recommender systems in the literature and either develop a new recommender system by yourself or identify an existing, working recommender system. Then you implement and evaluate this implemented system till you are happy with the system. You may use whatever language you are comfortable with to implement the recommender system. Now you are ready to test and report how good your system is. You are given a partially filled out rating data matrix with this assignment. The matrix is given in an ASCII text file where each row is a non-zero element of this matrix with three entries: the user ID number, the item ID number, and the rating value. The rating value is in the range of [1, 5] in integer where 1 means that the user likes the item the least and 5 means that the user likes the item the best. The file name is train_all_txt.txt with 943 users (m = 943) and 1682 items (n = 1682). You may use part of this given training dataset to evaluate your recommender system. When you report your testing result, you must make sure that your code generates an ASCII text file for the whole rating matrix with each element filled out (either as given or as the predicted rating value by your code). The output text file must follow the format of one element of the matrix as one row beginning with the element for the first user for the first item, followed by the first user for the second item, …, the first user for the last item, the second user for the first item, …, the second user for the last item, …, the last user for the first item, …, the last user for the last item; each row of the file has three numbers: user ID number, item ID number, and the rating value, separated by a space. Note that we use a script to grade your turned-in file and any violation of this format requirement shall result in penalty in no credit for this part. By noon November 28, you must submit in blackboard a zipped package containing the source code of your implementation of the recommender system with appropriate comments and documentations in the code, a README file to explain how to compile and run your code under what specific environment, and a text file containing the output matrix following exactly the format requirement stated above.

The second phase begins at any time between the beginning of the fall and November 28. In this phase, you prepare for a 10-minute presentation on your understanding of recommender systems and the specific system you have implemented. We shall begin the presentation in the class of November 28 and run into the end of the fall. In the presentation, you must give the following information:

•	Give a conceptual introduction to a recommender system
•	Explain in detail the specific system you have implemented
•	Give a literature review on whatever you have read on recommender systems as extensively as you can

We will announce the presentation schedule later this fall.

In the third phase, you submit your presentation material (e.g., your powerpoint file) into blackboard by noon of December 12.

Bibliographical notes: In the early literature on recommender systems, different techniques of collaborative filtering are extensively used to develop the recommender systems [1,2]. [3] is a special issue focusing on the literature on this topic. One of the challenging problems in the literature on recommender systems is that it is difficult to give an appropriate prediction for a user who does not leave any history prediction data in the matrix (i.e., a “new” user), or for an item that does not have any history prediction data in the matrix (i.e., a “new” item). This is called a cold start problem in the literature.

A final note: you must complete this project, for all the three phases, independently and no collaboration is allowed.

References

[1] J. Breese, D.. Heckerman, and C. Kadie, Empirical analysis of predictive algorithms for collaborative filtering, Proc. Conf. Uncertainty in Artificial Intelligence, (UAI98) 1998

[2] J.L. Herlocker, J.A. Konstan, J.R.A. Borchers, and J. Riedl, An algorithmic framework for performing collaborative filtering, Proc. International on ACM SIGIR Research and Development in Information Retrieval, (SIGIR98) 1998

[3] P. Resnick and H.R. Varian, Recommender Systems, Special Issue of Communications of the ACM, 40(3), 1997



