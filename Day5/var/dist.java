import java.util.*;
class dist
{
public static void main(String[] args) {
String s="yce";
String t="y6jsjbjkgvkje";
int error=0;
char ch[]=s.toCharArray();
char ch1[] =t.toCharArray();
int i,j;
int op;
if(s.length()<t.length()){
	op=(t.length())-(s.length());
	System.out.println(op);
}
else if(s.length()>t.length()){
op=(s.length())-(t.length());
System.out.println(op);
}
else {
for (i=0,j=0;i<ch1.length-1;i++,j++) {
	if(ch[i]==ch1[i]){

	}
	else{
		error=error+1;
		++j;
	}
}
System.out.println(error);
}}
}`