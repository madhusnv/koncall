package nk;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.EnumC4100t;
import kk.InterfaceC4101u;
import mk.C4776o;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.y */
/* loaded from: classes.dex */
public final class C5102y extends AbstractC4103w {

    /* renamed from: c */
    public static final C5098u f24991c = new C5098u(1, EnumC4100t.DOUBLE);

    /* renamed from: a */
    public final C4088h f24992a;

    /* renamed from: b */
    public final InterfaceC4101u f24993b;

    public C5102y(C4088h c4088h, InterfaceC4101u interfaceC4101u) {
        this.f24992a = c4088h;
        this.f24993b = interfaceC4101u;
    }

    /* renamed from: e */
    public static Serializable m10034e(C6564a c6564a, EnumC6565b enumC6565b) throws IOException {
        int i10 = AbstractC5101x.f24990a[enumC6565b.ordinal()];
        if (i10 == 1) {
            c6564a.mo10024h();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        c6564a.mo10025j();
        return new C4776o(true);
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        EnumC6565b enumC6565bE0 = c6564a.E0();
        Object objM10034e = m10034e(c6564a, enumC6565bE0);
        if (objM10034e == null) {
            return m10035d(c6564a, enumC6565bE0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c6564a.mo10023R()) {
                String strV0 = objM10034e instanceof Map ? c6564a.v0() : null;
                EnumC6565b enumC6565bE02 = c6564a.E0();
                Serializable serializableM10034e = m10034e(c6564a, enumC6565bE02);
                boolean z6 = serializableM10034e != null;
                if (serializableM10034e == null) {
                    serializableM10034e = m10035d(c6564a, enumC6565bE02);
                }
                if (objM10034e instanceof List) {
                    ((List) objM10034e).add(serializableM10034e);
                } else {
                    ((Map) objM10034e).put(strV0, serializableM10034e);
                }
                if (z6) {
                    arrayDeque.addLast(objM10034e);
                    objM10034e = serializableM10034e;
                }
            } else {
                if (objM10034e instanceof List) {
                    c6564a.mo10026w();
                } else {
                    c6564a.mo10027z();
                }
                if (arrayDeque.isEmpty()) {
                    return objM10034e;
                }
                objM10034e = arrayDeque.removeLast();
            }
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        if (obj == null) {
            c6566c.mo10029J();
            return;
        }
        AbstractC4103w abstractC4103wM8858e = this.f24992a.m8858e(TypeToken.get((Class) obj.getClass()));
        if (!(abstractC4103wM8858e instanceof C5102y)) {
            abstractC4103wM8858e.mo8852c(c6566c, obj);
        } else {
            c6566c.mo10031n();
            c6566c.mo10033z();
        }
    }

    /* renamed from: d */
    public final Serializable m10035d(C6564a c6564a, EnumC6565b enumC6565b) {
        int i10 = AbstractC5101x.f24990a[enumC6565b.ordinal()];
        if (i10 == 3) {
            return c6564a.C0();
        }
        if (i10 == 4) {
            return this.f24993b.readNumber(c6564a);
        }
        if (i10 == 5) {
            return Boolean.valueOf(c6564a.a0());
        }
        if (i10 == 6) {
            c6564a.A0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC6565b);
    }
}
