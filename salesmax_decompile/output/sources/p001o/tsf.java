package p001o;

import android.telecom.PhoneAccountHandle;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class tsf implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f47675a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return (PhoneAccountHandle) this.f47675a.get(((Integer) obj).intValue());
    }
}
