import java.lang.reflect.*;
import java.util.*;
import reflection.*;

public class AnalyzeApp
{
	public static void main(String[] args)
	{
	  String name;
	  if(args.length>0)
		  name=args[0];
	  else
	  {
		  Scanner sin=new Scanner(System.in);
		  System.out.print("Enter the class name : ");
		  name=sin.next();
	  }
	  Analyze.analyzeClass(name);
	}
}
