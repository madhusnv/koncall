package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2139h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.hi7;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes2.dex */
public abstract class AbstractC2124j {

    /* renamed from: a */
    public final AbstractC2118d f7579a;

    /* renamed from: b */
    public final ClassLoader f7580b;

    /* renamed from: c */
    public ArrayList f7581c;

    /* renamed from: d */
    public int f7582d;

    /* renamed from: e */
    public int f7583e;

    /* renamed from: f */
    public int f7584f;

    /* renamed from: g */
    public int f7585g;

    /* renamed from: h */
    public int f7586h;

    /* renamed from: i */
    public boolean f7587i;

    /* renamed from: j */
    public boolean f7588j;

    /* renamed from: k */
    public String f7589k;

    /* renamed from: l */
    public int f7590l;

    /* renamed from: m */
    public CharSequence f7591m;

    /* renamed from: n */
    public int f7592n;

    /* renamed from: o */
    public CharSequence f7593o;

    /* renamed from: p */
    public ArrayList f7594p;

    /* renamed from: q */
    public ArrayList f7595q;

    /* renamed from: r */
    public boolean f7596r;

    /* renamed from: s */
    public ArrayList f7597s;

    /* renamed from: androidx.fragment.app.j$a */
    public static final class a {

        /* renamed from: a */
        public int f7598a;

        /* renamed from: b */
        public Fragment f7599b;

        /* renamed from: c */
        public boolean f7600c;

        /* renamed from: d */
        public int f7601d;

        /* renamed from: e */
        public int f7602e;

        /* renamed from: f */
        public int f7603f;

        /* renamed from: g */
        public int f7604g;

        /* renamed from: h */
        public AbstractC2139h.b f7605h;

        /* renamed from: i */
        public AbstractC2139h.b f7606i;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f7598a = i;
            this.f7599b = fragment;
            this.f7600c = false;
            AbstractC2139h.b bVar = AbstractC2139h.b.RESUMED;
            this.f7605h = bVar;
            this.f7606i = bVar;
        }

        public a(int i, Fragment fragment, boolean z) {
            this.f7598a = i;
            this.f7599b = fragment;
            this.f7600c = z;
            AbstractC2139h.b bVar = AbstractC2139h.b.RESUMED;
            this.f7605h = bVar;
            this.f7606i = bVar;
        }

        public a(int i, Fragment fragment, AbstractC2139h.b bVar) {
            this.f7598a = i;
            this.f7599b = fragment;
            this.f7600c = false;
            this.f7605h = fragment.mMaxState;
            this.f7606i = bVar;
        }

        public a(a aVar) {
            this.f7598a = aVar.f7598a;
            this.f7599b = aVar.f7599b;
            this.f7600c = aVar.f7600c;
            this.f7601d = aVar.f7601d;
            this.f7602e = aVar.f7602e;
            this.f7603f = aVar.f7603f;
            this.f7604g = aVar.f7604g;
            this.f7605h = aVar.f7605h;
            this.f7606i = aVar.f7606i;
        }
    }

    public AbstractC2124j(AbstractC2118d abstractC2118d, ClassLoader classLoader) {
        this.f7581c = new ArrayList();
        this.f7588j = true;
        this.f7596r = false;
        this.f7579a = abstractC2118d;
        this.f7580b = classLoader;
    }

    /* renamed from: b */
    public AbstractC2124j m6418b(int i, Fragment fragment) {
        mo6264m(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC2124j m6419c(int i, Fragment fragment, String str) {
        mo6264m(i, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    public final AbstractC2124j m6420d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return m6419c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public AbstractC2124j m6421e(Fragment fragment, String str) {
        mo6264m(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    public void m6422f(a aVar) {
        this.f7581c.add(aVar);
        aVar.f7601d = this.f7582d;
        aVar.f7602e = this.f7583e;
        aVar.f7603f = this.f7584f;
        aVar.f7604g = this.f7585g;
    }

    /* renamed from: g */
    public AbstractC2124j m6423g(String str) {
        if (!this.f7588j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f7587i = true;
        this.f7589k = str;
        return this;
    }

    /* renamed from: h */
    public abstract int mo6260h();

    /* renamed from: i */
    public abstract int mo6261i();

    /* renamed from: j */
    public abstract void mo6262j();

    /* renamed from: k */
    public abstract void mo6263k();

    /* renamed from: l */
    public AbstractC2124j m6424l() {
        if (this.f7587i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f7588j = false;
        return this;
    }

    /* renamed from: m */
    public void mo6264m(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            hi7.m30612f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        m6422f(new a(i2, fragment));
    }

    /* renamed from: n */
    public abstract boolean mo6265n();

    /* renamed from: o */
    public AbstractC2124j mo6266o(Fragment fragment) {
        m6422f(new a(3, fragment));
        return this;
    }

    /* renamed from: p */
    public AbstractC2124j m6425p(int i, Fragment fragment) {
        return m6426q(i, fragment, null);
    }

    /* renamed from: q */
    public AbstractC2124j m6426q(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo6264m(i, fragment, str, 2);
        return this;
    }

    /* renamed from: r */
    public AbstractC2124j m6427r(boolean z, Runnable runnable) {
        if (!z) {
            m6424l();
        }
        if (this.f7597s == null) {
            this.f7597s = new ArrayList();
        }
        this.f7597s.add(runnable);
        return this;
    }

    /* renamed from: s */
    public AbstractC2124j m6428s(int i, int i2, int i3, int i4) {
        this.f7582d = i;
        this.f7583e = i2;
        this.f7584f = i3;
        this.f7585g = i4;
        return this;
    }

    /* renamed from: t */
    public AbstractC2124j mo6267t(Fragment fragment, AbstractC2139h.b bVar) {
        m6422f(new a(10, fragment, bVar));
        return this;
    }

    /* renamed from: u */
    public AbstractC2124j mo6268u(Fragment fragment) {
        m6422f(new a(8, fragment));
        return this;
    }

    /* renamed from: v */
    public AbstractC2124j m6429v(boolean z) {
        this.f7596r = z;
        return this;
    }

    /* renamed from: w */
    public AbstractC2124j m6430w(int i) {
        this.f7586h = i;
        return this;
    }

    public AbstractC2124j(AbstractC2118d abstractC2118d, ClassLoader classLoader, AbstractC2124j abstractC2124j) {
        this(abstractC2118d, classLoader);
        Iterator it = abstractC2124j.f7581c.iterator();
        while (it.hasNext()) {
            this.f7581c.add(new a((a) it.next()));
        }
        this.f7582d = abstractC2124j.f7582d;
        this.f7583e = abstractC2124j.f7583e;
        this.f7584f = abstractC2124j.f7584f;
        this.f7585g = abstractC2124j.f7585g;
        this.f7586h = abstractC2124j.f7586h;
        this.f7587i = abstractC2124j.f7587i;
        this.f7588j = abstractC2124j.f7588j;
        this.f7589k = abstractC2124j.f7589k;
        this.f7592n = abstractC2124j.f7592n;
        this.f7593o = abstractC2124j.f7593o;
        this.f7590l = abstractC2124j.f7590l;
        this.f7591m = abstractC2124j.f7591m;
        if (abstractC2124j.f7594p != null) {
            ArrayList arrayList = new ArrayList();
            this.f7594p = arrayList;
            arrayList.addAll(abstractC2124j.f7594p);
        }
        if (abstractC2124j.f7595q != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f7595q = arrayList2;
            arrayList2.addAll(abstractC2124j.f7595q);
        }
        this.f7596r = abstractC2124j.f7596r;
    }
}
