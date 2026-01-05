package p001o;

import java.util.function.Function;
import type.ContactAssignmentStatus;

/* loaded from: classes.dex */
public final /* synthetic */ class pu2 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ContactAssignmentStatus.valueOf((String) obj);
    }
}
