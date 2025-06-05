# BrowserNavigationSystemDeque

This project simulates a browser navigation system using the Deque data structure in Java. It implements common browser operations like visiting new pages, going back, moving forward, and checking the current page — mimicking real-world browser behavior using two stacks (backStack and forwardStack).

## Code Summary

The program uses two Deque<String> stacks (ArrayDeque) to simulate the browser's back and forward history. It performs the following operations:

i) Visit New Page: Visits a new URL, pushes the current page to the back stack, and clears the forward stack.

ii) Back: Navigates to the previous page by popping from the back stack and pushing the current page to the forward stack.

iii) Forward: Navigates to the next page by popping from the forward stack and pushing the current page to the back stack.

iv) Current Page: Displays the currently active page.

## Sample Output

```
Visited: www.youtube.com
Visited: www.linkedin.com
Went back to: www.youtube.com
Current page: www.youtube.com
Went to next page: www.linkedin.com
Visited: www.gmail.com
Went back to: www.linkedin.com
Current page: www.linkedin.com
```

## Key Points

i) Uses Java’s ArrayDeque to implement stack behavior for both back and forward navigation.

ii) Demonstrates real-world browser behavior using LIFO operations: push(), pop(), and clear().

iii) Visiting a new page clears the forward history, just like modern browsers.

## Developed By: 

Milan P Samuel
