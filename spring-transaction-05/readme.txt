
Propagation : NEVER

Behaviour   : Always executes with out any transaction. 
              It throws an exception if there is an existing transaction.
			  

1) If the "insertEmployee() in EmployeeService" is called directly it does not creates a new transaction.

1) If the "insertEmployee() in EmployeeService" method is called from another service i.e from "joinOrganization() in OrganzationService" :-
a) If the calling service i.e. "joinOrganization() in OrganzationService" has a transaction then "insertEmployee() in EmployeeService" method will throw an exception.
b) If the calling service i.e. "joinOrganization() in OrganzationService" does not have a transaction then "insertEmployee() in EmployeeService" method will not create a new trx and run without trx.
			  

So in the case of NEVER the "insertEmployee() in EmployeeService" will never uses trx. 
			  