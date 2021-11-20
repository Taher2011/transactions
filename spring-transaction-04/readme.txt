
Propagation : REQUIRES_NEW

Behaviour   : Always executes without a transaction. 
              If there is any existing transaction it gets suspended.
			  

1) If the "insertEmployee() in EmployeeService" is called directly it does not create own new transaction.

1) If the "insertEmployee() in EmployeeService" method is called from another service i.e from "joinOrganization() in OrganzationService" :-
a) If the calling service i.e. "joinOrganization() in OrganzationService" has a transaction then "insertEmployee() in EmployeeService" method does not make use of existing transaction neither it creates its own trx.
b) If the calling service i.e. "joinOrganization() in OrganzationService" does not have a transaction then "insertEmployee() in EmployeeService" method will not create new transaction.
			  

So in the case of NOT_SUPPORTS the "insertEmployee() in EmployeeService" will not make use of calling service trx if it exists, neither it will create new trx and always run without trx. 
			  