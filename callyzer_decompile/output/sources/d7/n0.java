package d7;

import a9.C0073l;
import f7.AbstractC2205a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import rw.C6669s;
import sw.C6962f;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a */
    public final LinkedHashMap f8118a;

    /* renamed from: b */
    public final C0073l f8119b;

    public n0(C6962f c6962f) {
        this.f8118a = new LinkedHashMap();
        this.f8119b = new C0073l(c6962f);
    }

    /* renamed from: a */
    public final Object m5330a(String str) {
        Object value;
        C0073l c0073l = this.f8119b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0073l.f264a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0073l.f267d;
        try {
            wx.u0 u0Var = (wx.u0) linkedHashMap2.get(str);
            if (u0Var != null && (value = ((m1) u0Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) c0073l.f266c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    /* renamed from: b */
    public final void m5331b(String str, Serializable serializable) {
        if (serializable != null) {
            ArrayList arrayList = AbstractC2205a.f10134a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((Class) obj).isInstance(serializable)) {
                    }
                }
            }
            throw new IllegalArgumentException(("Can't put value with type " + serializable.getClass() + " into saved state").toString());
        }
        ArrayList arrayList2 = AbstractC2205a.f10134a;
        Object obj2 = this.f8118a.get(str);
        g0 g0Var = obj2 instanceof g0 ? (g0) obj2 : null;
        if (g0Var != null) {
            g0Var.m5321k(serializable);
        }
        this.f8119b.m200J(serializable, str);
    }

    public n0() {
        this.f8118a = new LinkedHashMap();
        this.f8119b = new C0073l(C6669s.f31944a);
    }
}
