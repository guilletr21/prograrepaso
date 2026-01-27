import java.util.Scanner;

public class tarea2_2 {
    public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el día: ");
    int dia = sc.nextInt();
    System.out.print("Introduce el mes: ");
    int mes = sc.nextInt();
    System.out.print("Introduce el año: ");
    int ano = sc.nextInt();
                 dia = dia +=2;
            
    if(mes == 12 && (dia==30 && dia==31)){
        dia=dia-31;
        mes = 1;
        ano=ano+1;
    }
    
    switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
           
        if(mes == 12 && (dia==30 && dia==31)){
                dia=dia-31;
                mes = 1;
                ano=ano+1;
            }
            
            if(dia==30 && dia==31){
                dia=dia-31;
                mes =mes + 1;
            
            }
            break;
    
        case 4:
        case 6:
        case 9:
        case 11:
            if((dia ==29 || dia ==30))
            dia=dia-30;
            mes = mes+1;

        break;
            case 2:
             if((dia ==29 || dia ==30)){
            dia=dia-29;
            mes = mes+1;


        } else{
            if(dia==27 || dia ==28){
                dia = dia-28;
                mes = mes+1;

            }


    }
    
    
    
    
    
    }
    
    
    
    
    
    
dia =dia+2;
    
             System.out.println(dia+"/"+mes+"/"+ano);
            }
        }
    
    