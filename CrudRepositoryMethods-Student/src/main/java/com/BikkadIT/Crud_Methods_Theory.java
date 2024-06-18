package com.BikkadIT;

public class Crud_Methods_Theory {
	
	
	
	/*
	  CrudRepository interface methods
	  --------------------------------------------------------------------- ->
	  CrudRepository is a predefined interface available in Spring Data JPA. ->
	  
	  CrudRepository interface providing methods to perform Crud Operations in our
	  application.
	  
	 
	  
	  1)save(Object E) -> 
	                  Insert / Update The Record. //
	                  save()/persist()/saveorupadte()(Hibernate)
	  
	
	  2)saveAll (Iterable<E> entities ) -> 
	                                            Insert/Update Collection of records.
	  
	  Note: With given primary if record already present in the table then it will
	  execute update query else it will execute insert query.
	  
	  
	  3)findById(Serilizable ID) :  
	                             To retrieve record using Primary key. // get()
	                                 and load() diffrence
	  
	  
	  4)findAllById(Iterable<Serializable> ids) : 
	                               To find records using multiple
	                                Primary Keys
	  
	 
	  5)findAll ( ) : 
	                 To retrieve all records from the table.
	  
	  
	  6)existsById(Serilizable Id) : 
	                                  To check presence of record using Primary Key
	  
	  
	  7)count ( ) :
	                To get total records count of the table
	  
	  
	  
	  8)deleteById(Serializable id) :
	                                  To delete a record using primary key
	  
	 
	  
	  9)deleteAllById(Iterable ids) :  
	                                       To delete multiple records using primary keys
	  
	  
	  
	  10)delete(Object entity): 
	                            To delete a record based on entity object
	  
	  
	  
	  11)deleteAll ( ) : 
	                      To delete all records from the table
	 
	 *
	 *
	 */

}
