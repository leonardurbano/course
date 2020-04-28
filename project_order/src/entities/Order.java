package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> orderItens = new ArrayList<OrderItem>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItens() {
		return orderItens;
	}

	public void addItem(OrderItem orderItem) {
		orderItens.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		orderItens.remove(orderItem);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem o : orderItens) {
			sum += o.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n####################################################\n");
		sb.append("\tORDER SUMMARY:");
		sb.append("\n####################################################\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status.name() +"\n");
		sb.append("Client: " + client.getName() + " (" + sdf1.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order Items:\n");
		for (OrderItem p : orderItens) {
			sb.append(p.getProduct().getName() + ", $" + String.format("%.2f", p.getProduct().getPrice()) + ", Quantity: " + p.getQuantity()
					+ ", SubTotal: " + String.format("%.2f", p.subTotal()) + "\n");
		}
		sb.append("Total price: $"+String.format("%.2f", total())+"\n");
		return sb.toString();
	}

}
