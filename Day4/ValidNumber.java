package Day4;
public class ValidNumber
{
public static void main(String args[])
{
int num=0;
for(int i=0;i<args.length;i++)
{
try
			{
				int j=Integer.parseInt(args[i]);
				num++;
			}
			catch(NumberFormatException e)
			{
				
			}
System.out.println("args["+i+"]::"+args[i]);
}
System.out.println("\n\n valid number in args[]::"+num);
}
}
