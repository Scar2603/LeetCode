# 933. Number of Recent Calls

## Problem Statement
You have a `RecentCounter` class which counts the number of recent requests within a certain time frame.

## Methods
1. `RecentCounter()` - Initializes the counter with zero recent requests.
2. `int ping(int t)` - Adds a new request at time `t`, where `t` represents some time in milliseconds, and returns the number of requests that have happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].

## Examples
### Example
```plaintext
Input:
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output:
[null, 1, 2, 3, 3]
Explanation:
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1); // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100); // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001); // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002); // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
```

## Intuition
The problem asks to implement a class that counts the number of recent requests within the last 3000 milliseconds.

## Approach
The given Java code implements a solution with the following steps:
1. Initialize a queue to store timestamps of recent requests.
2. In the `ping` method, add the current timestamp to the queue.
3. Remove timestamps from the front of the queue that are older than 3000 milliseconds.
4. Return the size of the queue, which represents the number of recent requests within the last 3000 milliseconds.

## Steps
1. Initialize a queue `requests`.
2. In the `RecentCounter` constructor, initialize the queue.
3. In the `ping` method:
    a. Add the current timestamp to the queue.
    b. While the front timestamp of the queue is older than 3000 milliseconds, remove it from the queue.
    c. Return the size of the queue.

## Time Complexity
The time complexity of this solution is O(N), where N is the number of requests in the queue.

## Space Complexity
The space complexity is O(N), where N is the number of requests stored in the queue.

