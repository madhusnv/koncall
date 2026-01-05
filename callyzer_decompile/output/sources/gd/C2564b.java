package gd;

import fd.C2271i;
import fd.C2273k;
import fd.InterfaceC2265c;
import fd.InterfaceC2266d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import og.jg;
import wc.C7985s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gd.b */
/* loaded from: classes.dex */
public final class C2564b implements InterfaceC2266d {

    /* renamed from: a */
    public final C2271i f13969a;

    /* renamed from: b */
    public final C7985s f13970b;

    /* renamed from: c */
    public final long f13971c;

    /* renamed from: d */
    public int f13972d;

    public C2564b(C2566d c2566d, C2271i c2271i) {
        this.f13969a = c2271i;
        C7985s c7985s = c2566d.f13974a;
        this.f13970b = c7985s;
        this.f13971c = c7985s.f38413a.f3638b;
    }

    @Override // fd.InterfaceC2270h
    /* renamed from: a */
    public final void mo5961a(C2273k c2273k) {
        Object next;
        this.f13972d++;
        StringBuilder sb2 = new StringBuilder();
        C2271i c2271i = this.f13969a;
        Set<InterfaceC2265c> set = c2271i.f10280c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (InterfaceC2265c interfaceC2265c : set) {
            }
        }
        Iterator it = c2271i.f10280c.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((InterfaceC2265c) next).getClass() == C2563a.class) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC2265c interfaceC2265c2 = (InterfaceC2265c) next;
        C2563a c2563a = (C2563a) (interfaceC2265c2 instanceof C2563a ? interfaceC2265c2 : null);
        if (c2563a == null) {
            c2563a = C2563a.f13968a;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(jg.m10722a(c2271i));
        sb3.append(".member.");
        c2563a.getClass();
        sb3.append(this.f13972d);
        sb2.append(sb3.toString());
        sb2.append('.');
        c2273k.f10283b.invoke(new C2566d(this.f13970b, sb2.toString()), c2273k.f10282a);
    }
}
