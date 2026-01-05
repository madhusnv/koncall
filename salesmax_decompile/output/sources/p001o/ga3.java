package p001o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class ga3 {

    /* renamed from: a */
    public final String f24819a;

    /* renamed from: b */
    public List f24820b;

    /* renamed from: c */
    public final List f24821c;

    /* renamed from: d */
    public final Set f24822d;

    /* renamed from: e */
    public final List f24823e;

    /* renamed from: f */
    public final List f24824f;

    /* renamed from: g */
    public final List f24825g;

    public ga3(String str) {
        sq8.m48649h(str, "serialName");
        this.f24819a = str;
        this.f24820b = ch3.m21246k();
        this.f24821c = new ArrayList();
        this.f24822d = new HashSet();
        this.f24823e = new ArrayList();
        this.f24824f = new ArrayList();
        this.f24825g = new ArrayList();
    }

    /* renamed from: b */
    public static /* synthetic */ void m28277b(ga3 ga3Var, String str, uef uefVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = ch3.m21246k();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        ga3Var.m28278a(str, uefVar, list, z);
    }

    /* renamed from: a */
    public final void m28278a(String str, uef uefVar, List list, boolean z) {
        sq8.m48649h(str, "elementName");
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(list, "annotations");
        if (this.f24822d.add(str)) {
            this.f24821c.add(str);
            this.f24823e.add(uefVar);
            this.f24824f.add(list);
            this.f24825g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f24819a).toString());
    }

    /* renamed from: c */
    public final List m28279c() {
        return this.f24820b;
    }

    /* renamed from: d */
    public final List m28280d() {
        return this.f24824f;
    }

    /* renamed from: e */
    public final List m28281e() {
        return this.f24823e;
    }

    /* renamed from: f */
    public final List m28282f() {
        return this.f24821c;
    }

    /* renamed from: g */
    public final List m28283g() {
        return this.f24825g;
    }

    /* renamed from: h */
    public final void m28284h(List list) {
        sq8.m48649h(list, "<set-?>");
        this.f24820b = list;
    }
}
