package p001o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class q8j {

    /* renamed from: g */
    public static int f41487g;

    /* renamed from: b */
    public int f41489b;

    /* renamed from: d */
    public int f41491d;

    /* renamed from: a */
    public ArrayList f41488a = new ArrayList();

    /* renamed from: c */
    public boolean f41490c = false;

    /* renamed from: e */
    public ArrayList f41492e = null;

    /* renamed from: f */
    public int f41493f = -1;

    /* renamed from: o.q8j$a */
    public static class C16324a {

        /* renamed from: a */
        public WeakReference f41494a;

        /* renamed from: b */
        public int f41495b;

        /* renamed from: c */
        public int f41496c;

        /* renamed from: d */
        public int f41497d;

        /* renamed from: e */
        public int f41498e;

        /* renamed from: f */
        public int f41499f;

        /* renamed from: g */
        public int f41500g;

        public C16324a(zt3 zt3Var, sda sdaVar, int i) {
            this.f41494a = new WeakReference(zt3Var);
            this.f41495b = sdaVar.m48257y(zt3Var.f57631Q);
            this.f41496c = sdaVar.m48257y(zt3Var.f57632R);
            this.f41497d = sdaVar.m48257y(zt3Var.f57633S);
            this.f41498e = sdaVar.m48257y(zt3Var.f57634T);
            this.f41499f = sdaVar.m48257y(zt3Var.f57635U);
            this.f41500g = i;
        }
    }

    public q8j(int i) {
        int i2 = f41487g;
        f41487g = i2 + 1;
        this.f41489b = i2;
        this.f41491d = i;
    }

    /* renamed from: a */
    public boolean m45020a(zt3 zt3Var) {
        if (this.f41488a.contains(zt3Var)) {
            return false;
        }
        this.f41488a.add(zt3Var);
        return true;
    }

    /* renamed from: b */
    public void m45021b(ArrayList arrayList) {
        int size = this.f41488a.size();
        if (this.f41493f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                q8j q8jVar = (q8j) arrayList.get(i);
                if (this.f41493f == q8jVar.f41489b) {
                    m45026g(this.f41491d, q8jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m45022c() {
        return this.f41489b;
    }

    /* renamed from: d */
    public int m45023d() {
        return this.f41491d;
    }

    /* renamed from: e */
    public final String m45024e() {
        int i = this.f41491d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: f */
    public int m45025f(sda sdaVar, int i) {
        if (this.f41488a.size() == 0) {
            return 0;
        }
        return m45029j(sdaVar, this.f41488a, i);
    }

    /* renamed from: g */
    public void m45026g(int i, q8j q8jVar) {
        Iterator it = this.f41488a.iterator();
        while (it.hasNext()) {
            zt3 zt3Var = (zt3) it.next();
            q8jVar.m45020a(zt3Var);
            if (i == 0) {
                zt3Var.S0 = q8jVar.m45022c();
            } else {
                zt3Var.T0 = q8jVar.m45022c();
            }
        }
        this.f41493f = q8jVar.f41489b;
    }

    /* renamed from: h */
    public void m45027h(boolean z) {
        this.f41490c = z;
    }

    /* renamed from: i */
    public void m45028i(int i) {
        this.f41491d = i;
    }

    /* renamed from: j */
    public final int m45029j(sda sdaVar, ArrayList arrayList, int i) {
        int iM48257y;
        int iM48257y2;
        au3 au3Var = (au3) ((zt3) arrayList.get(0)).m59835M();
        sdaVar.m48234E();
        au3Var.mo47183g(sdaVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((zt3) arrayList.get(i2)).mo47183g(sdaVar, false);
        }
        if (i == 0 && au3Var.g1 > 0) {
            xf2.m56208b(au3Var, sdaVar, arrayList, 0);
        }
        if (i == 1 && au3Var.h1 > 0) {
            xf2.m56208b(au3Var, sdaVar, arrayList, 1);
        }
        try {
            sdaVar.m48230A();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f41492e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f41492e.add(new C16324a((zt3) arrayList.get(i3), sdaVar, i));
        }
        if (i == 0) {
            iM48257y = sdaVar.m48257y(au3Var.f57631Q);
            iM48257y2 = sdaVar.m48257y(au3Var.f57633S);
            sdaVar.m48234E();
        } else {
            iM48257y = sdaVar.m48257y(au3Var.f57632R);
            iM48257y2 = sdaVar.m48257y(au3Var.f57634T);
            sdaVar.m48234E();
        }
        return iM48257y2 - iM48257y;
    }

    public String toString() {
        String str = m45024e() + " [" + this.f41489b + "] <";
        Iterator it = this.f41488a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((zt3) it.next()).m59862v();
        }
        return str + " >";
    }
}
