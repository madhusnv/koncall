package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.view.Display;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.AbstractC2321i;
import androidx.mediarouter.media.AbstractC2322j;
import androidx.mediarouter.media.AbstractC2323k;
import androidx.mediarouter.media.C2315c;
import androidx.mediarouter.media.C2317e;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.CredentialsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.bae;
import p001o.e7b;
import p001o.l8b;

/* renamed from: androidx.mediarouter.media.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2327o extends AbstractC2316d {

    /* renamed from: androidx.mediarouter.media.o$a */
    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.d, androidx.mediarouter.media.AbstractC2327o.c, androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: O */
        public void mo8504O(b.C19572b c19572b, C2315c.a aVar) {
            super.mo8504O(c19572b, aVar);
            aVar.m8168i(l8b.m36746a(c19572b.f9407a));
        }
    }

    /* renamed from: androidx.mediarouter.media.o$b */
    public static class b extends AbstractC2327o implements AbstractC2321i.a, AbstractC2321i.e {

        /* renamed from: Z */
        public static final ArrayList f9395Z;
        public static final ArrayList h0;

        /* renamed from: H */
        public final Object f9396H;

        /* renamed from: L */
        public int f9397L;

        /* renamed from: M */
        public boolean f9398M;

        /* renamed from: Q */
        public boolean f9399Q;

        /* renamed from: X */
        public final ArrayList f9400X;

        /* renamed from: Y */
        public final ArrayList f9401Y;

        /* renamed from: q */
        public final e f9402q;

        /* renamed from: s */
        public final Object f9403s;

        /* renamed from: x */
        public final Object f9404x;

        /* renamed from: y */
        public final Object f9405y;

        /* renamed from: androidx.mediarouter.media.o$b$a */
        public static final class a extends AbstractC2316d.e {

            /* renamed from: a */
            public final Object f9406a;

            public a(Object obj) {
                this.f9406a = obj;
            }

            @Override // androidx.mediarouter.media.AbstractC2316d.e
            /* renamed from: g */
            public void mo8097g(int i) {
                AbstractC2321i.c.m8411i(this.f9406a, i);
            }

            @Override // androidx.mediarouter.media.AbstractC2316d.e
            /* renamed from: j */
            public void mo8098j(int i) {
                AbstractC2321i.c.m8412j(this.f9406a, i);
            }
        }

        /* renamed from: androidx.mediarouter.media.o$b$b, reason: collision with other inner class name */
        public static final class C19572b {

            /* renamed from: a */
            public final Object f9407a;

            /* renamed from: b */
            public final String f9408b;

            /* renamed from: c */
            public C2315c f9409c;

            public C19572b(Object obj, String str) {
                this.f9407a = obj;
                this.f9408b = str;
            }
        }

        /* renamed from: androidx.mediarouter.media.o$b$c */
        public static final class c {

            /* renamed from: a */
            public final C2319g.h f9410a;

            /* renamed from: b */
            public final Object f9411b;

            public c(C2319g.h hVar, Object obj) {
                this.f9410a = hVar;
                this.f9411b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList arrayList = new ArrayList();
            f9395Z = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList arrayList2 = new ArrayList();
            h0 = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.f9400X = new ArrayList();
            this.f9401Y = new ArrayList();
            this.f9402q = eVar;
            Object objM8389e = AbstractC2321i.m8389e(context);
            this.f9403s = objM8389e;
            this.f9404x = mo8507G();
            this.f9405y = m8508H();
            this.f9396H = AbstractC2321i.m8386b(objM8389e, context.getResources().getString(bae.mr_user_route_category_name), false);
            m8519T();
        }

        @Override // androidx.mediarouter.media.AbstractC2327o
        /* renamed from: A */
        public void mo8500A(C2319g.h hVar) {
            if (hVar.m8364r() == this) {
                int iM8509I = m8509I(AbstractC2321i.m8391g(this.f9403s, 8388611));
                if (iM8509I < 0 || !((C19572b) this.f9400X.get(iM8509I)).f9408b.equals(hVar.m8351e())) {
                    return;
                }
                hVar.m8343I();
                return;
            }
            Object objM8387c = AbstractC2321i.m8387c(this.f9403s, this.f9396H);
            c cVar = new c(hVar, objM8387c);
            AbstractC2321i.c.m8413k(objM8387c, cVar);
            AbstractC2321i.d.m8419f(objM8387c, this.f9405y);
            mo8520U(cVar);
            this.f9401Y.add(cVar);
            AbstractC2321i.m8385a(this.f9403s, objM8387c);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o
        /* renamed from: B */
        public void mo8501B(C2319g.h hVar) {
            int iM8511K;
            if (hVar.m8364r() == this || (iM8511K = m8511K(hVar)) < 0) {
                return;
            }
            mo8520U((c) this.f9401Y.get(iM8511K));
        }

        @Override // androidx.mediarouter.media.AbstractC2327o
        /* renamed from: C */
        public void mo8502C(C2319g.h hVar) {
            int iM8511K;
            if (hVar.m8364r() == this || (iM8511K = m8511K(hVar)) < 0) {
                return;
            }
            c cVar = (c) this.f9401Y.remove(iM8511K);
            AbstractC2321i.c.m8413k(cVar.f9411b, null);
            AbstractC2321i.d.m8419f(cVar.f9411b, null);
            AbstractC2321i.m8393i(this.f9403s, cVar.f9411b);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o
        /* renamed from: D */
        public void mo8503D(C2319g.h hVar) {
            if (hVar.m8338C()) {
                if (hVar.m8364r() != this) {
                    int iM8511K = m8511K(hVar);
                    if (iM8511K >= 0) {
                        mo8516Q(((c) this.f9401Y.get(iM8511K)).f9411b);
                        return;
                    }
                    return;
                }
                int iM8510J = m8510J(hVar.m8351e());
                if (iM8510J >= 0) {
                    mo8516Q(((C19572b) this.f9400X.get(iM8510J)).f9407a);
                }
            }
        }

        /* renamed from: E */
        public final boolean m8505E(Object obj) {
            if (m8514N(obj) != null || m8509I(obj) >= 0) {
                return false;
            }
            C19572b c19572b = new C19572b(obj, m8506F(obj));
            m8518S(c19572b);
            this.f9400X.add(c19572b);
            return true;
        }

        /* renamed from: F */
        public final String m8506F(Object obj) {
            String str = mo8512L() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(m8513M(obj).hashCode()));
            if (m8510J(str) < 0) {
                return str;
            }
            int i = 2;
            while (true) {
                String str2 = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i));
                if (m8510J(str2) < 0) {
                    return str2;
                }
                i++;
            }
        }

        /* renamed from: G */
        public abstract Object mo8507G();

        /* renamed from: H */
        public Object m8508H() {
            return AbstractC2321i.m8388d(this);
        }

        /* renamed from: I */
        public int m8509I(Object obj) {
            int size = this.f9400X.size();
            for (int i = 0; i < size; i++) {
                if (((C19572b) this.f9400X.get(i)).f9407a == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: J */
        public int m8510J(String str) {
            int size = this.f9400X.size();
            for (int i = 0; i < size; i++) {
                if (((C19572b) this.f9400X.get(i)).f9408b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: K */
        public int m8511K(C2319g.h hVar) {
            int size = this.f9401Y.size();
            for (int i = 0; i < size; i++) {
                if (((c) this.f9401Y.get(i)).f9410a == hVar) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: L */
        public abstract Object mo8512L();

        /* renamed from: M */
        public String m8513M(Object obj) {
            CharSequence charSequenceM8403a = AbstractC2321i.c.m8403a(obj, m8182n());
            return charSequenceM8403a != null ? charSequenceM8403a.toString() : "";
        }

        /* renamed from: N */
        public c m8514N(Object obj) {
            Object objM8407e = AbstractC2321i.c.m8407e(obj);
            if (objM8407e instanceof c) {
                return (c) objM8407e;
            }
            return null;
        }

        /* renamed from: O */
        public void mo8504O(C19572b c19572b, C2315c.a aVar) {
            int iM8406d = AbstractC2321i.c.m8406d(c19572b.f9407a);
            if ((iM8406d & 1) != 0) {
                aVar.m8161b(f9395Z);
            }
            if ((iM8406d & 2) != 0) {
                aVar.m8161b(h0);
            }
            aVar.m8175p(AbstractC2321i.c.m8405c(c19572b.f9407a));
            aVar.m8174o(AbstractC2321i.c.m8404b(c19572b.f9407a));
            aVar.m8177r(AbstractC2321i.c.m8408f(c19572b.f9407a));
            aVar.m8179t(AbstractC2321i.c.m8410h(c19572b.f9407a));
            aVar.m8178s(AbstractC2321i.c.m8409g(c19572b.f9407a));
        }

        /* renamed from: P */
        public void m8515P() {
            C2317e.a aVar = new C2317e.a();
            int size = this.f9400X.size();
            for (int i = 0; i < size; i++) {
                aVar.m8214a(((C19572b) this.f9400X.get(i)).f9409c);
            }
            m8187w(aVar.m8216c());
        }

        /* renamed from: Q */
        public abstract void mo8516Q(Object obj);

        /* renamed from: R */
        public abstract void mo8517R();

        /* renamed from: S */
        public void m8518S(C19572b c19572b) {
            C2315c.a aVar = new C2315c.a(c19572b.f9408b, m8513M(c19572b.f9407a));
            mo8504O(c19572b, aVar);
            c19572b.f9409c = aVar.m8164e();
        }

        /* renamed from: T */
        public final void m8519T() {
            mo8517R();
            Iterator it = AbstractC2321i.m8390f(this.f9403s).iterator();
            boolean zM8505E = false;
            while (it.hasNext()) {
                zM8505E |= m8505E(it.next());
            }
            if (zM8505E) {
                m8515P();
            }
        }

        /* renamed from: U */
        public void mo8520U(c cVar) {
            AbstractC2321i.d.m8414a(cVar.f9411b, cVar.f9410a.m8359m());
            AbstractC2321i.d.m8416c(cVar.f9411b, cVar.f9410a.m8361o());
            AbstractC2321i.d.m8415b(cVar.f9411b, cVar.f9410a.m8360n());
            AbstractC2321i.d.m8418e(cVar.f9411b, cVar.f9410a.m8365s());
            AbstractC2321i.d.m8421h(cVar.f9411b, cVar.f9410a.m8367u());
            AbstractC2321i.d.m8420g(cVar.f9411b, cVar.f9410a.m8366t());
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.e
        /* renamed from: a */
        public void mo8422a(Object obj, int i) {
            c cVarM8514N = m8514N(obj);
            if (cVarM8514N != null) {
                cVarM8514N.f9410a.m8342H(i);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: b */
        public void mo8395b(Object obj, Object obj2) {
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: c */
        public void mo8396c(Object obj, Object obj2, int i) {
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.e
        /* renamed from: d */
        public void mo8423d(Object obj, int i) {
            c cVarM8514N = m8514N(obj);
            if (cVarM8514N != null) {
                cVarM8514N.f9410a.m8341G(i);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: e */
        public void mo8397e(Object obj) {
            int iM8509I;
            if (m8514N(obj) != null || (iM8509I = m8509I(obj)) < 0) {
                return;
            }
            m8518S((C19572b) this.f9400X.get(iM8509I));
            m8515P();
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: f */
        public void mo8398f(int i, Object obj) {
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: g */
        public void mo8399g(Object obj) {
            int iM8509I;
            if (m8514N(obj) != null || (iM8509I = m8509I(obj)) < 0) {
                return;
            }
            this.f9400X.remove(iM8509I);
            m8515P();
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: h */
        public void mo8400h(int i, Object obj) {
            if (obj != AbstractC2321i.m8391g(this.f9403s, 8388611)) {
                return;
            }
            c cVarM8514N = m8514N(obj);
            if (cVarM8514N != null) {
                cVarM8514N.f9410a.m8343I();
                return;
            }
            int iM8509I = m8509I(obj);
            if (iM8509I >= 0) {
                this.f9402q.mo8283c(((C19572b) this.f9400X.get(iM8509I)).f9408b);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: j */
        public void mo8401j(Object obj) {
            if (m8505E(obj)) {
                m8515P();
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2321i.a
        /* renamed from: k */
        public void mo8402k(Object obj) {
            int iM8509I;
            if (m8514N(obj) != null || (iM8509I = m8509I(obj)) < 0) {
                return;
            }
            C19572b c19572b = (C19572b) this.f9400X.get(iM8509I);
            int iM8408f = AbstractC2321i.c.m8408f(obj);
            if (iM8408f != c19572b.f9409c.m8155u()) {
                c19572b.f9409c = new C2315c.a(c19572b.f9409c).m8177r(iM8408f).m8164e();
                m8515P();
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d
        /* renamed from: s */
        public AbstractC2316d.e mo8087s(String str) {
            int iM8510J = m8510J(str);
            if (iM8510J >= 0) {
                return new a(((C19572b) this.f9400X.get(iM8510J)).f9407a);
            }
            return null;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d
        /* renamed from: u */
        public void mo8089u(e7b e7bVar) {
            boolean zM24486e;
            int i = 0;
            if (e7bVar != null) {
                List listM8223e = e7bVar.m24485d().m8223e();
                int size = listM8223e.size();
                int i2 = 0;
                while (i < size) {
                    String str = (String) listM8223e.get(i);
                    i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    i++;
                }
                zM24486e = e7bVar.m24486e();
                i = i2;
            } else {
                zM24486e = false;
            }
            if (this.f9397L == i && this.f9398M == zM24486e) {
                return;
            }
            this.f9397L = i;
            this.f9398M = zM24486e;
            m8519T();
        }
    }

    /* renamed from: androidx.mediarouter.media.o$c */
    public static class c extends b implements AbstractC2322j.a {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: G */
        public Object mo8507G() {
            return AbstractC2322j.m8424a(this);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: O */
        public void mo8504O(b.C19572b c19572b, C2315c.a aVar) {
            super.mo8504O(c19572b, aVar);
            if (!AbstractC2322j.c.m8427b(c19572b.f9407a)) {
                aVar.m8169j(false);
            }
            if (mo8521V(c19572b)) {
                aVar.m8166g(1);
            }
            Display displayM8426a = AbstractC2322j.c.m8426a(c19572b.f9407a);
            if (displayM8426a != null) {
                aVar.m8176q(displayM8426a.getDisplayId());
            }
        }

        /* renamed from: V */
        public abstract boolean mo8521V(b.C19572b c19572b);

        @Override // androidx.mediarouter.media.AbstractC2322j.a
        /* renamed from: i */
        public void mo8425i(Object obj) {
            int iM8509I = m8509I(obj);
            if (iM8509I >= 0) {
                b.C19572b c19572b = (b.C19572b) this.f9400X.get(iM8509I);
                Display displayM8426a = AbstractC2322j.c.m8426a(obj);
                int displayId = displayM8426a != null ? displayM8426a.getDisplayId() : -1;
                if (displayId != c19572b.f9409c.m8153s()) {
                    c19572b.f9409c = new C2315c.a(c19572b.f9409c).m8176q(displayId).m8164e();
                    m8515P();
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.o$d */
    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: L */
        public Object mo8512L() {
            return AbstractC2323k.m8429b(this.f9403s);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.c, androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: O */
        public void mo8504O(b.C19572b c19572b, C2315c.a aVar) {
            super.mo8504O(c19572b, aVar);
            CharSequence charSequenceM8430a = AbstractC2323k.a.m8430a(c19572b.f9407a);
            if (charSequenceM8430a != null) {
                aVar.m8167h(charSequenceM8430a.toString());
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: Q */
        public void mo8516Q(Object obj) {
            AbstractC2321i.m8394j(this.f9403s, 8388611, obj);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: R */
        public void mo8517R() {
            if (this.f9399Q) {
                AbstractC2321i.m8392h(this.f9403s, this.f9404x);
            }
            this.f9399Q = true;
            AbstractC2323k.m8428a(this.f9403s, this.f9397L, this.f9404x, (this.f9398M ? 1 : 0) | 2);
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.b
        /* renamed from: U */
        public void mo8520U(b.c cVar) {
            super.mo8520U(cVar);
            AbstractC2323k.b.m8432a(cVar.f9411b, cVar.f9410a.m8350d());
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.c
        /* renamed from: V */
        public boolean mo8521V(b.C19572b c19572b) {
            return AbstractC2323k.a.m8431b(c19572b.f9407a);
        }
    }

    /* renamed from: androidx.mediarouter.media.o$e */
    public interface e {
        /* renamed from: c */
        void mo8283c(String str);
    }

    public AbstractC2327o(Context context) {
        super(context, new AbstractC2316d.d(new ComponentName(CredentialsData.CREDENTIALS_TYPE_ANDROID, AbstractC2327o.class.getName())));
    }

    /* renamed from: z */
    public static AbstractC2327o m8499z(Context context, e eVar) {
        return new a(context, eVar);
    }

    /* renamed from: A */
    public abstract void mo8500A(C2319g.h hVar);

    /* renamed from: B */
    public abstract void mo8501B(C2319g.h hVar);

    /* renamed from: C */
    public abstract void mo8502C(C2319g.h hVar);

    /* renamed from: D */
    public abstract void mo8503D(C2319g.h hVar);
}
