
Propagation : REQUIRES_NEW

Behaviour   : Always executes in a new transaction. 
              If there is any existing transaction it gets suspended.
			  

1) If the "insertEmployee() in EmployeeService" is called directly it creates its own new transaction.

1) If the "insertEmployee() in EmployeeService" method is called from another service i.e from "joinOrganization() in OrganzationService" :-
a) If the calling service i.e. "joinOrganization() in OrganzationService" has a transaction then "insertEmployee() in EmployeeService" method does not make use of existing transaction but it creates its own new trx.
b) If the calling service i.e. "joinOrganization() in OrganzationService" does not have a transaction then "insertEmployee() in EmployeeService" method will creates its own new trx.
			  

So in the case of REQUIRES_NEW the "insertEmployee() in EmployeeService" will always run in new trx. 
			  