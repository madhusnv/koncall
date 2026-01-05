package u2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.r */
/* loaded from: classes.dex */
public abstract class AbstractC7321r {

    /* renamed from: a */
    public static final Object f34905a = new Object();

    /* renamed from: b */
    public static final Object f34906b = new Object();

    /* renamed from: a */
    public static final void m13704a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    /* renamed from: b */
    public static final int m13705b(long[] jArr, long j6) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j10 = jArr[i11];
            if (j6 > j10) {
                i10 = i11 + 1;
            } else {
                if (j6 >= j10) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: c */
    public static AbstractC7311h m13706c() {
        return (AbstractC7311h) AbstractC7316m.f34889a.m9138r();
    }

    /* renamed from: d */
    public static AbstractC7311h m13707d(AbstractC7311h abstractC7311h) {
        if (abstractC7311h instanceof c0) {
            c0 c0Var = (c0) abstractC7311h;
            if (c0Var.f34852t == AbstractC6740i.m12900b()) {
                c0Var.f34850r = null;
                return abstractC7311h;
            }
        }
        if (abstractC7311h instanceof d0) {
            d0 d0Var = (d0) abstractC7311h;
            if (d0Var.f34866h == AbstractC6740i.m12900b()) {
                d0Var.f34865g = null;
                return abstractC7311h;
            }
        }
        AbstractC7311h abstractC7311hM13683h = AbstractC7316m.m13683h(abstractC7311h, null, false);
        abstractC7311hM13683h.m13669j();
        return abstractC7311hM13683h;
    }

    /* renamed from: e */
    public static Object m13708e(InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c) {
        AbstractC7311h c0Var;
        if (interfaceC2139c == null) {
            return interfaceC2137a.invoke();
        }
        AbstractC7311h abstractC7311h = (AbstractC7311h) AbstractC7316m.f34889a.m9138r();
        if (abstractC7311h instanceof c0) {
            c0 c0Var2 = (c0) abstractC7311h;
            if (c0Var2.f34852t == AbstractC6740i.m12900b()) {
                InterfaceC2139c interfaceC2139c2 = c0Var2.f34850r;
                InterfaceC2139c interfaceC2139c3 = c0Var2.f34851s;
                try {
                    ((c0) abstractC7311h).f34850r = AbstractC7316m.m13687l(interfaceC2139c, interfaceC2139c2, true);
                    ((c0) abstractC7311h).f34851s = interfaceC2139c3;
                    return interfaceC2137a.invoke();
                } finally {
                    c0Var2.f34850r = interfaceC2139c2;
                    c0Var2.f34851s = interfaceC2139c3;
                }
            }
        }
        if (abstractC7311h == null || (abstractC7311h instanceof C7307d)) {
            c0Var = new c0(abstractC7311h instanceof C7307d ? (C7307d) abstractC7311h : null, interfaceC2139c, null, true, false);
        } else {
            if (interfaceC2139c == null) {
                return interfaceC2137a.invoke();
            }
            c0Var = abstractC7311h.mo13645u(interfaceC2139c);
        }
        try {
            AbstractC7311h abstractC7311hM13669j = c0Var.m13669j();
            try {
                Object objInvoke = interfaceC2137a.invoke();
                AbstractC7311h.m13667q(abstractC7311hM13669j);
                c0Var.mo13641c();
                return objInvoke;
            } catch (Throwable th2) {
                AbstractC7311h.m13667q(abstractC7311hM13669j);
                throw th2;
            }
        } catch (Throwable th3) {
            c0Var.mo13641c();
            throw th3;
        }
    }

    /* renamed from: f */
    public static void m13709f(AbstractC7311h abstractC7311h, AbstractC7311h abstractC7311h2, InterfaceC2139c interfaceC2139c) {
        if (abstractC7311h != abstractC7311h2) {
            abstractC7311h2.getClass();
            AbstractC7311h.m13667q(abstractC7311h);
            abstractC7311h2.mo13641c();
        } else if (abstractC7311h instanceof c0) {
            ((c0) abstractC7311h).f34850r = interfaceC2139c;
        } else if (abstractC7311h instanceof d0) {
            ((d0) abstractC7311h).f34865g = interfaceC2139c;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC7311h).toString());
        }
    }

    /* renamed from: g */
    public static final void m13710g() {
        throw new UnsupportedOperationException();
    }
}
