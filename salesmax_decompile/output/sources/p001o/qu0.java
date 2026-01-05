package p001o;

import android.location.Location;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class qu0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Double.valueOf(((Location) obj).getLongitude());
    }
}
