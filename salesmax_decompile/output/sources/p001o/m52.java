package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.AbstractC2145n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.pa2;

/* loaded from: classes2.dex */
public final class m52 implements u92 {

    /* renamed from: a */
    public final String f34804a;

    /* renamed from: b */
    public final s82 f34805b;

    /* renamed from: c */
    public final k52 f34806c;

    /* renamed from: e */
    public m42 f34808e;

    /* renamed from: h */
    public final C15224a f34811h;

    /* renamed from: j */
    public final l5e f34813j;

    /* renamed from: k */
    public final k76 f34814k;

    /* renamed from: l */
    public final z92 f34815l;

    /* renamed from: d */
    public final Object f34807d = new Object();

    /* renamed from: f */
    public C15224a f34809f = null;

    /* renamed from: g */
    public C15224a f34810g = null;

    /* renamed from: i */
    public List f34812i = null;

    /* renamed from: o.m52$a */
    public static class C15224a extends z9b {

        /* renamed from: a */
        public AbstractC2145n f34816a;

        /* renamed from: b */
        public final Object f34817b;

        public C15224a(Object obj) {
            this.f34817b = obj;
        }

        @Override // p001o.z9b
        public void addSource(AbstractC2145n abstractC2145n, n9c n9cVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void m38397c(AbstractC2145n abstractC2145n) {
            AbstractC2145n abstractC2145n2 = this.f34816a;
            if (abstractC2145n2 != null) {
                super.removeSource(abstractC2145n2);
            }
            this.f34816a = abstractC2145n;
            super.addSource(abstractC2145n, new n9c() { // from class: o.l52
                @Override // p001o.n9c
                public final void onChanged(Object obj) {
                    this.f33277a.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.AbstractC2145n
        public Object getValue() {
            AbstractC2145n abstractC2145n = this.f34816a;
            return abstractC2145n == null ? this.f34817b : abstractC2145n.getValue();
        }
    }

    public m52(String str, z92 z92Var) {
        String str2 = (String) fgd.m26663g(str);
        this.f34804a = str2;
        this.f34815l = z92Var;
        s82 s82VarM58952c = z92Var.m58952c(str2);
        this.f34805b = s82VarM58952c;
        this.f34806c = new k52(this);
        l5e l5eVarM35219a = ka2.m35219a(str, s82VarM58952c);
        this.f34813j = l5eVarM35219a;
        this.f34814k = new c72(str, l5eVarM35219a);
        this.f34811h = new C15224a(pa2.m43261a(pa2.EnumC16044b.CLOSED));
    }

    @Override // p001o.t92
    /* renamed from: a */
    public int mo38379a() {
        return mo38387j(0);
    }

    @Override // p001o.u92
    /* renamed from: b */
    public String mo38380b() {
        return this.f34804a;
    }

    @Override // p001o.u92
    /* renamed from: c */
    public void mo38381c(j72 j72Var) {
        synchronized (this.f34807d) {
            m42 m42Var = this.f34808e;
            if (m42Var != null) {
                m42Var.b0(j72Var);
                return;
            }
            List list = this.f34812i;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Pair) it.next()).first == j72Var) {
                    it.remove();
                }
            }
        }
    }

    @Override // p001o.t92
    /* renamed from: d */
    public int mo38382d() {
        Integer num = (Integer) this.f34805b.m47965a(CameraCharacteristics.LENS_FACING);
        fgd.m26658b(num != null, "Unable to get the lens facing of the camera.");
        return vba.m52507a(num.intValue());
    }

    @Override // p001o.u92
    /* renamed from: e */
    public List mo38383e(int i) {
        Size[] sizeArrM44875a = this.f34805b.m47966b().m44875a(i);
        return sizeArrM44875a != null ? Arrays.asList(sizeArrM44875a) : Collections.emptyList();
    }

    @Override // p001o.u92
    /* renamed from: f */
    public l5e mo38384f() {
        return this.f34813j;
    }

    @Override // p001o.u92
    /* renamed from: g */
    public List mo38385g(int i) {
        Size[] sizeArrM44877c = this.f34805b.m47966b().m44877c(i);
        return sizeArrM44877c != null ? Arrays.asList(sizeArrM44877c) : Collections.emptyList();
    }

    @Override // p001o.t92
    /* renamed from: i */
    public String mo38386i() {
        return m38392o() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // p001o.t92
    /* renamed from: j */
    public int mo38387j(int i) {
        return ha2.m30028a(ha2.m30029b(i), m38391n(), 1 == mo38382d());
    }

    @Override // p001o.u92
    /* renamed from: k */
    public void mo38388k(Executor executor, j72 j72Var) {
        synchronized (this.f34807d) {
            m42 m42Var = this.f34808e;
            if (m42Var != null) {
                m42Var.m38321u(executor, j72Var);
                return;
            }
            if (this.f34812i == null) {
                this.f34812i = new ArrayList();
            }
            this.f34812i.add(new Pair(j72Var, executor));
        }
    }

    /* renamed from: l */
    public k52 m38389l() {
        return this.f34806c;
    }

    /* renamed from: m */
    public s82 m38390m() {
        return this.f34805b;
    }

    /* renamed from: n */
    public int m38391n() {
        Integer num = (Integer) this.f34805b.m47965a(CameraCharacteristics.SENSOR_ORIENTATION);
        fgd.m26663g(num);
        return num.intValue();
    }

    /* renamed from: o */
    public int m38392o() {
        Integer num = (Integer) this.f34805b.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        fgd.m26663g(num);
        return num.intValue();
    }

    /* renamed from: p */
    public void m38393p(m42 m42Var) {
        synchronized (this.f34807d) {
            this.f34808e = m42Var;
            C15224a c15224a = this.f34810g;
            if (c15224a != null) {
                c15224a.m38397c(m42Var.m38314I().m28559d());
            }
            C15224a c15224a2 = this.f34809f;
            if (c15224a2 != null) {
                c15224a2.m38397c(this.f34808e.m38312G().m48891c());
            }
            List<Pair> list = this.f34812i;
            if (list != null) {
                for (Pair pair : list) {
                    this.f34808e.m38321u((Executor) pair.second, (j72) pair.first);
                }
                this.f34812i = null;
            }
        }
        m38394q();
    }

    /* renamed from: q */
    public final void m38394q() {
        m38395r();
    }

    /* renamed from: r */
    public final void m38395r() {
        String str;
        int iM38392o = m38392o();
        if (iM38392o == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iM38392o == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iM38392o == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iM38392o == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iM38392o != 4) {
            str = "Unknown value: " + iM38392o;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        wja.m54631e("Camera2CameraInfo", "Device Level: " + str);
    }

    /* renamed from: s */
    public void m38396s(AbstractC2145n abstractC2145n) {
        this.f34811h.m38397c(abstractC2145n);
    }
}
