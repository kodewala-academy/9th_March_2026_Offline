package com.kodewala.str2;

public class QueryBuilder
{

	public static void main(String[] args)
	{
		String employeeId = null;
		String sal = "120000";
		QueryBuilder builder = new QueryBuilder();
		builder.generateSQL(employeeId, sal);
	}

	public void generateSQL(String empId, String salary)
	{
		StringBuffer query = new StringBuffer("Select firstName, String lastName from Employee where ");

		if (empId != null)
		{
			query.append("employeeId= " + empId);
		} else if (salary != null)
		{
			query.append("salary= " + salary);
		} else
		{
			query.append("Select firstName, String lastName from Employee");
		}
		query.append(";");

		System.out.println(" final query is " + query);
	}

}
