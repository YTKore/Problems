public class combo
{
  String guess_sequence(int N)
  {
    String s="";
    String l="ABXY";
    int p=new combo_lib();
    if(p.press("AB")>0)
    {
      if(p.press("A")==1)
      {
        s+="A";
        l="BXY";
      }
      else
      {
        s+="B";
        l="AXY";
      }
    }
    else
    {
      if(p.press("X")==1)
      {
        s+="X";
        l="ABY";
      }
      else
      {
        s+="Y";
        l="ABX";
      }
    }
    if(N==1)
    {
      return s;
    }
    while(s.length()<N-1)
    {
      int x=p.press(s+l.charAt(0)+l.charAt(0)+s+l.charAt(0)+l.charAt(1)+s+l.charAt(0)+l.charAt(2)+s+l.charAt(1));
      int lol=s.length();
      if(x==lol+2)
      s+=l.charAt(0);
      if(x==lol+1)
      s+=l.charAt(1);
      if(x==lol)
      s+=l.charAt(2);
    }
    if(p.press(s+l.charAt(0)+s+l.charAt(1))>s.length())
    {
      if(p.press(s+l.charAt(0))>s.length())
      s+=l.charAt(0);
      else
      s+=l.charAt(1);
    }
    else
    s+=l.charAt(2);
    return s;
  }
}
