select max(num) AS num from mynumbers 
where num in 
(select max(num) as num from MyNumbers
group by num 
having count(num)=1);