package fc;

import ex.InterfaceC2139c;
import fx.InterfaceC2395a;
import fx.InterfaceC2398d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4145c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.d */
/* loaded from: classes.dex */
public final class C2256d implements InterfaceC2398d, Map.Entry, InterfaceC2395a {

    /* renamed from: a */
    public final Map.Entry f10248a;

    /* renamed from: b */
    public final AbstractC4145c f10249b;

    /* renamed from: c */
    public final InterfaceC2139c f10250c;

    /* renamed from: d */
    public final Map.Entry f10251d;

    /* renamed from: e */
    public final InterfaceC2139c f10252e;

    /* renamed from: f */
    public final InterfaceC2139c f10253f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2256d(Map.Entry src, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3) {
        AbstractC4154l.m8923f(src, "src");
        this.f10248a = src;
        this.f10249b = (AbstractC4145c) interfaceC2139c;
        this.f10250c = interfaceC2139c2;
        this.f10251d = src;
        this.f10252e = interfaceC2139c2;
        this.f10253f = interfaceC2139c3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ex.c, kotlin.jvm.internal.c] */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10249b.invoke(this.f10248a.getKey());
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10250c.invoke(this.f10248a.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        return this.f10252e.invoke(this.f10251d.setValue(this.f10253f.invoke(obj)));
    }
}
