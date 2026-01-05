package l7;

import a2.AbstractC0030c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import ba.AbstractC0638h;
import e1.v0;
import h6.C2856l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import m7.AbstractC4670a;
import nx.AbstractC5178p;
import og.cg;
import og.eg;
import og.nd;
import pg.n7;
import q7.C6139f;
import q7.C6140g;
import qw.C6361k;
import rw.AbstractC6674x;
import uz.AbstractC7582g;
import zh.AbstractC8954a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.v */
/* loaded from: classes.dex */
public abstract class AbstractC4422v {

    /* renamed from: f */
    public static final /* synthetic */ int f22133f = 0;

    /* renamed from: a */
    public final String f22134a;

    /* renamed from: b */
    public final C6140g f22135b;

    /* renamed from: c */
    public C4423w f22136c;

    /* renamed from: d */
    public CharSequence f22137d;

    /* renamed from: e */
    public final v0 f22138e;

    static {
        new LinkedHashMap();
    }

    public AbstractC4422v(n0 navigator) {
        AbstractC4154l.m8923f(navigator, "navigator");
        LinkedHashMap linkedHashMap = o0.f22090b;
        this.f22134a = AbstractC0638h.m1854b(navigator.getClass());
        this.f22135b = new C6140g(this);
        this.f22138e = new v0(0);
    }

