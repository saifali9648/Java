class Suparcar extends Car{
    private String alaram,navigator,safeGuardString;
    public void setAlaram(String a)
    {
        alaram=a;
    }
    public void getAlaram()
    {
        if(alaram.equals('y'))
        {
            System.out.println("yes");
        }
    }
    public void setNavigator(String n)
    {
        navigator=n;
    }
    public void getNavigator()
    {
        if (navigator.equals('y'))
         {
            System.out.println("yes");
        }
    }
    public void setSafeGuard(String sf)
    {
        safeGuardString=sf;
    }
    public void getSafeGuard()
    {
        if (safeGuardString.equals('y')) 
        {
         System.out.println("yes");   
        }
    }
}
