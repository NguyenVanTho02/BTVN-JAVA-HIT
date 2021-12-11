package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<News> listNews = new ArrayList<>();
	
	static void insert() {
        News news = new News();
        sc.nextLine();
        System.out.print("Enter the title: ");		 	 news.setTitle(sc.nextLine());
        System.out.print("Enter the publishDate: ");	 news.setPublishDate(sc.nextLine());
        System.out.print("Enter the author: ");			 news.setAuthor(sc.nextLine());
        System.out.print("Enter the content: "); 		 news.setContent(sc.nextLine());
        news.setRateList();
        listNews.add(news);
    }

    static void view() {
        for(int i=0; i < listNews.size(); i++) {
        	listNews.get(i).Display();
        }
    }

    static void average() {
        for(int i=0; i < listNews.size(); i++) {
        	listNews.get(i).Calculate();
        	listNews.get(i).Display();
        }
    }
	public static void main(String[] args) {
		int choose;
        do {
            System.out.println("1.Insert News");
            System.out.println("2.View List News");
            System.out.println("3.Average Rate");
            System.out.println("4.Exit");
            System.out.print("Your choose: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    insert();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                	average();
                    break;
                case 4:
                    return;             
                default:
                    System.out.println("Choose 1->4 !");
            }
        } while (true);
	}
	
}
