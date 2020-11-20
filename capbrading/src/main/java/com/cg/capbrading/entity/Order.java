package com.cg.capbrading.entity;
/**
 * 
 * @author Lakshmi
 *
 */
public class Order {
private int Cart;
private String paymentMethod;
public Order(String paymentMethod) {
	super();
	this.paymentMethod = paymentMethod;
}
@Override
public String toString() {
	return "Order [Cart=" + Cart + ", paymentMethod=" + paymentMethod + ", deliveryStatus=" + deliveryStatus
			+ ", currentLocation=" + currentLocation + ", orderTime=" + orderTime + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Cart;
	result = prime * result + ((currentLocation == null) ? 0 : currentLocation.hashCode());
	result = prime * result + ((deliveryStatus == null) ? 0 : deliveryStatus.hashCode());
	result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
	result = prime * result + ((paymentMethod == null) ? 0 : paymentMethod.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	if (Cart != other.Cart)
		return false;
	if (currentLocation == null) {
		if (other.currentLocation != null)
			return false;
	} else if (!currentLocation.equals(other.currentLocation))
		return false;
	if (deliveryStatus == null) {
		if (other.deliveryStatus != null)
			return false;
	} else if (!deliveryStatus.equals(other.deliveryStatus))
		return false;
	if (orderTime == null) {
		if (other.orderTime != null)
			return false;
	} else if (!orderTime.equals(other.orderTime))
		return false;
	if (paymentMethod == null) {
		if (other.paymentMethod != null)
			return false;
	} else if (!paymentMethod.equals(other.paymentMethod))
		return false;
	return true;
}
public void setCart(int cart) {
	Cart = cart;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
public void setDeliveryStatus(String deliveryStatus) {
	this.deliveryStatus = deliveryStatus;
}
public void setCurrentLocation(String currentLocation) {
	this.currentLocation = currentLocation;
}
public void setOrderTime(String orderTime) {
	this.orderTime = orderTime;
}
public int getCart() {
	return Cart;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public String getDeliveryStatus() {
	return deliveryStatus;
}
public String getCurrentLocation() {
	return currentLocation;
}
public String getOrderTime() {
	return orderTime;
}
private String deliveryStatus;
private String currentLocation;
private String orderTime;
}
