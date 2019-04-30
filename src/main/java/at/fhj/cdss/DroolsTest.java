package at.fhj.cdss;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import at.fhj.cdss.pneumonia.BodyTemperatureFact;
import at.fhj.cdss.pneumonia.LeucocytosisFact;
import at.fhj.cdss.pneumonia.LeukopeniaFact;
import at.fhj.cdss.pneumonia.PBWimberleyFact;
import at.fhj.cdss.pneumonia.PneumoniaFact;
import at.fhj.cdss.pneumonia.RespiratorySymptomsFact;
import at.fhj.cdss.pneumonia.SymptomsFact;
import at.fhj.cdss.pneumonia.XRayFact;
import edu.uvm.ccts.arden.model.ABoolean;
import edu.uvm.ccts.arden.model.ANumber;
 
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {
	
    public static final void main(String[] args) {
        try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");
 
            CTDSIRSNotification notification = new CTDSIRSNotification(35, 89, 23, 33, 3965, 16);
//            CTD_SIRS_NotificationA2B notification1 = new CTD_SIRS_NotificationA2B(10, new ArdenNumber(39), new ArdenNumber(89), new ArdenNumber(23), new ArdenNumber(33), new ArdenNumber(3965), new ArdenNumber(16));
            CTD_SIRS_NotificationAM notification2 = new CTD_SIRS_NotificationAM(new ANumber(39), new ANumber(89), new ANumber(23), new ANumber(33), new ANumber(3965), new ANumber(16));

            
            //Pneumonia Test
            //Pneumonia Symptoms
            ANumber wbcount = new ANumber(3999);
            LeucocytosisFact lcf = new LeucocytosisFact(wbcount);
            LeukopeniaFact lpf = new LeukopeniaFact(wbcount);
            BodyTemperatureFact btf = new BodyTemperatureFact(new ANumber(39));
            RespiratorySymptomsFact rsf = new RespiratorySymptomsFact(new ABoolean(true), new ABoolean(true), new ABoolean(false));
            SymptomsFact smf = new SymptomsFact(btf, lpf, lcf, rsf);
            XRayFact xrf = new XRayFact(new ABoolean(true), new ABoolean(true), new ABoolean(true), new ABoolean(false), new ABoolean(false));
            PBWimberleyFact pbw = new PBWimberleyFact(new ANumber(12000));
            PneumoniaFact pnf = new PneumoniaFact(xrf, smf, pbw);
            
            kSession.insert(lcf);
            kSession.insert(lpf);
            kSession.insert(btf);
            kSession.insert(rsf);
            kSession.insert(smf);
            kSession.insert(xrf);
            kSession.insert(pbw);
            kSession.insert(pnf);
            kSession.insert(notification);
//            kSession.insert(notification1);
            kSession.insert(notification2);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}