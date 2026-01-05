package nk;

import a2.AbstractC0030c;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.C4095o;
import mk.InterfaceC4777p;
import oj.C5392d;
import rk.C6564a;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.t */
/* loaded from: classes.dex */
public final class C5097t extends AbstractC4103w {

    /* renamed from: a */
    public final /* synthetic */ int f24981a = 1;

    /* renamed from: b */
    public final Object f24982b;

    /* renamed from: c */
    public final AbstractC4103w f24983c;

    /* renamed from: d */
    public final Object f24984d;

    public C5097t(C4088h c4088h, AbstractC4103w abstractC4103w, Type type) {
        this.f24982b = c4088h;
        this.f24983c = abstractC4103w;
        this.f24984d = type;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        switch (this.f24981a) {
            case 0:
                EnumC6565b enumC6565bE0 = c6564a.E0();
                if (enumC6565bE0 == EnumC6565b.NULL) {
                    c6564a.A0();
                    return null;
                }
                Map map = (Map) ((InterfaceC4777p) this.f24984d).mo28i();
                if (enumC6565bE0 == EnumC6565b.BEGIN_ARRAY) {
                    c6564a.mo10024h();
                    while (c6564a.mo10023R()) {
                        c6564a.mo10024h();
                        Object objMo8851b = ((C5097t) this.f24982b).f24983c.mo8851b(c6564a);
                        if (map.put(objMo8851b, ((C5097t) this.f24983c).f24983c.mo8851b(c6564a)) != null) {
                            throw new JsonSyntaxException(AbstractC0030c.m118i(objMo8851b, "duplicate key: "));
                        }
                        c6564a.mo10026w();
                    }
                    c6564a.mo10026w();
                } else {
                    c6564a.mo10025j();
                    while (c6564a.mo10023R()) {
                        C5392d.f27079c.getClass();
                        if (c6564a instanceof C5094q) {
                            C5094q c5094q = (C5094q) c6564a;
                            c5094q.O0(EnumC6565b.NAME);
                            Map.Entry entry = (Map.Entry) ((Iterator) c5094q.S0()).next();
                            c5094q.U0(entry.getValue());
                            c5094q.U0(new C4095o((String) entry.getKey()));
                        } else {
                            int iM12581u = c6564a.f31431j;
                            if (iM12581u == 0) {
                                iM12581u = c6564a.m12581u();
                            }
                            if (iM12581u == 13) {
                                c6564a.f31431j = 9;
                            } else if (iM12581u == 12) {
                                c6564a.f31431j = 8;
                            } else {
                                if (iM12581u != 14) {
                                    throw c6564a.N0("a name");
                                }
                                c6564a.f31431j = 10;
                            }
                        }
                        Object objMo8851b2 = ((C5097t) this.f24982b).f24983c.mo8851b(c6564a);
                        if (map.put(objMo8851b2, ((C5097t) this.f24983c).f24983c.mo8851b(c6564a)) != null) {
                            throw new JsonSyntaxException(AbstractC0030c.m118i(objMo8851b2, "duplicate key: "));
                        }
                    }
                    c6564a.mo10027z();
                }
                return map;
            default:
                return this.f24983c.mo8851b(c6564a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Type] */
    @Override // kk.AbstractC4103w
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8852c(rk.C6566c r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f24981a
            switch(r0) {
                case 0: goto L49;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f24984d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            kk.w r2 = r4.f24983c
            if (r1 == r0) goto L45
            java.lang.Object r0 = r4.f24982b
            kk.h r0 = (kk.C4088h) r0
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            kk.w r0 = r0.m8858e(r1)
            boolean r1 = r0 instanceof nk.a0
            if (r1 != 0) goto L2e
            goto L44
        L2e:
            r1 = r2
        L2f:
            boolean r3 = r1 instanceof nk.f0
            if (r3 == 0) goto L3f
            r3 = r1
            nk.f0 r3 = (nk.f0) r3
            kk.w r3 = r3.mo8853d()
            if (r3 != r1) goto L3d
            goto L3f
        L3d:
            r1 = r3
            goto L2f
        L3f:
            boolean r1 = r1 instanceof nk.a0
            if (r1 != 0) goto L44
            goto L45
        L44:
            r2 = r0
        L45:
            r2.mo8852c(r5, r6)
            return
        L49:
            java.util.Map r6 = (java.util.Map) r6
            kk.w r0 = r4.f24983c
            nk.t r0 = (nk.C5097t) r0
            if (r6 != 0) goto L55
            r5.mo10029J()
            goto L82
        L55:
            r5.mo10031n()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.mo10028A(r2)
            java.lang.Object r1 = r1.getValue()
            r0.mo8852c(r5, r1)
            goto L60
        L7f:
            r5.mo10033z()
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.C5097t.mo8852c(rk.c, java.lang.Object):void");
    }

    public C5097t(C5081d c5081d, C5097t c5097t, C5097t c5097t2, InterfaceC4777p interfaceC4777p) {
        this.f24982b = c5097t;
        this.f24983c = c5097t2;
        this.f24984d = interfaceC4777p;
    }
}
