package p001o;

import com.amplifyframework.datastore.generated.model.Priority;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gy extends dxi {
    /* renamed from: f */
    public final List m29636f() {
        Priority[] priorityArrValues = Priority.values();
        ArrayList arrayList = new ArrayList(priorityArrValues.length);
        for (Priority priority : priorityArrValues) {
            arrayList.add(priority.name());
        }
        return arrayList;
    }
}
