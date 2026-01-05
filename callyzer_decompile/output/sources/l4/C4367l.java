package l4;

import a2.C0036i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import aw.C0465e;
import bl.C0689a;
import c0.C0814g;
import c0.b1;
import c0.w0;
import cj.C0979e;
import com.google.android.gms.internal.measurement.j4;
import com.google.firebase.encoders.EncodingException;
import com.skydoves.balloon.internals.DefinitionKt;
import dy.AbstractC1856d;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import gn.x2;
import h6.C2856l;
import i0.EnumC3089t;
import i0.EnumC3090u;
import i0.EnumC3091v;
import i0.InterfaceC3093x;
import i0.m0;
import i1.C3135n;
import j0.AbstractC3502b;
import j0.C3503c;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import jc.C3733i;
import jj.InterfaceC3778c;
import k2.h2;
import k4.C4001v;
import k5.C4013h;
import k5.C4014i;
import k5.EnumC4012g;
import kj.InterfaceC4080a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l0.AbstractC4308h;
import l0.RunnableC4302b;
import l0.RunnableC4307g;
import l1.C4327p;
import l5.C4383b;
import lc.InterfaceC4439b;
import lc.InterfaceC4440c;
import lv.C4535g;
import m0.C4609c;
import m0.C4616j;
import m5.C4654h;
import mj.C4759g;
import mk.C4764c;
import n4.C4952a;
import n4.C4953b;
import nc.AbstractC4998i;
import nc.C4997h;
import nc.C4999j;
import nc.C5000k;
import nc.EnumC5001l;
import nc.InterfaceC4991b;
import nc.InterfaceC5007r;
import nd.EnumC5011b;
import nd.InterfaceC5014e;
import nd.InterfaceC5016g;
import nx.AbstractC5178p;
import of.C5347b;
import og.nd;
import og.pe;
import og.qe;
import og.t1;
import og.u1;
import og.y0;
import org.bouncycastle.iana.AEADAlgorithm;
import p3.AbstractC5818p;
import p3.C5812j;
import p3.C5819q;
import p3.C5824v;
import p3.C5825w;
import p3.EnumC5823u;
import pg.C5924e;
import pg.o7;
import pg.s8;
import pg.t8;
import q0.C6062c;
import q0.C6066g;
import q0.C6068i;
import q0.C6069j;
import qw.EnumC6359i;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6670t;
import s0.C6698b;
import s2.AbstractC6740i;
import s2.AbstractC6742k;
import s2.C6741j;
import sc.C6788h;
import sc.C6802v;
import sc.InterfaceC6796p;
import t2.InterfaceC7008g;
import t3.InterfaceC7033t;
import t5.AbstractC7052j;
import tc.C7117b;
import th.C7154d;
import th.C7158h;
import ud.C7410n;
import ud.C7416t;
import ud.C7417u;
import ud.InterfaceC7409m;
import ud.InterfaceC7411o;
import ug.g1;
import uh.InterfaceC7458c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import xm.x1;
import xm.y5;
import yc.C8615d;
import yc.EnumC8616e;
import yg.C8656m;
import yg.InterfaceC8646c;
import z1.C8849i;
import zc.C8935l;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.l */
/* loaded from: classes.dex */
public class C4367l implements InterfaceC5007r, InterfaceC4439b, InterfaceC5016g, InterfaceC8646c, InterfaceC4080a, InterfaceC6796p, InterfaceC7008g, InterfaceC7458c {

    /* renamed from: a */
    public final /* synthetic */ int f21920a;

    /* renamed from: b */
    public Object f21921b;

    /* renamed from: c */
    public Object f21922c;

    /* renamed from: d */
    public Object f21923d;

    public /* synthetic */ C4367l(int i10, Object obj, Object obj2, Object obj3) {
        this.f21920a = i10;
        this.f21921b = obj;
        this.f21922c = obj2;
        this.f21923d = obj3;
    }

    /* renamed from: A */
    public static ArrayList m9114A(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(AbstractC3502b.f18368a);
        arrayList2.add(AbstractC3502b.f18370c);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Size size2 = (Size) obj;
            Rational rational = new Rational(size2.getWidth(), size2.getHeight());
            if (!arrayList2.contains(rational)) {
                int size3 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size3) {
                        arrayList2.add(rational);
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (AbstractC3502b.m8054a((Rational) obj2, size2)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: C */
    public static Rational m9115C(int i10, boolean z6) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z6 ? AbstractC3502b.f18368a : AbstractC3502b.f18369b;
        }
        if (i10 == 1) {
            return z6 ? AbstractC3502b.f18370c : AbstractC3502b.f18371d;
        }
        u1.m10943b("SupportedOutputSizesCollector");
        return null;
    }

    /* renamed from: D */
    public static HashMap m9116D(ArrayList arrayList) {
        HashMap map = new HashMap();
        ArrayList arrayListM9114A = m9114A(arrayList);
        int size = arrayListM9114A.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListM9114A.get(i11);
            i11++;
            map.put((Rational) obj, new ArrayList());
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            Size size3 = (Size) obj2;
            for (Rational rational : map.keySet()) {
                if (AbstractC3502b.m8054a(rational, size3)) {
                    ((List) map.get(rational)).add(size3);
                }
            }
        }
        return map;
    }

