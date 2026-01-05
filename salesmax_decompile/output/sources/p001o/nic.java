package p001o;

import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class nic implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((List) obj).isEmpty());
    }
}
