package c4;

import ad.C0108o;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4143a;
import m2.C4640e;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0860j extends C4143a implements InterfaceC2139c {

    /* renamed from: h */
    public final /* synthetic */ int f5401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0860j(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f5401h = i12;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5401h) {
            case 0:
                ((C4640e) this.f21147a).m9506b((C0862l) obj);
                return a0.f30746a;
            case 1:
                String p02 = (String) obj;
                AbstractC4154l.m8923f(p02, "p0");
                return C0108o.m297a((C0108o) this.f21147a, p02);
            default:
                String p03 = (String) obj;
                AbstractC4154l.m8923f(p03, "p0");
                return C0108o.m297a((C0108o) this.f21147a, p03);
        }
    }
}