    /* renamed from: H */
    public static C4367l m9117H(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new C4367l(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    /* renamed from: L */
    public static void m9118L(List list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: M */
    public static void m9119M(List list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = (Size) list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList m9120B(i0.w2 r18) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C4367l.m9120B(i0.w2):java.util.ArrayList");
    }

    /* renamed from: E */
    public void m9121E(C0979e c0979e) {
        C6788h c6788h = (C6788h) ((C4535g) c0979e.f5802a).f22539c;
        EnumC8616e order = EnumC8616e.After;
        c6788h.getClass();
        AbstractC4154l.m8923f(order, "order");
        c6788h.m12980c(new C6788h(2, this), order);
    }

    /* renamed from: F */
    public boolean m9122F() {
        if (((h2) this.f21921b).getValue() != this.f21922c) {
            return true;
        }
        C4367l c4367l = (C4367l) this.f21923d;
        return c4367l != null && c4367l.m9122F();
    }

    /* renamed from: G */
    public boolean m9123G(C4654h c4654h, C4013h c4013h, boolean z6) {
        C4383b c4383b = (C4383b) this.f21922c;
        EnumC4012g[] enumC4012gArr = c4013h.f20741I;
        int[] iArr = c4013h.f20770l;
        c4383b.f21948a = enumC4012gArr[0];
        c4383b.f21949b = enumC4012gArr[1];
        c4383b.f21950c = c4013h.m8800j();
        c4383b.f21951d = c4013h.m8797g();
        c4383b.f21956i = false;
        c4383b.f21957j = z6;
        EnumC4012g enumC4012g = c4383b.f21948a;
        EnumC4012g enumC4012g2 = EnumC4012g.MATCH_CONSTRAINT;
        boolean z10 = enumC4012g == enumC4012g2;
        boolean z11 = c4383b.f21949b == enumC4012g2;
        boolean z12 = z10 && c4013h.f20745M > DefinitionKt.NO_Float_VALUE;
        boolean z13 = z11 && c4013h.f20745M > DefinitionKt.NO_Float_VALUE;
        if (z12 && iArr[0] == 4) {
            c4383b.f21948a = EnumC4012g.FIXED;
        }
        if (z13 && iArr[1] == 4) {
            c4383b.f21949b = EnumC4012g.FIXED;
        }
        c4654h.m9534a(c4013h, c4383b);
        c4013h.m8812v(c4383b.f21952e);
        c4013h.m8809s(c4383b.f21953f);
        c4013h.f20781w = c4383b.f21955h;
        int i10 = c4383b.f21954g;
        c4013h.f20749Q = i10;
        c4013h.f20781w = i10 > 0;
        c4383b.f21957j = false;
        return c4383b.f21956i;
    }

    /* renamed from: I */
    public void m9124I() {
        ((TypedArray) this.f21922c).recycle();
    }

    /* renamed from: J */
    public void m9125J(Object obj) {
        long jM12900b = AbstractC6740i.m12900b();
        if (jM12900b == AbstractC6742k.f32194a) {
            this.f21923d = obj;
            return;
        }
        synchronized (this.f21922c) {
            C6741j c6741j = (C6741j) ((AtomicReference) this.f21921b).get();
            int iM12904a = c6741j.m12904a(jM12900b);
            if (iM12904a < 0) {
                ((AtomicReference) this.f21921b).set(c6741j.m12905b(jM12900b, obj));
            } else {
                c6741j.f32193c[iM12904a] = obj;
            }
        }
    }

    /* renamed from: K */
    public void m9126K(C4014i c4014i, int i10, int i11) {
        int i12 = c4014i.f20750R;
        int i13 = c4014i.f20751S;
        c4014i.f20750R = 0;
        c4014i.f20751S = 0;
        c4014i.m8812v(i10);
        c4014i.m8809s(i11);
        if (i12 < 0) {
            c4014i.f20750R = 0;
        } else {
            c4014i.f20750R = i12;
        }
        if (i13 < 0) {
            c4014i.f20751S = 0;
        } else {
            c4014i.f20751S = i13;
        }
        ((C4014i) this.f21923d).m8816B();
    }

    /* renamed from: N */
    public void m9127N() {
        e1.j0 j0Var = (e1.j0) this.f21921b;
        String str = (String) this.f21922c;
        List list = (List) j0Var.m5577j(str);
        if (list != null) {
            list.remove((AbstractC4155m) this.f21923d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        j0Var.m5579l(str, list);
    }

    /* renamed from: O */
    public void m9128O(Object obj, String str) {
        C4367l c4367l = new C4367l(6, false);
        ((C4367l) this.f21923d).f21923d = c4367l;
        this.f21923d = c4367l;
        c4367l.f21922c = obj;
        c4367l.f21921b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[LOOP:0: B:12:0x0038->B:57:?, LOOP_END, SYNTHETIC] */
    @Override // nc.InterfaceC5007r
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nc.AbstractC5005p mo9129a(ad.C0109p r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f21922c
            qw.p r0 = (qw.C6366p) r0
            java.lang.Object r1 = r9.f21921b
            qw.p r1 = (qw.C6366p) r1
            java.lang.Object r2 = r1.getValue()
            nc.p r2 = (nc.AbstractC5005p) r2
            if (r2 != 0) goto L18
            java.lang.Object r2 = r0.getValue()
            nc.p r2 = (nc.AbstractC5005p) r2
            if (r2 == 0) goto Ld5
        L18:
            java.lang.Object r2 = r9.f21923d
            qw.p r2 = (qw.C6366p) r2
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto L34
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L34
            goto Laf
        L34:
            java.util.Iterator r2 = r2.iterator()
        L38:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r2.next()
            nc.m r3 = (nc.C5002m) r3
            r3.getClass()
            java.lang.String r5 = r3.f24755a
            java.lang.String r6 = "*"
            boolean r7 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r6)
            r8 = 1
            if (r7 == 0) goto L54
        L52:
            r3 = r8
            goto Lac
        L54:
            java.lang.Integer r3 = r3.f24756b
            if (r3 == 0) goto L62
            int r7 = r10.f377c
            int r3 = r3.intValue()
            if (r7 == r3) goto L62
        L60:
            r3 = r4
            goto Lac
        L62:
            zc.d r3 = r10.f376b
            java.lang.String r3 = r3.toString()
            boolean r7 = nx.AbstractC5185w.m10129k(r5, r6, r4)
            if (r7 == 0) goto L77
            java.lang.String r5 = nx.AbstractC5178p.m10108S(r5, r6)
            boolean r3 = nx.AbstractC5185w.m10138t(r3, r5, r4)
            goto Lac
        L77:
            boolean r7 = nx.AbstractC5185w.m10138t(r5, r6, r4)
            if (r7 == 0) goto L86
            java.lang.String r5 = nx.AbstractC5178p.m10107R(r5, r6)
            boolean r3 = nx.AbstractC5185w.m10129k(r3, r5, r4)
            goto Lac
        L86:
            int r6 = r5.length()
            int r7 = r3.length()
            if (r6 <= r7) goto L91
            goto L60
        L91:
            boolean r6 = nx.AbstractC5185w.m10129k(r3, r5, r4)
            int r7 = r3.length()
            int r5 = r5.length()
            int r7 = r7 - r5
            int r7 = r7 - r8
            if (r6 == 0) goto L60
            if (r7 < 0) goto L52
            char r3 = r3.charAt(r7)
            r5 = 46
            if (r3 != r5) goto L60
            goto L52
        Lac:
            if (r3 == 0) goto L38
            r4 = r8
        Laf:
            if (r4 == 0) goto Lb2
            goto Ld5
        Lb2:
            zc.l r10 = r10.f375a
            zc.l r2 = zc.C8935l.f42909d
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r10, r2)
            if (r2 == 0) goto Lc3
            java.lang.Object r10 = r1.getValue()
            nc.p r10 = (nc.AbstractC5005p) r10
            goto Ld3
        Lc3:
            zc.l r1 = zc.C8935l.f42908c
            boolean r10 = kotlin.jvm.internal.AbstractC4154l.m8918a(r10, r1)
            if (r10 == 0) goto Ld2
            java.lang.Object r10 = r0.getValue()
            nc.p r10 = (nc.AbstractC5005p) r10
            goto Ld3
        Ld2:
            r10 = 0
        Ld3:
            if (r10 != 0) goto Ld7
        Ld5:
            nc.n r10 = nc.C5003n.f24757a
        Ld7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C4367l.mo9129a(ad.p):nc.p");
    }

    @Override // sc.InterfaceC6796p
    /* renamed from: b */
    public Object mo7561b(Object obj, C8615d c8615d) {
        C6802v c6802v = (C6802v) obj;
        for (Map.Entry entry : ((Map) ((C3733i) this.f21922c).f482a).entrySet()) {
            ((C7117b) c6802v.f32332b).f34312c.m338r((String) entry.getKey(), (List) entry.getValue());
        }
        for (Map.Entry entry2 : ((Map) ((C3733i) this.f21921b).f482a).entrySet()) {
            ((C7117b) c6802v.f32332b).f34312c.m318F(AbstractC6663m.m12750N((List) entry2.getValue()), (String) entry2.getKey());
        }
        for (Map.Entry entry3 : ((Map) ((C3733i) this.f21923d).f482a).entrySet()) {
            String str = (String) entry3.getKey();
            List list = (List) entry3.getValue();
            if (!((C7117b) c6802v.f32332b).f34312c.m339s(str)) {
                ((C7117b) c6802v.f32332b).f34312c.m318F(AbstractC6663m.m12750N(list), str);
            }
        }
        return c6802v;
    }

    @Override // kj.InterfaceC4080a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC4080a mo8850c(Class cls, InterfaceC3778c interfaceC3778c) {
        ((HashMap) this.f21921b).put(cls, interfaceC3778c);
        ((HashMap) this.f21922c).remove(cls);
        return this;
    }

    /* renamed from: d */
    public InterfaceC4440c m9130d() {
        return new C4001v(11, (InterfaceC4991b) ((InterfaceC2137a) this.f21922c).invoke());
    }

    /* renamed from: e */
    public void m9131e(C6069j c6069j, Map.Entry entry) {
        C6069j c6069j2 = (C6069j) entry.getValue();
        C0814g c0814g = null;
        C0814g c0814g2 = new C0814g(c6069j.f29599g.f16522a, ((C6698b) entry.getKey()).f32012d, c6069j.f29595c ? (i0.g0) this.f21922c : null, ((C6698b) entry.getKey()).f32014f, ((C6698b) entry.getKey()).f32015g);
        int i10 = ((C6698b) entry.getKey()).f32011c;
        c6069j2.getClass();
        o7.m11806a();
        c6069j2.m12074a();
        y0.m11056f("Consumer can only be linked once.", !c6069j2.f29602j);
        c6069j2.f29602j = true;
        C6068i c6068i = c6069j2.f29604l;
        RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(c6068i.m7418c(), new C6066g(c6069j2, c6068i, i10, c0814g2, c0814g), t8.m11875d());
        runnableC4302bM9037g.mo9026a(new RunnableC4307g(0, runnableC4302bM9037g, new C8849i(12, this, c6069j2, false)), t8.m11875d());
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: f */
    public void mo329f(Throwable th2, InterfaceC2137a interfaceC2137a) {
        InterfaceC7564h interfaceC7564h = (InterfaceC7564h) this.f21921b;
        String str = (String) this.f21923d;
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        u1.m10948g(interfaceC7564h, EnumC5011b.Warning, str, th2, interfaceC2137a);
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: g */
    public void mo330g(Throwable th2, InterfaceC2137a interfaceC2137a) {
        InterfaceC7564h interfaceC7564h = (InterfaceC7564h) this.f21921b;
        String str = (String) this.f21923d;
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        u1.m10948g(interfaceC7564h, EnumC5011b.Trace, str, th2, interfaceC2137a);
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: h */
    public boolean mo331h(EnumC5011b level) {
        AbstractC4154l.m8923f(level, "level");
        return ((InterfaceC5016g) this.f21922c).mo331h(level);
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: i */
    public void mo332i(Throwable th2, InterfaceC2137a interfaceC2137a) {
        InterfaceC7564h interfaceC7564h = (InterfaceC7564h) this.f21921b;
        String str = (String) this.f21923d;
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        u1.m10948g(interfaceC7564h, EnumC5011b.Debug, str, th2, interfaceC2137a);
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m c8656m) {
        C5347b c5347b = (C5347b) this.f21921b;
        String str = (String) this.f21922c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f21923d;
        synchronized (c5347b.f26265a) {
            c5347b.f26265a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: k */
    public Object m9132k(int i10, AbstractC8193c abstractC8193c) {
        Object objM450a = ((x2) ((g1) this.f21921b).f35448a).f14948h.m450a(i10, abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM450a != enumC7794a) {
            objM450a = a0Var;
        }
        if (objM450a != enumC7794a) {
            objM450a = a0Var;
        }
        return objM450a == enumC7794a ? objM450a : a0Var;
    }

    @Override // lc.InterfaceC4439b
    /* renamed from: l */
    public void mo245l(InterfaceC4991b interfaceC4991b) {
        Object c0465e;
        this.f21923d = AbstractC4998i.f24752a[((EnumC5001l) this.f21923d).ordinal()] == 1 ? EnumC5001l.INITIALIZED : EnumC5001l.EXPLICIT_ENGINE;
        if (interfaceC4991b == null) {
            this.f21921b = C5000k.f24754a;
            c0465e = new C4997h(this, 0);
        } else {
            c0465e = new C0465e(24, interfaceC4991b);
        }
        this.f21922c = c0465e;
        if (interfaceC4991b != null) {
            interfaceC4991b.mo9899d();
        }
    }

    /* renamed from: m */
    public Object m9133m() {
        Object objRemoveLast;
        synchronized (this.f21922c) {
            objRemoveLast = ((ArrayDeque) this.f21921b).removeLast();
        }
        return objRemoveLast;
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: n */
    public InterfaceC5014e mo9134n(EnumC5011b level) {
        AbstractC4154l.m8923f(level, "level");
        return ((InterfaceC5016g) this.f21922c).mo9134n(level);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: o */
    public void m9135o(C5812j c5812j) {
        C5825w c5825w = (C5825w) this.f21923d;
        ?? r12 = c5812j.f28467a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C5819q) r12.get(i10)).m11406b()) {
                if (((EnumC5823u) this.f21922c) == EnumC5823u.Dispatching) {
                    InterfaceC7033t interfaceC7033t = (InterfaceC7033t) this.f21921b;
                    if (interfaceC7033t == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    AbstractC5818p.m11404h(c5812j, interfaceC7033t.mo13299V(0L), new C5824v(c5825w, 0), true);
                }
                this.f21922c = EnumC5823u.NotDispatching;
                return;
            }
        }
        InterfaceC7033t interfaceC7033t2 = (InterfaceC7033t) this.f21921b;
        if (interfaceC7033t2 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        AbstractC5818p.m11404h(c5812j, interfaceC7033t2.mo13299V(0L), new C3135n(23, this, c5825w), false);
        if (((EnumC5823u) this.f21922c) == EnumC5823u.Dispatching) {
            int size2 = r12.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((C5819q) r12.get(i11)).m11405a();
            }
            j4 j4Var = c5812j.f28468b;
            if (j4Var == null) {
                return;
            }
            j4Var.f6251b = !c5825w.f28509c;
        }
    }

    /* renamed from: p */
    public void m9136p(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f21921b;
        C4759g c4759g = new C4759g(byteArrayOutputStream, map, (HashMap) this.f21922c, (InterfaceC3778c) this.f21923d);
        if (obj == null) {
            return;
        }
        InterfaceC3778c interfaceC3778c = (InterfaceC3778c) map.get(obj.getClass());
        if (interfaceC3778c != null) {
            interfaceC3778c.mo5788a(obj, c4759g);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    /* renamed from: q */
    public void m9137q(b1 b1Var) throws Exception {
        Object objM9133m;
        w0 w0VarMo2135X = b1Var.mo2135X();
        InterfaceC3093x interfaceC3093x = w0VarMo2135X instanceof C4609c ? ((C4609c) w0VarMo2135X).f22828a : null;
        if (interfaceC3093x == null || ((interfaceC3093x.mo7430o() != EnumC3090u.LOCKED_FOCUSED && interfaceC3093x.mo7430o() != EnumC3090u.PASSIVE_FOCUSED) || interfaceC3093x.mo7428l() != EnumC3089t.CONVERGED || interfaceC3093x.mo7427e() != EnumC3091v.CONVERGED)) {
            ((C4764c) this.f21923d).getClass();
            b1Var.close();
            return;
        }
        synchronized (this.f21922c) {
            try {
                objM9133m = ((ArrayDeque) this.f21921b).size() >= 3 ? m9133m() : null;
                ((ArrayDeque) this.f21921b).addFirst(b1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((C4764c) this.f21923d) == null || objM9133m == null) {
            return;
        }
        ((b1) objM9133m).close();
    }

    /* renamed from: r */
    public Object m9138r() {
        long jM12900b = AbstractC6740i.m12900b();
        if (jM12900b == AbstractC6742k.f32194a) {
            return this.f21923d;
        }
        C6741j c6741j = (C6741j) ((AtomicReference) this.f21921b).get();
        int iM12904a = c6741j.m12904a(jM12900b);
        if (iM12904a >= 0) {
            return c6741j.f32193c[iM12904a];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [ex.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dy.a] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9139s(ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ud.C7405i
            if (r0 == 0) goto L13
            r0 = r9
            ud.i r0 = (ud.C7405i) r0
            int r1 = r0.f35194f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35194f = r1
            goto L18
        L13:
            ud.i r0 = new ud.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f35192d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f35194f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            l4.l r1 = r0.f35190b
            dy.a r0 = r0.f35189a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L2f:
            r9 = move-exception
            goto L86
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            int r2 = r0.f35191c
            dy.a r4 = r0.f35189a
            og.od.m10798c(r9)
            r9 = r4
            goto L57
        L42:
            og.od.m10798c(r9)
            java.lang.Object r9 = r8.f21921b
            dy.c r9 = (dy.C1855c) r9
            r0.f35189a = r9
            r2 = 0
            r0.f35191c = r2
            r0.f35194f = r4
            java.lang.Object r4 = r9.mo1768h(r0)
            if (r4 != r1) goto L57
            goto L70
        L57:
            java.lang.Object r4 = r8.f21923d     // Catch: java.lang.Throwable -> L7a
            ud.u r6 = ud.C7417u.f35215a     // Catch: java.lang.Throwable -> L7a
            if (r4 != r6) goto L7f
            java.lang.Object r4 = r8.f21922c     // Catch: java.lang.Throwable -> L7a
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)     // Catch: java.lang.Throwable -> L7a
            r0.f35189a = r9     // Catch: java.lang.Throwable -> L7a
            r0.f35190b = r8     // Catch: java.lang.Throwable -> L7a
            r0.f35191c = r2     // Catch: java.lang.Throwable -> L7a
            r0.f35194f = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r1) goto L71
        L70:
            return r1
        L71:
            r1 = r0
            r0 = r9
            r9 = r1
            r1 = r8
        L75:
            r1.f21923d = r9     // Catch: java.lang.Throwable -> L2f
            r8.f21922c = r5     // Catch: java.lang.Throwable -> L2f
            goto L80
        L7a:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L86
        L7f:
            r0 = r9
        L80:
            java.lang.Object r9 = r8.f21923d     // Catch: java.lang.Throwable -> L2f
            r0.mo1769j(r5)
            return r9
        L86:
            r0.mo1769j(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C4367l.m9139s(ww.c):java.lang.Object");
    }

    /* renamed from: t */
    public ColorStateList m9140t(int i10) {
        int resourceId;
        ColorStateList colorStateListM11863a;
        TypedArray typedArray = (TypedArray) this.f21922c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM11863a = s8.m11863a((Context) this.f21921b, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListM11863a;
    }

    public String toString() {
        switch (this.f21920a) {
            case 2:
                String str = (String) this.f21923d;
                String str2 = (String) this.f21922c;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f21921b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                return m0.m7381n(sb2, " }", "toString(...)");
            case 7:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f21921b);
                sb3.append('{');
                C4367l c4367l = (C4367l) ((C4367l) this.f21922c).f21923d;
                String str3 = "";
                while (c4367l != null) {
                    Object obj = c4367l.f21922c;
                    sb3.append(str3);
                    String str4 = (String) c4367l.f21921b;
                    if (str4 != null) {
                        sb3.append(str4);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c4367l = (C4367l) c4367l.f21923d;
                    str3 = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9141u(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lo.C4495a
            if (r0 == 0) goto L13
            r0 = r7
            lo.a r0 = (lo.C4495a) r0
            int r1 = r0.f22374c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22374c = r1
            goto L18
        L13:
            lo.a r0 = new lo.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f22372a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f22374c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            og.od.m10798c(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f21921b
            ug.g1 r7 = (ug.g1) r7
            r0.f22374c = r4
            java.lang.Object r7 = r7.f35448a
            gn.x2 r7 = (gn.x2) r7
            an.g5 r7 = r7.f14948h
            z7.w r7 = r7.f862a
            ad.h r2 = new ad.h
            r5 = 20
            r2.<init>(r5)
            java.lang.Object r7 = og.pe.m10839n(r0, r7, r4, r3, r2)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L57
            int r3 = r7.size()
        L57:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C4367l.m9141u(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9142v(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lo.C4496b
            if (r0 == 0) goto L13
            r0 = r5
            lo.b r0 = (lo.C4496b) r0
            int r1 = r0.f22377c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22377c = r1
            goto L18
        L13:
            lo.b r0 = new lo.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22375a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f22377c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r5)     // Catch: java.lang.Exception -> L27
            return r5
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            og.od.m10798c(r5)
            java.lang.Object r5 = r4.f21921b     // Catch: java.lang.Exception -> L27
            ug.g1 r5 = (ug.g1) r5     // Catch: java.lang.Exception -> L27
            r0.f22377c = r3     // Catch: java.lang.Exception -> L27
            java.io.Serializable r5 = r5.m13931v(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        L42:
            r5.printStackTrace()
            qw.m r5 = og.od.m10796a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C4367l.m9142v(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9143w(int r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lo.C4497c
            if (r0 == 0) goto L13
            r0 = r6
            lo.c r0 = (lo.C4497c) r0
            int r1 = r0.f22380c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22380c = r1
            goto L18
        L13:
            lo.c r0 = new lo.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f22378a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f22380c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r5 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r6 = 50
            int r5 = r5 * r6
            java.lang.Object r2 = r4.f21921b     // Catch: java.lang.Exception -> L27
            ug.g1 r2 = (ug.g1) r2     // Catch: java.lang.Exception -> L27
            r0.f22380c = r3     // Catch: java.lang.Exception -> L27
            java.io.Serializable r5 = r2.m13930u(r6, r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        L45:
            r5.printStackTrace()
            qw.m r5 = og.od.m10796a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C4367l.m9143w(int, ww.c):java.lang.Object");
    }

    /* renamed from: x */
    public C4953b m9144x() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C0689a) this.f21923d)) {
            try {
                C4953b c4953b = (C4953b) this.f21922c;
                if (c4953b != null && localeList == ((LocaleList) this.f21921b)) {
                    return c4953b;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new C4952a(localeList.get(i10)));
                }
                C4953b c4953b2 = new C4953b(arrayList);
                this.f21921b = localeList;
                this.f21922c = c4953b2;
                return c4953b2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public Drawable m9145y(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f21922c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : s8.m11864b((Context) this.f21921b, resourceId);
    }

    /* renamed from: z */
    public Typeface m9146z(int i10, int i11, p013o.b0 b0Var) {
        int resourceId = ((TypedArray) this.f21922c).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f21923d) == null) {
            this.f21923d = new TypedValue();
        }
        Context context = (Context) this.f21921b;
        TypedValue typedValue = (TypedValue) this.f21923d;
        ThreadLocal threadLocal = AbstractC7052j.f34088a;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC7052j.m13344b(context, resourceId, typedValue, i11, b0Var, true, false);
    }

    @Override // uh.InterfaceC7458c
    public Object zza() {
        Object objZza = ((InterfaceC7458c) this.f21921b).zza();
        return new C7154d((C7158h) objZza, ((C2856l) ((C4327p) this.f21923d).f21788b).f15864a);
    }

    public /* synthetic */ C4367l(int i10, boolean z6) {
        this.f21920a = i10;
    }

    public C4367l(String str) {
        this.f21920a = 7;
        C4367l c4367l = new C4367l(6, false);
        this.f21922c = c4367l;
        this.f21923d = c4367l;
        this.f21921b = str;
    }

    public C4367l(g1 g1Var, y5 userSIMRepository, x1 callLogsRepository) {
        this.f21920a = 3;
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(callLogsRepository, "callLogsRepository");
        this.f21921b = g1Var;
        this.f21922c = userSIMRepository;
        this.f21923d = callLogsRepository;
    }

    public C4367l(InterfaceC2139c interfaceC2139c) {
        this.f21920a = 29;
        this.f21921b = AbstractC1856d.m5490a();
        this.f21922c = interfaceC2139c;
        this.f21923d = C7417u.f35215a;
    }

    public C4367l(C5825w c5825w) {
        this.f21920a = 18;
        this.f21923d = c5825w;
        this.f21922c = EnumC5823u.Unknown;
    }

    public C4367l(int i10) {
        this.f21920a = i10;
        switch (i10) {
            case 10:
                InterfaceC7411o.f35200a.getClass();
                final C7416t provider = C7410n.f35199b;
                AbstractC4154l.m8923f(provider, "provider");
                final int i11 = 0;
                this.f21921b = nd.m10782c(new InterfaceC2137a() { // from class: nc.e
                    @Override // ex.InterfaceC2137a
                    public final Object invoke() {
                        Set setG0;
                        int i12 = i11;
                        InterfaceC7409m interfaceC7409m = provider;
                        switch (i12) {
                            case 0:
                                C8935l c8935l = C8935l.f42909d;
                                C5004o c5004oM10922b = t1.m10922b(interfaceC7409m, c8935l);
                                return c5004oM10922b == null ? t1.m10921a(interfaceC7409m, c8935l) : c5004oM10922b;
                            case 1:
                                C8935l c8935l2 = C8935l.f42908c;
                                C5004o c5004oM10922b2 = t1.m10922b(interfaceC7409m, c8935l2);
                                return c5004oM10922b2 == null ? t1.m10921a(interfaceC7409m, c8935l2) : c5004oM10922b2;
                            default:
                                C7416t c7416t = (C7416t) interfaceC7409m;
                                String property = System.getProperty("http.nonProxyHosts");
                                if (property == null) {
                                    property = System.getProperty("http.noProxyHosts");
                                }
                                int i13 = 0;
                                if (property != null) {
                                    List listM10111V = AbstractC5178p.m10111V(property, new char[]{'|'}, 0, 6);
                                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10111V, 10));
                                    Iterator it = listM10111V.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(AbstractC5178p.g0((String) it.next()).toString());
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (i14 < size) {
                                        Object obj = arrayList.get(i14);
                                        i14++;
                                        arrayList2.add(AbstractC5178p.i0((String) obj, '.'));
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = arrayList2.get(i15);
                                        i15++;
                                        arrayList3.add(t1.m10924d((String) obj2));
                                    }
                                    setG0 = AbstractC6663m.g0(arrayList3);
                                } else {
                                    setG0 = C6670t.f31945a;
                                }
                                List listM10834i = pe.m10834i("no_proxy", "NO_PROXY");
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it2 = listM10834i.iterator();
                                while (it2.hasNext()) {
                                    String strM13806a = c7416t.m13806a((String) it2.next());
                                    if (strM13806a != null) {
                                        arrayList4.add(strM13806a);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i16 = 0;
                                while (i16 < size3) {
                                    Object obj3 = arrayList4.get(i16);
                                    i16++;
                                    AbstractC6663m.m12765x(arrayList5, AbstractC5178p.m10111V((String) obj3, new char[]{',', ' '}, 0, 6));
                                }
                                ArrayList arrayList6 = new ArrayList(AbstractC6664n.m12768r(arrayList5, 10));
                                int size4 = arrayList5.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    Object obj4 = arrayList5.get(i17);
                                    i17++;
                                    arrayList6.add(AbstractC5178p.g0((String) obj4).toString());
                                }
                                ArrayList arrayList7 = new ArrayList(AbstractC6664n.m12768r(arrayList6, 10));
                                int size5 = arrayList6.size();
                                int i18 = 0;
                                while (i18 < size5) {
                                    Object obj5 = arrayList6.get(i18);
                                    i18++;
                                    arrayList7.add(AbstractC5178p.i0((String) obj5, '.'));
                                }
                                ArrayList arrayList8 = new ArrayList(AbstractC6664n.m12768r(arrayList7, 10));
                                int size6 = arrayList7.size();
                                while (i13 < size6) {
                                    Object obj6 = arrayList7.get(i13);
                                    i13++;
                                    arrayList8.add(t1.m10924d((String) obj6));
                                }
                                return qe.m10858d(setG0, AbstractC6663m.g0(arrayList8));
                        }
                    }
                });
                final int i12 = 1;
                this.f21922c = nd.m10782c(new InterfaceC2137a() { // from class: nc.e
                    @Override // ex.InterfaceC2137a
                    public final Object invoke() {
                        Set setG0;
                        int i122 = i12;
                        InterfaceC7409m interfaceC7409m = provider;
                        switch (i122) {
                            case 0:
                                C8935l c8935l = C8935l.f42909d;
                                C5004o c5004oM10922b = t1.m10922b(interfaceC7409m, c8935l);
                                return c5004oM10922b == null ? t1.m10921a(interfaceC7409m, c8935l) : c5004oM10922b;
                            case 1:
                                C8935l c8935l2 = C8935l.f42908c;
                                C5004o c5004oM10922b2 = t1.m10922b(interfaceC7409m, c8935l2);
                                return c5004oM10922b2 == null ? t1.m10921a(interfaceC7409m, c8935l2) : c5004oM10922b2;
                            default:
                                C7416t c7416t = (C7416t) interfaceC7409m;
                                String property = System.getProperty("http.nonProxyHosts");
                                if (property == null) {
                                    property = System.getProperty("http.noProxyHosts");
                                }
                                int i13 = 0;
                                if (property != null) {
                                    List listM10111V = AbstractC5178p.m10111V(property, new char[]{'|'}, 0, 6);
                                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10111V, 10));
                                    Iterator it = listM10111V.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(AbstractC5178p.g0((String) it.next()).toString());
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (i14 < size) {
                                        Object obj = arrayList.get(i14);
                                        i14++;
                                        arrayList2.add(AbstractC5178p.i0((String) obj, '.'));
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = arrayList2.get(i15);
                                        i15++;
                                        arrayList3.add(t1.m10924d((String) obj2));
                                    }
                                    setG0 = AbstractC6663m.g0(arrayList3);
                                } else {
                                    setG0 = C6670t.f31945a;
                                }
                                List listM10834i = pe.m10834i("no_proxy", "NO_PROXY");
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it2 = listM10834i.iterator();
                                while (it2.hasNext()) {
                                    String strM13806a = c7416t.m13806a((String) it2.next());
                                    if (strM13806a != null) {
                                        arrayList4.add(strM13806a);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i16 = 0;
                                while (i16 < size3) {
                                    Object obj3 = arrayList4.get(i16);
                                    i16++;
                                    AbstractC6663m.m12765x(arrayList5, AbstractC5178p.m10111V((String) obj3, new char[]{',', ' '}, 0, 6));
                                }
                                ArrayList arrayList6 = new ArrayList(AbstractC6664n.m12768r(arrayList5, 10));
                                int size4 = arrayList5.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    Object obj4 = arrayList5.get(i17);
                                    i17++;
                                    arrayList6.add(AbstractC5178p.g0((String) obj4).toString());
                                }
                                ArrayList arrayList7 = new ArrayList(AbstractC6664n.m12768r(arrayList6, 10));
                                int size5 = arrayList6.size();
                                int i18 = 0;
                                while (i18 < size5) {
                                    Object obj5 = arrayList6.get(i18);
                                    i18++;
                                    arrayList7.add(AbstractC5178p.i0((String) obj5, '.'));
                                }
                                ArrayList arrayList8 = new ArrayList(AbstractC6664n.m12768r(arrayList7, 10));
                                int size6 = arrayList7.size();
                                while (i13 < size6) {
                                    Object obj6 = arrayList7.get(i13);
                                    i13++;
                                    arrayList8.add(t1.m10924d((String) obj6));
                                }
                                return qe.m10858d(setG0, AbstractC6663m.g0(arrayList8));
                        }
                    }
                });
                final int i13 = 2;
                this.f21923d = nd.m10782c(new InterfaceC2137a() { // from class: nc.e
                    @Override // ex.InterfaceC2137a
                    public final Object invoke() {
                        Set setG0;
                        int i122 = i13;
                        InterfaceC7409m interfaceC7409m = provider;
                        switch (i122) {
                            case 0:
                                C8935l c8935l = C8935l.f42909d;
                                C5004o c5004oM10922b = t1.m10922b(interfaceC7409m, c8935l);
                                return c5004oM10922b == null ? t1.m10921a(interfaceC7409m, c8935l) : c5004oM10922b;
                            case 1:
                                C8935l c8935l2 = C8935l.f42908c;
                                C5004o c5004oM10922b2 = t1.m10922b(interfaceC7409m, c8935l2);
                                return c5004oM10922b2 == null ? t1.m10921a(interfaceC7409m, c8935l2) : c5004oM10922b2;
                            default:
                                C7416t c7416t = (C7416t) interfaceC7409m;
                                String property = System.getProperty("http.nonProxyHosts");
                                if (property == null) {
                                    property = System.getProperty("http.noProxyHosts");
                                }
                                int i132 = 0;
                                if (property != null) {
                                    List listM10111V = AbstractC5178p.m10111V(property, new char[]{'|'}, 0, 6);
                                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10111V, 10));
                                    Iterator it = listM10111V.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(AbstractC5178p.g0((String) it.next()).toString());
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (i14 < size) {
                                        Object obj = arrayList.get(i14);
                                        i14++;
                                        arrayList2.add(AbstractC5178p.i0((String) obj, '.'));
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = arrayList2.get(i15);
                                        i15++;
                                        arrayList3.add(t1.m10924d((String) obj2));
                                    }
                                    setG0 = AbstractC6663m.g0(arrayList3);
                                } else {
                                    setG0 = C6670t.f31945a;
                                }
                                List listM10834i = pe.m10834i("no_proxy", "NO_PROXY");
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it2 = listM10834i.iterator();
                                while (it2.hasNext()) {
                                    String strM13806a = c7416t.m13806a((String) it2.next());
                                    if (strM13806a != null) {
                                        arrayList4.add(strM13806a);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i16 = 0;
                                while (i16 < size3) {
                                    Object obj3 = arrayList4.get(i16);
                                    i16++;
                                    AbstractC6663m.m12765x(arrayList5, AbstractC5178p.m10111V((String) obj3, new char[]{',', ' '}, 0, 6));
                                }
                                ArrayList arrayList6 = new ArrayList(AbstractC6664n.m12768r(arrayList5, 10));
                                int size4 = arrayList5.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    Object obj4 = arrayList5.get(i17);
                                    i17++;
                                    arrayList6.add(AbstractC5178p.g0((String) obj4).toString());
                                }
                                ArrayList arrayList7 = new ArrayList(AbstractC6664n.m12768r(arrayList6, 10));
                                int size5 = arrayList6.size();
                                int i18 = 0;
                                while (i18 < size5) {
                                    Object obj5 = arrayList6.get(i18);
                                    i18++;
                                    arrayList7.add(AbstractC5178p.i0((String) obj5, '.'));
                                }
                                ArrayList arrayList8 = new ArrayList(AbstractC6664n.m12768r(arrayList7, 10));
                                int size6 = arrayList7.size();
                                while (i132 < size6) {
                                    Object obj6 = arrayList7.get(i132);
                                    i132++;
                                    arrayList8.add(t1.m10924d((String) obj6));
                                }
                                return qe.m10858d(setG0, AbstractC6663m.g0(arrayList8));
                        }
                    }
                });
                break;
            case 11:
                this.f21921b = C4999j.f24753a;
                this.f21922c = new C4997h(this, 1);
                this.f21923d = EnumC5001l.NOT_INITIALIZED;
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f21921b = new WeakHashMap();
                this.f21922c = new WeakHashMap();
                this.f21923d = new WeakHashMap();
                break;
            case 19:
                this.f21921b = new HashMap();
                this.f21922c = new HashMap();
                this.f21923d = C5924e.f28821c;
                break;
            case 22:
                int i14 = 1;
                this.f21921b = new C3733i(i14);
                this.f21922c = new C3733i(i14);
                this.f21923d = new C3733i(i14);
                break;
            case 24:
                this.f21921b = new AtomicReference(AbstractC6740i.f32190a);
                this.f21922c = new Object();
                break;
            case 27:
                List list = Collections.EMPTY_LIST;
                this.f21921b = list;
                this.f21922c = list;
                break;
            default:
                this.f21923d = new C0689a(22);
                break;
        }
    }

    public C4367l(C4764c c4764c) {
        this.f21920a = 17;
        this.f21922c = new Object();
        this.f21921b = new ArrayDeque(3);
        this.f21923d = c4764c;
    }

    public C4367l(View view) {
        this.f21920a = 0;
        this.f21921b = view;
        this.f21922c = nd.m10781b(EnumC6359i.NONE, new C0036i(26, this));
        this.f21923d = new C8989c(view);
    }

    public C4367l(Context context, TypedArray typedArray) {
        this.f21920a = 13;
        this.f21921b = context;
        this.f21922c = typedArray;
    }

    public C4367l(C4014i c4014i) {
        this.f21920a = 1;
        this.f21921b = new ArrayList();
        this.f21922c = new C4383b();
        this.f21923d = c4014i;
    }

    public C4367l(i0.e0 e0Var, Size size) {
        Rational rational;
        this.f21920a = 4;
        this.f21921b = e0Var;
        e0Var.mo7322d();
        e0Var.mo7326i();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listMo7332o = e0Var.mo7332o(256);
            if (listMo7332o.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listMo7332o, new C3503c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f21922c = rational;
        this.f21923d = new C4616j(e0Var, rational);
    }

    public C4367l(i0.g0 g0Var, C6062c c6062c) {
        this.f21920a = 21;
        this.f21922c = g0Var;
        this.f21921b = c6062c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4367l(e1.j0 j0Var, String str, InterfaceC2137a interfaceC2137a) {
        this.f21920a = 26;
        this.f21921b = j0Var;
        this.f21922c = str;
        this.f21923d = (AbstractC4155m) interfaceC2137a;
    }

    public C4367l(k4.h0 h0Var, C4367l c4367l) {
        this.f21920a = 14;
        this.f21921b = h0Var;
        this.f21923d = c4367l;
        this.f21922c = h0Var.getValue();
    }

    public C4367l(InterfaceC7564h context, InterfaceC5016g delegate, String str) {
        this.f21920a = 12;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f21921b = context;
        this.f21922c = delegate;
        this.f21923d = str;
    }
}
