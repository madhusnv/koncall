package androidx.fragment.app;

import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2139h;
import java.io.PrintWriter;
import java.util.ArrayList;
import p001o.mja;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes2.dex */
public final class C2115a extends AbstractC2124j implements FragmentManager.InterfaceC2106m {

    /* renamed from: t */
    public final FragmentManager f7493t;

    /* renamed from: u */
    public boolean f7494u;

    /* renamed from: v */
    public int f7495v;

    /* renamed from: w */
    public boolean f7496w;

    public C2115a(FragmentManager fragmentManager) {
        super(fragmentManager.z0(), fragmentManager.C0() != null ? fragmentManager.C0().m18966f().getClassLoader() : null);
        this.f7495v = -1;
        this.f7496w = false;
        this.f7493t = fragmentManager;
    }

    /* renamed from: A */
    public void m6252A(String str, PrintWriter printWriter) {
        m6253B(str, printWriter, true);
    }

    /* renamed from: B */
    public void m6253B(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7589k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7495v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7494u);
            if (this.f7586h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7586h));
            }
            if (this.f7582d != 0 || this.f7583e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7582d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7583e));
            }
            if (this.f7584f != 0 || this.f7585g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7584f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7585g));
            }
            if (this.f7590l != 0 || this.f7591m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7590l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7591m);
            }
            if (this.f7592n != 0 || this.f7593o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7592n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7593o);
            }
        }
        if (this.f7581c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f7581c.size();
        for (int i = 0; i < size; i++) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(i);
            switch (aVar.f7598a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f7598a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f7599b);
            if (z) {
                if (aVar.f7601d != 0 || aVar.f7602e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f7601d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f7602e));
                }
                if (aVar.f7603f != 0 || aVar.f7604g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f7603f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f7604g));
                }
            }
        }
    }

    /* renamed from: C */
    public void m6254C() {
        int size = this.f7581c.size();
        for (int i = 0; i < size; i++) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(i);
            Fragment fragment = aVar.f7599b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f7496w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f7586h);
                fragment.setSharedElementNames(this.f7594p, this.f7595q);
            }
            switch (aVar.f7598a) {
                case 1:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.I1(fragment, false);
                    this.f7493t.m6198j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f7598a);
                case 3:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.v1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.M0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.I1(fragment, false);
                    this.f7493t.M1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.m6214z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.I1(fragment, false);
                    this.f7493t.m6204p(fragment);
                    break;
                case 8:
                    this.f7493t.K1(fragment);
                    break;
                case 9:
                    this.f7493t.K1(null);
                    break;
                case 10:
                    this.f7493t.J1(fragment, aVar.f7606i);
                    break;
            }
        }
    }

    /* renamed from: D */
    public void m6255D() {
        for (int size = this.f7581c.size() - 1; size >= 0; size--) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(size);
            Fragment fragment = aVar.f7599b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f7496w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.C1(this.f7586h));
                fragment.setSharedElementNames(this.f7595q, this.f7594p);
            }
            switch (aVar.f7598a) {
                case 1:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.I1(fragment, true);
                    this.f7493t.v1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f7598a);
                case 3:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.m6198j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.M1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.I1(fragment, true);
                    this.f7493t.M0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.m6204p(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f7601d, aVar.f7602e, aVar.f7603f, aVar.f7604g);
                    this.f7493t.I1(fragment, true);
                    this.f7493t.m6214z(fragment);
                    break;
                case 8:
                    this.f7493t.K1(null);
                    break;
                case 9:
                    this.f7493t.K1(fragment);
                    break;
                case 10:
                    this.f7493t.J1(fragment, aVar.f7605h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment m6256E(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f7581c.size()) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(i);
            int i2 = aVar.f7598a;
            if (i2 == 1) {
                arrayList.add(aVar.f7599b);
            } else if (i2 == 2) {
                Fragment fragment3 = aVar.f7599b;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f7581c.add(i, new AbstractC2124j.a(9, fragment4, true));
                                i++;
                                fragment2 = null;
                            }
                            AbstractC2124j.a aVar2 = new AbstractC2124j.a(3, fragment4, true);
                            aVar2.f7601d = aVar.f7601d;
                            aVar2.f7603f = aVar.f7603f;
                            aVar2.f7602e = aVar.f7602e;
                            aVar2.f7604g = aVar.f7604g;
                            this.f7581c.add(i, aVar2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.f7581c.remove(i);
                    i--;
                } else {
                    aVar.f7598a = 1;
                    aVar.f7600c = true;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(aVar.f7599b);
                Fragment fragment5 = aVar.f7599b;
                if (fragment5 == fragment2) {
                    this.f7581c.add(i, new AbstractC2124j.a(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 != 7) {
                if (i2 == 8) {
                    this.f7581c.add(i, new AbstractC2124j.a(9, fragment2, true));
                    aVar.f7600c = true;
                    i++;
                    fragment2 = aVar.f7599b;
                }
            }
            i++;
        }
        return fragment2;
    }

    /* renamed from: F */
    public String m6257F() {
        return this.f7589k;
    }

    /* renamed from: G */
    public void m6258G() {
        if (this.f7597s != null) {
            for (int i = 0; i < this.f7597s.size(); i++) {
                ((Runnable) this.f7597s.get(i)).run();
            }
            this.f7597s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment m6259H(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f7581c.size() - 1; size >= 0; size--) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(size);
            int i = aVar.f7598a;
            if (i == 1) {
                arrayList.remove(aVar.f7599b);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(aVar.f7599b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f7599b;
                        break;
                    case 10:
                        aVar.f7606i = aVar.f7605h;
                        break;
                }
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC2106m
    /* renamed from: a */
    public boolean mo6239a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7587i) {
            return true;
        }
        this.f7493t.m6197i(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: h */
    public int mo6260h() {
        return m6271z(false, true);
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: i */
    public int mo6261i() {
        return m6271z(true, true);
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: j */
    public void mo6262j() {
        m6424l();
        this.f7493t.e0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: k */
    public void mo6263k() {
        m6424l();
        this.f7493t.e0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: m */
    public void mo6264m(int i, Fragment fragment, String str, int i2) {
        super.mo6264m(i, fragment, str, i2);
        fragment.mFragmentManager = this.f7493t;
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: n */
    public boolean mo6265n() {
        return this.f7581c.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: o */
    public AbstractC2124j mo6266o(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f7493t) {
            return super.mo6266o(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: t */
    public AbstractC2124j mo6267t(Fragment fragment, AbstractC2139h.b bVar) {
        if (fragment.mFragmentManager != this.f7493t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f7493t);
        }
        if (bVar == AbstractC2139h.b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC2139h.b.DESTROYED) {
            return super.mo6267t(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7495v >= 0) {
            sb.append(" #");
            sb.append(this.f7495v);
        }
        if (this.f7589k != null) {
            sb.append(" ");
            sb.append(this.f7589k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC2124j
    /* renamed from: u */
    public AbstractC2124j mo6268u(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f7493t) {
            return super.mo6268u(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: x */
    public void m6269x(int i) {
        if (this.f7587i) {
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.f7581c.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(i2);
                Fragment fragment = aVar.f7599b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f7599b);
                        sb2.append(" to ");
                        sb2.append(aVar.f7599b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: y */
    public void m6270y() {
        int size = this.f7581c.size() - 1;
        while (size >= 0) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) this.f7581c.get(size);
            if (aVar.f7600c) {
                if (aVar.f7598a == 8) {
                    aVar.f7600c = false;
                    this.f7581c.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.f7599b.mContainerId;
                    aVar.f7598a = 2;
                    aVar.f7600c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        AbstractC2124j.a aVar2 = (AbstractC2124j.a) this.f7581c.get(i2);
                        if (aVar2.f7600c && aVar2.f7599b.mContainerId == i) {
                            this.f7581c.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* renamed from: z */
    public int m6271z(boolean z, boolean z2) {
        if (this.f7494u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new mja("FragmentManager"));
            m6252A("  ", printWriter);
            printWriter.close();
        }
        this.f7494u = true;
        if (this.f7587i) {
            this.f7495v = this.f7493t.m6202n();
        } else {
            this.f7495v = -1;
        }
        if (z2) {
            this.f7493t.b0(this, z);
        }
        return this.f7495v;
    }

    public C2115a(C2115a c2115a) {
        super(c2115a.f7493t.z0(), c2115a.f7493t.C0() != null ? c2115a.f7493t.C0().m18966f().getClassLoader() : null, c2115a);
        this.f7495v = -1;
        this.f7496w = false;
        this.f7493t = c2115a.f7493t;
        this.f7494u = c2115a.f7494u;
        this.f7495v = c2115a.f7495v;
        this.f7496w = c2115a.f7496w;
    }
}
