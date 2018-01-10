package foobar;

import java.util.Scanner;

public class donttry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				int k=0;
				int q=s.nextInt();
				String[] st=new String[q];
				for(int j=0;j<q;j++)
				{
					int x=s.nextInt();
					String str=s.next();
					if(x==1)
					{
						st[k++]=str;
					}
					else if(x==2)
					{
						int l=0;
						for(l=0;l<k;l++)
						{
							if(st[l].equals(str))
							{
								break;
							}
						}
						for(int y=l;y<k-1;y++)
						{
							st[y]=st[y+1];
						}
						st[k-1]=null;
						k--;
					}
					else if(x==3)
					{
						int count=0;
						for(int l=0;l<k;l++)
						{
							char[] str1=str.toCharArray();
							char[] str2=st[l].toCharArray();
							int flag1=0,flag2=0;
							for(int y=0;y<str1.length;y++)
							{
								if(str2[y]==str1[y])
								{
									flag1++;
								}
							}
							int n=0;
							for(int y=str2.length-str1.length;y<str2.length;y++)
							{
								if(str2[y]==str1[n++])
								{
									flag2++;
								}
							}
							if(flag1+flag2==str1.length || flag1==str1.length ||flag2==str1.length)
							{
								count++;
							}
						}
						System.out.println(count);
					}
				}
			}
	}

}
