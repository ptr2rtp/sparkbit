 select cl.name, cl.vat_id, tran.id, tran.value, tran.ts from client cl
 left join (select client_id, min(ts) as ts from transaction group by client_id) client_min_tran 
 on cl.id = client_min_tran.client_id
 left join (select id, client_id, ts, value from transaction) tran
 on client_min_tran.ts = tran.ts and client_min_tran.client_id = tran.client_id;
