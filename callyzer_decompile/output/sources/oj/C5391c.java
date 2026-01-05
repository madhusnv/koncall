package oj;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import ji.C3769c;
import pg.l8;
import pg.p7;
import qi.C6230m;
import qj.InterfaceC6237b;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oj.c */
/* loaded from: classes.dex */
public final class C5391c implements InterfaceC5393e, InterfaceC5395g {

    /* renamed from: a */
    public final C6230m f27073a;

    /* renamed from: b */
    public final Context f27074b;

    /* renamed from: c */
    public final InterfaceC6237b f27075c;

    /* renamed from: d */
    public final Set f27076d;

    /* renamed from: e */
    public final Executor f27077e;

    public C5391c(Context context, String str, Set set, InterfaceC6237b interfaceC6237b, Executor executor) {
        this.f27073a = new C6230m(new C3769c(context, str));
        this.f27076d = set;
        this.f27077e = executor;
        this.f27075c = interfaceC6237b;
        this.f27074b = context;
    }

    /* renamed from: a */
    public final C8656m m11107a() {
        if (!p7.m11823c(this.f27074b)) {
            return l8.m11765f("");
        }
        return l8.m11762c(this.f27077e, new CallableC5390b(this, 0));
    }

    /* renamed from: b */
    public final void m11108b() {
        if (this.f27076d.size() <= 0) {
            l8.m11765f(null);
        } else if (!p7.m11823c(this.f27074b)) {
            l8.m11765f(null);
        } else {
            l8.m11762c(this.f27077e, new CallableC5390b(this, 1));
        }
    }
}
