package s1;

import n1.AbstractC4941a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.h */
/* loaded from: classes.dex */
public final class C6713h {

    /* renamed from: a */
    public final int f32068a;

    /* renamed from: b */
    public final int f32069b;

    /* renamed from: c */
    public final InterfaceC6722q f32070c;

    public C6713h(int i10, int i11, InterfaceC6722q interfaceC6722q) {
        this.f32068a = i10;
        this.f32069b = i11;
        this.f32070c = interfaceC6722q;
        if (i10 < 0) {
            AbstractC4941a.m9884a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        AbstractC4941a.m9884a("size should be > 0");
    }
}
