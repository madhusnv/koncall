package ym;

import j$.time.LocalDate;
import kk.AbstractC4092l;
import kk.C4095o;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.f */
/* loaded from: classes3.dex */
public final class C8695f implements InterfaceC4096p, InterfaceC4091k {

    /* renamed from: a */
    public static final C8695f f42064a = new C8695f();

    private C8695f() {
    }

    @Override // kk.InterfaceC4096p
    /* renamed from: a */
    public final C4095o mo7643a(Object obj) {
        LocalDate localDate = (LocalDate) obj;
        if (localDate == null) {
            return null;
        }
        C8800o c8800o = C8800o.f42459a;
        return new C4095o(C8800o.m16197f(localDate));
    }

    @Override // kk.InterfaceC4091k
    /* renamed from: b */
    public final Object mo7644b(AbstractC4092l abstractC4092l) {
        if (abstractC4092l == null) {
            return null;
        }
        C8800o c8800o = C8800o.f42459a;
        String strMo8868c = abstractC4092l.mo8868c();
        AbstractC4154l.m8922e(strMo8868c, "getAsString(...)");
        LocalDate localDate = LocalDate.parse(strMo8868c, C8800o.f42461c);
        AbstractC4154l.m8922e(localDate, "parse(...)");
        return localDate;
    }
}
