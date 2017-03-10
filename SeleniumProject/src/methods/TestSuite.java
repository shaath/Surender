package methods;

public class TestSuite {

	public static void main(String[] args) 
	{
		//Login
		OrgHrmMaster om=new OrgHrmMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Appliction Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");
		
		//EmpReg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_EmpReg("Venkat", "G");
		System.out.println("Employee Registration "+res );
		
		res=om.org_Logout();
		System.out.println("Appliction Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");

		//Usser Reg
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		
		res=om.org_UserReg("Venkat G", "VenkatG1234", "VenkatG1234", "VenkatG1234");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Appliction Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");
		
		//User Login
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("VenkatG1234", "VenkatG1234");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Appliction Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");
		

	}

}
