package Main;

import com.fasterxml.jackson.annotation.*;

@JsonRootName(value = "test")
@JsonIgnoreProperties
public class Test {

    @JsonProperty("patient_id")
    private int patient_id;

    @JsonProperty("test_type")
    private String test_type;

    @JsonProperty("date")
    private String date;

    @JsonProperty("test_accuracy")
    private String test_accuracy;

    @JsonProperty("laboratory_id")
    private String laboratory_id;

    @JsonProperty("result")
    private String result;

    public Test() {
    }

    public Test(int patient_id, String test_type, String date, String test_accuracy, String laboratory_id, String result) {
        this.patient_id = patient_id;
        this.test_type = test_type;
        this.date = date;
        this.test_accuracy = test_accuracy;
        this.laboratory_id = laboratory_id;
        this.result = result;
    }

    public int getPatient_id() {
        return patient_id;
    }

    @Override
    public String toString() {
        return "Test{" +
                "patient_id=" + patient_id +
                ", test_type='" + test_type + '\'' +
                ", date='" + date + '\'' +
                ", test_accuracy='" + test_accuracy + '\'' +
                ", laboratory_id='" + laboratory_id + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}

