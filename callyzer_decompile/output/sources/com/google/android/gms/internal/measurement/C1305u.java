package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.Arrays;
import java.util.Comparator;
import og.sa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes.dex */
public final class C1305u implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1292h f6400a;

    /* renamed from: b */
    public final /* synthetic */ C0919n f6401b;

    public C1305u(AbstractC1292h abstractC1292h, C0919n c0919n) {
        this.f6400a = abstractC1292h;
        this.f6401b = c0919n;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC1298n interfaceC1298n = (InterfaceC1298n) obj;
        InterfaceC1298n interfaceC1298n2 = (InterfaceC1298n) obj2;
        if (interfaceC1298n instanceof C1302r) {
            return !(interfaceC1298n2 instanceof C1302r) ? 1 : 0;
        }
        if (interfaceC1298n2 instanceof C1302r) {
            return -1;
        }
        AbstractC1292h abstractC1292h = this.f6400a;
        return abstractC1292h == null ? interfaceC1298n.mo3210b().compareTo(interfaceC1298n2.mo3210b()) : (int) sa.m10899l(abstractC1292h.mo3299d(this.f6401b, Arrays.asList(interfaceC1298n, interfaceC1298n2)).mo3212e().doubleValue());
    }
}
