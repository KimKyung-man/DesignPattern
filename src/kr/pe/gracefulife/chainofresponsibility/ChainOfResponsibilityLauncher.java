package kr.pe.gracefulife.chainofresponsibility;

import kr.pe.gracefulife.Starter;
import kr.pe.gracefulife.chainofresponsibility.handler.*;

import java.util.ArrayList;
import java.util.List;

import static kr.pe.gracefulife.chainofresponsibility.Trouble.*;

/**
 * Created by Gracefulife on 2016-02-14.
 */
public class ChainOfResponsibilityLauncher implements Starter {

    public void start() {
        Supporter bugSupporter = new BugSupporter("BUG SUPPORTER");
        Supporter errorSupporter = new ErrorSupporter("ERROR SUPPORTER");
        Supporter faultSupporter = new FaultSupporter("FAULT SUPPORTER");

        faultSupporter.setNextItem(errorSupporter).setNextItem(bugSupporter);

        generateDefaultTroubleList().forEach(faultSupporter::support);
    }

    public List<Trouble> generateDefaultTroubleList() {
        System.out.println("generateDefaultTroubleList");
        List<Trouble> list = new ArrayList<>();
        list.add(new Trouble(CODE_BUG, "BUG ! "));
        list.add(new Trouble(CODE_ERROR, "ERROR ! "));
        list.add(new Trouble(CODE_FAILURE, "FAILURE ! "));
        list.add(new Trouble(CODE_FAULT, "FAULT ! "));
        return list;
    }
}
