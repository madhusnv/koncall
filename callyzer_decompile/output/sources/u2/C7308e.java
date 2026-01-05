package u2;

import e1.k0;
import ex.InterfaceC2139c;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.e */
/* loaded from: classes.dex */
public final class C7308e extends C7307d {

    /* renamed from: o */
    public final C7307d f34867o;

    /* renamed from: p */
    public boolean f34868p;

    public C7308e(long j6, C7315l c7315l, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, C7307d c7307d) {
        super(j6, c7315l, interfaceC2139c, interfaceC2139c2);
        this.f34867o = c7307d;
        c7307d.mo13642k();
    }

    @Override // u2.C7307d, u2.AbstractC7311h
    /* renamed from: c */
    public final void mo13641c() {
        if (this.f34875c) {
            return;
        }
        super.mo13641c();
        if (this.f34868p) {
            return;
        }
        this.f34868p = true;
        this.f34867o.mo13643l();
    }

    @Override // u2.C7307d
    /* renamed from: w */
    public final AbstractC7321r mo13646w() throws Throwable {
        C7308e c7308e;
        C7307d c7307d = this.f34867o;
        if (c7307d.f34862m || c7307d.f34875c) {
            return new C7312i();
        }
        k0 k0Var = this.f34857h;
        long j6 = this.f34874b;
        HashMap mapM13678c = k0Var != null ? AbstractC7316m.m13678c(c7307d.mo13652g(), this, this.f34867o.mo13649d()) : null;
        Object obj = AbstractC7316m.f34890b;
        synchronized (obj) {
            try {
                AbstractC7316m.m13679d(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (k0Var == null || k0Var.f9008d == 0) {
                    c7308e = this;
                    m13668a();
                } else {
                    c7308e = this;
                    AbstractC7321r abstractC7321rM13665z = c7308e.m13665z(this.f34867o.mo13652g(), k0Var, mapM13678c, this.f34867o.mo13649d());
                    if (!abstractC7321rM13665z.equals(C7313j.f34877c)) {
                        return abstractC7321rM13665z;
                    }
                    k0 k0VarMo13659x = c7308e.f34867o.mo13659x();
                    if (k0VarMo13659x != null) {
                        k0VarMo13659x.m5590j(k0Var);
                    } else {
                        c7308e.f34867o.mo13647B(k0Var);
                        c7308e.f34857h = null;
                    }
                }
                if (c7308e.f34867o.mo13652g() < j6) {
                    c7308e.f34867o.m13664v();
                }
                C7307d c7307d2 = c7308e.f34867o;
                c7307d2.mo13656r(c7307d2.mo13649d().m13672h(j6).m13671b(c7308e.f34859j));
                c7308e.f34867o.m13661A(j6);
                C7307d c7307d3 = c7308e.f34867o;
                int i10 = c7308e.f34876d;
                c7308e.f34876d = -1;
                if (i10 >= 0) {
                    int[] iArr = c7307d3.f34860k;
                    AbstractC4154l.m8923f(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    c7307d3.f34860k = iArrCopyOf;
                } else {
                    c7307d3.getClass();
                }
                C7307d c7307d4 = c7308e.f34867o;
                C7315l c7315l = c7308e.f34859j;
                c7307d4.getClass();
                synchronized (obj) {
                    c7307d4.f34859j = c7307d4.f34859j.m13674q(c7315l);
                    C7307d c7307d5 = c7308e.f34867o;
                    int[] iArr2 = c7308e.f34860k;
                    c7307d5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c7307d5.f34860k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            AbstractC4154l.m8920c(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        c7307d5.f34860k = iArr2;
                    }
                }
                c7308e.f34862m = true;
                if (!c7308e.f34868p) {
                    c7308e.f34868p = true;
                    c7308e.f34867o.mo13643l();
                }
                return C7313j.f34877c;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
