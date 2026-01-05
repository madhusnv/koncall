package y4;

import d5.C1598b;
import d5.C1603g;
import d5.EnumC1608l;
import d5.InterfaceC1604h;
import e5.C1946a;
import e5.C1948c;
import e5.C1951f;
import e5.C1952g;
import e5.C1953h;
import e5.C1955j;
import e5.C1957l;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.b0;
import s4.AbstractC6746b;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.n */
/* loaded from: classes.dex */
public final class C8553n {

    /* renamed from: a */
    public b0 f41519a;

    /* renamed from: b */
    public boolean f41520b = true;

    /* renamed from: c */
    public final HashMap f41521c;

    /* renamed from: d */
    public final HashMap f41522d;

    /* renamed from: e */
    public final HashMap f41523e;

    /* renamed from: f */
    public final C1598b f41524f;

    /* renamed from: g */
    public int f41525g;

    /* renamed from: h */
    public final ArrayList f41526h;

    /* renamed from: i */
    public final ArrayList f41527i;

    /* renamed from: j */
    public boolean f41528j;

    /* renamed from: k */
    public final InterfaceC6747c f41529k;

    /* renamed from: l */
    public long f41530l;

    public C8553n(InterfaceC6747c interfaceC6747c) {
        HashMap map = new HashMap();
        this.f41521c = map;
        this.f41522d = new HashMap();
        this.f41523e = new HashMap();
        C1598b c1598b = new C1598b(this);
        this.f41524f = c1598b;
        this.f41525g = 0;
        this.f41526h = new ArrayList();
        this.f41527i = new ArrayList();
        this.f41528j = true;
        c1598b.f7975a = 0;
        map.put(0, c1598b);
        this.f41529k = interfaceC6747c;
        this.f41530l = AbstractC6746b.m12924b(0, 0, 15);
        EnumC6757m enumC6757m = EnumC6757m.Ltr;
        this.f41519a = new b0(12, this);
    }

    /* renamed from: a */
    public final void m15820a(Object obj) {
        this.f41526h.add(obj);
        this.f41528j = true;
    }

    /* renamed from: b */
    public final C1598b m15821b(Object obj) {
        HashMap map = this.f41521c;
        InterfaceC1604h interfaceC1604h = (InterfaceC1604h) map.get(obj);
        InterfaceC1604h interfaceC1604h2 = interfaceC1604h;
        if (interfaceC1604h == null) {
            C1598b c1598b = new C1598b(this);
            map.put(obj, c1598b);
            c1598b.f7975a = obj;
            interfaceC1604h2 = c1598b;
        }
        if (interfaceC1604h2 instanceof C1598b) {
            return (C1598b) interfaceC1604h2;
        }
        return null;
    }

    /* renamed from: c */
    public final int m15822c(Float f6) {
        return Math.round(f6.floatValue());
    }

    /* renamed from: d */
    public final C1953h m15823d(int i10, String str) {
        C1598b c1598bM15821b = m15821b(str);
        Object obj = c1598bM15821b.f7977c;
        if (obj == null || !(obj instanceof C1953h)) {
            C1953h c1953h = new C1953h(this);
            c1953h.f9194b = i10;
            c1953h.f9199g = str;
            c1598bM15821b.f7977c = c1953h;
            c1598bM15821b.mo5237a(c1953h.mo5238b());
        }
        return (C1953h) c1598bM15821b.f7977c;
    }

    /* renamed from: e */
    public final C1603g m15824e(EnumC1608l enumC1608l) {
        C1603g c1955j;
        StringBuilder sb2 = new StringBuilder("__HELPER_KEY_");
        int i10 = this.f41525g;
        this.f41525g = i10 + 1;
        String strM11233d = AbstractC5601a.m11233d(i10, "__", sb2);
        HashMap map = this.f41522d;
        C1603g c1603g = (C1603g) map.get(strM11233d);
        C1603g c1603g2 = c1603g;
        if (c1603g == null) {
            switch (enumC1608l) {
                case HORIZONTAL_CHAIN:
                    c1955j = new C1955j(this, EnumC1608l.HORIZONTAL_CHAIN);
                    break;
                case VERTICAL_CHAIN:
                    c1955j = new C1957l(this, EnumC1608l.VERTICAL_CHAIN);
                    break;
                case ALIGN_HORIZONTALLY:
                    C1946a c1946a = new C1946a(this, EnumC1608l.ALIGN_VERTICALLY, 0);
                    c1946a.f44184o0 = 0.5f;
                    c1955j = c1946a;
                    break;
                case ALIGN_VERTICALLY:
                    C1946a c1946a2 = new C1946a(this, EnumC1608l.ALIGN_VERTICALLY, 1);
                    c1946a2.f44184o0 = 0.5f;
                    c1955j = c1946a2;
                    break;
                case BARRIER:
                    c1955j = new C1948c(this);
                    break;
                case LAYER:
                default:
                    c1955j = new C1603g(this, enumC1608l);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    c1955j = new C1951f(this, enumC1608l);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    c1955j = new C1952g(this, enumC1608l);
                    break;
            }
            c1955j.f7975a = strM11233d;
            map.put(strM11233d, c1955j);
            c1603g2 = c1955j;
        }
        return c1603g2;
    }
}
