package p001o;

import java.util.List;
import p001o.y08;

/* loaded from: classes3.dex */
public abstract class q8i {
    /* renamed from: b */
    public static final hwc m45019b(String str) {
        if (!f9g.I0(str, '[', false, 2, null)) {
            List listC0 = f9g.C0(str, new char[]{':'}, false, 0, 6, null);
            y08 y08VarM57086a = y08.f54673a.m57086a(e3d.f20909h.m24248e().decode((String) listC0.get(0)));
            if (!(((y08VarM57086a instanceof y08.C18292c) && (((y08.C18292c) y08VarM57086a).m57088a() instanceof aw8)) ? false : true)) {
                throw new IllegalArgumentException("ipv6 host given without []-brackets".toString());
            }
            String str2 = (String) kh3.i0(listC0, 1);
            return vyh.m53620a(y08VarM57086a, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null);
        }
        int iA0 = f9g.a0(str, ']', 0, false, 6, null);
        if (!(iA0 > 0)) {
            throw new IllegalArgumentException("unmatched [ or ]".toString());
        }
        String strSubstring = str.substring(1, iA0);
        sq8.m48648g(strSubstring, "substring(...)");
        y08 y08VarM57086a2 = y08.f54673a.m57086a(e3d.f20909h.m24248e().decode(strSubstring));
        if ((y08VarM57086a2 instanceof y08.C18292c) && (((y08.C18292c) y08VarM57086a2).m57088a() instanceof aw8)) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("non-ipv6 host was enclosed in []-brackets".toString());
        }
        Character chH1 = h9g.h1(str, iA0 + 1);
        if (chH1 != null && chH1.charValue() == ':') {
            String strSubstring2 = str.substring(iA0 + 2);
            sq8.m48648g(strSubstring2, "substring(...)");
            numValueOf = Integer.valueOf(Integer.parseInt(strSubstring2));
        } else if (chH1 != null) {
            throw new IllegalArgumentException("unexpected characters after ]");
        }
        return vyh.m53620a(y08VarM57086a2, numValueOf);
    }
}
