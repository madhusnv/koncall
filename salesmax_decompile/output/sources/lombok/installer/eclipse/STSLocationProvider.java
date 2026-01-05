package lombok.installer.eclipse;

import com.amazonaws.regions.ServiceAbbreviations;
import java.util.Collections;

/* loaded from: salesmax.apk:lombok/installer/eclipse/STSLocationProvider.SCL.lombok */
public class STSLocationProvider extends EclipseProductLocationProvider {
    private static final EclipseProductDescriptor STS = new StandardProductDescriptor("STS", "STS", ServiceAbbreviations.STS, STSLocationProvider.class.getResource("STS.png"), Collections.singleton("springsource"));

    public STSLocationProvider() {
        super(STS);
    }
}
