package ly;

import a6.C0058f;
import al.C0174b;
import ee.C2039g;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import iy.InterfaceC3367d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jy.r0;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.AbstractC4282n;
import ky.C4278j;
import ky.C4289u;
import l1.C4327p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.u */
/* loaded from: classes3.dex */
public final class C4597u implements InterfaceC3367d, InterfaceC3365b {

    /* renamed from: a */
    public final C0058f f22752a;

    /* renamed from: b */
    public final AbstractC4271c f22753b;

    /* renamed from: c */
    public final EnumC4601y f22754c;

    /* renamed from: d */
    public final C4597u[] f22755d;

    /* renamed from: e */
    public final C0174b f22756e;

    /* renamed from: f */
    public final C4278j f22757f;

    /* renamed from: g */
    public boolean f22758g;

    /* renamed from: h */
    public String f22759h;

    /* renamed from: i */
    public String f22760i;

    public C4597u(C0058f composer, AbstractC4271c abstractC4271c, EnumC4601y enumC4601y, C4597u[] c4597uArr) {
        AbstractC4154l.m8923f(composer, "composer");
        this.f22752a = composer;
        this.f22753b = abstractC4271c;
        this.f22754c = enumC4601y;
        this.f22755d = c4597uArr;
        this.f22756e = abstractC4271c.f21668b;
        this.f22757f = abstractC4271c.f21667a;
        int iOrdinal = enumC4601y.ordinal();
        if (c4597uArr != null) {
            C4597u c4597u = c4597uArr[iOrdinal];
            if (c4597u == null && c4597u == this) {
                return;
            }
            c4597uArr[iOrdinal] = this;
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: a */
    public final C0174b mo7710a() {
        return this.f22756e;
    }

    @Override // iy.InterfaceC3365b
    /* renamed from: b */
    public final void mo7693b(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        EnumC4601y enumC4601y = this.f22754c;
        if (enumC4601y.end != 0) {
            C0058f c0058f = this.f22752a;
            c0058f.getClass();
            c0058f.f233a = false;
            c0058f.m170i(enumC4601y.end);
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: c */
    public final InterfaceC3365b mo7711c(InterfaceC3055f descriptor) {
        C4597u c4597u;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4271c abstractC4271c = this.f22753b;
        EnumC4601y enumC4601yM9436q = AbstractC4585i.m9436q(descriptor, abstractC4271c);
        char c2 = enumC4601yM9436q.begin;
        C0058f c0058f = this.f22752a;
        if (c2 != 0) {
            c0058f.m170i(c2);
            c0058f.f233a = true;
        }
        String str = this.f22759h;
        if (str != null) {
            String strMo7277a = this.f22760i;
            if (strMo7277a == null) {
                strMo7277a = descriptor.mo7277a();
            }
            c0058f.m168g();
            mo7724r(str);
            c0058f.m170i(':');
            c0058f.getClass();
            mo7724r(strMo7277a);
            this.f22759h = null;
            this.f22760i = null;
        }
        if (this.f22754c == enumC4601yM9436q) {
            return this;
        }
        C4597u[] c4597uArr = this.f22755d;
        return (c4597uArr == null || (c4597u = c4597uArr[enumC4601yM9436q.ordinal()]) == null) ? new C4597u(c0058f, abstractC4271c, enumC4601yM9436q, c4597uArr) : c4597u;
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: d */
    public final void mo7712d() {
        this.f22752a.m173l("null");
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: e */
    public final InterfaceC3367d mo7713e(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        boolean zM9445a = AbstractC4598v.m9445a(descriptor);
        EnumC4601y enumC4601y = this.f22754c;
        AbstractC4271c abstractC4271c = this.f22753b;
        C0058f c4581e = this.f22752a;
        if (zM9445a) {
            if (!(c4581e instanceof C4582f)) {
                c4581e = new C4582f((C2039g) c4581e.f234b, this.f22758g);
            }
            return new C4597u(c4581e, abstractC4271c, enumC4601y, null);
        }
        if (descriptor.isInline() && descriptor.equals(AbstractC4282n.f21688a)) {
            if (!(c4581e instanceof C4581e)) {
                c4581e = new C4581e((C2039g) c4581e.f234b, this.f22758g);
            }
            return new C4597u(c4581e, abstractC4271c, enumC4601y, null);
        }
        if (this.f22759h != null) {
            this.f22760i = descriptor.mo7277a();
        }
        return this;
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: f */
    public final void mo7714f(double d2) {
        boolean z6 = this.f22758g;
        C0058f c0058f = this.f22752a;
        if (z6) {
            mo7724r(String.valueOf(d2));
        } else {
            ((C2039g) c0058f.f234b).m5768r(String.valueOf(d2));
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw AbstractC4585i.m9421b(Double.valueOf(d2), ((C2039g) c0058f.f234b).toString());
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: g */
    public final void mo7715g(short s5) {
        if (this.f22758g) {
            mo7724r(String.valueOf((int) s5));
        } else {
            this.f22752a.mo174m(s5);
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: h */
    public final void mo7716h(byte b10) {
        if (this.f22758g) {
            mo7724r(String.valueOf((int) b10));
        } else {
            this.f22752a.mo169h(b10);
        }
    }

    @Override // iy.InterfaceC3365b
    /* renamed from: i */
    public final boolean mo7694i(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return false;
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: j */
    public final void mo7717j(boolean z6) {
        if (this.f22758g) {
            mo7724r(String.valueOf(z6));
        } else {
            ((C2039g) this.f22752a.f234b).m5768r(String.valueOf(z6));
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: k */
    public final void mo7718k(float f6) {
        boolean z6 = this.f22758g;
        C0058f c0058f = this.f22752a;
        if (z6) {
            mo7724r(String.valueOf(f6));
        } else {
            ((C2039g) c0058f.f234b).m5768r(String.valueOf(f6));
        }
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            throw AbstractC4585i.m9421b(Float.valueOf(f6), ((C2039g) c0058f.f234b).toString());
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: l */
    public final void mo7719l(char c2) {
        mo7724r(String.valueOf(c2));
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: m */
    public final void mo7720m(InterfaceC3055f enumDescriptor, int i10) {
        AbstractC4154l.m8923f(enumDescriptor, "enumDescriptor");
        mo7724r(enumDescriptor.mo7282g(i10));
    }

    @Override // iy.InterfaceC3365b
    /* renamed from: n */
    public final void mo7695n(InterfaceC3055f descriptor, int i10, InterfaceC2401a serializer, Object obj) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(serializer, "serializer");
        if (obj != null || this.f22757f.f21682b) {
            AbstractC4154l.m8923f(descriptor, "descriptor");
            AbstractC4154l.m8923f(serializer, "serializer");
            m9440s(descriptor, i10);
            if (serializer.getDescriptor().mo7278c()) {
                mo7721o(serializer, obj);
            } else if (obj == null) {
                mo7712d();
            } else {
                mo7721o(serializer, obj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // iy.InterfaceC3367d
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7721o(fy.InterfaceC2401a r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.C4597u.mo7721o(fy.a, java.lang.Object):void");
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: p */
    public final void mo7722p(int i10) {
        if (this.f22758g) {
            mo7724r(String.valueOf(i10));
        } else {
            this.f22752a.mo171j(i10);
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: q */
    public final void mo7723q(long j6) {
        if (this.f22758g) {
            mo7724r(String.valueOf(j6));
        } else {
            this.f22752a.mo172k(j6);
        }
    }

    @Override // iy.InterfaceC3367d
    /* renamed from: r */
    public final void mo7724r(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f22752a.mo175n(value);
    }

    /* renamed from: s */
    public final void m9440s(InterfaceC3055f descriptor, int i10) {
        String strMo7282g;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        int i11 = AbstractC4596t.f22751a[this.f22754c.ordinal()];
        C0058f c0058f = this.f22752a;
        boolean z6 = true;
        if (i11 == 1) {
            if (!c0058f.f233a) {
                c0058f.m170i(',');
            }
            c0058f.m168g();
            return;
        }
        if (i11 == 2) {
            if (c0058f.f233a) {
                this.f22758g = true;
                c0058f.m168g();
                return;
            }
            if (i10 % 2 == 0) {
                c0058f.m170i(',');
                c0058f.m168g();
            } else {
                c0058f.m170i(':');
                c0058f.m176o();
                z6 = false;
            }
            this.f22758g = z6;
            return;
        }
        if (i11 == 3) {
            if (i10 == 0) {
                this.f22758g = true;
            }
            if (i10 == 1) {
                c0058f.m170i(',');
                c0058f.m176o();
                this.f22758g = false;
                return;
            }
            return;
        }
        if (!c0058f.f233a) {
            c0058f.m170i(',');
        }
        c0058f.m168g();
        AbstractC4271c abstractC4271c = this.f22753b;
        C4289u c4289uM9434o = AbstractC4585i.m9434o(descriptor, abstractC4271c);
        if (c4289uM9434o == null) {
            strMo7282g = descriptor.mo7282g(i10);
        } else {
            C4327p c4327p = abstractC4271c.f21669c;
            c4327p.getClass();
            C4586j c4586j = AbstractC4585i.f22717b;
            Object objM9050h = c4327p.m9050h(descriptor, c4586j);
            if (objM9050h == null) {
                int iMo7281f = descriptor.mo7281f();
                String[] strArr = new String[iMo7281f];
                for (int i12 = 0; i12 < iMo7281f; i12++) {
                    strArr[i12] = c4289uM9434o.m8994a(descriptor, descriptor.mo7282g(i12));
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c4327p.f21788b;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c4586j, strArr);
                objM9050h = strArr;
            }
            strMo7282g = ((String[]) objM9050h)[i10];
        }
        mo7724r(strMo7282g);
        c0058f.m170i(':');
        c0058f.m176o();
    }

    /* renamed from: t */
    public final InterfaceC3367d m9441t(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        m9440s(descriptor, i10);
        return mo7713e(descriptor.mo7284i(i10));
    }

    /* renamed from: u */
    public final void m9442u(InterfaceC3055f descriptor, int i10, long j6) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        m9440s(descriptor, i10);
        mo7723q(j6);
    }

    /* renamed from: v */
    public final void m9443v(InterfaceC3055f descriptor, int i10, InterfaceC2401a serializer, Object obj) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(serializer, "serializer");
        m9440s(descriptor, i10);
        mo7721o(serializer, obj);
    }

    /* renamed from: w */
    public final void m9444w(InterfaceC3055f descriptor, int i10, String value) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(value, "value");
        m9440s(descriptor, i10);
        mo7724r(value);
    }
}
