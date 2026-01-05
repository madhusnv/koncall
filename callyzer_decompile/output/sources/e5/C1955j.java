package e5;

import d5.C1598b;
import d5.EnumC1606j;
import java.util.ArrayList;
import java.util.HashMap;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.j */
/* loaded from: classes.dex */
public final class C1955j extends AbstractC1949d {
    @Override // d5.C1603g, d5.C1598b, d5.InterfaceC1604h
    public final void apply() {
        C8553n c8553n;
        ArrayList arrayList = this.f44182m0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            c8553n = this.f44180k0;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            c8553n.m15821b(obj).m5243g();
        }
        int size2 = arrayList.size();
        C1598b c1598b = null;
        int i11 = 0;
        C1598b c1598b2 = null;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            C1598b c1598bM15821b = c8553n.m15821b(obj2);
            if (c1598b2 == null) {
                Object obj3 = this.f7962N;
                if (obj3 != null) {
                    c1598bM15821b.m5251o(obj3);
                    c1598bM15821b.mo5247k(this.f7986l).m5249m(this.f7992r);
                } else {
                    Object obj4 = this.f7963O;
                    if (obj4 != null) {
                        c1598bM15821b.getClass();
                        c1598bM15821b.f44173d0 = EnumC1606j.START_TO_END;
                        c1598bM15821b.f7963O = obj4;
                        c1598bM15821b.mo5247k(this.f7986l).m5249m(this.f7992r);
                    } else {
                        Object obj5 = this.f7958J;
                        if (obj5 != null) {
                            c1598bM15821b.m5251o(obj5);
                            c1598bM15821b.mo5247k(this.f7984j).m5249m(this.f7990p);
                        } else {
                            Object obj6 = this.f7959K;
                            if (obj6 != null) {
                                c1598bM15821b.getClass();
                                c1598bM15821b.f44173d0 = EnumC1606j.START_TO_END;
                                c1598bM15821b.f7963O = obj6;
                                c1598bM15821b.mo5247k(this.f7984j).m5249m(this.f7990p);
                            } else {
                                String string = c1598bM15821b.f7975a.toString();
                                c1598bM15821b.m5251o(0);
                                c1598bM15821b.mo5248l(Float.valueOf(m5704w(string))).m5250n(Float.valueOf(m5703v(string)));
                            }
                        }
                    }
                }
                c1598b2 = c1598bM15821b;
            }
            if (c1598b != null) {
                String string2 = c1598b.f7975a.toString();
                String string3 = c1598bM15821b.f7975a.toString();
                Object obj7 = c1598bM15821b.f7975a;
                c1598b.f44173d0 = EnumC1606j.END_TO_START;
                c1598b.f7964P = obj7;
                c1598b.mo5248l(Float.valueOf(m5702u(string2))).m5250n(Float.valueOf(m5701t(string2)));
                Object obj8 = c1598b.f7975a;
                c1598bM15821b.f44173d0 = EnumC1606j.START_TO_END;
                c1598bM15821b.f7963O = obj8;
                c1598bM15821b.mo5248l(Float.valueOf(m5704w(string3))).m5250n(Float.valueOf(m5703v(string3)));
            }
            String string4 = obj2.toString();
            HashMap map = this.f44189o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                c1598bM15821b.f7980f = fFloatValue;
            }
            c1598b = c1598bM15821b;
        }
        if (c1598b != null) {
            Object obj9 = this.f7964P;
            if (obj9 != null) {
                c1598b.f44173d0 = EnumC1606j.END_TO_START;
                c1598b.f7964P = obj9;
                c1598b.mo5247k(this.f7987m).m5249m(this.f7993s);
            } else {
                Object obj10 = this.f7965Q;
                if (obj10 != null) {
                    c1598b.m5245i(obj10);
                    c1598b.mo5247k(this.f7987m).m5249m(this.f7993s);
                } else {
                    Object obj11 = this.f7960L;
                    if (obj11 != null) {
                        c1598b.f44173d0 = EnumC1606j.END_TO_START;
                        c1598b.f7964P = obj11;
                        c1598b.mo5247k(this.f7985k).m5249m(this.f7991q);
                    } else {
                        Object obj12 = this.f7961M;
                        if (obj12 != null) {
                            c1598b.m5245i(obj12);
                            c1598b.mo5247k(this.f7985k).m5249m(this.f7991q);
                        } else {
                            String string5 = c1598b.f7975a.toString();
                            c1598b.m5245i(0);
                            c1598b.mo5248l(Float.valueOf(m5702u(string5))).m5250n(Float.valueOf(m5701t(string5)));
                        }
                    }
                }
            }
        }
        if (c1598b2 == null) {
            return;
        }
        float f6 = this.f44188n0;
        if (f6 != 0.5f) {
            c1598b2.f7982h = f6;
        }
        int i12 = AbstractC1954i.f9200a[this.f44194t0.ordinal()];
        if (i12 == 1) {
            c1598b2.f7978d = 0;
        } else if (i12 == 2) {
            c1598b2.f7978d = 1;
        } else {
            if (i12 != 3) {
                return;
            }
            c1598b2.f7978d = 2;
        }
    }
}
