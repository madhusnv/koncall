package j3;

import a9.AbstractC0067f;
import a9.C0062a;
import a9.C0073l;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import c9.C0922q;
import f9.C2222e;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import t8.C7077w;
import wx.InterfaceC8209j;
import wx.c1;
import y8.AbstractC8600i;
import y8.C8595d;
import y8.C8599h;
import z8.C8901d;
import z8.C8903f;
import z8.C8904g;
import z8.InterfaceC8902e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.g */
/* loaded from: classes.dex */
public final class C3553g {

    /* renamed from: a */
    public final ArrayList f19011a;

    public C3553g() {
        this.f19011a = new ArrayList(32);
    }

    /* renamed from: a */
    public boolean m8093a(C0922q c0922q) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f19011a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            if (((InterfaceC8902e) obj).mo15952c(c0922q)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            C7077w c7077wM13371a = C7077w.m13371a();
            int i11 = AbstractC8600i.f41852a;
            AbstractC6663m.m12748L(arrayList, null, null, null, C8599h.f41851a, 31);
            c7077wM13371a.getClass();
        }
        return arrayList.isEmpty();
    }

    /* renamed from: b */
    public void m8094b() {
        this.f19011a.add(C3557k.f19059c);
    }

    /* renamed from: c */
    public void m8095c(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f19011a.add(new C3558l(f6, f10, f11, f12, f13, f14));
    }

    /* renamed from: d */
    public void m8096d(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f19011a.add(new C3566t(f6, f10, f11, f12, f13, f14));
    }

    /* renamed from: e */
    public void m8097e(float f6) {
        this.f19011a.add(new C3567u(f6));
    }

    /* renamed from: f */
    public void m8098f(float f6, float f10) {
        this.f19011a.add(new C3560n(f6, f10));
    }

    /* renamed from: g */
    public void m8099g(float f6, float f10) {
        this.f19011a.add(new C3568v(f6, f10));
    }

    /* renamed from: h */
    public void m8100h(float f6, float f10) {
        this.f19011a.add(new C3561o(f6, f10));
    }

    /* renamed from: i */
    public void m8101i(float f6, float f10, float f11, float f12) {
        this.f19011a.add(new C3563q(f6, f10, f11, f12));
    }

    /* renamed from: j */
    public void m8102j(float f6, float f10, float f11, float f12) {
        this.f19011a.add(new C3571y(f6, f10, f11, f12));
    }

    /* renamed from: k */
    public InterfaceC8209j m8103k(C0922q spec) {
        AbstractC4154l.m8923f(spec, "spec");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f19011a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            if (((InterfaceC8902e) obj).mo15950a(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList3.add(((InterfaceC8902e) obj2).mo15951b(spec.f5631j));
        }
        return c1.m15382m(new C2222e(8, (InterfaceC8209j[]) AbstractC6663m.c0(arrayList3).toArray(new InterfaceC8209j[0])));
    }

    /* renamed from: l */
    public void m8104l(float f6) {
        this.f19011a.add(new a0(f6));
    }

    public C3553g(C0073l trackers) {
        C8595d c8595d;
        AbstractC4154l.m8923f(trackers, "trackers");
        C8901d c8901d = new C8901d((AbstractC0067f) trackers.f265b, 0);
        C8901d c8901d2 = new C8901d((C0062a) trackers.f268e);
        C8901d c8901d3 = new C8901d((AbstractC0067f) trackers.f267d, 4);
        AbstractC0067f abstractC0067f = (AbstractC0067f) trackers.f266c;
        C8901d c8901d4 = new C8901d(abstractC0067f, 2);
        C8901d c8901d5 = new C8901d(abstractC0067f, 3);
        C8904g c8904g = new C8904g(abstractC0067f);
        C8903f c8903f = new C8903f(abstractC0067f);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) trackers.f264a;
            int i10 = AbstractC8600i.f41852a;
            AbstractC4154l.m8923f(context, "context");
            Object systemService = context.getSystemService("connectivity");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            c8595d = new C8595d((ConnectivityManager) systemService);
        } else {
            c8595d = null;
        }
        this.f19011a = AbstractC6662l.m12729s(new InterfaceC8902e[]{c8901d, c8901d2, c8901d3, c8901d4, c8901d5, c8904g, c8903f, c8595d});
    }
}