    /* renamed from: b */
    public final void m9245b(C4419s navDeepLink) {
        AbstractC4154l.m8923f(navDeepLink, "navDeepLink");
        C6140g c6140g = this.f22135b;
        c6140g.getClass();
        ArrayList arrayListM14314a = AbstractC7582g.m14314a(c6140g.f29938d, new C6139f(navDeepLink, 0));
        if (arrayListM14314a.isEmpty()) {
            c6140g.f29937c.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f22109a + " can't be used to open destination " + c6140g.f29935a + ".\nFollowing required arguments are missing: " + arrayListM14314a).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Lcd
        L5:
            r1 = 0
            if (r11 == 0) goto Lce
            boolean r2 = r11 instanceof l7.AbstractC4422v
            if (r2 != 0) goto Le
            goto Lce
        Le:
            q7.g r2 = r10.f22135b
            java.util.ArrayList r3 = r2.f29937c
            l7.v r11 = (l7.AbstractC4422v) r11
            e1.v0 r4 = r11.f22138e
            q7.g r5 = r11.f22135b
            java.util.ArrayList r6 = r5.f29937c
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r6)
            e1.v0 r6 = r10.f22138e
            int r7 = r6.m5649f()
            int r8 = r4.m5649f()
            if (r7 != r8) goto L5a
            e1.w0 r7 = new e1.w0
            r7.<init>(r6)
            mx.g r7 = mx.AbstractC4913i.m9806b(r7)
            mx.a r7 = (mx.C4905a) r7
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L58
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.m5646c(r8)
            java.lang.Object r8 = r4.m5646c(r8)
            boolean r8 = kotlin.jvm.internal.AbstractC4154l.m8918a(r9, r8)
            if (r8 != 0) goto L39
            goto L5a
        L58:
            r4 = r0
            goto L5b
        L5a:
            r4 = r1
        L5b:
            java.util.Map r6 = r10.m9249r()
            int r6 = r6.size()
            java.util.Map r7 = r11.m9249r()
            int r7 = r7.size()
            if (r6 != r7) goto Lb6
            java.util.Map r6 = r10.m9249r()
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            mx.j r6 = rw.AbstractC6663m.m12766y(r6)
            java.lang.Object r6 = r6.f24454b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L83:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb4
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.Map r8 = r11.m9249r()
            java.lang.Object r9 = r7.getKey()
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto Lb6
            java.util.Map r8 = r11.m9249r()
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.AbstractC4154l.m8918a(r8, r7)
            if (r7 == 0) goto Lb6
            goto L83
        Lb4:
            r11 = r0
            goto Lb7
        Lb6:
            r11 = r1
        Lb7:
            int r6 = r2.f29939e
            int r7 = r5.f29939e
            if (r6 != r7) goto Lce
            java.lang.String r2 = r2.f29940f
            java.lang.String r5 = r5.f29940f
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r5)
            if (r2 == 0) goto Lce
            if (r3 == 0) goto Lce
            if (r4 == 0) goto Lce
            if (r11 == 0) goto Lce
        Lcd:
            return r0
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.AbstractC4422v.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public final Bundle m9246h(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f22135b.f29938d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C4408h c4408h = (C4408h) entry.getValue();
            c4408h.getClass();
            AbstractC4154l.m8923f(name, "name");
            if (c4408h.f22042c && (obj = c4408h.f22043d) != null) {
                c4408h.f22040a.mo9207e(bundleM11799a, name, obj);
            }
        }
        if (bundle != null) {
            bundleM11799a.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C4408h c4408h2 = (C4408h) entry2.getValue();
                c4408h2.getClass();
                k0 k0Var = c4408h2.f22040a;
                AbstractC4154l.m8923f(name2, "name");
                if (c4408h2.f22041b || !bundleM11799a.containsKey(name2) || !cg.m10590e(name2, bundleM11799a)) {
                    try {
                        k0Var.mo9203a(name2, bundleM11799a);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbM7383p = i0.m0.m7383p("Wrong argument type for '", name2, "' in argument savedState. ");
                sbM7383p.append(k0Var.mo9204b());
                sbM7383p.append(" expected.");
                throw new IllegalArgumentException(sbM7383p.toString().toString());
            }
        }
        return bundleM11799a;
    }

    public int hashCode() {
        C6140g c6140g = this.f22135b;
        int i10 = c6140g.f29939e * 31;
        String str = c6140g.f29940f;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = c6140g.f29937c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C4419s c4419s = (C4419s) obj;
            int i12 = iHashCode * 31;
            String str2 = c4419s.f22109a;
            int iHashCode2 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = c4419s.f22110b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = c4419s.f22111c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        v0 v0Var = this.f22138e;
        AbstractC4154l.m8923f(v0Var, "<this>");
        int i13 = 0;
        while (true) {
            if (!(i13 < v0Var.m5649f())) {
                break;
            }
            int i14 = i13 + 1;
            C4407g c4407g = (C4407g) v0Var.m5650g(i13);
            int i15 = ((iHashCode * 31) + c4407g.f22036a) * 31;
            d0 d0Var = c4407g.f22037b;
            iHashCode = i15 + (d0Var != null ? d0Var.hashCode() : 0);
            Bundle bundle = c4407g.f22038c;
            if (bundle != null) {
                iHashCode = eg.m10635b(bundle) + (iHashCode * 31);
            }
            i13 = i14;
        }
        for (String str5 : m9249r().keySet()) {
            int iM113d = AbstractC0030c.m113d(iHashCode * 31, 31, str5);
            Object obj2 = m9249r().get(str5);
            iHashCode = iM113d + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] m9247j(l7.AbstractC4422v r7) {
        /*
            r6 = this;
            rw.k r0 = new rw.k
            r0.<init>()
            r1 = r6
        L6:
            q7.g r2 = r1.f22135b
            l7.w r3 = r1.f22136c
            if (r7 == 0) goto Lf
            l7.w r4 = r7.f22136c
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L25
            l7.w r4 = r7.f22136c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            int r5 = r2.f29939e
            ly.w r4 = r4.f22140g
            l7.v r4 = r4.m9463p(r5)
            if (r4 != r1) goto L25
            r0.addFirst(r1)
            goto L3b
        L25:
            if (r3 == 0) goto L2f
            ly.w r4 = r3.f22140g
            int r4 = r4.f22763b
            int r2 = r2.f29939e
            if (r4 == r2) goto L32
        L2f:
            r0.addFirst(r1)
        L32:
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r7)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            if (r3 != 0) goto L6b
        L3b:
            java.util.List r7 = rw.AbstractC6663m.c0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = rw.AbstractC6664n.m12768r(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r7.next()
            l7.v r1 = (l7.AbstractC4422v) r1
            q7.g r1 = r1.f22135b
            int r1 = r1.f29939e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4e
        L66:
            int[] r7 = rw.AbstractC6663m.b0(r0)
            return r7
        L6b:
            r1 = r3
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.AbstractC4422v.m9247j(l7.v):int[]");
    }

    /* renamed from: q */
    public final C4407g m9248q(int i10) {
        v0 v0Var = this.f22138e;
        C4407g c4407g = v0Var.m5649f() == 0 ? null : (C4407g) v0Var.m5646c(i10);
        if (c4407g != null) {
            return c4407g;
        }
        C4423w c4423w = this.f22136c;
        if (c4423w != null) {
            return c4423w.m9248q(i10);
        }
        return null;
    }

    /* renamed from: r */
    public final Map m9249r() {
        return AbstractC6674x.m12785m(this.f22135b.f29938d);
    }

    /* renamed from: s */
    public final boolean m9250s(String route, Bundle bundle) {
        AbstractC4154l.m8923f(route, "route");
        C6140g c6140g = this.f22135b;
        c6140g.getClass();
        if (AbstractC4154l.m8918a(c6140g.f29940f, route)) {
            return true;
        }
        C4421u c4421uM12189a = c6140g.m12189a(route);
        if (!c6140g.f29935a.equals(c4421uM12189a != null ? c4421uM12189a.f22127a : null)) {
            return false;
        }
        Bundle bundle2 = c4421uM12189a.f22128b;
        if (bundle == null || bundle2 == null) {
            return false;
        }
        Set<String> setKeySet = bundle2.keySet();
        AbstractC4154l.m8922e(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            AbstractC4154l.m8920c(str);
            if (!bundle.containsKey(str)) {
                return false;
            }
            C4408h c4408h = (C4408h) c4421uM12189a.f22127a.m9249r().get(str);
            k0 k0Var = c4408h != null ? c4408h.f22040a : null;
            Object objMo9203a = k0Var != null ? k0Var.mo9203a(str, bundle2) : null;
            Object objMo9203a2 = k0Var != null ? k0Var.mo9203a(str, bundle) : null;
            if (k0Var != null && !k0Var.mo9208g(objMo9203a, objMo9203a2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l7.C4421u mo9251t(l4.C4367l r26) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.AbstractC4422v.mo9251t(l4.l):l7.u");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        C6140g c6140g = this.f22135b;
        String str = c6140g.f29936b;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(c6140g.f29939e));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = c6140g.f29940f;
        if (str2 != null && !AbstractC5178p.m10101L(str2)) {
            sb2.append(" route=");
            sb2.append(c6140g.f29940f);
        }
        if (this.f22137d != null) {
            sb2.append(" label=");
            sb2.append(this.f22137d);
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    /* renamed from: u */
    public void mo9180u(Context context, AttributeSet attributeSet) {
        AbstractC4154l.m8923f(context, "context");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC4670a.f23109e);
        AbstractC4154l.m8922e(typedArrayObtainAttributes, "obtainAttributes(...)");
        m9253w(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            C6140g c6140g = this.f22135b;
            c6140g.f29939e = resourceId;
            c6140g.f29936b = null;
            c6140g.f29936b = AbstractC8954a.m16435a(new C2856l(context, false), c6140g.f29939e);
        }
        this.f22137d = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    /* renamed from: v */
    public final void m9252v(int i10, C4407g action) {
        AbstractC4154l.m8923f(action, "action");
        if (!(this instanceof C4401a)) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f22138e.m5648e(i10, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* renamed from: w */
    public final void m9253w(String str) {
        C6140g c6140g = this.f22135b;
        if (str == null) {
            c6140g.f29939e = 0;
            c6140g.f29936b = null;
        } else {
            c6140g.getClass();
            if (AbstractC5178p.m10101L(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            AbstractC4154l.m8923f(uriPattern, "uriPattern");
            ArrayList arrayListM14314a = AbstractC7582g.m14314a(c6140g.f29938d, new C6139f(new C4419s(uriPattern, null, null), 1));
            if (!arrayListM14314a.isEmpty()) {
                StringBuilder sbM7383p = i0.m0.m7383p("Cannot set route \"", str, "\" for destination ");
                sbM7383p.append(c6140g.f29935a);
                sbM7383p.append(". Following required arguments are missing: ");
                sbM7383p.append(arrayListM14314a);
                throw new IllegalArgumentException(sbM7383p.toString().toString());
            }
            c6140g.f29941g = nd.m10782c(new i9.g0(uriPattern, 2));
            c6140g.f29939e = uriPattern.hashCode();
            c6140g.f29936b = null;
        }
        c6140g.f29940f = str;
    }
}
