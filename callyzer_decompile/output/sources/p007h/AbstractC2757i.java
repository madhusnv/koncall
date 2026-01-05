package p007h;

import android.content.Intent;
import android.os.Bundle;
import bx.C0799i;
import d7.AbstractC1646r;
import d7.EnumC1644p;
import d7.EnumC1645q;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import hq.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import mx.C4905a;
import p008i.AbstractC3064a;
import pg.m7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h.i */
/* loaded from: classes.dex */
public abstract class AbstractC2757i {

    /* renamed from: a */
    public final LinkedHashMap f15308a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f15309b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f15310c = new LinkedHashMap();

    /* renamed from: d */
    public final ArrayList f15311d = new ArrayList();

    /* renamed from: e */
    public final transient LinkedHashMap f15312e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f15313f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f15314g = new Bundle();

    /* renamed from: a */
    public final boolean m6750a(int i10, int i11, Intent intent) {
        String str = (String) this.f15308a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        C2753e c2753e = (C2753e) this.f15312e.get(str);
        if ((c2753e != null ? c2753e.f15299a : null) != null) {
            ArrayList arrayList = this.f15311d;
            if (arrayList.contains(str)) {
                c2753e.f15299a.mo24a(c2753e.f15300b.mo1127c(intent, i11));
                arrayList.remove(str);
                return true;
            }
        }
        this.f15313f.remove(str);
        this.f15314g.putParcelable(str, new C2749a(intent, i11));
        return true;
    }

    /* renamed from: b */
    public abstract void mo5506b(int i10, AbstractC3064a abstractC3064a, Object obj);

    /* renamed from: c */
    public final C2756h m6751c(final String key, InterfaceC1649u interfaceC1649u, final AbstractC3064a contract, final InterfaceC2750b callback) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(contract, "contract");
        AbstractC4154l.m8923f(callback, "callback");
        AbstractC1646r lifecycle = interfaceC1649u.getLifecycle();
        if (lifecycle.mo5344b().isAtLeast(EnumC1645q.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC1649u + " is attempting to register while current state is " + lifecycle.mo5344b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m6753e(key);
        LinkedHashMap linkedHashMap = this.f15310c;
        C2754f c2754f = (C2754f) linkedHashMap.get(key);
        if (c2754f == null) {
            c2754f = new C2754f(lifecycle);
        }
        InterfaceC1647s interfaceC1647s = new InterfaceC1647s() { // from class: h.d
            @Override // d7.InterfaceC1647s
            /* renamed from: u */
            public final void mo1120u(InterfaceC1649u interfaceC1649u2, EnumC1644p enumC1644p) {
                AbstractC2757i abstractC2757i = this.f15295a;
                LinkedHashMap linkedHashMap2 = abstractC2757i.f15312e;
                EnumC1644p enumC1644p2 = EnumC1644p.ON_START;
                String str = key;
                if (enumC1644p2 != enumC1644p) {
                    if (EnumC1644p.ON_STOP == enumC1644p) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (EnumC1644p.ON_DESTROY == enumC1644p) {
                            abstractC2757i.m6754f(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = abstractC2757i.f15314g;
                LinkedHashMap linkedHashMap3 = abstractC2757i.f15313f;
                AbstractC3064a abstractC3064a = contract;
                InterfaceC2750b interfaceC2750b = callback;
                linkedHashMap2.put(str, new C2753e(abstractC3064a, interfaceC2750b));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC2750b.mo24a(obj);
                }
                C2749a c2749a = (C2749a) m7.m11789b(str, bundle);
                if (c2749a != null) {
                    bundle.remove(str);
                    interfaceC2750b.mo24a(abstractC3064a.mo1127c(c2749a.f15294b, c2749a.f15293a));
                }
            }
        };
        c2754f.f15301a.mo5343a(interfaceC1647s);
        c2754f.f15302b.add(interfaceC1647s);
        linkedHashMap.put(key, c2754f);
        return new C2756h(this, key, contract, 0);
    }

    /* renamed from: d */
    public final C2756h m6752d(String key, AbstractC3064a abstractC3064a, InterfaceC2750b interfaceC2750b) {
        AbstractC4154l.m8923f(key, "key");
        m6753e(key);
        this.f15312e.put(key, new C2753e(abstractC3064a, interfaceC2750b));
        LinkedHashMap linkedHashMap = this.f15313f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC2750b.mo24a(obj);
        }
        Bundle bundle = this.f15314g;
        C2749a c2749a = (C2749a) m7.m11789b(key, bundle);
        if (c2749a != null) {
            bundle.remove(key);
            interfaceC2750b.mo24a(abstractC3064a.mo1127c(c2749a.f15294b, c2749a.f15293a));
        }
        return new C2756h(this, key, abstractC3064a, 1);
    }

    /* renamed from: e */
    public final void m6753e(String str) {
        LinkedHashMap linkedHashMap = this.f15309b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new C4905a(new C0799i(1, C2755g.f15303a, new d0(19))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f15308a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* renamed from: f */
    public final void m6754f(String key) {
        Integer num;
        AbstractC4154l.m8923f(key, "key");
        if (!this.f15311d.contains(key) && (num = (Integer) this.f15309b.remove(key)) != null) {
            this.f15308a.remove(num);
        }
        this.f15312e.remove(key);
        LinkedHashMap linkedHashMap = this.f15313f;
        if (linkedHashMap.containsKey(key)) {
            Objects.toString(linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f15314g;
        if (bundle.containsKey(key)) {
            Objects.toString((C2749a) m7.m11789b(key, bundle));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f15310c;
        C2754f c2754f = (C2754f) linkedHashMap2.get(key);
        if (c2754f != null) {
            ArrayList arrayList = c2754f.f15302b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c2754f.f15301a.mo5346d((InterfaceC1647s) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
