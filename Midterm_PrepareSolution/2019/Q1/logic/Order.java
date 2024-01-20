package Q1.logic;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;
	
	public Order() {
		orderItemList = new ArrayList<>();
		orderNumber = totalOrderCount++;
	}

	public OrderItem addItem(Item item, int amount) {
		amount = Math.max(amount, 0);
		boolean check = true;
		for(OrderItem a : orderItemList) {
			if(a.getItem() == item) {
				a.setItemAmount(a.getItemAmount() + amount);
				check = false;
			}
		}
		if(check) {
			OrderItem neworder = new OrderItem(item, amount);
			orderItemList.add(neworder);
		}
		return null;
	}

	public int calculateOrderTotalPrice() {
		int temp = 0;
		for(OrderItem a : orderItemList) {
			temp += a.calculateTotalPrice();
		}
		return temp;
	}

	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	
	
}
