package ji;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.x0;
import pi.InterfaceC5966a;
import pi.InterfaceC5967b;
import pi.InterfaceC5968c;
import pi.InterfaceC5969d;
import qi.C6234q;
import qi.InterfaceC6222e;
import tx.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.h */
/* loaded from: classes.dex */
public final class C3774h implements InterfaceC6222e {

    /* renamed from: b */
    public static final C3774h f19672b = new C3774h(0);

    /* renamed from: c */
    public static final C3774h f19673c = new C3774h(1);

    /* renamed from: d */
    public static final C3774h f19674d = new C3774h(2);

    /* renamed from: e */
    public static final C3774h f19675e = new C3774h(3);

    /* renamed from: a */
    public final /* synthetic */ int f19676a;

    public /* synthetic */ C3774h(int i10) {
        this.f19676a = i10;
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public final Object mo21h(x0 x0Var) {
        switch (this.f19676a) {
            case 0:
                Object objMo12237d = x0Var.mo12237d(new C6234q(InterfaceC5966a.class, Executor.class));
                AbstractC4154l.m8922e(objMo12237d, "get(...)");
                return c0.m13492o((Executor) objMo12237d);
            case 1:
                Object objMo12237d2 = x0Var.mo12237d(new C6234q(InterfaceC5968c.class, Executor.class));
                AbstractC4154l.m8922e(objMo12237d2, "get(...)");
                return c0.m13492o((Executor) objMo12237d2);
            case 2:
                Object objMo12237d3 = x0Var.mo12237d(new C6234q(InterfaceC5967b.class, Executor.class));
                AbstractC4154l.m8922e(objMo12237d3, "get(...)");
                return c0.m13492o((Executor) objMo12237d3);
            default:
                Object objMo12237d4 = x0Var.mo12237d(new C6234q(InterfaceC5969d.class, Executor.class));
                AbstractC4154l.m8922e(objMo12237d4, "get(...)");
                return c0.m13492o((Executor) objMo12237d4);
        }
    }
}
