import java.io.*;
import java.lang.*;
import java.util.*;
public class CreateEV {
	public static void main(String[] arg) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		Runtime run = Runtime.getRuntime();
		System.out.println("Name The Variables name.");
		//BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		String name = scanner.next();
		//process
		System.out.println("Please input the path for the EVariable.");
		String path = scanner.next();
		//process
		//ProcessBuilder processBuilder = new ProcessBuilder();
		//processBuilder.command("cmd", "/c", "SetX "+name+" "+path+" /m");
		//Process process = processBuilder.start();
        	/*List<String> list = new ArrayList<String>();
        	list.add("cmd.exe /c "+"create.cmd "+name+" "+path);
		ProcessBuilder Env = new ProcessBuilder(list);
		System.out.println("command: " + Env.command());
		Env.directory(new File("Run"));
		Process process = Env.start();
		System.out.println(process);*/
		System.out.println("Setting a new enviroment variable "+name+" to "+path);
		Process process = Runtime.getRuntime().exec(
        "cmd /k "+"SetX "+name+" "+path+" /m",null);
		System.out.println("Set the new enviroment variable "+name+" to "+path);
	}
}