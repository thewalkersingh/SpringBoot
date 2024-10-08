package com.example.cnExpense.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "expense_type")
public class ExpenseType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "expense_id")
	@JsonBackReference
	private Expense expense;
	
	public ExpenseType() {}
	
	public ExpenseType(String name, Expense expense) {
		this.name = name;
		this.expense = expense;
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
	
	public Expense getExpense() {
		return expense;
	}
	
	public void setExpense(Expense expense) {
		this.expense = expense;
	}
}