import static java.lang.System.out;
import java.lang.reflect.*;
import java.util.*;

public class HackyClass{
	public static void main(String []args) throws Exception{
		String name;
		for(int i = 0;i < args.length;i ++){
			//if(args.length > 0)
			name = args[0];
			Class cls = Class.forName(name);
			out.println("Class Name : " + cls.getName());
			Class SuperCls = cls.getSuperclass();
			out.println("Super Class Name : " + SuperCls.getName());
			String x = Modifier.toString(cls.getModifiers());
			out.println("Class Modifier : class " + x);
			out.println("-------------Constructors-------------\n");
			printConstructors(cls);
			out.println("--------------------------------------\n");
			out.println("-----------------Methods--------------\n");
			printMethods(cls);
			out.println("---------------------------------------\n");
			out.println("-------------Fields-------------\n");
			printFields(cls);
			out.println("--------------------------------\n");
		}
	}

	public static void printConstructors(Class cls){
		Constructor [] constructors = cls.getDeclaredConstructors();

		for(int i = 0; i < constructors.length; i ++){ //it can also be written as for(Constructor c : constructors)
			String name = constructors[i].getName();
			//out.println(name);
			String modifiers = Modifier.toString(constructors[i].getModifiers());
			//out.print("Modifiers : ");
			if(modifiers.length()>0)
				out.println(modifiers + " "+name);
			Class []paraTypes = constructors[i].getParameterTypes();
			if(paraTypes.length > 1){
				out.print("Parameters : ");
				for(int j = 0; j < paraTypes.length; j++){
					if(j>0)
						out.print(paraTypes[j].getName()+",");
				}
			}
			out.println("\n");
		}
	}

	public static void printMethods(Class cls){
		Method[] methods = cls.getDeclaredMethods();
	
		for(int i = 0; i < methods.length; i ++){ 
			String name = methods[i].getName();
			//out.println(name);
			String modifiers = Modifier.toString(methods[i].getModifiers());
			//out.print("Modifiers : ");
			if(modifiers.length() > 0)
				out.println(modifiers + " " + name);
			Class []paraTypes = methods[i].getParameterTypes();
			if(paraTypes.length > 1){
				out.print("Parameters : ");
				for(int j = 0; j < paraTypes.length; j++){
					if(j>0)
						out.print(paraTypes[j].getName()+",");
				}
			}
			out.println("\n");
		}
					
	}

	public static void printFields(Class cls){
		Field[] fields = cls.getDeclaredFields();
		for(Field f:fields){
			Class type = f.getType();
			String name = f.getName();
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length()>0)
				out.println(modifiers+" "+name+";\n");
		}
	}
	
	public static void ObjectAnalyser(){
	}

}
