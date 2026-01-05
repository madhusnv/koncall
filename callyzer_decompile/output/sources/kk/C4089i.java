package kk;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import mk.AbstractC4770i;
import mk.C4766e;
import nk.AbstractC5084g;
import nk.C5085h;
import nk.b1;
import nk.g0;
import nk.m1;
import qk.AbstractC6243f;
import qk.C6242e;
import ym.C8692c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.i */
/* loaded from: classes.dex */
public final class C4089i {

    /* renamed from: a */
    public C4766e f20981a = C4766e.f23778c;

    /* renamed from: b */
    public final EnumC4097q f20982b = EnumC4097q.DEFAULT;

    /* renamed from: c */
    public final EnumC4081a f20983c = EnumC4081a.IDENTITY;

    /* renamed from: d */
    public final HashMap f20984d = new HashMap();

    /* renamed from: e */
    public final ArrayList f20985e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f20986f = new ArrayList();

    /* renamed from: g */
    public final int f20987g;

    /* renamed from: h */
    public final int f20988h;

    /* renamed from: i */
    public final boolean f20989i;

    /* renamed from: j */
    public final C4083c f20990j;

    /* renamed from: k */
    public EnumC4099s f20991k;

    /* renamed from: l */
    public final boolean f20992l;

    /* renamed from: m */
    public final EnumC4100t f20993m;

    /* renamed from: n */
    public final EnumC4100t f20994n;

    /* renamed from: o */
    public final ArrayDeque f20995o;

    public C4089i() {
        C4083c c4083c = C4088h.f20969i;
        this.f20987g = 2;
        this.f20988h = 2;
        this.f20989i = true;
        this.f20990j = C4088h.f20969i;
        this.f20991k = null;
        this.f20992l = true;
        this.f20993m = C4088h.f20971k;
        this.f20994n = C4088h.f20972l;
        this.f20995o = new ArrayDeque();
    }

    /* renamed from: a */
    public final C4088h m8864a() {
        b1 b1Var;
        b1 b1Var2;
        ArrayList arrayList = this.f20985e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20986f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z6 = AbstractC6243f.f30262a;
        int i10 = this.f20987g;
        int i11 = this.f20988h;
        if (i10 != 2 || i11 != 2) {
            C5085h c5085h = new C5085h(AbstractC5084g.f24915b, i10, i11);
            b1 b1Var3 = m1.f24942a;
            b1 b1Var4 = new b1(Date.class, c5085h, 0);
            if (z6) {
                C6242e c6242e = AbstractC6243f.f30264c;
                c6242e.getClass();
                b1Var = new b1(c6242e.f24916a, new C5085h(c6242e, i10, i11), 0);
                C6242e c6242e2 = AbstractC6243f.f30263b;
                c6242e2.getClass();
                b1Var2 = new b1(c6242e2.f24916a, new C5085h(c6242e2, i10, i11), 0);
            } else {
                b1Var = null;
                b1Var2 = null;
            }
            arrayList3.add(b1Var4);
            if (z6) {
                arrayList3.add(b1Var);
                arrayList3.add(b1Var2);
            }
        }
        C4766e c4766e = this.f20981a;
        HashMap map = new HashMap(this.f20984d);
        EnumC4099s enumC4099s = this.f20991k;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new C4088h(c4766e, this.f20983c, map, this.f20989i, this.f20990j, enumC4099s, this.f20992l, this.f20982b, arrayList3, this.f20993m, this.f20994n, new ArrayList(this.f20995o));
    }

    /* renamed from: b */
    public final void m8865b(Class cls, Object obj) {
        boolean z6 = obj instanceof InterfaceC4096p;
        AbstractC4770i.m9689b(z6 || (obj instanceof InterfaceC4091k) || (obj instanceof AbstractC4103w));
        if (cls == Object.class) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + cls);
        }
        ArrayList arrayList = this.f20985e;
        if (z6 || (obj instanceof InterfaceC4091k)) {
            TypeToken<?> typeToken = TypeToken.get((Type) cls);
            arrayList.add(new g0(obj, typeToken, typeToken.getType() == typeToken.getRawType()));
        }
        if (obj instanceof AbstractC4103w) {
            b1 b1Var = m1.f24942a;
            arrayList.add(new b1(TypeToken.get((Type) cls), (AbstractC4103w) obj, 2));
        }
    }

    /* renamed from: c */
    public final void m8866c(C8692c... c8692cArr) {
        for (C8692c c8692c : c8692cArr) {
            C4766e c4766e = this.f20981a;
            C4766e c4766eClone = c4766e.clone();
            ArrayList arrayList = new ArrayList(c4766e.f23779a);
            c4766eClone.f23779a = arrayList;
            arrayList.add(c8692c);
            ArrayList arrayList2 = new ArrayList(c4766e.f23780b);
            c4766eClone.f23780b = arrayList2;
            arrayList2.add(c8692c);
            this.f20981a = c4766eClone;
        }
    }
}
