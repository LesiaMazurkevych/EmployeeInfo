package TeamWork.EmployeeManipulation;

import java.util.Comparator;

public class MyJSONComparator implements Comparator<User> {

		@Override
		public int compare(User o1, User o2) {
			int flag;
			 String v1 = (String) (o1.getName());
			 String v3 = (String) (o2.getName());
		    flag = v1.compareTo(v3);
		    if(flag==0)
		    {
		    	flag=1;
		    	String v2 = (String) (o1.getPosition());
				String v4 = (String) (o2.getPosition());
				flag = v2.compareTo(v4);
				if(flag==0)
				{
					Integer v5 = o1.getSalary();
					Integer v6 = o2.getSalary();
					return v5.compareTo(v6);
				}
				return v2.compareTo(v4);
		    }
		    return v1.compareTo(v3);
		}

		}