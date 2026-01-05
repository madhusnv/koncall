package id;

import a1.C0005d;
import ex.InterfaceC2139c;
import fd.C2271i;
import fd.C2272j;
import fd.C2273k;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import i9.C3183a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.gf;
import og.wd;
import pg.j6;
import pg.k6;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.g */
/* loaded from: classes.dex */
public final class C3237g implements InterfaceC2275m, InterfaceC2276n {

    /* renamed from: a */
    public final C0005d f17402a = new C0005d(27);

    /* renamed from: b */
    public final ArrayList f17403b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f17404c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [fd.i] */
    @Override // fd.InterfaceC2275m
    /* renamed from: b */
    public final InterfaceC2276n mo5962b(C2272j c2272j) {
        Object next;
        ArrayList arrayList = this.f17404c;
        AbstractC4154l.m8923f(arrayList, "<this>");
        ?? r02 = (C2271i) (!arrayList.isEmpty() ? wd.m11034b(arrayList) : null);
        if (r02 != 0) {
            c2272j = r02;
        }
        gf gfVar = c2272j.f10278a;
        ArrayList arrayList2 = this.f17403b;
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it = c2272j.f10280c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2265c) next).getClass() == C3235e.class) {
                break;
            }
        }
        InterfaceC2265c interfaceC2265c = (InterfaceC2265c) next;
        if (!(interfaceC2265c instanceof C3235e)) {
            interfaceC2265c = null;
        }
        C3235e c3235e = (C3235e) interfaceC2265c;
        C0005d c0005d = this.f17402a;
        if (c3235e != null && zIsEmpty) {
            c0005d.getClass();
            ((LinkedHashMap) c0005d.f25c).put(new C3241k("xmlns", null), "http://s3.amazonaws.com/doc/2006-03-01/");
        }
        String str = j6.m11709a(c2272j).f17401a;
        if (!AbstractC4154l.m8918a(gfVar, C2274l.f10288f) && !AbstractC4154l.m8918a(gfVar, C2274l.f10290h)) {
            C0005d.m0(c0005d, str);
        }
        AbstractC4154l.m8923f(arrayList2, "<this>");
        arrayList2.add(str);
        return this;
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: c */
    public final void mo2595c(C2271i c2271i, int i10) {
        m7580g(c2271i, Integer.valueOf(i10), new C3183a(1, this, C3237g.class, "serializeNumber", "serializeNumber(Ljava/lang/Number;)V", 0, 7));
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: d */
    public final void mo2596d(C2271i c2271i, String value) {
        AbstractC4154l.m8923f(value, "value");
        m7580g(c2271i, value, new C3183a(1, this, C3237g.class, "serializeString", "serializeString(Ljava/lang/String;)V", 0, 6));
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: e */
    public final void mo2597e(C2271i c2271i, C2273k c2273k) {
        ArrayList arrayList = this.f17404c;
        AbstractC4154l.m8923f(arrayList, "<this>");
        arrayList.add(c2271i);
        c2273k.f10283b.invoke(this, c2273k.f10282a);
        AbstractC4154l.m8923f(arrayList, "<this>");
        AbstractC6663m.m12757U(arrayList);
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: f */
    public final void mo2598f() {
        ArrayList arrayList = this.f17403b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Expected nodeStack to have a value, but was empty.");
        }
        String str = (String) AbstractC6663m.m12757U(arrayList);
        ArrayList arrayList2 = this.f17404c;
        if (arrayList2.isEmpty()) {
            return;
        }
        C2271i c2271i = (C2271i) wd.m11034b(arrayList2);
        if (AbstractC4154l.m8918a(c2271i.f10278a, C2274l.f10288f) || AbstractC4154l.m8918a(c2271i.f10278a, C2274l.f10290h)) {
            return;
        }
        C0005d.m33q(this.f17402a, str);
    }

    /* renamed from: g */
    public final void m7580g(C2271i c2271i, Object obj, InterfaceC2139c interfaceC2139c) {
        Object next;
        Set set = c2271i.f10280c;
        Iterator it = set.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((InterfaceC2265c) next).getClass() == C3235e.class) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC2265c interfaceC2265c = (InterfaceC2265c) next;
        C3235e c3235e = (C3235e) (interfaceC2265c instanceof C3235e ? interfaceC2265c : null);
        Set<InterfaceC2265c> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (InterfaceC2265c interfaceC2265c2 : set2) {
            }
        }
        String str = j6.m11709a(c2271i).f17401a;
        C0005d c0005d = this.f17402a;
        k6.m11732b(c0005d, str, c3235e);
        interfaceC2139c.invoke(obj);
        C0005d.m33q(c0005d, str);
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: n */
    public final void mo2604n(C2271i c2271i, boolean z6) {
        m7580g(c2271i, Boolean.valueOf(z6), new C3183a(1, this, C3237g.class, "serializeBoolean", "serializeBoolean(Z)V", 0, 5));
    }
}
