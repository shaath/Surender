package methods;

public class UserRegTC {

	public static void main(String[] args)
	{
		OrgHrmMaster om=new OrgHrmMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		
		res=om.org_UserReg("Sandeep G", "SandeepG1234", "SandeepG1234", "SandeepG1234");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Appliction Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");
	}

}
