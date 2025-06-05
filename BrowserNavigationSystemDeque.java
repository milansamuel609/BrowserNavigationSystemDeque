import java.util.*;

class Navigation {
    Deque<String> backStack = new ArrayDeque<>();
    Deque<String> forwardStack = new ArrayDeque<>();

    String page;

    void visit(String url){
        if (page != null){
            backStack.push(page);
        }
        forwardStack.clear();
        page = url;
        System.out.println("Visited: " + page);
    }

    void back(){
        if (!backStack.isEmpty()){
            forwardStack.push(page);
            page = backStack.pop();
            System.out.println("Went back to: " + page);
        }
        else {
            System.out.println("No back history available.");
        }
    }

    void forward(){
        if (!forwardStack.isEmpty()){
            backStack.push(page);
            page = forwardStack.pop();
            System.out.println("Went to next page: " + page);
        }
        else {
            System.out.println("No next page is available");
        }
    }

    void currentPage(){
        System.out.println("Current page: " + page);
    }
}

public class BrowserNavigationSystemDeque {
    public static void main(String[] args) {
        Navigation browser = new Navigation();

        browser.visit("www.youtube.com");
        browser.visit("www.linkedin.com");
        browser.back();
        browser.currentPage();
        browser.forward();
        browser.visit("www.gmail.com");
        browser.back();
        browser.currentPage();

    }
}
