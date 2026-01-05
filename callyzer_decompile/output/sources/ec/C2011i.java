package ec;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.i */
/* loaded from: classes.dex */
public final class C2011i implements InterfaceC2004b {

    /* renamed from: a */
    public static final C2011i f9543a = new C2011i();

    @Override // ec.InterfaceC2004b
    /* renamed from: a */
    public final boolean mo1861a(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        return false;
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: c */
    public final Set mo1863c() {
        return C6670t.f31945a;
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: e */
    public final Object mo1864e(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC2004b) && ((InterfaceC2004b) obj).isEmpty();
    }

    @Override // ec.InterfaceC2004b
    public final boolean isEmpty() {
        return true;
    }
}
