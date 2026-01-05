package q7;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4419s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q7.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C6139f implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f29933a;

    /* renamed from: b */
    public final /* synthetic */ C4419s f29934b;

    public /* synthetic */ C6139f(C4419s c4419s, int i10) {
        this.f29933a = i10;
        this.f29934b = c4419s;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        boolean zContains;
        String key = (String) obj;
        switch (this.f29933a) {
            case 0:
                AbstractC4154l.m8923f(key, "key");
                zContains = this.f29934b.m9240c().contains(key);
                break;
            default:
                AbstractC4154l.m8923f(key, "key");
                zContains = this.f29934b.m9240c().contains(key);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
