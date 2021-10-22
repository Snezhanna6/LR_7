package Main;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    private final static String fileXML = "Patients.xml";
    private final static String fileJSON = "test.json";

    public static void main(String[] args) {

        try {


            //Конвертация данных из xml файла
            Patient[] patients = Converter.XMLtoJavaObject(fileXML);


            //Конвертация данных из json файла
            Test[] tests = Converter.JSONtoJavaObject(fileJSON);


            //Вывод в консоль
            for (int i = 0; i < patients.length; i++) {
                System.out.println(patients[i]);
                System.out.println("Тесты пациента:");
                for (int j = 0; j < tests.length; j++){
                    if (patients[i].getPatient_id() == tests[j].getPatient_id())
                        System.out.println(tests[j]);
                }
                System.out.println("\n");
            }

            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
