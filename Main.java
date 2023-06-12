import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

            HayvanlarRepository hayvanlarRepository = new HayvanlarRepository();
            Turler turler = new Turler();
            TurlerRepository turlerRepository = new TurlerRepository();
            Hayvanlar hayvanlar = new Hayvanlar();

            System.out.println("Hayvan işlemleri için 1, tür işlemleri içim 2 giriniz: ");
            Scanner input = new Scanner(System.in);
            char secim = input.next().charAt(0);


            while(true){
                    switch(secim){
                            case'1':
                            {System.out.println("Ekleme için 1, silme için 2, listeleme için 3 seçin:");
                                    char secim2 = input.next().charAt(0);
                                switch(secim2){
                                        case'1':
                                                hayvanlar.name=input.next();
                                                hayvanlar.Id=input.nextInt();
                                                hayvanlar.isStatus=true;
                                                hayvanlar.isDelete=false;
                                                hayvanlarRepository.add(hayvanlar);
                                                break;
                                        case '2':
                                                hayvanlarRepository.delete(hayvanlar);
                                                break;
                                        case '3':
                                                hayvanlarRepository.list();
                                                break;
                                        default:
                                                break;}
                                break;
                                }
                            case'2':
                                    System.out.println("Ekleme için 1, silme için 2, listeleme için 3 seçin:");
                                    char secim3 = input.next().charAt(0);
                                    switch (secim3){
                                            case'1':
                                                    turler.Id= input.nextInt();
                                                    turler.name=input.next();
                                                    turlerRepository.add(turler);
                                                    break;
                                            case'2':
                                                    turlerRepository.delete(turler);
                                                    break;
                                            case'3':
                                                    turlerRepository.list();
                                                    break;
                                            default:
                                                    break;


                                    }



                    }
            }




}}