package ernestoyaquello.com.verticalstepperform;

import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ernestoyaquello.com.verticalstepperform.b */
/* loaded from: classes6.dex */
public abstract class AbstractC11918b {

    /* renamed from: a */
    public String f13893a;

    /* renamed from: b */
    public String f13894b;

    /* renamed from: c */
    public String f13895c;

    /* renamed from: d */
    public String f13896d;

    /* renamed from: e */
    public String f13897e;

    /* renamed from: f */
    public boolean f13898f;

    /* renamed from: g */
    public boolean f13899g;

    /* renamed from: h */
    public boolean f13900h;

    /* renamed from: i */
    public View f13901i;

    /* renamed from: j */
    public View f13902j;

    /* renamed from: k */
    public VerticalStepperFormView f13903k;

    /* renamed from: l */
    public List f13904l;

    /* renamed from: ernestoyaquello.com.verticalstepperform.b$a */
    public interface a {
        /* renamed from: a */
        void mo16146a(int i, boolean z);

        /* renamed from: b */
        void mo16147b(int i, boolean z);

        /* renamed from: c */
        void mo16148c(int i, boolean z);

        /* renamed from: d */
        void mo16149d(int i, boolean z);

        /* renamed from: e */
        void mo16150e(int i, boolean z);

        /* renamed from: f */
        void mo16151f(int i, boolean z);
    }

    /* renamed from: ernestoyaquello.com.verticalstepperform.b$b */
    public static class b {

        /* renamed from: a */
        public boolean f13905a;

        /* renamed from: b */
        public String f13906b;

        public b(boolean z) {
            this(z, "");
        }

        /* renamed from: a */
        public String m16199a() {
            return this.f13906b;
        }

        /* renamed from: b */
        public boolean m16200b() {
            return this.f13905a;
        }

        public b(boolean z, String str) {
            this.f13905a = z;
            this.f13906b = str;
        }
    }

    public AbstractC11918b(String str) {
        this(str, "");
    }

    /* renamed from: A */
    public abstract void mo16155A(boolean z);

