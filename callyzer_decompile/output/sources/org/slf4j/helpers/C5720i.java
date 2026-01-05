package org.slf4j.helpers;

import f00.InterfaceC2172a;
import h00.InterfaceC2767c;
import h00.InterfaceC2769e;
import java.util.concurrent.ConcurrentHashMap;
import l4.d0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.i */
/* loaded from: classes3.dex */
public final class C5720i implements InterfaceC2769e {

    /* renamed from: a */
    public final C5719h f28202a = new C5719h();

    /* renamed from: b */
    public final d0 f28203b;

    public C5720i() {
        new ConcurrentHashMap();
        this.f28203b = new d0(10);
    }

    @Override // h00.InterfaceC2769e
    /* renamed from: a */
    public final InterfaceC2767c mo6763a() {
        return this.f28203b;
    }

    @Override // h00.InterfaceC2769e
    /* renamed from: b */
    public final InterfaceC2172a mo6764b() {
        return this.f28202a;
    }

    @Override // h00.InterfaceC2769e
    /* renamed from: c */
    public final String mo6765c() {
        throw new UnsupportedOperationException();
    }
}
