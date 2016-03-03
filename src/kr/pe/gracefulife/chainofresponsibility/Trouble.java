package kr.pe.gracefulife.chainofresponsibility;

import kr.pe.gracefulife.IdentifierGenerator;

/**
 * Created by Gracefulife on 2016-02-14.
 */
public class Trouble {
    public static final String CODE_BUG = "bug";
    public static final String CODE_ERROR = "error";
    public static final String CODE_FAULT = "fault";
    public static final String CODE_FAILURE = "failure";

    private int id;
    private String troubleCode;
    private String description;

    public Trouble(String troubleCode, String description) {
        this.id = IdentifierGenerator.generate();
        this.troubleCode = troubleCode;
        this.description = description;
    }

    public String getTroubleCode() {
        return troubleCode;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", troubleCode='" + troubleCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
