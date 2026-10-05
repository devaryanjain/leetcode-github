select 
      contest_id,
      round(count(user_id)*100.0 / (select count(*) from users),2) as percentage
from register
group by contest_id
ORDER BY percentage DESC, contest_id ASC;;