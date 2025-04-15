package Ch21_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * • 請撰寫一個程式來管理學生成績，功能包含了
1. 新增學生資料
2. 計算平均分數
3. 列印最高分
4. 列印最低分
5. 退出
 * */

public class P5_Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P5_Score outter = new P5_Score();
		StudentGradeManager sgm = outter.new StudentGradeManager(); // 宣告內部類別的用法

		int set = 0;
		while (true) {
			System.out.println("1. 新增學生資料\n" + "2. 計算平均分數\n" + "3. 列印最高分\n" + "4. 列印最低分\n" + "5. 退出");
			set = sc.nextInt();
			if (set == 1) {
				System.out.println("新增學生資料");
				System.out.println("Please Enter Student Name: ");
				String name = sc.next();
				System.out.println("Please Enter Student Score: ");
				int score = sc.nextInt();
				sgm.addStudent(name, score);
			}
			if (set == 2) {
				System.out.println("計算平均分數");
				System.out.println("Avarage is: " + sgm.getAverageGrade());

			}
			if (set == 3) {
				System.out.println("列印最高分");
				System.out.println("Hightest is: " + sgm.getHighestGrade());

			}
			if (set == 4) {
				System.out.println("列印最低分");
				System.out.println("Lowest is: " + sgm.getLowestGrade());
			}
			if (set == 5) {
				System.out.println("退出");
				break;
			}

		}
		sc.close();
	}

	class Student {
		private String name;
		private int grade;

		public Student() {
			super();
		}

		public Student(String name, int grade) {
			super();
			this.name = name;
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", grade=" + grade + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}
	}

	class StudentGradeManager {
		private ArrayList<Student> students;

		public StudentGradeManager() {
			students = new ArrayList<>();
		}

		public void addStudent(String name, int grade) {
			Student student = new Student(name, grade);
			students.add(student);
		}

		public double getAverageGrade() {
			double sum = 0;
			for (int i = 0; i < students.size(); i++) {
				sum += students.get(i).getGrade();
			}
			return sum / students.size();
		}

		public int getHighestGrade() {
			int max = students.get(0).getGrade();
			for (int i = 0; i < students.size(); i++) {
				if (max < students.get(i).getGrade()) {
					max = students.get(i).getGrade();
				}
			}
			return max;
		}

		public int getLowestGrade() {
			int min = students.get(0).getGrade();
			for (int i = 0; i < students.size(); i++) {
				if (min > students.get(i).getGrade()) {
					min = students.get(i).getGrade();
				}
			}
			return min;
		}
	}
	
	
	
}

