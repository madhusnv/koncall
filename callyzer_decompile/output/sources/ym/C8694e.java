package ym;

import j$.time.LocalDateTime;
import kk.AbstractC4092l;
import kk.C4095o;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.e */
/* loaded from: classes3.dex */
public final class C8694e implements InterfaceC4096p, InterfaceC4091k {

    /* renamed from: a */
    public static final C8694e f42063a = new C8694e();

    private C8694e() {
    }

    @Override // kk.InterfaceC4096p
    /* renamed from: a */
    public final C4095o mo7643a(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (localDateTime == null) {
            return null;
        }
        C8800o c8800o = C8800o.f42459a;
        return new C4095o(C8800o.m16212u(localDateTime));
    }

    @Override // kk.InterfaceC4091k
    /* renamed from: b */
    public final Object mo7644b(AbstractC4092l abstractC4092l) {
        if (abstractC4092l == null) {
            return null;
        }
        String strMo8868c = abstractC4092l.mo8868c();
        AbstractC4154l.m8922e(strMo8868c, "getAsString(...)");
        if (strMo8868c.length() <= 0) {
            return null;
        }
        C8800o c8800o = C8800o.f42459a;
        String strMo8868c2 = abstractC4092l.mo8868c();
        AbstractC4154l.m8922e(strMo8868c2, "getAsString(...)");
        return C8800o.m16183G(strMo8868c2);
    }
}
