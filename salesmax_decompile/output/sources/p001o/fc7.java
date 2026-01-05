package p001o;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class fc7 {

    /* renamed from: a */
    public final CaptureSessionOnClosedNotCalledQuirk f23128a;

    /* renamed from: o.fc7$a */
    public interface InterfaceC13398a {
        /* renamed from: a */
        void mo23154a(ugg uggVar);
    }

    public fc7(l5e l5eVar) {
        this.f23128a = (CaptureSessionOnClosedNotCalledQuirk) l5eVar.m36594b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    /* renamed from: a */
    public final void m26439a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ugg uggVar = (ugg) it.next();
            uggVar.mo17115c().mo17128q(uggVar);
        }
    }

    /* renamed from: b */
    public final void m26440b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ugg uggVar = (ugg) it.next();
            uggVar.mo17115c().mo17129r(uggVar);
        }
    }

    /* renamed from: c */
    public void m26441c(ugg uggVar, List list, List list2, InterfaceC13398a interfaceC13398a) {
        ugg uggVar2;
        ugg uggVar3;
        if (m26442d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (uggVar3 = (ugg) it.next()) != uggVar) {
                linkedHashSet.add(uggVar3);
            }
            m26440b(linkedHashSet);
        }
        interfaceC13398a.mo23154a(uggVar);
        if (m26442d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (uggVar2 = (ugg) it2.next()) != uggVar) {
                linkedHashSet2.add(uggVar2);
            }
            m26439a(linkedHashSet2);
        }
    }

    /* renamed from: d */
    public boolean m26442d() {
        return this.f23128a != null;
    }
}