    /* renamed from: B */
    public final void m16156B(boolean z) {
        Iterator it = this.f13904l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo16149d(m16182j(), z);
        }
    }

    /* renamed from: C */
    public final void m16157C(boolean z) {
        Iterator it = this.f13904l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo16147b(m16182j(), z);
        }
    }

    /* renamed from: D */
    public final void m16158D(boolean z) {
        Iterator it = this.f13904l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo16146a(m16182j(), z);
        }
    }

    /* renamed from: E */
    public final void m16159E(boolean z) {
        Iterator it = this.f13904l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo16151f(m16182j(), z);
        }
    }

    /* renamed from: F */
    public final void m16160F(boolean z) {
        Iterator it = this.f13904l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo16150e(m16182j(), z);
        }
    }

    /* renamed from: G */
    public final void m16161G(boolean z) {
        Iterator it = this.f13904l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo16148c(m16182j(), z);
        }
    }

    /* renamed from: H */
    public void m16162H(boolean z) {
        if (this.f13899g) {
            return;
        }
        m16170P(true, z);
    }

    /* renamed from: I */
    public void m16163I(boolean z) {
        this.f13900h = z;
    }

    /* renamed from: J */
    public abstract void mo16164J(Serializable serializable);

    /* renamed from: K */
    public void m16165K(Serializable serializable) {
        mo16164J(serializable);
    }

    /* renamed from: L */
    public void m16166L(View view) {
        this.f13902j = view;
    }

    /* renamed from: M */
    public final void m16167M(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        this.f13897e = str;
        m16157C(z);
    }

    /* renamed from: N */
    public void m16168N(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        this.f13896d = str;
        m16156B(z);
    }

    /* renamed from: O */
    public final void m16169O(boolean z, String str, boolean z2) {
        this.f13898f = z;
        m16167M(str, z2);
        m16158D(z2);
        if (z) {
            mo16197y(z2);
        } else {
            mo16198z(z2);
        }
    }

    /* renamed from: P */
    public final void m16170P(boolean z, boolean z2) {
        this.f13899g = z;
        m16159E(z2);
        if (z) {
            mo16155A(z2);
        } else {
            mo16196x(z2);
        }
    }

    /* renamed from: Q */
    public void m16171Q(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        this.f13895c = str;
        m16160F(z);
    }

    /* renamed from: R */
    public void m16172R(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        this.f13894b = str;
        m16161G(z);
    }

    /* renamed from: a */
    public void m16173a(a aVar) {
        if (this.f13904l.contains(aVar)) {
            return;
        }
        this.f13904l.add(aVar);
    }

    /* renamed from: b */
    public void m16174b(boolean z) {
        if (this.f13899g) {
            m16170P(false, z);
        }
    }

    /* renamed from: c */
    public abstract View mo16175c();

    /* renamed from: d */
    public View m16176d() {
        return this.f13902j;
    }

    /* renamed from: e */
    public Context m16177e() {
        return this.f13903k.getContext();
    }

    /* renamed from: f */
    public View m16178f() {
        return this.f13901i;
    }

    /* renamed from: g */
    public String m16179g() {
        String str = this.f13897e;
        return str == null ? "" : str;
    }

    /* renamed from: h */
    public VerticalStepperFormView m16180h() {
        return this.f13903k;
    }

    /* renamed from: i */
    public String m16181i() {
        String str = this.f13896d;
        return str == null ? "" : str;
    }

    /* renamed from: j */
    public int m16182j() {
        return this.f13903k.m16142w(this);
    }

    /* renamed from: k */
    public abstract Serializable mo16183k();

    /* renamed from: l */
    public abstract String mo16184l();

    /* renamed from: m */
    public String m16185m() {
        String str = this.f13895c;
        return str == null ? "" : str;
    }

    /* renamed from: n */
    public String m16186n() {
        String str = this.f13894b;
        return str == null ? "" : str;
    }

    /* renamed from: o */
    public boolean m16187o() {
        return this.f13900h;
    }

    /* renamed from: p */
    public void m16188p(View view, VerticalStepperFormView verticalStepperFormView) {
        this.f13901i = view;
        this.f13903k = verticalStepperFormView;
    }

    /* renamed from: q */
    public boolean m16189q() {
        return this.f13898f;
    }

    /* renamed from: r */
    public boolean m16190r() {
        return this.f13899g;
    }

    /* renamed from: s */
    public abstract b mo16191s(Serializable serializable);

    /* renamed from: t */
    public void m16192t(boolean z) {
        m16169O(true, "", z);
    }

    /* renamed from: u */
    public boolean m16193u(boolean z) {
        return m16194v(z, false);
    }

    /* renamed from: v */
    public boolean m16194v(boolean z, boolean z2) {
        b bVarMo16191s = mo16191s(mo16183k());
        if (bVarMo16191s == null) {
            bVarMo16191s = new b(true);
        }
        boolean zM16200b = bVarMo16191s.m16200b();
        if (this.f13898f == zM16200b) {
            this.f13900h = (z2 || zM16200b) ? false : true;
            m16167M(zM16200b ? "" : bVarMo16191s.m16199a(), z);
        } else if (zM16200b) {
            this.f13900h = false;
            m16192t(z);
        } else {
            this.f13900h = !z2;
            m16195w(bVarMo16191s.m16199a(), z);
        }
        return zM16200b;
    }

    /* renamed from: w */
    public void m16195w(String str, boolean z) {
        m16169O(false, str, z);
    }

    /* renamed from: x */
    public abstract void mo16196x(boolean z);

    /* renamed from: y */
    public abstract void mo16197y(boolean z);

    /* renamed from: z */
    public abstract void mo16198z(boolean z);

    public AbstractC11918b(String str, String str2) {
        this(str, str2, "");
    }

    public AbstractC11918b(String str, String str2, String str3) {
        this.f13894b = str;
        this.f13895c = str2;
        this.f13896d = str3;
        this.f13893a = str3;
        this.f13897e = "";
        this.f13904l = new ArrayList();
    }
}
