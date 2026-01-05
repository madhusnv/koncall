package org.slf4j.helpers;

import f00.InterfaceC2172a;
import h00.InterfaceC2767c;
import h00.InterfaceC2769e;
import java.util.concurrent.ConcurrentHashMap;
import ph.C5950e;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.c */
/* loaded from: classes3.dex */
public final class C5714c implements InterfaceC2769e {

    /* renamed from: a */
    public final C5950e f28188a;

    /* renamed from: b */
    public final C8687a f28189b;

    public C5714c() {
        int i10 = 22;
        this.f28188a = new C5950e(i10);
        new ConcurrentHashMap();
        this.f28189b = new C8687a(i10);
    }

    @Override // h00.InterfaceC2769e
    /* renamed from: a */
    public final InterfaceC2767c mo6763a() {
        return this.f28189b;
    }

    @Override // h00.InterfaceC2769e
    /* renamed from: b */
    public final InterfaceC2172a mo6764b() {
        return this.f28188a;
    }

    @Override // h00.InterfaceC2769e
    /* renamed from: c */
    public final String mo6765c() {
        return "2.0.99";
    }
}
