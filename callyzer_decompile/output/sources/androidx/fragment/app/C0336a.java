package androidx.fragment.app;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import y6.AbstractC8565c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0336a implements f1 {

    /* renamed from: a */
    public final ArrayList f2434a;

    /* renamed from: b */
    public int f2435b;

    /* renamed from: c */
    public int f2436c;

    /* renamed from: d */
    public int f2437d;

    /* renamed from: e */
    public int f2438e;

    /* renamed from: f */
    public int f2439f;

    /* renamed from: g */
    public boolean f2440g;

    /* renamed from: h */
    public boolean f2441h;

    /* renamed from: i */
    public String f2442i;

    /* renamed from: j */
    public int f2443j;

    /* renamed from: k */
    public CharSequence f2444k;

    /* renamed from: l */
    public int f2445l;

    /* renamed from: m */
    public CharSequence f2446m;

    /* renamed from: n */
    public ArrayList f2447n;

    /* renamed from: o */
    public ArrayList f2448o;

    /* renamed from: p */
    public boolean f2449p;

    /* renamed from: q */
    public ArrayList f2450q;

    /* renamed from: r */
    public final j1 f2451r;

    /* renamed from: s */
    public boolean f2452s;

    /* renamed from: t */
    public int f2453t;

    /* renamed from: u */
    public boolean f2454u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0336a(j1 j1Var) {
        this();
        j1Var.m1161I();
        u0 u0Var = j1Var.f2601w;
        if (u0Var != null) {
            u0Var.f2708b.getClassLoader();
        }
        this.f2453t = -1;
        this.f2454u = false;
        this.f2451r = j1Var;
    }

    @Override // androidx.fragment.app.f1
    /* renamed from: a */
    public final boolean mo1086a(ArrayList arrayList, ArrayList arrayList2) {
        if (j1.m1152K(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2440g) {
            return true;
        }
        this.f2451r.f2582d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m1087b(u1 u1Var) {
        this.f2434a.add(u1Var);
        u1Var.f2714d = this.f2435b;
        u1Var.f2715e = this.f2436c;
        u1Var.f2716f = this.f2437d;
        u1Var.f2717g = this.f2438e;
    }

    /* renamed from: c */
    public final void m1088c(int i10) {
        if (this.f2440g) {
            if (j1.m1152K(2)) {
                toString();
            }
            ArrayList arrayList = this.f2434a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                u1 u1Var = (u1) arrayList.get(i11);
                j0 j0Var = u1Var.f2712b;
                if (j0Var != null) {
                    j0Var.mBackStackNesting += i10;
                    if (j1.m1152K(2)) {
                        Objects.toString(u1Var.f2712b);
                        int i12 = u1Var.f2712b.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1089d() {
        ArrayList arrayList = this.f2434a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            u1 u1Var = (u1) arrayList.get(size);
            if (u1Var.f2713c) {
                if (u1Var.f2711a == 8) {
                    u1Var.f2713c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = u1Var.f2712b.mContainerId;
                    u1Var.f2711a = 2;
                    u1Var.f2713c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        u1 u1Var2 = (u1) arrayList.get(i11);
                        if (u1Var2.f2713c && u1Var2.f2712b.mContainerId == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* renamed from: e */
    public final void m1090e() {
        m1091f(false, true);
    }

    /* renamed from: f */
    public final int m1091f(boolean z6, boolean z10) {
        if (this.f2452s) {
            throw new IllegalStateException("commit already called");
        }
        if (j1.m1152K(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new e2());
            m1093h("  ", printWriter, true);
            printWriter.close();
        }
        this.f2452s = true;
        boolean z11 = this.f2440g;
        j1 j1Var = this.f2451r;
        if (z11) {
            this.f2453t = j1Var.f2589k.getAndIncrement();
        } else {
            this.f2453t = -1;
        }
        if (z10) {
            j1Var.m1199x(this, z6);
        }
        return this.f2453t;
    }

    /* renamed from: g */
    public final void m1092g(int i10, j0 j0Var, String str, int i11) {
        String str2 = j0Var.mPreviousWho;
        if (str2 != null) {
            AbstractC8565c.m15833c(j0Var, str2);
        }
        Class<?> cls = j0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = j0Var.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(j0Var);
                sb2.append(": was ");
                throw new IllegalStateException(p020v.a1.m14335o(sb2, j0Var.mTag, " now ", str));
            }
            j0Var.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + j0Var + " with tag " + str + " to container view with no id");
            }
            int i12 = j0Var.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + j0Var + ": was " + j0Var.mFragmentId + " now " + i10);
            }
            j0Var.mFragmentId = i10;
            j0Var.mContainerId = i10;
        }
        m1087b(new u1(j0Var, i11));
        j0Var.mFragmentManager = this.f2451r;
    }

    /* renamed from: h */
    public final void m1093h(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2442i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2453t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2452s);
            if (this.f2439f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2439f));
            }
            if (this.f2435b != 0 || this.f2436c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2435b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2436c));
            }
            if (this.f2437d != 0 || this.f2438e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2437d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2438e));
            }
            if (this.f2443j != 0 || this.f2444k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2443j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2444k);
            }
            if (this.f2445l != 0 || this.f2446m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2445l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2446m);
            }
        }
        ArrayList arrayList = this.f2434a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1 u1Var = (u1) arrayList.get(i10);
            switch (u1Var.f2711a) {
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
                    str2 = "cmd=" + u1Var.f2711a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(u1Var.f2712b);
            if (z6) {
                if (u1Var.f2714d != 0 || u1Var.f2715e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(u1Var.f2714d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(u1Var.f2715e));
                }
                if (u1Var.f2716f != 0 || u1Var.f2717g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(u1Var.f2716f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(u1Var.f2717g));
                }
            }
        }
    }

    /* renamed from: i */
    public final void m1094i(j0 j0Var) {
        j1 j1Var = j0Var.mFragmentManager;
        if (j1Var == null || j1Var == this.f2451r) {
            m1087b(new u1(j0Var, 8));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + j0Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2453t >= 0) {
            sb2.append(" #");
            sb2.append(this.f2453t);
        }
        if (this.f2442i != null) {
            sb2.append(" ");
            sb2.append(this.f2442i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0336a(C0336a c0336a) {
        this();
        c0336a.f2451r.m1161I();
        u0 u0Var = c0336a.f2451r.f2601w;
        if (u0Var != null) {
            u0Var.f2708b.getClassLoader();
        }
        ArrayList arrayList = c0336a.f2434a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u1 u1Var = (u1) obj;
            ArrayList arrayList2 = this.f2434a;
            u1 u1Var2 = new u1();
            u1Var2.f2711a = u1Var.f2711a;
            u1Var2.f2712b = u1Var.f2712b;
            u1Var2.f2713c = u1Var.f2713c;
            u1Var2.f2714d = u1Var.f2714d;
            u1Var2.f2715e = u1Var.f2715e;
            u1Var2.f2716f = u1Var.f2716f;
            u1Var2.f2717g = u1Var.f2717g;
            u1Var2.f2718h = u1Var.f2718h;
            u1Var2.f2719i = u1Var.f2719i;
            arrayList2.add(u1Var2);
        }
        this.f2435b = c0336a.f2435b;
        this.f2436c = c0336a.f2436c;
        this.f2437d = c0336a.f2437d;
        this.f2438e = c0336a.f2438e;
        this.f2439f = c0336a.f2439f;
        this.f2440g = c0336a.f2440g;
        this.f2441h = c0336a.f2441h;
        this.f2442i = c0336a.f2442i;
        this.f2445l = c0336a.f2445l;
        this.f2446m = c0336a.f2446m;
        this.f2443j = c0336a.f2443j;
        this.f2444k = c0336a.f2444k;
        if (c0336a.f2447n != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f2447n = arrayList3;
            arrayList3.addAll(c0336a.f2447n);
        }
        if (c0336a.f2448o != null) {
            ArrayList arrayList4 = new ArrayList();
            this.f2448o = arrayList4;
            arrayList4.addAll(c0336a.f2448o);
        }
        this.f2449p = c0336a.f2449p;
        this.f2453t = -1;
        this.f2454u = false;
        this.f2451r = c0336a.f2451r;
        this.f2452s = c0336a.f2452s;
        this.f2453t = c0336a.f2453t;
        this.f2454u = c0336a.f2454u;
    }

    public C0336a() {
        this.f2434a = new ArrayList();
        this.f2441h = true;
        this.f2449p = false;
    }
}
