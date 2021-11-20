
Propagation : REQUIRED

Behaviour   : Always executes in a transaction. 
			  If there is any existing transaction it uses it. 
			  If none exists then only a new one is created
			  

1) If the "insertEmployee() in EmployeeService" is called directly it creates its own new transaction.

1) If the "insertEmployee() in EmployeeService" method is called from another service i.e from "joinOrganization() in OrganzationService" :-
a) If the calling service i.e. "joinOrganization() in OrganzationService" has a transaction then "insertEmployee() in EmployeeService" method makes use of existing transaction.
b) If the calling service i.e. "joinOrganization() in OrganzationService" does not have a transaction then "insertEmployee() in EmployeeService" method will create new transaction.
			  
			  