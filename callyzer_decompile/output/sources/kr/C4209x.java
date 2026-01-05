package kr;

import ex.InterfaceC2137a;
import java.util.Iterator;
import k2.w0;
import or.C5454q;
import sw.C6957a;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.x */
/* loaded from: classes3.dex */
public final class C4209x implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ boolean f21327a;

    /* renamed from: b */
    public final /* synthetic */ C7320q f21328b;

    /* renamed from: c */
    public final /* synthetic */ w0 f21329c;

    public C4209x(boolean z6, C7320q c7320q, w0 w0Var) {
        this.f21327a = z6;
        this.f21328b = c7320q;
        this.f21329c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        C6957a c6957a;
        if (this.f21327a) {
            C7320q c7320q = this.f21328b;
            if (c7320q != null && c7320q.isEmpty()) {
                this.f21329c.setValue(Boolean.FALSE);
                break;
            }
            Iterator it = c7320q.iterator();
            do {
                c6957a = (C6957a) it;
                if (!c6957a.hasNext()) {
                    this.f21329c.setValue(Boolean.FALSE);
                    break;
                }
            } while (!((C5454q) c6957a.next()).f27493c);
        }
        return qw.a0.f30746a;
    }
}
