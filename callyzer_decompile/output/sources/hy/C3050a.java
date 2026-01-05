package hy;

import i0.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hy.a */
/* loaded from: classes3.dex */
public final class C3050a {

    /* renamed from: a */
    public final String f16380a;

    /* renamed from: b */
    public List f16381b;

    /* renamed from: c */
    public final ArrayList f16382c;

    /* renamed from: d */
    public final HashSet f16383d;

    /* renamed from: e */
    public final ArrayList f16384e;

    /* renamed from: f */
    public final ArrayList f16385f;

    /* renamed from: g */
    public final ArrayList f16386g;

    public C3050a(String serialName) {
        AbstractC4154l.m8923f(serialName, "serialName");
        this.f16380a = serialName;
        this.f16381b = C6668r.f31943a;
        this.f16382c = new ArrayList();
        this.f16383d = new HashSet();
        this.f16384e = new ArrayList();
        this.f16385f = new ArrayList();
        this.f16386g = new ArrayList();
    }

    /* renamed from: a */
    public static void m7276a(C3050a c3050a, String elementName, InterfaceC3055f descriptor) {
        c3050a.getClass();
        AbstractC4154l.m8923f(elementName, "elementName");
        AbstractC4154l.m8923f(descriptor, "descriptor");
        if (!c3050a.f16383d.add(elementName)) {
            StringBuilder sbM7383p = m0.m7383p("Element with name '", elementName, "' is already registered in ");
            sbM7383p.append(c3050a.f16380a);
            throw new IllegalArgumentException(sbM7383p.toString().toString());
        }
        c3050a.f16382c.add(elementName);
        c3050a.f16384e.add(descriptor);
        c3050a.f16385f.add(C6668r.f31943a);
        c3050a.f16386g.add(false);
    }
}
