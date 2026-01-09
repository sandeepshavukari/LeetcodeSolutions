public NumberOfSeniorCitizens() {
    public int countSeniors(String[] details) {
        int c=0,n=details.length;
        for(int i=0;i<n;i++)
        {
           int a=Integer.parseInt(details[i].substring(11,13));
            if(a >60)
           c++;
        }
        return c;
    }
}
