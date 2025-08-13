# Write your MySQL query statement below
select max(num) as num
from(
    select num, count(num) as countNum
    from MyNumbers
    group by num
)as t
where countNum=1;



