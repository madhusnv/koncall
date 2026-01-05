package bd;

import ec.C2003a;
import ec.C2005c;
import ec.InterfaceC2016n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.ud;
import tx.InterfaceC7266z;
import tx.c0;
import tx.f1;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bd.a */
/* loaded from: classes.dex */
public final class C0645a implements InterfaceC2016n, InterfaceC7266z {

    /* renamed from: a */
    public final /* synthetic */ C2005c f4116a;

    /* renamed from: b */
    public final f1 f4117b;

    /* renamed from: c */
    public final C2005c f4118c;

    public C0645a() {
        C2005c c2005cM10980f = ud.m10980f();
        this.f4116a = c2005cM10980f;
        this.f4117b = c0.m13480c();
        this.f4118c = c2005cM10980f;
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: a */
    public final boolean mo1861a(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        return this.f4116a.mo1861a(key);
    }

    @Override // ec.InterfaceC2016n
    /* renamed from: b */
    public final void mo1862b(C2003a key, Object value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.f4116a.mo1862b(key, value);
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: c */
    public final Set mo1863c() {
        return this.f4116a.f9534a.keySet();
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: e */
    public final Object mo1864e(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        return this.f4116a.mo1864e(key);
    }

    @Override // ec.InterfaceC2004b
    public final boolean isEmpty() {
        return this.f4116a.f9534a.isEmpty();
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f4117b;
    }
}
