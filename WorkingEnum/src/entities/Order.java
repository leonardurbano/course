package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities_enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;

	public Order() {

	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMoment() {
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return d.format(moment);
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStaus() {
		return status;
	}

	public void setStaus(OrderStatus staus) {
		this.status = staus;
	}

	@Override
	public String toString() {
		return "Order [id: " + id + ", moment: " + getMoment() + ", status: " + status + "]";
	}
	
	

}
