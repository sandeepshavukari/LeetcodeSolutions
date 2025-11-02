select request_at  as Day, round(SUM(CASE status WHEN 'completed' THEN 0 ELSE 1 END)/count(*), 2) as 'Cancellation Rate'
from Trips t
inner join Users uc on t.client_id = uc.users_id
inner join Users ud on t.driver_id = ud.users_id
where uc.Banned = 'No' and ud.banned = 'No'
and request_at BETWEEN '2013-10-01' AND '2013-10-03'
group by request_at 
