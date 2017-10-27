package com.hao.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//操作功能
public class DVDManager {
	private DVDDB db;

	public DVDManager(DVDDB db) {
		this.db = db;
	}

	// 添加dvd
	public void addDVD(String name) {
		DVD[] s = db.getDb();
		// int i = 0;
		while (true) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] == null) {
					s[i] = new DVD();
					s[i].setId(i + 1);
					s[i].setStatus("可借");
					s[i].setName(name);
					s[i].setLendDate("");
					System.out.println("<" + s[i].getName() + ">" + "已添加");
					break;
				} else {
					if (name.equals(s[i].getName())) {
						System.out.println("该" + "<" + name + ">" + "DVD已存在");
						break;
					}
				}

			}
			break;
			/*
			 * if (s[i] == null && !name.equals(s[i].getName())) { s[i] = new
			 * DVD(); s[i].setId(i + 1); s[i].setStatus("可借");
			 * s[i].setName(name); s[i].setLendDate(""); System.out.println("<"
			 * + s[i].getName() + ">" + "已添加"); break; } i++;
			 */ }
	}

	// 删除DVD
	public void deleteDVD(String name) {
		DVD[] s = db.getDb();
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				if (s[i].getName().equals(name)) {
					s[i] = null;
					System.out.println("<" + name + ">" + "已删除");
					break;
				}
			}
		}
	}

	// 查看DVD
	public void lookDVD() {
		DVD[] d = db.getDb();
		for (int i = 0; i < d.length; i++) {
			if (d[i] != null) {
				System.out.println("序号         " + "状态         " + "名称          " + "借出日期");
				System.out.println(d[i].getId() + "     " + d[i].getStatus() + "         " + d[i].getName() + "  "
						+ d[i].getLendDate());
				System.out.println("---------------------------------------------");
			}
		}

	}

	// 借出DVD
	public void lendDVD(String d) {
		int i = 0;
		DVD[] s = db.getDb();
		for (int j = 0; j < s.length; j++) {
			if (d.equals(s[j].getName()) && !s[j].getStatus().equals("已借出")) {
				s[j].setLendCount(i++);
				s[j].setStatus("已借出");
				s[j].setLendDate(new SimpleDateFormat().format(new Date()));
				System.out.println("<" + d + ">" + "已借出");
				break;
			}
			if (d.equals(s[j].getName()) && s[j].getStatus().equals("已借出")) {
				System.out.println("<" + d + ">" + "该DVD已借出");
				break;
			}
			if (s[j].equals("")) {
				System.out.println("该" + "<" + d + ">" + "DVD不存在");
				break;
			}
		}
	}

	// 归还DVD
	public void returnDVD(String d) {
		DVD[] s = db.getDb();
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && d.equals(s[i].getName())) {
				s[i].setStatus("可借");
				s[i].setLendDate("");
				System.out.println("<" + d + ">" + "已归还");
				break;
			}
		}
	}

	// DVD排行榜
	public void RankList() {
		DVD[] s = db.getDb();
		for (int i = 1; i < s.length; i++) {
			if (s[i].getLendCount() < s[i - 1].getLendCount()) {
				System.out.println(s[i].getName());
				System.out.println(s[i].getLendCount());
			}
		}
	}

}
