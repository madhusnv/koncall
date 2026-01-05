package g7;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g7.d */
/* loaded from: classes.dex */
public final class C2539d extends AbstractC2538c {
    public C2539d(AbstractC2538c initialExtras) {
        AbstractC4154l.m8923f(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f13868a;
        AbstractC4154l.m8923f(initialExtras2, "initialExtras");
        this.f13868a.putAll(initialExtras2);
    }

    @Override // g7.AbstractC2538c
    /* renamed from: a */
    public final Object mo6562a(InterfaceC2537b interfaceC2537b) {
        return this.f13868a.get(interfaceC2537b);
    }

    public /* synthetic */ C2539d(int i10) {
        this(C2536a.f13867b);
    }
}
