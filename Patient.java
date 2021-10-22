package Main;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Patient {

    @JsonProperty("patient_id")
    private long patient_id;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("name")
    private String name;

    @JsonProperty("patronymic")
    private String patronymic;

    @JsonProperty("birthday")
    private String birthday;

    @JsonProperty("insurancepolicynumber")
    private String insurancepolicynumber;

    public Patient() {
    }

    public Patient(long patient_id, String surname, String name, String patronymic, String birthday, String insurancepolicynumber) {
        this.patient_id = patient_id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.insurancepolicynumber = insurancepolicynumber;
    }

    public long getPatient_id() {
        return patient_id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id=" + patient_id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", insurancepolicynumber='" + insurancepolicynumber + '\'' +
                '}';
    }
}
