package p3;

import a3.C0045d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import k9.C4032f;
import m2.C4640e;
import pg.n6;
import s4.InterfaceC6747c;
import tx.C7251k;
import tx.s1;
import uw.C7566j;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import v3.u1;
import vw.EnumC7794a;
import w2.AbstractC7878q;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends AbstractC7878q implements InterfaceC5822t, InterfaceC6747c, u1 {

    /* renamed from: B */
    public C5812j f28454B;

    /* renamed from: C */
    public long f28455C;

    /* renamed from: q */
    public Object f28456q;

    /* renamed from: r */
    public Object f28457r;

    /* renamed from: s */
    public AbstractC8199i f28458s;

    /* renamed from: t */
    public PointerInputEventHandler f28459t;

    /* renamed from: v */
    public s1 f28460v;

    /* renamed from: w */
    public C5812j f28461w = b0.f28413a;

    /* renamed from: x */
    public final C4640e f28462x;

    /* renamed from: y */
    public final C4640e f28463y;

    /* renamed from: z */
    public final C4640e f28464z;

    public h0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f28456q = obj;
        this.f28457r = obj2;
        this.f28459t = pointerInputEventHandler;
        C4640e c4640e = new C4640e(new f0[16]);
        this.f28462x = c4640e;
        this.f28463y = c4640e;
        this.f28464z = new C4640e(new f0[16]);
        this.f28455C = 0L;
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        N0();
    }

    public final Object L0(InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        f0 f0Var = new f0(this, c7251k);
        synchronized (this.f28463y) {
            this.f28462x.m9506b(f0Var);
            new C7566j(n6.m11797c(n6.m11795a(interfaceC2141e, f0Var, f0Var)), EnumC7794a.COROUTINE_SUSPENDED).resumeWith(qw.a0.f30746a);
        }
        c7251k.m13542t(new C0045d(26, f0Var));
        return c7251k.m13539o();
    }

    public final void M0(C5812j c5812j, EnumC5813k enumC5813k) {
        C7251k c7251k;
        C7251k c7251k2;
        synchronized (this.f28463y) {
            C4640e c4640e = this.f28464z;
            c4640e.m9507c(c4640e.f22886c, this.f28462x);
        }
        try {
            int i10 = g0.f28445a[enumC5813k.ordinal()];
            if (i10 == 1 || i10 == 2) {
                C4640e c4640e2 = this.f28464z;
                Object[] objArr = c4640e2.f22884a;
                int i11 = c4640e2.f22886c;
                for (int i12 = 0; i12 < i11; i12++) {
                    f0 f0Var = (f0) objArr[i12];
                    if (enumC5813k == f0Var.f28442d && (c7251k = f0Var.f28441c) != null) {
                        f0Var.f28441c = null;
                        c7251k.resumeWith(c5812j);
                    }
                }
            } else if (i10 == 3) {
                C4640e c4640e3 = this.f28464z;
                int i13 = c4640e3.f22886c - 1;
                Object[] objArr2 = c4640e3.f22884a;
                if (i13 < objArr2.length) {
                    while (i13 >= 0) {
                        f0 f0Var2 = (f0) objArr2[i13];
                        if (enumC5813k == f0Var2.f28442d && (c7251k2 = f0Var2.f28441c) != null) {
                            f0Var2.f28441c = null;
                            c7251k2.resumeWith(c5812j);
                        }
                        i13--;
                    }
                }
            }
        } finally {
            this.f28464z.m9511h();
        }
    }

    public final void N0() {
        s1 s1Var = this.f28460v;
        if (s1Var != null) {
            s1Var.mo13566p(new PointerInputResetException());
            this.f28460v = null;
        }
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return AbstractC7634f.m14563x(this).f36825C.mo154O();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        this.f28455C = j6;
        if (enumC5813k == EnumC5813k.Initial) {
            this.f28461w = c5812j;
        }
        InterfaceC7559c interfaceC7559c = null;
        if (this.f28460v == null) {
            this.f28460v = tx.c0.m13502y(z0(), null, tx.b0.UNDISPATCHED, new C4032f(this, interfaceC7559c, 3), 1);
        }
        M0(c5812j, enumC5813k);
        ?? r52 = c5812j.f28467a;
        int size = r52.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c5812j = null;
                break;
            } else if (!AbstractC5818p.m11399c((C5819q) r52.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        this.f28454B = c5812j;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return AbstractC7634f.m14563x(this).f36825C.mo155a();
    }

    @Override // v3.InterfaceC7641m
    /* renamed from: c */
    public final void mo153c() {
        N0();
    }

    @Override // v3.u1
    public final void m0() {
        N0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        C5812j c5812j = this.f28454B;
        if (c5812j == null) {
            return;
        }
        ?? r12 = c5812j.f28467a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C5819q) r12.get(i10)).f28479d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    C5819q c5819q = (C5819q) r12.get(i11);
                    long j6 = c5819q.f28476a;
                    long j10 = c5819q.f28478c;
                    long j11 = c5819q.f28477b;
                    float f6 = c5819q.f28480e;
                    boolean z6 = c5819q.f28479d;
                    arrayList.add(new C5819q(j6, j11, j10, false, f6, j11, j10, z6, z6, c5819q.f28484i, 0L));
                }
                C5812j c5812j2 = new C5812j(arrayList, null);
                this.f28461w = c5812j2;
                M0(c5812j2, EnumC5813k.Initial);
                M0(c5812j2, EnumC5813k.Main);
                M0(c5812j2, EnumC5813k.Final);
                this.f28454B = null;
                return;
            }
        }
    }
}
