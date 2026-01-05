package yx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import qw.C6364n;
import tx.AbstractC7262v;
import tx.C7260t;
import tx.c0;
import tx.k0;
import tx.w0;
import tx.w1;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;
import ww.InterfaceC8194d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.f */
/* loaded from: classes3.dex */
public final class C8812f extends k0 implements InterfaceC8194d, InterfaceC7559c {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42490h = AtomicReferenceFieldUpdater.newUpdater(C8812f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d */
    public final AbstractC7262v f42491d;

    /* renamed from: e */
    public final AbstractC8193c f42492e;

    /* renamed from: f */
    public Object f42493f;

    /* renamed from: g */
    public final Object f42494g;

    public C8812f(AbstractC7262v abstractC7262v, AbstractC8193c abstractC8193c) {
        super(-1);
        this.f42491d = abstractC7262v;
        this.f42492e = abstractC8193c;
        this.f42493f = AbstractC8808b.f42480b;
        this.f42494g = AbstractC8808b.m16255o(abstractC8193c.getContext());
    }

    @Override // ww.InterfaceC8194d
    public final InterfaceC8194d getCallerFrame() {
        return this.f42492e;
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f42492e.getContext();
    }

    @Override // tx.k0
    /* renamed from: h */
    public final Object mo13533h() {
        Object obj = this.f42493f;
        this.f42493f = AbstractC8808b.f42480b;
        return obj;
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM12363a = C6364n.m12363a(obj);
        Object c7260t = thM12363a == null ? obj : new C7260t(thM12363a, false);
        AbstractC8193c abstractC8193c = this.f42492e;
        InterfaceC7564h context = abstractC8193c.getContext();
        AbstractC7262v abstractC7262v = this.f42491d;
        if (AbstractC8808b.m16252l(abstractC7262v, context)) {
            this.f42493f = c7260t;
            this.f34652c = 0;
            AbstractC8808b.m16251k(abstractC7262v, abstractC8193c.getContext(), this);
            return;
        }
        w0 w0VarM13577a = w1.m13577a();
        if (w0VarM13577a.f34691c >= 4294967296L) {
            this.f42493f = c7260t;
            this.f34652c = 0;
            w0VarM13577a.G0(this);
            return;
        }
        w0VarM13577a.I0(true);
        try {
            InterfaceC7564h context2 = abstractC8193c.getContext();
            Object objM16256p = AbstractC8808b.m16256p(context2, this.f42494g);
            try {
                abstractC8193c.resumeWith(obj);
                while (w0VarM13577a.K0()) {
                }
            } finally {
                AbstractC8808b.m16249i(context2, objM16256p);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f42491d + ", " + c0.m13471G(this.f42492e) + ']';
    }

    @Override // tx.k0
    /* renamed from: c */
    public final InterfaceC7559c mo13530c() {
        return this;
    }
}
