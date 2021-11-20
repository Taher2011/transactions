
Propagation : MANDATORY

Behaviour   : Always executes in a transaction. 
			  If there is any existing transaction it is used. 
			  If there is no existing transaction it will throw an exception..
			  

1) If the "insertEmployee() in EmployeeService" is called directly it will throw an exception.

1) If the "insertEmployee() in EmployeeService" method is called from another service i.e from "joinOrganization() in OrganzationService" :-
a) If the calling service i.e. "joinOrganization() in OrganzationService" has a transaction then "insertEmployee() in EmployeeService" method will make use of existing trx.
b) If the calling service i.e. "joinOrganization() in OrganzationService" does not have a transaction then "insertEmployee() in EmployeeService" method will throw an exception.
			  

So in the case of MANDATORY the "insertEmployee() in EmployeeService" will always need calling service to have trx else exception is thrown. 
			  