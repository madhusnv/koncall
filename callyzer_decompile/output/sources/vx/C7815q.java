package vx;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import og.md;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import sc.InterfaceC6796p;
import tx.e2;
import uw.InterfaceC7559c;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.q */
/* loaded from: classes3.dex */
public final class C7815q extends C7806h {

    /* renamed from: n */
    public final EnumC7799a f37523n;

    public C7815q(int i10, EnumC7799a enumC7799a, InterfaceC2139c interfaceC2139c) {
        super(i10, interfaceC2139c);
        this.f37523n = enumC7799a;
        if (enumC7799a != EnumC7799a.SUSPEND) {
            if (i10 < 1) {
                throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + a0.m8901a(C7806h.class).m8914c() + " instead").toString());
        }
    }

    @Override // vx.C7806h
    /* renamed from: B */
    public final boolean mo14760B() {
        return this.f37523n == EnumC7799a.DROP_OLDEST;
    }

    /* renamed from: N */
    public final Object m14800N(Object obj, boolean z6) {
        InterfaceC2139c interfaceC2139c;
        UndeliveredElementException undeliveredElementExceptionM16242b;
        EnumC7799a enumC7799a = this.f37523n;
        EnumC7799a enumC7799a2 = EnumC7799a.DROP_LATEST;
        qw.a0 a0Var = qw.a0.f30746a;
        if (enumC7799a == enumC7799a2) {
            Object objMo14776i = super.mo14776i(obj);
            if (!(objMo14776i instanceof C7812n) || (objMo14776i instanceof C7811m)) {
                return objMo14776i;
            }
            if (z6 && (interfaceC2139c = this.f37494b) != null && (undeliveredElementExceptionM16242b = AbstractC8808b.m16242b(interfaceC2139c, obj, null)) != null) {
                throw undeliveredElementExceptionM16242b;
            }
        } else {
            Object obj2 = obj;
            InterfaceC6796p interfaceC6796p = AbstractC7808j.f37500d;
            C7814p c7814p = (C7814p) C7806h.f37488h.get(this);
            while (true) {
                long andIncrement = C7806h.f37484d.getAndIncrement(this);
                long j6 = 1152921504606846975L & andIncrement;
                boolean zM14791y = m14791y(false, andIncrement);
                int i10 = AbstractC7808j.f37498b;
                long j10 = i10;
                long j11 = j6 / j10;
                int i11 = (int) (j6 % j10);
                if (c7814p.f42518c != j11) {
                    C7814p c7814pM14755d = C7806h.m14755d(this, j11, c7814p);
                    if (c7814pM14755d != null) {
                        c7814p = c7814pM14755d;
                    } else if (zM14791y) {
                        return new C7811m(m14789v());
                    }
                }
                int iM14757h = C7806h.m14757h(this, c7814p, i11, obj2, j6, interfaceC6796p, zM14791y);
                if (iM14757h == 0) {
                    c7814p.m16257a();
                    return a0Var;
                }
                if (iM14757h == 1) {
                    break;
                }
                if (iM14757h != 2) {
                    if (iM14757h == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iM14757h == 4) {
                        if (j6 < C7806h.f37485e.get(this)) {
                            c7814p.m16257a();
                        }
                        return new C7811m(m14789v());
                    }
                    if (iM14757h == 5) {
                        c7814p.m16257a();
                    }
                    obj2 = obj;
                } else {
                    if (zM14791y) {
                        c7814p.m16277i();
                        return new C7811m(m14789v());
                    }
                    e2 e2Var = interfaceC6796p instanceof e2 ? (e2) interfaceC6796p : null;
                    if (e2Var != null) {
                        e2Var.mo5076a(c7814p, i11 + i10);
                    }
                    m14784q((c7814p.f42518c * j10) + i11);
                }
            }
        }
        return a0Var;
    }

    @Override // vx.C7806h, vx.InterfaceC7822x
    /* renamed from: g */
    public final Object mo14775g(Object obj, InterfaceC7559c interfaceC7559c) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM16242b;
        if (!(m14800N(obj, true) instanceof C7811m)) {
            return qw.a0.f30746a;
        }
        InterfaceC2139c interfaceC2139c = this.f37494b;
        if (interfaceC2139c == null || (undeliveredElementExceptionM16242b = AbstractC8808b.m16242b(interfaceC2139c, obj, null)) == null) {
            throw m14789v();
        }
        md.m10764a(undeliveredElementExceptionM16242b, m14789v());
        throw undeliveredElementExceptionM16242b;
    }

    @Override // vx.C7806h, vx.InterfaceC7822x
    /* renamed from: i */
    public final Object mo14776i(Object obj) {
        return m14800N(obj, false);
    }
}
