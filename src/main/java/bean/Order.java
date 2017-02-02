package bean;

import java.math.BigDecimal;

public class Order
{
	private int id;
	private int orderCount;
	private BigDecimal price;
	private boolean status;
	
	public void setId(int id)
    {
    	this.id = id;
    }
 
    public int getId() 
    {
        return id;
    }
	
	public int getOrderCount()
	{
		return orderCount;
	}

	public void setOrderCount(int orderCount)
	{
		this.orderCount = orderCount;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public boolean isStatus()
	{
		return status;
	}

	public void setStatus(boolean status)
	{
		this.status = status;
	}
}
