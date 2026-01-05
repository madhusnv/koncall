package lombok.installer.eclipse;

import com.amazonaws.regions.ServiceAbbreviations;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: salesmax.apk:lombok/installer/eclipse/STS4LocationProvider.SCL.lombok */
public class STS4LocationProvider extends EclipseProductLocationProvider {
    private static final EclipseProductDescriptor STS4 = new StandardProductDescriptor("Spring Tools Suite 4", "SpringToolSuite4", ServiceAbbreviations.STS, STS4LocationProvider.class.getResource("STS.png"), Collections.unmodifiableList(Arrays.asList("springsource", "spring-tool-suite")));

    public STS4LocationProvider() {
        super(STS4);
    }
}
