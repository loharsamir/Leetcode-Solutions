# Write your MySQL query statement below

(select u.name as results
from Users u
join MovieRating mr on u.user_id=mr.user_id
group by u.user_id,u.name
order by count(mr.user_id) desc, u.name asc
limit 1)
union all
(
select m.title as results
from Movies m
join MovieRating mr on m.movie_id=mr.movie_id
where created_at between '2020-02-01' and '2020-02-29'
group by m.movie_id,m.title
order by avg(mr.rating) desc, m.title asc
limit 1
)