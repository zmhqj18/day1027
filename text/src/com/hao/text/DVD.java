package com.hao.text;

import java.util.Scanner;

/**
 * DVD管理器
 * 
 * @author Administrator
 *
 */
public class DVD {
	private int id;
	private String name;
	private int lendCount;
	private String lendDate;
	private String status = "可借";
	private DVDManager manager;

	public DVD() {
	}

	public DVD(DVDManager manager) {
		this.manager = manager;
	}

	public DVD(int id, String name, int lendCount, String lendDate, String status) {
		this.id = id;
		this.name = name;
		this.lendCount = lendCount;
		this.lendDate = lendDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLendCount() {
		return lendCount;
	}

	public void setLendCount(int lendCount) {
		this.lendCount = lendCount;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// 启动
	public void start() {
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("----------------------------------------------------");
		select();
	}

	// 选择
	public void select() {
		while (true) {
			System.out.println("1. 新增 DVD");
			System.out.println("2. 查看 DVD");
			System.out.println("3. 删除 DVD");
			System.out.println("4. 借出 DVD");
			System.out.println("5. 归还 DVD");
			System.out.println("6. 退         出");
			System.out.println("----------------------------------------------------");
			Scanner input = new Scanner(System.in);
			System.out.print("请选择：");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("----->新增DVD");
				Scanner input2 = new Scanner(System.in);
				System.out.print("请输入DVD：");
				String name = input2.next();
				manager.addDVD(name);
				System.out.print("输入0返回：");
				int n = input2.nextInt();
				if (n == 0) {
					select();
				}
				break;
			case 2:
				System.out.println("----->查看DVD");
				manager.lookDVD();
				System.out.print("输入0返回：");
				Scanner input7 = new Scanner(System.in);
				int n2 = input7.nextInt();
				if (n2 == 0) {
					select();
				}
				break;
			case 3:
				System.out.println("----->删除DVD");
				Scanner input3 = new Scanner(System.in);
				System.out.print("请输入DVD：");
				String name1 = input3.next();
				manager.deleteDVD(name1);
				System.out.print("输入0返回：");
				int n3 = input3.nextInt();
				if (n3 == 0) {
					select();
				}
				break;
			case 4:
				System.out.println("----->借出DVD");
				Scanner input4 = new Scanner(System.in);
				System.out.print("请输入DVD：");
				String name2 = input4.next();
				manager.lendDVD(name2);
				System.out.print("输入0返回：");
				int n4 = input4.nextInt();
				if (n4 == 0) {
					select();
				}
				break;
			case 5:
				System.out.println("----->归还DVD");
				Scanner input5 = new Scanner(System.in);
				System.out.print("请输入DVD：");
				String name3 = input5.next();
				manager.returnDVD(name3);
				System.out.print("输入0返回：");
				int n5 = input5.nextInt();
				if (n5 == 0) {
					select();
				}
				break;
			case 6:
				input.close();
				break;
			}
			break;
		}
	}

}
