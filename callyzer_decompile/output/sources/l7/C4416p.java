package l7;

import android.os.Bundle;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C4416p implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f22092a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f22093b;

    public /* synthetic */ C4416p(int i10, Bundle bundle) {
        this.f22092a = i10;
        this.f22093b = bundle;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        String argName = (String) obj;
        switch (this.f22092a) {
            case 0:
                AbstractC4154l.m8923f(argName, "argName");
                Bundle source = this.f22093b;
                AbstractC4154l.m8923f(source, "source");
                zContainsKey = source.containsKey(argName);
                break;
            default:
                AbstractC4154l.m8923f(argName, "key");
                Bundle source2 = this.f22093b;
                AbstractC4154l.m8923f(source2, "source");
                zContainsKey = source2.containsKey(argName);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
