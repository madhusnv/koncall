package xx;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;
import vx.EnumC7799a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8495a {

    /* renamed from: a */
    public AbstractC8497c[] f41390a;

    /* renamed from: b */
    public int f41391b;

    /* renamed from: c */
    public int f41392c;

    /* renamed from: d */
    public C8518x f41393d;

    /* renamed from: d */
    public final AbstractC8497c m15785d() {
        AbstractC8497c abstractC8497cMo15354e;
        C8518x c8518x;
        synchronized (this) {
            try {
                AbstractC8497c[] abstractC8497cArrMo15355f = this.f41390a;
                if (abstractC8497cArrMo15355f == null) {
                    abstractC8497cArrMo15355f = mo15355f();
                    this.f41390a = abstractC8497cArrMo15355f;
                } else if (this.f41391b >= abstractC8497cArrMo15355f.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC8497cArrMo15355f, abstractC8497cArrMo15355f.length * 2);
                    AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
                    this.f41390a = (AbstractC8497c[]) objArrCopyOf;
                    abstractC8497cArrMo15355f = (AbstractC8497c[]) objArrCopyOf;
                }
                int i10 = this.f41392c;
                do {
                    abstractC8497cMo15354e = abstractC8497cArrMo15355f[i10];
                    if (abstractC8497cMo15354e == null) {
                        abstractC8497cMo15354e = mo15354e();
                        abstractC8497cArrMo15355f[i10] = abstractC8497cMo15354e;
                    }
                    i10++;
                    if (i10 >= abstractC8497cArrMo15355f.length) {
                        i10 = 0;
                    }
                } while (!abstractC8497cMo15354e.mo15394a(this));
                this.f41392c = i10;
                this.f41391b++;
                c8518x = this.f41393d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c8518x != null) {
            c8518x.m15792v(1);
        }
        return abstractC8497cMo15354e;
    }

    /* renamed from: e */
    public abstract AbstractC8497c mo15354e();

    /* renamed from: f */
    public abstract AbstractC8497c[] mo15355f();

    /* renamed from: g */
    public final void m15786g(AbstractC8497c abstractC8497c) {
        C8518x c8518x;
        int i10;
        InterfaceC7559c[] interfaceC7559cArrMo15395b;
        synchronized (this) {
            try {
                int i11 = this.f41391b - 1;
                this.f41391b = i11;
                c8518x = this.f41393d;
                if (i11 == 0) {
                    this.f41392c = 0;
                }
                AbstractC4154l.m8921d(abstractC8497c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC7559cArrMo15395b = abstractC8497c.mo15395b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC7559c interfaceC7559c : interfaceC7559cArrMo15395b) {
            if (interfaceC7559c != null) {
                interfaceC7559c.resumeWith(a0.f30746a);
            }
        }
        if (c8518x != null) {
            c8518x.m15792v(-1);
        }
    }

    /* renamed from: h */
    public final C8518x m15787h() {
        C8518x c8518x;
        synchronized (this) {
            c8518x = this.f41393d;
            if (c8518x == null) {
                int i10 = this.f41391b;
                c8518x = new C8518x(1, Integer.MAX_VALUE, EnumC7799a.DROP_OLDEST);
                c8518x.mo15352b(Integer.valueOf(i10));
                this.f41393d = c8518x;
            }
        }
        return c8518x;
    }
}
