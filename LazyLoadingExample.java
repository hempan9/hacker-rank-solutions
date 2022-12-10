package com.hackerranck;

// Java program that shows virtual proxy in the Lazy Loading   
  
// import statements  
import java.util.ArrayList;  
import java.util.List;  
  
// declaring an interface  
interface IContactList  
{  
public List<Employees> getEmployeesList();  
}  
  
class Company  
{  
// fields of the company class  
String cName;  
String cAddress;  
String cContactNo;  
IContactList contctList;  
  
// constructor of the list for  initializing the class fields  
public Company(String cName, String cAddress, String cContactNo, IContactList contctList)  
{  
this.cName = cName;  
this.cAddress = cAddress;  
this.cContactNo = cContactNo;  
this.contctList = contctList;  
}  
  
// a getter method to retrieve the company name  
public String getCompnyName()  
{  
return this.cName;  
}  
  
// a getter method to retrieve the address of the company  
public String getCompnyAddress()  
{  
return this.cAddress;  
}  
public String getCompnyContactNo()  
{  
return this.cContactNo;  
}  
  
// a getter method to retrieve the contact list  
public IContactList getContctList()  
{  
return this.contctList;  
}  
  
}  
  
class ContactList implements IContactList   
{  
// a method to retrieve the list  
@Override  
public List<Employees> getEmployeesList()  
{  
return getEmpList();  
}  
private static List<Employees> getEmpList()  
{  
List<Employees> empList = new ArrayList<Employees>(5);  
  
// adding employees to the list  
empList.add(new Employees("Mukesh", 3452.67, "JSE"));  
empList.add(new Employees("Amit", 22345, "ASE"));  
empList.add(new Employees("Naman", 3256.17, "G4"));  
empList.add(new Employees("Vipul", 4895.34, "SDE1"));  
empList.add(new Employees("Akhil", 2857.91, "SDE2"));  
  
return empList;  
}  
}  
  
class ContactListProxy implements IContactList   
{  
  
private IContactList contctList;  
  
@Override  
public List<Employees> getEmployeesList()  
{  
if (contctList == null)   
{  
System.out.println("Fetching the list of employees ... \n");  
contctList = new ContactList();  
}  
return contctList.getEmployeesList();  
}  
}  
  
class Employees  
{  
// fields of the employees class  
private String empName;  
  
private double empSalary;  
private String empDesignation;  
  
// constructor of the list for initializing the class fields   
public Employees(String empName, double empSalary, String empDesignation)  
{  
this.empName = empName;  
this.empSalary = empSalary;  
this.empDesignation = empDesignation;  
}  
  
// a getter method to get employee name  
public String getEmpName()  
{  
return empName;  
}  
  
  
// a getter method to retrieve the employee salary  
public double getEmpSalary()  
{  
return empSalary;  
}  
  
// a getter method to fetch the designation of the employee  
public String getEmpDesignation()  
{  
return empDesignation;  
}  
  
@Override  
public String toString()  
{  
String res = "Employee Name: " + empName + ", EmpDesignation : " + empDesignation + ", Employee Salary : " + empSalary;  
  
return res;  
}  
}  
  
// main class  
public class LazyLoadingExample  
{  
// main method  
public static void main(String[] argvs)  
{  
// instantiating the ContactListProxy class   
IContactList contactListObj = new ContactListProxy();  
  
  
// instantiating the company class  
Company companyObj = new Company("ABC", "India", "+91-011-55512347", contactListObj);  
  
System.out.println("Company Name: " + companyObj.getCompnyName());  
System.out.println("Company Address: " + companyObj.getCompnyAddress());  
System.out.println("Company Contact No.: " + companyObj.getCompnyContactNo() + "\n");  
System.out.println("Requesting for the contact list ...");  
  
contactListObj = companyObj.getContctList();  
List<Employees> employeeList = contactListObj.getEmployeesList();  
  
// printing the fetched list  
for (Employees emp : employeeList)   
{  
System.out.println(emp);  
}  
}  
}  