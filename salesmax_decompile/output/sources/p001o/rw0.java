package p001o;

import ai.salesmax.model.AttendanceSummary;
import com.amplifyframework.datastore.generated.model.Attendance;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class rw0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new AttendanceSummary((Attendance) obj);
    }
}
