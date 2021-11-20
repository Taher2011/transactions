
Propagation : SUPPORTS

Behaviour   : It may or may not run in a transaction. 
			  If current transaction exists then it is supported. 
			  If none exists then gets executed with out transaction.
			  

1) If the "insertEmployee() in EmployeeService" is called directly it does not create own new transaction.

1) If the "insertEmployee() in EmployeeService" method is called from another service i.e from "joinOrganization() in OrganzationService" :-
a) If the calling service i.e. "joinOrganization() in OrganzationService" has a transaction then "insertEmployee() in EmployeeService" method makes use of existing transaction.
b) If the calling service i.e. "joinOrganization() in OrganzationService" does not have a transaction then "insertEmployee() in EmployeeService" method will not create new transaction.
			  

So in the case of SUPPORTS the "insertEmployee() in EmployeeService" will make use of calling service trx if it exists, else it will not create new trx and run without trx. 
			  