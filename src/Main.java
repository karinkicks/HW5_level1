public class Main {

    public static void main(String[] args) {
	Employer[] employers = new Employer[5];
	employers[0]=new Employer("FIO0","position0","mail0",0,0,10);
        employers[1]=new Employer("FIO1","position1","mail1",1,1,11);
        employers[2]=new Employer("FIO2","position2","mail2",2,2,21);
        employers[3]=new Employer("FIO3","position3","mail3",3,3,31);
        employers[4]=new Employer("FIO4","position4","mail4",4,4,41);
        for(int i=0;i<employers.length;i++){
            if(employers[i].age>40){
                System.out.println(employers[i]);
            }
        }
    }

}
