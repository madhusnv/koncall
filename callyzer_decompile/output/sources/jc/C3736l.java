package jc;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.l */
/* loaded from: classes.dex */
public final class C3736l implements InterfaceC3732h {

    /* renamed from: c */
    public static final C3736l f19593c = new C3736l();

    @Override // ec.InterfaceC2023u
    /* renamed from: a */
    public final Set mo5747a() {
        return C6670t.f31945a;
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: c */
    public final boolean mo5749c() {
        return true;
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: d */
    public final List mo5750d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return C6668r.f31943a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC3732h) && ((InterfaceC3732h) obj).isEmpty();
    }

    @Override // ec.InterfaceC2023u
    public final boolean isEmpty() {
        return true;
    }
}
