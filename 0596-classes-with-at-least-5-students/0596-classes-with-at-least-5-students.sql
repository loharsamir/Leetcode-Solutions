# Write your MySQL query statement below

select class
from(
    select class, count(student) std
    from courses
    group by class
) as t
where std>=5;

