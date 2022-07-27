package phase1.java;

class EncapsulationTest {
	   
	   private int securityCode;
	   private String branchCode;
	   private String branchName;
	   private String deptCode;
	   private String deptName;
	public int getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


public static class Encapsulation {

	   public static void main(String args[]) {
	      EncapsulationTest encap = new EncapsulationTest();
	      System.out.println("\n");
	      encap.setBranchName("Computer Science\n");
	      encap.setSecurityCode(23);
	      encap.setBranchCode("MCA18\n");
	      encap.setDeptName("Master of Computer Applications\n");
	      encap.setDeptCode("MCA18\n");

	      System.out.print("Security Code : " + encap.getSecurityCode() + " Branch Name : " + encap.getBranchName() + 
	    		  "Branch Code: " + encap.getBranchCode() + "Department Name: " + encap.getDeptName() + "Department Code: " + encap.getDeptCode()
	    		  );
	   }
	}
}