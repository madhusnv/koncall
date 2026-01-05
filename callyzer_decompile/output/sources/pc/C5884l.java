package pc;

import jc.AbstractC3741q;
import jc.AbstractC3745u;
import kotlin.jvm.internal.AbstractC4154l;
import nz.C5205p;
import og.od;
import tc.InterfaceC7116a;
import td.C7126c;
import tx.InterfaceC7266z;
import uc.C7394a;
import uw.InterfaceC7564h;
import wc.InterfaceC7989w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.l */
/* loaded from: classes.dex */
public final class C5884l implements InterfaceC7266z {

    /* renamed from: a */
    public final InterfaceC7116a f28690a;

    /* renamed from: b */
    public final C7394a f28691b;

    /* renamed from: c */
    public final C7126c f28692c;

    /* renamed from: d */
    public final C7126c f28693d;

    /* renamed from: e */
    public final InterfaceC7564h f28694e;

    /* renamed from: f */
    public final C5205p f28695f;

    public C5884l(InterfaceC7116a request, C7394a c7394a, C7126c c7126c, C7126c c7126c2, InterfaceC7564h coroutineContext, C5205p call) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(coroutineContext, "coroutineContext");
        AbstractC4154l.m8923f(call, "call");
        this.f28690a = request;
        this.f28691b = c7394a;
        this.f28692c = c7126c;
        this.f28693d = c7126c2;
        this.f28694e = coroutineContext;
        this.f28695f = call;
    }

    /* renamed from: b */
    public static C5884l m11501b(C5884l c5884l, C7394a response) {
        InterfaceC7116a request = c5884l.f28690a;
        c5884l.getClass();
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(response, "response");
        return new C5884l(request, response, c5884l.f28692c, c5884l.f28693d, c5884l.f28694e, c5884l.f28695f);
    }

    /* renamed from: a */
    public final void m11502a() {
        InterfaceC7989w from;
        try {
            AbstractC3745u abstractC3745u = this.f28691b.f35160c;
            AbstractC3741q abstractC3741q = abstractC3745u instanceof AbstractC3741q ? (AbstractC3741q) abstractC3745u : null;
            if (abstractC3741q != null && (from = abstractC3741q.readFrom()) != null) {
                from.cancel(null);
            }
        } catch (Throwable th2) {
            od.m10796a(th2);
        }
        this.f28695f.cancel();
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f28694e;
    }
}
