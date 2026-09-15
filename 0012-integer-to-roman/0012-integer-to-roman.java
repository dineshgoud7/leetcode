class Solution {
    public static StringBuilder romanCal(StringBuilder sb,int n){
        if(n>=1000){
            while(n>=1000){
                sb.append("M");
                n=n-1000;
            }
            
        }else if(n<1000 && n>=500){
            if(n==900){
                    sb.append("CM");
                }else{
                    sb.append("D");
                    n-=500;
                    int c=n/100;
                    while(c!=0){
                        sb.append("C");
                        c--;
                }
            }
        }else if(n>=100 && n<500){
            if(n==400){
                sb.append("CD");
            }else{
                int c=n/100;
                    System.out.println(c);
                    while(c!=0){
                        sb.append("C");
                        c--;
                }
                
            }
        }else if(n<100 && n>=50){
            if(n==90){
                sb.append("XC");
            }else{
                sb.append("L");
                n=n-50;
                int c=n/10;
                while(c>0){
                    sb.append("X");
                    c--;
                }
            }
        }else if(n>=10 && n<50){
            if(n==40){
                sb.append("XL");
            }else{
                int c=n/10;
                while(c>0){
                    sb.append("X");
                    c--;
                }
            }
        }else{
            if(n==9){
                sb.append("IX");
            }else{
                if(n>=5){
                    sb.append("V");
                    n=n-5;
                    while(n>0){
                        sb.append("I");
                        n--;
                    }
                }else{
                    if(n==4){
                        sb.append("IV");
                    }else{
                        while(n>0){
                            sb.append("I");
                            n--;
                        }
                    }
                }
            }
        }
        return sb;
    }
    
    public static String intToRoman(int num) {
        List<Integer> list=new ArrayList<>();
        int count=1;
        while(num>0){
            int digit =num%10;
            digit*=count;
            list.add(digit);
            count*=10;
            num/=10;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            romanCal(sb,list.get(i));
        }
        return sb.toString();
    }
}