package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import b6.InterfaceC0600a;
import bl.C0689a;
import c6.InterfaceC0883m;
import c9.C0914i;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import g7.C2536a;
import g8.C2545e;
import g8.InterfaceC2547g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p007h.AbstractC2757i;
import p007h.C2756h;
import p007h.InterfaceC2758j;
import q5.C6111d;
import q5.C6126s;
import q5.InterfaceC6124q;
import q5.InterfaceC6125r;
import r5.InterfaceC6470e;
import r5.InterfaceC6471f;
import y6.AbstractC8565c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: A */
    public final b1 f2563A;

    /* renamed from: B */
    public final C0689a f2564B;

    /* renamed from: C */
    public C2756h f2565C;

    /* renamed from: D */
    public C2756h f2566D;

    /* renamed from: E */
    public C2756h f2567E;

    /* renamed from: F */
    public ArrayDeque f2568F;

    /* renamed from: G */
    public boolean f2569G;

    /* renamed from: H */
    public boolean f2570H;

    /* renamed from: I */
    public boolean f2571I;

    /* renamed from: J */
    public boolean f2572J;

    /* renamed from: K */
    public boolean f2573K;

    /* renamed from: L */
    public ArrayList f2574L;

    /* renamed from: M */
    public ArrayList f2575M;

    /* renamed from: N */
    public ArrayList f2576N;

    /* renamed from: O */
    public n1 f2577O;

    /* renamed from: P */
    public final RunnableC0353r f2578P;

    /* renamed from: b */
    public boolean f2580b;

    /* renamed from: e */
    public ArrayList f2583e;

    /* renamed from: g */
    public p004e.c0 f2585g;

    /* renamed from: n */
    public final ArrayList f2592n;

    /* renamed from: o */
    public final p0 f2593o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f2594p;

    /* renamed from: q */
    public final x0 f2595q;

    /* renamed from: r */
    public final x0 f2596r;

    /* renamed from: s */
    public final x0 f2597s;

    /* renamed from: t */
    public final x0 f2598t;

    /* renamed from: u */
    public final a1 f2599u;

    /* renamed from: v */
    public int f2600v;

    /* renamed from: w */
    public u0 f2601w;

    /* renamed from: x */
    public r0 f2602x;

    /* renamed from: y */
    public j0 f2603y;

    /* renamed from: z */
    public j0 f2604z;

    /* renamed from: a */
    public final ArrayList f2579a = new ArrayList();

    /* renamed from: c */
    public final t1 f2581c = new t1();

    /* renamed from: d */
    public ArrayList f2582d = new ArrayList();

    /* renamed from: f */
    public final w0 f2584f = new w0(this);

    /* renamed from: h */
    public C0336a f2586h = null;

    /* renamed from: i */
    public boolean f2587i = false;

    /* renamed from: j */
    public final z0 f2588j = new z0(this);

    /* renamed from: k */
    public final AtomicInteger f2589k = new AtomicInteger();

    /* renamed from: l */
    public final Map f2590l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final Map f2591m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.x0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.x0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.x0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.x0] */
    public j1() {
        Collections.synchronizedMap(new HashMap());
        this.f2592n = new ArrayList();
        this.f2593o = new p0(this);
        this.f2594p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f2595q = new InterfaceC0600a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b */
            public final /* synthetic */ j1 f2748b;

            {
                this.f2748b = this;
            }

            @Override // b6.InterfaceC0600a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2748b;
                        if (j1Var.m1163M()) {
                            j1Var.m1184i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2748b;
                        if (j1Var2.m1163M() && num.intValue() == 80) {
                            j1Var2.m1188m(false);
                            break;
                        }
                        break;
                    case 2:
                        C6111d c6111d = (C6111d) obj;
                        j1 j1Var3 = this.f2748b;
                        if (j1Var3.m1163M()) {
                            j1Var3.m1189n(c6111d.f29818a, false);
                            break;
                        }
                        break;
                    default:
                        C6126s c6126s = (C6126s) obj;
                        j1 j1Var4 = this.f2748b;
                        if (j1Var4.m1163M()) {
                            j1Var4.m1194s(c6126s.f29874a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f2596r = new InterfaceC0600a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b */
            public final /* synthetic */ j1 f2748b;

            {
                this.f2748b = this;
            }

            @Override // b6.InterfaceC0600a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2748b;
                        if (j1Var.m1163M()) {
                            j1Var.m1184i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2748b;
                        if (j1Var2.m1163M() && num.intValue() == 80) {
                            j1Var2.m1188m(false);
                            break;
                        }
                        break;
                    case 2:
                        C6111d c6111d = (C6111d) obj;
                        j1 j1Var3 = this.f2748b;
                        if (j1Var3.m1163M()) {
                            j1Var3.m1189n(c6111d.f29818a, false);
                            break;
                        }
                        break;
                    default:
                        C6126s c6126s = (C6126s) obj;
                        j1 j1Var4 = this.f2748b;
                        if (j1Var4.m1163M()) {
                            j1Var4.m1194s(c6126s.f29874a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f2597s = new InterfaceC0600a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b */
            public final /* synthetic */ j1 f2748b;

            {
                this.f2748b = this;
            }

            @Override // b6.InterfaceC0600a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2748b;
                        if (j1Var.m1163M()) {
                            j1Var.m1184i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2748b;
                        if (j1Var2.m1163M() && num.intValue() == 80) {
                            j1Var2.m1188m(false);
                            break;
                        }
                        break;
                    case 2:
                        C6111d c6111d = (C6111d) obj;
                        j1 j1Var3 = this.f2748b;
                        if (j1Var3.m1163M()) {
                            j1Var3.m1189n(c6111d.f29818a, false);
                            break;
                        }
                        break;
                    default:
                        C6126s c6126s = (C6126s) obj;
                        j1 j1Var4 = this.f2748b;
                        if (j1Var4.m1163M()) {
                            j1Var4.m1194s(c6126s.f29874a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f2598t = new InterfaceC0600a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b */
            public final /* synthetic */ j1 f2748b;

            {
                this.f2748b = this;
            }

            @Override // b6.InterfaceC0600a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2748b;
                        if (j1Var.m1163M()) {
                            j1Var.m1184i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2748b;
                        if (j1Var2.m1163M() && num.intValue() == 80) {
                            j1Var2.m1188m(false);
                            break;
                        }
                        break;
                    case 2:
                        C6111d c6111d = (C6111d) obj;
                        j1 j1Var3 = this.f2748b;
                        if (j1Var3.m1163M()) {
                            j1Var3.m1189n(c6111d.f29818a, false);
                            break;
                        }
                        break;
                    default:
                        C6126s c6126s = (C6126s) obj;
                        j1 j1Var4 = this.f2748b;
                        if (j1Var4.m1163M()) {
                            j1Var4.m1194s(c6126s.f29874a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f2599u = new a1(this);
        this.f2600v = -1;
        this.f2563A = new b1(this);
        int i14 = 2;
        this.f2564B = new C0689a(i14);
        this.f2568F = new ArrayDeque();
        this.f2578P = new RunnableC0353r(i14, this);
    }

    /* renamed from: E */
    public static j0 m1150E(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            j0 j0Var = tag instanceof j0 ? (j0) tag : null;
            if (j0Var != null) {
                return j0Var;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: G */
    public static HashSet m1151G(C0336a c0336a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c0336a.f2434a.size(); i10++) {
            j0 j0Var = ((u1) c0336a.f2434a.get(i10)).f2712b;
            if (j0Var != null && c0336a.f2440g) {
                hashSet.add(j0Var);
            }
        }
        return hashSet;
    }

    /* renamed from: K */
    public static boolean m1152K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    /* renamed from: L */
    public static boolean m1153L(j0 j0Var) {
        if (j0Var.mHasMenu && j0Var.mMenuVisible) {
            return true;
        }
        ArrayList arrayListM1264e = j0Var.mChildFragmentManager.f2581c.m1264e();
        int size = arrayListM1264e.size();
        boolean zM1153L = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM1264e.get(i10);
            i10++;
            j0 j0Var2 = (j0) obj;
            if (j0Var2 != null) {
                zM1153L = m1153L(j0Var2);
            }
            if (zM1153L) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m1154N(j0 j0Var) {
        if (j0Var == null) {
            return true;
        }
        j1 j1Var = j0Var.mFragmentManager;
        return j0Var.equals(j1Var.f2604z) && m1154N(j1Var.f2603y);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0224 A[PHI: r15
      0x0224: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:100:0x0211, B:104:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1155A(java.util.ArrayList r27, java.util.ArrayList r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j1.m1155A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: B */
    public final int m1156B(int i10, String str, boolean z6) {
        if (this.f2582d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z6) {
                return 0;
            }
            return this.f2582d.size() - 1;
        }
        int size = this.f2582d.size() - 1;
        while (size >= 0) {
            C0336a c0336a = (C0336a) this.f2582d.get(size);
            if ((str != null && str.equals(c0336a.f2442i)) || (i10 >= 0 && i10 == c0336a.f2453t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f2582d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0336a c0336a2 = (C0336a) this.f2582d.get(size - 1);
            if ((str == null || !str.equals(c0336a2.f2442i)) && (i10 < 0 || i10 != c0336a2.f2453t)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* renamed from: C */
    public final j0 m1157C(int i10) {
        t1 t1Var = this.f2581c;
        ArrayList arrayList = t1Var.f2702a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null && j0Var.mFragmentId == i10) {
                return j0Var;
            }
        }
        for (s1 s1Var : t1Var.f2703b.values()) {
            if (s1Var != null) {
                j0 j0Var2 = s1Var.f2696c;
                if (j0Var2.mFragmentId == i10) {
                    return j0Var2;
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public final j0 m1158D(String str) {
        t1 t1Var = this.f2581c;
        ArrayList arrayList = t1Var.f2702a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j0 j0Var = (j0) arrayList.get(size);
                if (j0Var != null && str.equals(j0Var.mTag)) {
                    return j0Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (s1 s1Var : t1Var.f2703b.values()) {
            if (s1Var != null) {
                j0 j0Var2 = s1Var.f2696c;
                if (str.equals(j0Var2.mTag)) {
                    return j0Var2;
                }
            }
        }
        return null;
    }

    /* renamed from: F */
    public final void m1159F() {
        Iterator it = m1180e().iterator();
        while (it.hasNext()) {
            C0352q c0352q = (C0352q) it.next();
            if (c0352q.f2679f) {
                m1152K(2);
                c0352q.f2679f = false;
                c0352q.m1238e();
            }
        }
    }

    /* renamed from: H */
    public final ViewGroup m1160H(j0 j0Var) {
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (j0Var.mContainerId <= 0 || !this.f2602x.mo1116c()) {
            return null;
        }
        View viewMo1115b = this.f2602x.mo1115b(j0Var.mContainerId);
        if (viewMo1115b instanceof ViewGroup) {
            return (ViewGroup) viewMo1115b;
        }
        return null;
    }

    /* renamed from: I */
    public final b1 m1161I() {
        j0 j0Var = this.f2603y;
        return j0Var != null ? j0Var.mFragmentManager.m1161I() : this.f2563A;
    }

    /* renamed from: J */
    public final C0689a m1162J() {
        j0 j0Var = this.f2603y;
        return j0Var != null ? j0Var.mFragmentManager.m1162J() : this.f2564B;
    }

    /* renamed from: M */
    public final boolean m1163M() {
        j0 j0Var = this.f2603y;
        if (j0Var == null) {
            return true;
        }
        return j0Var.isAdded() && this.f2603y.getParentFragmentManager().m1163M();
    }

    /* renamed from: O */
    public final boolean m1164O() {
        return this.f2570H || this.f2571I;
    }

    /* renamed from: P */
    public final void m1165P(int i10, boolean z6) {
        u0 u0Var;
        if (this.f2601w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i10 != this.f2600v) {
            this.f2600v = i10;
            t1 t1Var = this.f2581c;
            HashMap map = t1Var.f2703b;
            ArrayList arrayList = t1Var.f2702a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                s1 s1Var = (s1) map.get(((j0) obj).mWho);
                if (s1Var != null) {
                    s1Var.m1254i();
                }
            }
            for (s1 s1Var2 : map.values()) {
                if (s1Var2 != null) {
                    s1Var2.m1254i();
                    j0 j0Var = s1Var2.f2696c;
                    if (j0Var.mRemoving && !j0Var.isInBackStack()) {
                        if (j0Var.mBeingSaved && !t1Var.f2704c.containsKey(j0Var.mWho)) {
                            t1Var.m1268i(j0Var.mWho, s1Var2.m1257l());
                        }
                        t1Var.m1267h(s1Var2);
                    }
                }
            }
            ArrayList arrayListM1263d = t1Var.m1263d();
            int size2 = arrayListM1263d.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayListM1263d.get(i12);
                i12++;
                s1 s1Var3 = (s1) obj2;
                j0 j0Var2 = s1Var3.f2696c;
                if (j0Var2.mDeferStart) {
                    if (this.f2580b) {
                        this.f2573K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        s1Var3.m1254i();
                    }
                }
            }
            if (this.f2569G && (u0Var = this.f2601w) != null && this.f2600v == 7) {
                ((n0) u0Var).f2643e.invalidateMenu();
                this.f2569G = false;
            }
        }
    }

    /* renamed from: Q */
    public final void m1166Q() {
        if (this.f2601w == null) {
            return;
        }
        this.f2570H = false;
        this.f2571I = false;
        this.f2577O.f2650g = false;
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null) {
                j0Var.noteStateNotSaved();
            }
        }
    }

    /* renamed from: R */
    public final boolean m1167R() {
        return m1168S(-1, 0);
    }

    /* renamed from: S */
    public final boolean m1168S(int i10, int i11) {
        m1201z(false);
        m1200y(true);
        j0 j0Var = this.f2604z;
        if (j0Var != null && i10 < 0 && j0Var.getChildFragmentManager().m1167R()) {
            return true;
        }
        boolean zM1169T = m1169T(this.f2574L, this.f2575M, null, i10, i11);
        if (zM1169T) {
            this.f2580b = true;
            try {
                m1171V(this.f2574L, this.f2575M);
            } finally {
                m1179d();
            }
        }
        e0();
        boolean z6 = this.f2573K;
        t1 t1Var = this.f2581c;
        if (z6) {
            this.f2573K = false;
            ArrayList arrayListM1263d = t1Var.m1263d();
            int size = arrayListM1263d.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListM1263d.get(i12);
                i12++;
                s1 s1Var = (s1) obj;
                j0 j0Var2 = s1Var.f2696c;
                if (j0Var2.mDeferStart) {
                    if (this.f2580b) {
                        this.f2573K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        s1Var.m1254i();
                    }
                }
            }
        }
        t1Var.f2703b.values().removeAll(Collections.singleton(null));
        return zM1169T;
    }

    /* renamed from: T */
    public final boolean m1169T(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iM1156B = m1156B(i10, str, (i11 & 1) != 0);
        if (iM1156B < 0) {
            return false;
        }
        for (int size = this.f2582d.size() - 1; size >= iM1156B; size--) {
            arrayList.add((C0336a) this.f2582d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: U */
    public final void m1170U(j0 j0Var) {
        if (m1152K(2)) {
            Objects.toString(j0Var);
        }
        boolean zIsInBackStack = j0Var.isInBackStack();
        if (j0Var.mDetached && zIsInBackStack) {
            return;
        }
        t1 t1Var = this.f2581c;
        synchronized (t1Var.f2702a) {
            t1Var.f2702a.remove(j0Var);
        }
        j0Var.mAdded = false;
        if (m1153L(j0Var)) {
            this.f2569G = true;
        }
        j0Var.mRemoving = true;
        c0(j0Var);
    }

    /* renamed from: V */
    public final void m1171V(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C0336a) arrayList.get(i10)).f2449p) {
                if (i11 != i10) {
                    m1155A(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C0336a) arrayList.get(i11)).f2449p) {
                        i11++;
                    }
                }
                m1155A(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m1155A(arrayList, arrayList2, i11, size);
        }
    }

    /* renamed from: W */
    public final void m1172W(Bundle bundle) {
        p0 p0Var;
        s1 s1Var;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f2601w.f2708b.getClassLoader());
                this.f2591m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f2601w.f2708b.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        t1 t1Var = this.f2581c;
        HashMap map2 = t1Var.f2704c;
        HashMap map3 = t1Var.f2703b;
        map2.clear();
        map2.putAll(map);
        l1 l1Var = (l1) bundle.getParcelable(TransferTable.COLUMN_STATE);
        if (l1Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = l1Var.f2614a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            p0Var = this.f2593o;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            Bundle bundleM1268i = t1Var.m1268i((String) obj, null);
            if (bundleM1268i != null) {
                j0 j0Var = (j0) this.f2577O.f2645b.get(((p1) bundleM1268i.getParcelable(TransferTable.COLUMN_STATE)).f2660b);
                if (j0Var != null) {
                    if (m1152K(2)) {
                        j0Var.toString();
                    }
                    s1Var = new s1(p0Var, t1Var, j0Var, bundleM1268i);
                    bundle2 = bundleM1268i;
                } else {
                    s1Var = new s1(this.f2593o, this.f2581c, this.f2601w.f2708b.getClassLoader(), m1161I(), bundleM1268i);
                    bundle2 = bundleM1268i;
                }
                j0 j0Var2 = s1Var.f2696c;
                j0Var2.mSavedFragmentState = bundle2;
                j0Var2.mFragmentManager = this;
                if (m1152K(2)) {
                    j0Var2.toString();
                }
                s1Var.m1255j(this.f2601w.f2708b.getClassLoader());
                t1Var.m1266g(s1Var);
                s1Var.f2698e = this.f2600v;
            }
        }
        n1 n1Var = this.f2577O;
        n1Var.getClass();
        ArrayList arrayList2 = new ArrayList(n1Var.f2645b.values());
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            j0 j0Var3 = (j0) obj2;
            if (map3.get(j0Var3.mWho) == null) {
                if (m1152K(2)) {
                    j0Var3.toString();
                    Objects.toString(l1Var.f2614a);
                }
                this.f2577O.m1212g(j0Var3);
                j0Var3.mFragmentManager = this;
                s1 s1Var2 = new s1(p0Var, t1Var, j0Var3);
                s1Var2.f2698e = 1;
                s1Var2.m1254i();
                j0Var3.mRemoving = true;
                s1Var2.m1254i();
            }
        }
        ArrayList arrayList3 = l1Var.f2615b;
        t1Var.f2702a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                String str3 = (String) obj3;
                j0 j0VarM1261b = t1Var.m1261b(str3);
                if (j0VarM1261b == null) {
                    throw new IllegalStateException(AbstractC5601a.m11238i("No instantiated fragment for (", str3, ")"));
                }
                if (m1152K(2)) {
                    j0VarM1261b.toString();
                }
                t1Var.m1260a(j0VarM1261b);
            }
        }
        if (l1Var.f2616c != null) {
            this.f2582d = new ArrayList(l1Var.f2616c.length);
            int i13 = 0;
            while (true) {
                C0337b[] c0337bArr = l1Var.f2616c;
                if (i13 >= c0337bArr.length) {
                    break;
                }
                C0337b c0337b = c0337bArr[i13];
                ArrayList arrayList4 = c0337b.f2458b;
                C0336a c0336a = new C0336a(this);
                c0337b.m1114a(c0336a);
                c0336a.f2453t = c0337b.f2463g;
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    String str4 = (String) arrayList4.get(i14);
                    if (str4 != null) {
                        ((u1) c0336a.f2434a.get(i14)).f2712b = t1Var.m1261b(str4);
                    }
                }
                c0336a.m1088c(1);
                if (m1152K(2)) {
                    c0336a.toString();
                    PrintWriter printWriter = new PrintWriter(new e2());
                    c0336a.m1093h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2582d.add(c0336a);
                i13++;
            }
        } else {
            this.f2582d = new ArrayList();
        }
        this.f2589k.set(l1Var.f2617d);
        String str5 = l1Var.f2618e;
        if (str5 != null) {
            j0 j0VarM1261b2 = t1Var.m1261b(str5);
            this.f2604z = j0VarM1261b2;
            m1193r(j0VarM1261b2);
        }
        ArrayList arrayList5 = l1Var.f2619f;
        if (arrayList5 != null) {
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                this.f2590l.put((String) arrayList5.get(i15), (C0338c) l1Var.f2620g.get(i15));
            }
        }
        this.f2568F = new ArrayDeque(l1Var.f2621h);
    }

    /* renamed from: X */
    public final Bundle m1173X() {
        int i10;
        ArrayList arrayList;
        C0337b[] c0337bArr;
        Bundle bundle = new Bundle();
        m1159F();
        m1198w();
        m1201z(true);
        this.f2570H = true;
        this.f2577O.f2650g = true;
        t1 t1Var = this.f2581c;
        t1Var.getClass();
        HashMap map = t1Var.f2703b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (s1 s1Var : map.values()) {
            if (s1Var != null) {
                j0 j0Var = s1Var.f2696c;
                t1Var.m1268i(j0Var.mWho, s1Var.m1257l());
                arrayList2.add(j0Var.mWho);
                if (m1152K(2)) {
                    j0Var.toString();
                    Objects.toString(j0Var.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f2581c.f2704c;
        if (map2.isEmpty()) {
            m1152K(2);
            return bundle;
        }
        t1 t1Var2 = this.f2581c;
        synchronized (t1Var2.f2702a) {
            try {
                if (t1Var2.f2702a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(t1Var2.f2702a.size());
                    ArrayList arrayList3 = t1Var2.f2702a;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        j0 j0Var2 = (j0) obj;
                        arrayList.add(j0Var2.mWho);
                        if (m1152K(2)) {
                            j0Var2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        int size2 = this.f2582d.size();
        if (size2 > 0) {
            c0337bArr = new C0337b[size2];
            for (i10 = 0; i10 < size2; i10++) {
                c0337bArr[i10] = new C0337b((C0336a) this.f2582d.get(i10));
                if (m1152K(2)) {
                    Objects.toString(this.f2582d.get(i10));
                }
            }
        } else {
            c0337bArr = null;
        }
        l1 l1Var = new l1();
        l1Var.f2618e = null;
        ArrayList arrayList4 = new ArrayList();
        l1Var.f2619f = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        l1Var.f2620g = arrayList5;
        l1Var.f2614a = arrayList2;
        l1Var.f2615b = arrayList;
        l1Var.f2616c = c0337bArr;
        l1Var.f2617d = this.f2589k.get();
        j0 j0Var3 = this.f2604z;
        if (j0Var3 != null) {
            l1Var.f2618e = j0Var3.mWho;
        }
        arrayList4.addAll(this.f2590l.keySet());
        arrayList5.addAll(this.f2590l.values());
        l1Var.f2621h = new ArrayList(this.f2568F);
        bundle.putParcelable(TransferTable.COLUMN_STATE, l1Var);
        for (String str : this.f2591m.keySet()) {
            bundle.putBundle(i0.m0.m7378k("result_", str), (Bundle) this.f2591m.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(i0.m0.m7378k("fragment_", str2), (Bundle) map2.get(str2));
        }
        return bundle;
    }

    /* renamed from: Y */
    public final void m1174Y() {
        synchronized (this.f2579a) {
            try {
                if (this.f2579a.size() == 1) {
                    this.f2601w.f2709c.removeCallbacks(this.f2578P);
                    this.f2601w.f2709c.post(this.f2578P);
                    e0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Z */
    public final void m1175Z(j0 j0Var, boolean z6) {
        ViewGroup viewGroupM1160H = m1160H(j0Var);
        if (viewGroupM1160H == null || !(viewGroupM1160H instanceof s0)) {
            return;
        }
        ((s0) viewGroupM1160H).setDrawDisappearingViewsLast(!z6);
    }

    /* renamed from: a */
    public final s1 m1176a(j0 j0Var) {
        String str = j0Var.mPreviousWho;
        if (str != null) {
            AbstractC8565c.m15833c(j0Var, str);
        }
        if (m1152K(2)) {
            j0Var.toString();
        }
        s1 s1VarM1182g = m1182g(j0Var);
        j0Var.mFragmentManager = this;
        t1 t1Var = this.f2581c;
        t1Var.m1266g(s1VarM1182g);
        if (!j0Var.mDetached) {
            t1Var.m1260a(j0Var);
            j0Var.mRemoving = false;
            if (j0Var.mView == null) {
                j0Var.mHiddenChanged = false;
            }
            if (m1153L(j0Var)) {
                this.f2569G = true;
            }
        }
        return s1VarM1182g;
    }

    public final void a0(j0 j0Var, EnumC1645q enumC1645q) {
        if (j0Var.equals(this.f2581c.m1261b(j0Var.mWho)) && (j0Var.mHost == null || j0Var.mFragmentManager == this)) {
            j0Var.mMaxState = enumC1645q;
            return;
        }
        throw new IllegalArgumentException("Fragment " + j0Var + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m1177b(u0 u0Var, r0 r0Var, j0 j0Var) {
        if (this.f2601w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2601w = u0Var;
        this.f2602x = r0Var;
        this.f2603y = j0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2594p;
        if (j0Var != null) {
            copyOnWriteArrayList.add(new c1(j0Var));
        } else if (u0Var instanceof o1) {
            copyOnWriteArrayList.add((o1) u0Var);
        }
        if (this.f2603y != null) {
            e0();
        }
        if (u0Var instanceof p004e.e0) {
            p004e.e0 e0Var = (p004e.e0) u0Var;
            p004e.c0 onBackPressedDispatcher = e0Var.getOnBackPressedDispatcher();
            this.f2585g = onBackPressedDispatcher;
            InterfaceC1649u interfaceC1649u = e0Var;
            if (j0Var != null) {
                interfaceC1649u = j0Var;
            }
            onBackPressedDispatcher.m5500a(interfaceC1649u, this.f2588j);
        }
        if (j0Var != null) {
            n1 n1Var = j0Var.mFragmentManager.f2577O;
            HashMap map = n1Var.f2646c;
            n1 n1Var2 = (n1) map.get(j0Var.mWho);
            if (n1Var2 == null) {
                n1Var2 = new n1(n1Var.f2648e);
                map.put(j0Var.mWho, n1Var2);
            }
            this.f2577O = n1Var2;
        } else if (u0Var instanceof d7.c1) {
            d7.b1 store = ((d7.c1) u0Var).getViewModelStore();
            AbstractC4154l.m8923f(store, "store");
            C2536a defaultCreationExtras = C2536a.f13867b;
            AbstractC4154l.m8923f(defaultCreationExtras, "defaultCreationExtras");
            C0914i c0914i = new C0914i(store, n1.f2644h, defaultCreationExtras);
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(n1.class);
            String strM8913b = c4147eM8901a.m8913b();
            if (strM8913b == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f2577O = (n1) c0914i.m2630j(c4147eM8901a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b));
        } else {
            this.f2577O = new n1(false);
        }
        this.f2577O.f2650g = m1164O();
        this.f2581c.f2705d = this.f2577O;
        Object obj = this.f2601w;
        if ((obj instanceof InterfaceC2547g) && j0Var == null) {
            C2545e savedStateRegistry = ((InterfaceC2547g) obj).getSavedStateRegistry();
            savedStateRegistry.m6565c("android:support:fragments", new k0(1, this));
            Bundle bundleM6563a = savedStateRegistry.m6563a("android:support:fragments");
            if (bundleM6563a != null) {
                m1172W(bundleM6563a);
            }
        }
        Object obj2 = this.f2601w;
        if (obj2 instanceof InterfaceC2758j) {
            AbstractC2757i activityResultRegistry = ((InterfaceC2758j) obj2).getActivityResultRegistry();
            String strM7378k = i0.m0.m7378k("FragmentManager:", j0Var != null ? AbstractC1452a.m4564k(new StringBuilder(), j0Var.mWho, ":") : "");
            this.f2565C = activityResultRegistry.m6752d(AbstractC1452a.m4561h(strM7378k, "StartActivityForResult"), new d1(6), new y0(this, 1));
            this.f2566D = activityResultRegistry.m6752d(AbstractC1452a.m4561h(strM7378k, "StartIntentSenderForResult"), new d1(0), new y0(this, 2));
            this.f2567E = activityResultRegistry.m6752d(AbstractC1452a.m4561h(strM7378k, "RequestPermissions"), new d1(4), new y0(this, 0));
        }
        Object obj3 = this.f2601w;
        if (obj3 instanceof InterfaceC6470e) {
            ((InterfaceC6470e) obj3).addOnConfigurationChangedListener(this.f2595q);
        }
        Object obj4 = this.f2601w;
        if (obj4 instanceof InterfaceC6471f) {
            ((InterfaceC6471f) obj4).addOnTrimMemoryListener(this.f2596r);
        }
        Object obj5 = this.f2601w;
        if (obj5 instanceof InterfaceC6124q) {
            ((InterfaceC6124q) obj5).addOnMultiWindowModeChangedListener(this.f2597s);
        }
        Object obj6 = this.f2601w;
        if (obj6 instanceof InterfaceC6125r) {
            ((InterfaceC6125r) obj6).addOnPictureInPictureModeChangedListener(this.f2598t);
        }
        Object obj7 = this.f2601w;
        if ((obj7 instanceof InterfaceC0883m) && j0Var == null) {
            ((InterfaceC0883m) obj7).addMenuProvider(this.f2599u);
        }
    }

    public final void b0(j0 j0Var) {
        if (j0Var != null) {
            if (!j0Var.equals(this.f2581c.m1261b(j0Var.mWho)) || (j0Var.mHost != null && j0Var.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + j0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        j0 j0Var2 = this.f2604z;
        this.f2604z = j0Var;
        m1193r(j0Var2);
        m1193r(this.f2604z);
    }

    /* renamed from: c */
    public final void m1178c(j0 j0Var) {
        if (m1152K(2)) {
            Objects.toString(j0Var);
        }
        if (j0Var.mDetached) {
            j0Var.mDetached = false;
            if (j0Var.mAdded) {
                return;
            }
            this.f2581c.m1260a(j0Var);
            if (m1152K(2)) {
                j0Var.toString();
            }
            if (m1153L(j0Var)) {
                this.f2569G = true;
            }
        }
    }

    public final void c0(j0 j0Var) {
        ViewGroup viewGroupM1160H = m1160H(j0Var);
        if (viewGroupM1160H != null) {
            if (j0Var.getPopExitAnim() + j0Var.getPopEnterAnim() + j0Var.getExitAnim() + j0Var.getEnterAnim() > 0) {
                if (viewGroupM1160H.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM1160H.setTag(R.id.visible_removing_fragment_view_tag, j0Var);
                }
                ((j0) viewGroupM1160H.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(j0Var.getPopDirection());
            }
        }
    }

    /* renamed from: d */
    public final void m1179d() {
        this.f2580b = false;
        this.f2575M.clear();
        this.f2574L.clear();
    }

    public final void d0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new e2());
        u0 u0Var = this.f2601w;
        try {
            if (u0Var != null) {
                ((n0) u0Var).f2643e.dump("  ", null, printWriter, new String[0]);
            } else {
                m1197v("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    /* renamed from: e */
    public final HashSet m1180e() {
        C0352q c0352q;
        HashSet hashSet = new HashSet();
        ArrayList arrayListM1263d = this.f2581c.m1263d();
        int size = arrayListM1263d.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM1263d.get(i10);
            i10++;
            ViewGroup viewGroup = ((s1) obj).f2696c.mContainer;
            if (viewGroup != null) {
                C0689a factory = m1162J();
                AbstractC4154l.m8923f(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0352q) {
                    c0352q = (C0352q) tag;
                } else {
                    c0352q = new C0352q(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0352q);
                }
                hashSet.add(c0352q);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ex.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ex.a, kotlin.jvm.internal.j] */
    public final void e0() {
        synchronized (this.f2579a) {
            try {
                if (!this.f2579a.isEmpty()) {
                    z0 z0Var = this.f2588j;
                    z0Var.f8901a = true;
                    ?? r12 = z0Var.f8903c;
                    if (r12 != 0) {
                        r12.invoke();
                    }
                    if (m1152K(3)) {
                        toString();
                    }
                    return;
                }
                boolean z6 = this.f2582d.size() + (this.f2586h != null ? 1 : 0) > 0 && m1154N(this.f2603y);
                if (m1152K(3)) {
                    toString();
                }
                z0 z0Var2 = this.f2588j;
                z0Var2.f8901a = z6;
                ?? r02 = z0Var2.f8903c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final HashSet m1181f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((C0336a) arrayList.get(i10)).f2434a;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                j0 j0Var = ((u1) obj).f2712b;
                if (j0Var != null && (viewGroup = j0Var.mContainer) != null) {
                    hashSet.add(C0352q.m1232j(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* renamed from: g */
    public final s1 m1182g(j0 j0Var) {
        String str = j0Var.mWho;
        t1 t1Var = this.f2581c;
        s1 s1Var = (s1) t1Var.f2703b.get(str);
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1Var2 = new s1(this.f2593o, t1Var, j0Var);
        s1Var2.m1255j(this.f2601w.f2708b.getClassLoader());
        s1Var2.f2698e = this.f2600v;
        return s1Var2;
    }

    /* renamed from: h */
    public final void m1183h(j0 j0Var) {
        if (m1152K(2)) {
            Objects.toString(j0Var);
        }
        if (j0Var.mDetached) {
            return;
        }
        j0Var.mDetached = true;
        if (j0Var.mAdded) {
            if (m1152K(2)) {
                j0Var.toString();
            }
            t1 t1Var = this.f2581c;
            synchronized (t1Var.f2702a) {
                t1Var.f2702a.remove(j0Var);
            }
            j0Var.mAdded = false;
            if (m1153L(j0Var)) {
                this.f2569G = true;
            }
            c0(j0Var);
        }
    }

    /* renamed from: i */
    public final void m1184i(boolean z6, Configuration configuration) {
        if (z6 && (this.f2601w instanceof InterfaceC6470e)) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null) {
                j0Var.performConfigurationChanged(configuration);
                if (z6) {
                    j0Var.mChildFragmentManager.m1184i(true, configuration);
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m1185j(MenuItem menuItem) {
        if (this.f2600v < 1) {
            return false;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null && j0Var.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m1186k(Menu menu, MenuInflater menuInflater) {
        if (this.f2600v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null && j0Var.isMenuVisible() && j0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j0Var);
                z6 = true;
            }
        }
        if (this.f2583e != null) {
            for (int i10 = 0; i10 < this.f2583e.size(); i10++) {
                j0 j0Var2 = (j0) this.f2583e.get(i10);
                if (arrayList == null || !arrayList.contains(j0Var2)) {
                    j0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2583e = arrayList;
        return z6;
    }

    /* renamed from: l */
    public final void m1187l() {
        boolean zIsChangingConfigurations = true;
        this.f2572J = true;
        m1201z(true);
        m1198w();
        u0 u0Var = this.f2601w;
        boolean z6 = u0Var instanceof d7.c1;
        t1 t1Var = this.f2581c;
        if (z6) {
            zIsChangingConfigurations = t1Var.f2705d.f2649f;
        } else {
            o0 o0Var = u0Var.f2708b;
            if (o0Var != null) {
                zIsChangingConfigurations = true ^ o0Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f2590l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((C0338c) it.next()).f2480a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n1 n1Var = t1Var.f2705d;
                    n1Var.getClass();
                    m1152K(3);
                    n1Var.m1211f((String) obj, false);
                }
            }
        }
        m1196u(-1);
        Object obj2 = this.f2601w;
        if (obj2 instanceof InterfaceC6471f) {
            ((InterfaceC6471f) obj2).removeOnTrimMemoryListener(this.f2596r);
        }
        Object obj3 = this.f2601w;
        if (obj3 instanceof InterfaceC6470e) {
            ((InterfaceC6470e) obj3).removeOnConfigurationChangedListener(this.f2595q);
        }
        Object obj4 = this.f2601w;
        if (obj4 instanceof InterfaceC6124q) {
            ((InterfaceC6124q) obj4).removeOnMultiWindowModeChangedListener(this.f2597s);
        }
        Object obj5 = this.f2601w;
        if (obj5 instanceof InterfaceC6125r) {
            ((InterfaceC6125r) obj5).removeOnPictureInPictureModeChangedListener(this.f2598t);
        }
        Object obj6 = this.f2601w;
        if ((obj6 instanceof InterfaceC0883m) && this.f2603y == null) {
            ((InterfaceC0883m) obj6).removeMenuProvider(this.f2599u);
        }
        this.f2601w = null;
        this.f2602x = null;
        this.f2603y = null;
        if (this.f2585g != null) {
            this.f2588j.m5514e();
            this.f2585g = null;
        }
        C2756h c2756h = this.f2565C;
        if (c2756h != null) {
            c2756h.m6749b();
            this.f2566D.m6749b();
            this.f2567E.m6749b();
        }
    }

    /* renamed from: m */
    public final void m1188m(boolean z6) {
        if (z6 && (this.f2601w instanceof InterfaceC6471f)) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null) {
                j0Var.performLowMemory();
                if (z6) {
                    j0Var.mChildFragmentManager.m1188m(true);
                }
            }
        }
    }

    /* renamed from: n */
    public final void m1189n(boolean z6, boolean z10) {
        if (z10 && (this.f2601w instanceof InterfaceC6124q)) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null) {
                j0Var.performMultiWindowModeChanged(z6);
                if (z10) {
                    j0Var.mChildFragmentManager.m1189n(z6, true);
                }
            }
        }
    }

    /* renamed from: o */
    public final void m1190o() {
        ArrayList arrayListM1264e = this.f2581c.m1264e();
        int size = arrayListM1264e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM1264e.get(i10);
            i10++;
            j0 j0Var = (j0) obj;
            if (j0Var != null) {
                j0Var.onHiddenChanged(j0Var.isHidden());
                j0Var.mChildFragmentManager.m1190o();
            }
        }
    }

    /* renamed from: p */
    public final boolean m1191p(MenuItem menuItem) {
        if (this.f2600v < 1) {
            return false;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null && j0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final void m1192q(Menu menu) {
        if (this.f2600v < 1) {
            return;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null) {
                j0Var.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: r */
    public final void m1193r(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.equals(this.f2581c.m1261b(j0Var.mWho))) {
                j0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* renamed from: s */
    public final void m1194s(boolean z6, boolean z10) {
        if (z10 && (this.f2601w instanceof InterfaceC6125r)) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null) {
                j0Var.performPictureInPictureModeChanged(z6);
                if (z10) {
                    j0Var.mChildFragmentManager.m1194s(z6, true);
                }
            }
        }
    }

    /* renamed from: t */
    public final boolean m1195t(Menu menu) {
        boolean z6 = false;
        if (this.f2600v < 1) {
            return false;
        }
        for (j0 j0Var : this.f2581c.m1265f()) {
            if (j0Var != null && j0Var.isMenuVisible() && j0Var.performPrepareOptionsMenu(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        j0 j0Var = this.f2603y;
        if (j0Var != null) {
            sb2.append(j0Var.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2603y)));
            sb2.append("}");
        } else {
            u0 u0Var = this.f2601w;
            if (u0Var != null) {
                sb2.append(u0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2601w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u */
    public final void m1196u(int i10) {
        try {
            this.f2580b = true;
            for (s1 s1Var : this.f2581c.f2703b.values()) {
                if (s1Var != null) {
                    s1Var.f2698e = i10;
                }
            }
            m1165P(i10, false);
            Iterator it = m1180e().iterator();
            while (it.hasNext()) {
                ((C0352q) it.next()).m1241i();
            }
            this.f2580b = false;
            m1201z(true);
        } catch (Throwable th2) {
            this.f2580b = false;
            throw th2;
        }
    }

    /* renamed from: v */
    public final void m1197v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strM4561h = AbstractC1452a.m4561h(str, "    ");
        t1 t1Var = this.f2581c;
        ArrayList arrayList = t1Var.f2702a;
        String strM4561h2 = AbstractC1452a.m4561h(str, "    ");
        HashMap map = t1Var.f2703b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (s1 s1Var : map.values()) {
                printWriter.print(str);
                if (s1Var != null) {
                    j0 j0Var = s1Var.f2696c;
                    printWriter.println(j0Var);
                    j0Var.dump(strM4561h2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                j0 j0Var2 = (j0) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(j0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f2583e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                j0 j0Var3 = (j0) this.f2583e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(j0Var3.toString());
            }
        }
        int size3 = this.f2582d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                C0336a c0336a = (C0336a) this.f2582d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c0336a.toString());
                c0336a.m1093h(strM4561h, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2589k.get());
        synchronized (this.f2579a) {
            try {
                int size4 = this.f2579a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (f1) this.f2579a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2601w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2602x);
        if (this.f2603y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2603y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2600v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2570H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2571I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2572J);
        if (this.f2569G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2569G);
        }
    }

    /* renamed from: w */
    public final void m1198w() {
        Iterator it = m1180e().iterator();
        while (it.hasNext()) {
            ((C0352q) it.next()).m1241i();
        }
    }

    /* renamed from: x */
    public final void m1199x(f1 f1Var, boolean z6) {
        if (!z6) {
            if (this.f2601w == null) {
                if (!this.f2572J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m1164O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2579a) {
            try {
                if (this.f2601w == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2579a.add(f1Var);
                    m1174Y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public final void m1200y(boolean z6) {
        if (this.f2580b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2601w == null) {
            if (!this.f2572J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2601w.f2709c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && m1164O()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2574L == null) {
            this.f2574L = new ArrayList();
            this.f2575M = new ArrayList();
        }
    }

    /* renamed from: z */
    public final boolean m1201z(boolean z6) {
        boolean zMo1086a;
        C0336a c0336a;
        m1200y(z6);
        if (!this.f2587i && (c0336a = this.f2586h) != null) {
            c0336a.f2452s = false;
            c0336a.m1089d();
            if (m1152K(3)) {
                Objects.toString(this.f2586h);
                Objects.toString(this.f2579a);
            }
            this.f2586h.m1091f(false, false);
            this.f2579a.add(0, this.f2586h);
            ArrayList arrayList = this.f2586h.f2434a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j0 j0Var = ((u1) obj).f2712b;
                if (j0Var != null) {
                    j0Var.mTransitioning = false;
                }
            }
            this.f2586h = null;
        }
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f2574L;
            ArrayList arrayList3 = this.f2575M;
            synchronized (this.f2579a) {
                if (this.f2579a.isEmpty()) {
                    zMo1086a = false;
                } else {
                    try {
                        int size2 = this.f2579a.size();
                        zMo1086a = false;
                        for (int i11 = 0; i11 < size2; i11++) {
                            zMo1086a |= ((f1) this.f2579a.get(i11)).mo1086a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo1086a) {
                break;
            }
            this.f2580b = true;
            try {
                m1171V(this.f2574L, this.f2575M);
                m1179d();
                z10 = true;
            } catch (Throwable th2) {
                m1179d();
                throw th2;
            }
        }
        e0();
        if (this.f2573K) {
            this.f2573K = false;
            ArrayList arrayListM1263d = this.f2581c.m1263d();
            int size3 = arrayListM1263d.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayListM1263d.get(i12);
                i12++;
                s1 s1Var = (s1) obj2;
                j0 j0Var2 = s1Var.f2696c;
                if (j0Var2.mDeferStart) {
                    if (this.f2580b) {
                        this.f2573K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        s1Var.m1254i();
                    }
                }
            }
        }
        this.f2581c.f2703b.values().removeAll(Collections.singleton(null));
        return z10;
    }
}
