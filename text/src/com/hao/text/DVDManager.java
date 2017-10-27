package com.hao.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//��������
public class DVDManager {
	private DVDDB db;

	public DVDManager(DVDDB db) {
		this.db = db;
	}

	// ���dvd
	public void addDVD(String name) {
		DVD[] s = db.getDb();
		// int i = 0;
		while (true) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] == null) {
					s[i] = new DVD();
					s[i].setId(i + 1);
					s[i].setStatus("�ɽ�");
					s[i].setName(name);
					s[i].setLendDate("");
					System.out.println("<" + s[i].getName() + ">" + "�����");
					break;
				} else {
					if (name.equals(s[i].getName())) {
						System.out.println("��" + "<" + name + ">" + "DVD�Ѵ���");
						break;
					}
				}

			}
			break;
			/*
			 * if (s[i] == null && !name.equals(s[i].getName())) { s[i] = new
			 * DVD(); s[i].setId(i + 1); s[i].setStatus("�ɽ�");
			 * s[i].setName(name); s[i].setLendDate(""); System.out.println("<"
			 * + s[i].getName() + ">" + "�����"); break; } i++;
			 */ }
	}

	// ɾ��DVD
	public void deleteDVD(String name) {
		DVD[] s = db.getDb();
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				if (s[i].getName().equals(name)) {
					s[i] = null;
					System.out.println("<" + name + ">" + "��ɾ��");
					break;
				}
			}
		}
	}

	// �鿴DVD
	public void lookDVD() {
		DVD[] d = db.getDb();
		for (int i = 0; i < d.length; i++) {
			if (d[i] != null) {
				System.out.println("���         " + "״̬         " + "����          " + "�������");
				System.out.println(d[i].getId() + "     " + d[i].getStatus() + "         " + d[i].getName() + "  "
						+ d[i].getLendDate());
				System.out.println("---------------------------------------------");
			}
		}

	}

	// ���DVD
	public void lendDVD(String d) {
		int i = 0;
		DVD[] s = db.getDb();
		for (int j = 0; j < s.length; j++) {
			if (d.equals(s[j].getName()) && !s[j].getStatus().equals("�ѽ��")) {
				s[j].setLendCount(i++);
				s[j].setStatus("�ѽ��");
				s[j].setLendDate(new SimpleDateFormat().format(new Date()));
				System.out.println("<" + d + ">" + "�ѽ��");
				break;
			}
			if (d.equals(s[j].getName()) && s[j].getStatus().equals("�ѽ��")) {
				System.out.println("<" + d + ">" + "��DVD�ѽ��");
				break;
			}
			if (s[j].equals("")) {
				System.out.println("��" + "<" + d + ">" + "DVD������");
				break;
			}
		}
	}

	// �黹DVD
	public void returnDVD(String d) {
		DVD[] s = db.getDb();
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && d.equals(s[i].getName())) {
				s[i].setStatus("�ɽ�");
				s[i].setLendDate("");
				System.out.println("<" + d + ">" + "�ѹ黹");
				break;
			}
		}
	}

	// DVD���а�
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
