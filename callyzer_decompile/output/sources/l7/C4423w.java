package l7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e1.v0;
import e1.x0;
import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import ly.C4599w;
import m7.AbstractC4670a;
import mx.AbstractC4913i;
import mx.C4905a;
import nx.AbstractC5178p;
import q7.C6141h;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.w */
/* loaded from: classes.dex */
public class C4423w extends AbstractC4422v implements Iterable, InterfaceC2395a {

    /* renamed from: h */
    public static final /* synthetic */ int f22139h = 0;

    /* renamed from: g */
    public final C4599w f22140g;

    public C4423w(C4426z c4426z) {
        super(c4426z);
        this.f22140g = new C4599w(this);
    }

    @Override // l7.AbstractC4422v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4423w) || !super.equals(obj)) {
            return false;
        }
        C4599w c4599w = this.f22140g;
        int iM5649f = ((v0) c4599w.f22767f).m5649f();
        C4599w c4599w2 = ((C4423w) obj).f22140g;
        if (iM5649f != ((v0) c4599w2.f22767f).m5649f() || c4599w.f22763b != c4599w2.f22763b) {
            return false;
        }
        v0 v0Var = (v0) c4599w.f22767f;
        AbstractC4154l.m8923f(v0Var, "<this>");
        Iterator it = ((C4905a) AbstractC4913i.m9806b(new x0(0, v0Var))).iterator();
        while (it.hasNext()) {
            AbstractC4422v abstractC4422v = (AbstractC4422v) it.next();
            if (!abstractC4422v.equals(((v0) c4599w2.f22767f).m5646c(abstractC4422v.f22135b.f29939e))) {
                return false;
            }
        }
        return true;
    }

    @Override // l7.AbstractC4422v
    public final int hashCode() {
        C4599w c4599w = this.f22140g;
        int iM5647d = c4599w.f22763b;
        v0 v0Var = (v0) c4599w.f22767f;
        int iM5649f = v0Var.m5649f();
        for (int i10 = 0; i10 < iM5649f; i10++) {
            iM5647d = (((iM5647d * 31) + v0Var.m5647d(i10)) * 31) + ((AbstractC4422v) v0Var.m5650g(i10)).hashCode();
        }
        return iM5647d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4599w c4599w = this.f22140g;
        c4599w.getClass();
        return new C6141h(c4599w);
    }

    @Override // l7.AbstractC4422v
    /* renamed from: t */
    public final C4421u mo9251t(C4367l c4367l) {
        C4421u c4421uMo9251t = super.mo9251t(c4367l);
        C4599w c4599w = this.f22140g;
        c4599w.getClass();
        return c4599w.m9467t(c4421uMo9251t, c4367l, false, (C4423w) c4599w.f22766e);
    }

    @Override // l7.AbstractC4422v
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        C4599w c4599w = this.f22140g;
        String str = c4599w.f22765d;
        c4599w.getClass();
        AbstractC4422v abstractC4422vM9464q = (str == null || AbstractC5178p.m10101L(str)) ? null : c4599w.m9464q(str, true);
        if (abstractC4422vM9464q == null) {
            abstractC4422vM9464q = c4599w.m9463p(c4599w.f22763b);
        }
        sb2.append(" startDestination=");
        if (abstractC4422vM9464q == null) {
            String str2 = c4599w.f22765d;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = c4599w.f22764c;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(c4599w.f22763b));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(abstractC4422vM9464q.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    @Override // l7.AbstractC4422v
    /* renamed from: u */
    public final void mo9180u(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        String strValueOf;
        AbstractC4154l.m8923f(context, "context");
        super.mo9180u(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC4670a.f23108d);
        AbstractC4154l.m8922e(typedArrayObtainAttributes, "obtainAttributes(...)");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        C4599w c4599w = this.f22140g;
        C4423w c4423w = (C4423w) c4599w.f22766e;
        if (resourceId == c4423w.f22135b.f29939e) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + c4423w).toString());
        }
        if (c4599w.f22765d != null) {
            c4599w.m9472y(null);
        }
        c4599w.f22763b = resourceId;
        c4599w.f22764c = null;
        int i10 = c4599w.f22763b;
        if (i10 <= 16777215) {
            strValueOf = String.valueOf(i10);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i10);
                AbstractC4154l.m8920c(strValueOf);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i10);
            }
        }
        c4599w.f22764c = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    /* renamed from: x */
    public final C4421u m9254x(C4367l c4367l, AbstractC4422v abstractC4422v) {
        return this.f22140g.m9467t(super.mo9251t(c4367l), c4367l, true, abstractC4422v);
    }

    /* renamed from: y */
    public final C4421u m9255y(String route, boolean z6, AbstractC4422v abstractC4422v) {
        C4421u c4421uM9255y;
        AbstractC4154l.m8923f(route, "route");
        C4599w c4599w = this.f22140g;
        c4599w.getClass();
        C4423w c4423w = (C4423w) c4599w.f22766e;
        C4421u c4421uM12189a = c4423w.f22135b.m12189a(route);
        ArrayList arrayList = new ArrayList();
        Iterator it = c4423w.iterator();
        while (true) {
            C6141h c6141h = (C6141h) it;
            c4421uM9255y = null;
            if (!c6141h.hasNext()) {
                break;
            }
            AbstractC4422v abstractC4422v2 = (AbstractC4422v) c6141h.next();
            if (!AbstractC4154l.m8918a(abstractC4422v2, abstractC4422v)) {
                if (abstractC4422v2 instanceof C4423w) {
                    c4421uM9255y = ((C4423w) abstractC4422v2).m9255y(route, false, c4423w);
                } else {
                    abstractC4422v2.getClass();
                    c4421uM9255y = abstractC4422v2.f22135b.m12189a(route);
                }
            }
            if (c4421uM9255y != null) {
                arrayList.add(c4421uM9255y);
            }
        }
        C4421u c4421u = (C4421u) AbstractC6663m.m12752P(arrayList);
        C4423w c4423w2 = c4423w.f22136c;
        if (c4423w2 != null && z6 && !c4423w2.equals(abstractC4422v)) {
            c4421uM9255y = c4423w2.m9255y(route, true, c4423w);
        }
        return (C4421u) AbstractC6663m.m12752P(AbstractC6662l.m12729s(new C4421u[]{c4421uM12189a, c4421u, c4421uM9255y}));
    }
}
