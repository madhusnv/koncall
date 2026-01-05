package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes2.dex */
public class C2123i {

    /* renamed from: a */
    public final ArrayList f7575a = new ArrayList();

    /* renamed from: b */
    public final HashMap f7576b = new HashMap();

    /* renamed from: c */
    public final HashMap f7577c = new HashMap();

    /* renamed from: d */
    public C2121g f7578d;

    /* renamed from: A */
    public void m6390A(C2121g c2121g) {
        this.f7578d = c2121g;
    }

    /* renamed from: B */
    public Bundle m6391B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f7577c.put(str, bundle) : (Bundle) this.f7577c.remove(str);
    }

    /* renamed from: a */
    public void m6392a(Fragment fragment) {
        if (this.f7575a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f7575a) {
            this.f7575a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    public void m6393b() {
        this.f7576b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m6394c(String str) {
        return this.f7576b.get(str) != null;
    }

    /* renamed from: d */
    public void m6395d(int i) {
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null) {
                c2122h.m6387t(i);
            }
        }
    }

    /* renamed from: e */
    public void m6396e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f7576b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2122h c2122h : this.f7576b.values()) {
                printWriter.print(str);
                if (c2122h != null) {
                    Fragment fragmentM6378k = c2122h.m6378k();
                    printWriter.println(fragmentM6378k);
                    fragmentM6378k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f7575a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f7575a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m6397f(String str) {
        C2122h c2122h = (C2122h) this.f7576b.get(str);
        if (c2122h != null) {
            return c2122h.m6378k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m6398g(int i) {
        for (int size = this.f7575a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f7575a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null) {
                Fragment fragmentM6378k = c2122h.m6378k();
                if (fragmentM6378k.mFragmentId == i) {
                    return fragmentM6378k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m6399h(String str) {
        if (str != null) {
            for (int size = this.f7575a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f7575a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null) {
                Fragment fragmentM6378k = c2122h.m6378k();
                if (str.equals(fragmentM6378k.mTag)) {
                    return fragmentM6378k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m6400i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null && (fragmentFindFragmentByWho = c2122h.m6378k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m6401j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f7575a.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = (Fragment) this.f7575a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f7575a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f7575a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List m6402k() {
        ArrayList arrayList = new ArrayList();
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null) {
                arrayList.add(c2122h);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List m6403l() {
        ArrayList arrayList = new ArrayList();
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null) {
                arrayList.add(c2122h.m6378k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public HashMap m6404m() {
        return this.f7577c;
    }

    /* renamed from: n */
    public C2122h m6405n(String str) {
        return (C2122h) this.f7576b.get(str);
    }

    /* renamed from: o */
    public List m6406o() {
        ArrayList arrayList;
        if (this.f7575a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f7575a) {
            arrayList = new ArrayList(this.f7575a);
        }
        return arrayList;
    }

    /* renamed from: p */
    public C2121g m6407p() {
        return this.f7578d;
    }

    /* renamed from: q */
    public Bundle m6408q(String str) {
        return (Bundle) this.f7577c.get(str);
    }

    /* renamed from: r */
    public void m6409r(C2122h c2122h) {
        Fragment fragmentM6378k = c2122h.m6378k();
        if (m6394c(fragmentM6378k.mWho)) {
            return;
        }
        this.f7576b.put(fragmentM6378k.mWho, c2122h);
        if (fragmentM6378k.mRetainInstanceChangedWhileDetached) {
            if (fragmentM6378k.mRetainInstance) {
                this.f7578d.m6355f(fragmentM6378k);
            } else {
                this.f7578d.m6364p(fragmentM6378k);
            }
            fragmentM6378k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(fragmentM6378k);
        }
    }

    /* renamed from: s */
    public void m6410s(C2122h c2122h) {
        Fragment fragmentM6378k = c2122h.m6378k();
        if (fragmentM6378k.mRetainInstance) {
            this.f7578d.m6364p(fragmentM6378k);
        }
        if (this.f7576b.get(fragmentM6378k.mWho) == c2122h && ((C2122h) this.f7576b.put(fragmentM6378k.mWho, null)) != null && FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(fragmentM6378k);
        }
    }

    /* renamed from: t */
    public void m6411t() {
        Iterator it = this.f7575a.iterator();
        while (it.hasNext()) {
            C2122h c2122h = (C2122h) this.f7576b.get(((Fragment) it.next()).mWho);
            if (c2122h != null) {
                c2122h.m6380m();
            }
        }
        for (C2122h c2122h2 : this.f7576b.values()) {
            if (c2122h2 != null) {
                c2122h2.m6380m();
                Fragment fragmentM6378k = c2122h2.m6378k();
                if (fragmentM6378k.mRemoving && !fragmentM6378k.isInBackStack()) {
                    if (fragmentM6378k.mBeingSaved && !this.f7577c.containsKey(fragmentM6378k.mWho)) {
                        m6391B(fragmentM6378k.mWho, c2122h2.m6385r());
                    }
                    m6410s(c2122h2);
                }
            }
        }
    }

    /* renamed from: u */
    public void m6412u(Fragment fragment) {
        synchronized (this.f7575a) {
            this.f7575a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: v */
    public void m6413v() {
        this.f7576b.clear();
    }

    /* renamed from: w */
    public void m6414w(List list) {
        this.f7575a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentM6397f = m6397f(str);
                if (fragmentM6397f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(fragmentM6397f);
                }
                m6392a(fragmentM6397f);
            }
        }
    }

    /* renamed from: x */
    public void m6415x(HashMap map) {
        this.f7577c.clear();
        this.f7577c.putAll(map);
    }

    /* renamed from: y */
    public ArrayList m6416y() {
        ArrayList arrayList = new ArrayList(this.f7576b.size());
        for (C2122h c2122h : this.f7576b.values()) {
            if (c2122h != null) {
                Fragment fragmentM6378k = c2122h.m6378k();
                m6391B(fragmentM6378k.mWho, c2122h.m6385r());
                arrayList.add(fragmentM6378k.mWho);
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(fragmentM6378k);
                    sb.append(": ");
                    sb.append(fragmentM6378k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public ArrayList m6417z() {
        synchronized (this.f7575a) {
            if (this.f7575a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f7575a.size());
            Iterator it = this.f7575a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.mWho);
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(fragment.mWho);
                    sb.append("): ");
                    sb.append(fragment);
                }
            }
            return arrayList;
        }
    }
}
