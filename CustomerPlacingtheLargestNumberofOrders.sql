with cte_history as(
select 
    customer_number,
    count(order_number) as order_his
from Orders
group by customer_number
)
select customer_number
from cte_history
where order_his = (select max(order_his) from cte_history)
;
