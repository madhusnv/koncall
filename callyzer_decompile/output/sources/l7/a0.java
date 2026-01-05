package l7;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import aq.C0401d;
import d7.AbstractC1646r;
import d7.C1639l;
import d7.InterfaceC1649u;
import d7.b1;
import ex.InterfaceC2139c;
import h6.C2856l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import mx.AbstractC4913i;
import mx.C4905a;
import of.C5359n;
import og.cg;
import og.dg;
import og.fg;
import og.nd;
import og.pe;
import pg.n7;
import q7.C6136c;
import q7.C6138e;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import rw.C6661k;
import v0.AbstractC7621e;
import zh.AbstractC8954a;
import zk.AbstractC8987a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public final Context f21995a;

    /* renamed from: b */
    public final C6138e f21996b;

    /* renamed from: c */
    public final C2856l f21997c;

    /* renamed from: d */
    public final Activity f21998d;

    /* renamed from: e */
    public boolean f21999e;

    /* renamed from: f */
    public final p004e.d0 f22000f;

    /* renamed from: g */
    public final boolean f22001g;

    /* renamed from: h */
    public final C6366p f22002h;

    public a0(Context context) {
        Object next;
        AbstractC4154l.m8923f(context, "context");
        this.f21995a = context;
        this.f21996b = new C6138e(this, new C0401d(this, 16));
        this.f21997c = new C2856l(context, false);
        Iterator it = AbstractC4913i.m9809e(new hq.d0(6), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f21998d = (Activity) next;
        this.f22000f = new p004e.d0(this);
        this.f22001g = true;
        o0 o0Var = this.f21996b.f29925s;
        o0Var.m9232a(new C4426z(o0Var));
        this.f21996b.f29925s.m9232a(new C4402b(this.f21995a));
        this.f22002h = nd.m10782c(new C0401d(this, 17));
    }

    /* renamed from: f */
    public static void m9181f(a0 a0Var, String route) {
        a0Var.getClass();
        AbstractC4154l.m8923f(route, "route");
        a0Var.f21996b.m12178m(route, null);
    }

    /* renamed from: h */
    public static void m9182h(a0 a0Var, String route, boolean z6) {
        a0Var.getClass();
        AbstractC4154l.m8923f(route, "route");
        C6138e c6138e = a0Var.f21996b;
        c6138e.getClass();
        if (c6138e.m12182q(route, z6, false)) {
            c6138e.m12168b();
        }
    }

    /* renamed from: a */
    public final C4409i m9183a(String str) {
        Object objPrevious;
        C6138e c6138e = this.f21996b;
        c6138e.getClass();
        C6661k c6661k = c6138e.f29912f;
        ListIterator listIterator = c6661k.listIterator(c6661k.mo10411b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C4409i c4409i = (C4409i) objPrevious;
            if (c4409i.f22046b.m9250s(str, c4409i.f22052h.m12163a())) {
                break;
            }
        }
        C4409i c4409i2 = (C4409i) objPrevious;
        if (c4409i2 != null) {
            return c4409i2;
        }
        StringBuilder sbM7383p = i0.m0.m7383p("No destination with route ", str, " is on the NavController's back stack. The current destination is ");
        sbM7383p.append(c6138e.m12173h());
        throw new IllegalArgumentException(sbM7383p.toString().toString());
    }

    /* renamed from: b */
    public final int m9184b() {
        C6661k c6661k = this.f21996b.f29912f;
        int i10 = 0;
        if (c6661k != null && c6661k.isEmpty()) {
            return 0;
        }
        Iterator<E> it = c6661k.iterator();
        while (it.hasNext()) {
            if (!(((C4409i) it.next()).f22046b instanceof C4423w) && (i10 = i10 + 1) < 0) {
                pe.m10841p();
                throw null;
            }
        }
        return i10;
    }

    /* renamed from: c */
    public final C4409i m9185c() {
        Object next;
        Iterator it = AbstractC6663m.m12758V(this.f21996b.f29912f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((C4905a) AbstractC4913i.m9806b(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((C4409i) next).f22046b instanceof C4423w)) {
                break;
            }
        }
        return (C4409i) next;
    }

    /* renamed from: d */
    public final void m9186d(int i10) {
        int i11;
        d0 d0Var;
        Bundle bundleM11799a;
        C6138e c6138e = this.f21996b;
        AbstractC4422v abstractC4422v = c6138e.f29912f.isEmpty() ? c6138e.f29909c : ((C4409i) c6138e.f29912f.last()).f22046b;
        if (abstractC4422v == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C4407g c4407gM9248q = abstractC4422v.m9248q(i10);
        if (c4407gM9248q != null) {
            d0Var = c4407gM9248q.f22037b;
            i11 = c4407gM9248q.f22036a;
            Bundle bundle = c4407gM9248q.f22038c;
            if (bundle != null) {
                bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                bundleM11799a.putAll(bundle);
            } else {
                bundleM11799a = null;
            }
        } else {
            i11 = i10;
            d0Var = null;
            bundleM11799a = null;
        }
        if (i11 == 0 && d0Var != null) {
            boolean z6 = d0Var.f22019d;
            String str = d0Var.f22025j;
            int i12 = d0Var.f22018c;
            if (i12 != -1 || str != null) {
                if (str != null) {
                    m9182h(this, str, z6);
                    return;
                } else {
                    if (i12 == -1 || !c6138e.m12181p(i12, z6, false)) {
                        return;
                    }
                    c6138e.m12168b();
                    return;
                }
            }
        }
        if (i11 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        AbstractC4422v abstractC4422vM12170d = c6138e.m12170d(i11, null);
        if (abstractC4422vM12170d != null) {
            c6138e.m12180o(abstractC4422vM12170d, bundleM11799a, d0Var);
            return;
        }
        int i13 = AbstractC4422v.f22133f;
        C2856l c2856l = this.f21997c;
        String strM16435a = AbstractC8954a.m16435a(c2856l, i11);
        if (c4407gM9248q == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strM16435a + " cannot be found from the current destination " + abstractC4422v);
        }
        StringBuilder sbM7383p = i0.m0.m7383p("Navigation destination ", strM16435a, " referenced from action ");
        sbM7383p.append(AbstractC8954a.m16435a(c2856l, i10));
        sbM7383p.append(" cannot be found from the current destination ");
        sbM7383p.append(abstractC4422v);
        throw new IllegalArgumentException(sbM7383p.toString().toString());
    }

    /* renamed from: e */
    public final void m9187e(InterfaceC2139c interfaceC2139c, String route) {
        AbstractC4154l.m8923f(route, "route");
        C6138e c6138e = this.f21996b;
        c6138e.getClass();
        c6138e.m12178m(route, AbstractC8987a.m16464a(interfaceC2139c));
    }

    /* renamed from: g */
    public final boolean m9188g() {
        C6138e c6138e = this.f21996b;
        if (c6138e.f29912f.isEmpty()) {
            return false;
        }
        AbstractC4422v abstractC4422vM12173h = c6138e.m12173h();
        AbstractC4154l.m8920c(abstractC4422vM12173h);
        return c6138e.m12181p(abstractC4422vM12173h.f22135b.f29939e, true, false) && c6138e.m12168b();
    }

    /* renamed from: i */
    public final void m9189i(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f21995a.getClassLoader());
        }
        C6138e c6138e = this.f21996b;
        LinkedHashMap linkedHashMap = c6138e.f29919m;
        if (bundle != null) {
            c6138e.f29910d = bundle.containsKey("android-support-nav:controller:navigatorState") ? cg.m10588c("android-support-nav:controller:navigatorState", bundle) : null;
            c6138e.f29911e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) cg.m10589d("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray == null) {
                    dg.m10615b("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (stringArrayList == null) {
                    dg.m10615b("android-support-nav:controller:backStackIds");
                    throw null;
                }
                int length = intArray.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    c6138e.f29918l.put(Integer.valueOf(intArray[i10]), !AbstractC4154l.m8918a(stringArrayList.get(i11), "") ? stringArrayList.get(i11) : null);
                    i10++;
                    i11 = i12;
                }
            }
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 == null) {
                    dg.m10615b("android-support-nav:controller:backStackStates");
                    throw null;
                }
                int size = stringArrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    String str = stringArrayList2.get(i13);
                    i13++;
                    String str2 = str;
                    String key = "android-support-nav:controller:backStackStates:" + str2;
                    AbstractC4154l.m8923f(key, "key");
                    if (bundle.containsKey(key)) {
                        ArrayList arrayListM10589d = cg.m10589d("android-support-nav:controller:backStackStates:" + str2, bundle);
                        C6661k c6661k = new C6661k(arrayListM10589d.size());
                        int size2 = arrayListM10589d.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj = arrayListM10589d.get(i14);
                            i14++;
                            c6661k.addLast(new C4410j((Bundle) obj));
                        }
                        linkedHashMap.put(str2, c6661k);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z6 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z6 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z6) : null;
            this.f21999e = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
    }

    /* renamed from: j */
    public final Bundle m9190j() {
        Bundle bundleM11799a;
        C6138e c6138e = this.f21996b;
        LinkedHashMap linkedHashMap = c6138e.f29919m;
        C6661k c6661k = c6138e.f29912f;
        LinkedHashMap linkedHashMap2 = c6138e.f29918l;
        ArrayList arrayList = new ArrayList();
        Bundle bundleM11799a2 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        for (Map.Entry entry : AbstractC6674x.m12785m(c6138e.f29925s.f22091a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo9230h = ((n0) entry.getValue()).mo9230h();
            if (bundleMo9230h != null) {
                arrayList.add(str);
                fg.m10658d(bundleM11799a2, str, bundleMo9230h);
            }
        }
        if (arrayList.isEmpty()) {
            bundleM11799a = null;
        } else {
            bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            fg.m10660f(bundleM11799a2, "android-support-nav:controller:navigatorState:names", arrayList);
            fg.m10658d(bundleM11799a, "android-support-nav:controller:navigatorState", bundleM11799a2);
        }
        if (!c6661k.isEmpty()) {
            if (bundleM11799a == null) {
                bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator<E> it = c6661k.iterator();
            while (it.hasNext()) {
                C4409i entry2 = (C4409i) it.next();
                AbstractC4154l.m8923f(entry2, "entry");
                int i10 = entry2.f22046b.f22135b.f29939e;
                String str2 = entry2.f22050f;
                C6136c c6136c = entry2.f22052h;
                Bundle bundleM12163a = c6136c.m12163a();
                Bundle bundleM11799a3 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                c6136c.f29899h.m6569c(bundleM11799a3);
                Bundle bundleM11799a4 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                fg.m10659e("nav-entry-state:id", str2, bundleM11799a4);
                bundleM11799a4.putInt("nav-entry-state:destination-id", i10);
                if (bundleM12163a == null) {
                    bundleM12163a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                }
                fg.m10658d(bundleM11799a4, "nav-entry-state:args", bundleM12163a);
                fg.m10658d(bundleM11799a4, "nav-entry-state:saved-state", bundleM11799a3);
                arrayList2.add(bundleM11799a4);
            }
            bundleM11799a.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleM11799a == null) {
                bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry3.getKey()).intValue();
                String str3 = (String) entry3.getValue();
                int i12 = i11 + 1;
                iArr[i11] = iIntValue;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList3.add(str3);
                i11 = i12;
            }
            bundleM11799a.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            fg.m10660f(bundleM11799a, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleM11799a == null) {
                bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                String str4 = (String) entry4.getKey();
                C6661k c6661k2 = (C6661k) entry4.getValue();
                arrayList4.add(str4);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator it2 = c6661k2.iterator();
                while (it2.hasNext()) {
                    C5359n c5359n = ((C4410j) it2.next()).f22054a;
                    c5359n.getClass();
                    Bundle bundleM11799a5 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                    fg.m10659e("nav-entry-state:id", (String) c5359n.f26304b, bundleM11799a5);
                    bundleM11799a5.putInt("nav-entry-state:destination-id", c5359n.f26303a);
                    Bundle bundleM11799a6 = (Bundle) c5359n.f26305c;
                    if (bundleM11799a6 == null) {
                        bundleM11799a6 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                    }
                    fg.m10658d(bundleM11799a5, "nav-entry-state:args", bundleM11799a6);
                    fg.m10658d(bundleM11799a5, "nav-entry-state:saved-state", (Bundle) c5359n.f26306d);
                    arrayList5.add(bundleM11799a5);
                }
                String key = "android-support-nav:controller:backStackStates:" + str4;
                AbstractC4154l.m8923f(key, "key");
                bundleM11799a.putParcelableArrayList(key, arrayList5);
            }
            fg.m10660f(bundleM11799a, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.f21999e) {
            if (bundleM11799a == null) {
                bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            }
            bundleM11799a.putBoolean("android-support-nav:controller:deepLinkHandled", this.f21999e);
        }
        return bundleM11799a;
    }

    /* renamed from: k */
    public final void m9191k(InterfaceC1649u owner) {
        AbstractC1646r lifecycle;
        AbstractC4154l.m8923f(owner, "owner");
        C6138e c6138e = this.f21996b;
        C1639l c1639l = c6138e.f29924r;
        if (owner.equals(c6138e.f29920n)) {
            return;
        }
        InterfaceC1649u interfaceC1649u = c6138e.f29920n;
        if (interfaceC1649u != null && (lifecycle = interfaceC1649u.getLifecycle()) != null) {
            lifecycle.mo5346d(c1639l);
        }
        c6138e.f29920n = owner;
        owner.getLifecycle().mo5343a(c1639l);
    }

    /* renamed from: l */
    public final void m9192l(b1 viewModelStore) {
        AbstractC4154l.m8923f(viewModelStore, "viewModelStore");
        C6138e c6138e = this.f21996b;
        c6138e.getClass();
        if (AbstractC4154l.m8918a(c6138e.f29921o, AbstractC7621e.m14506a(viewModelStore))) {
            return;
        }
        if (!c6138e.f29912f.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        c6138e.f29921o = AbstractC7621e.m14506a(viewModelStore);
    }
}
