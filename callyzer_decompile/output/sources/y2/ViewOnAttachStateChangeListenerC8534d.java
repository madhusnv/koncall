package y2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import b3.C0575g;
import cp.C1476g;
import d4.C1589q;
import d7.InterfaceC1633f;
import d7.InterfaceC1649u;
import e1.AbstractC1910l;
import e1.AbstractC1911m;
import e1.C1922x;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.RunnableC7606p;
import p020v.a1;
import pg.o6;
import ug.g1;
import vx.C7806h;
import w3.C7904v;
import w3.m0;
import w3.n2;
import z3.C8862a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y2.d */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC8534d implements InterfaceC1633f, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final C7904v f41462a;

    /* renamed from: b */
    public final C0575g f41463b;

    /* renamed from: c */
    public C8862a f41464c;

    /* renamed from: d */
    public final ArrayList f41465d = new ArrayList();

    /* renamed from: e */
    public final long f41466e = 100;

    /* renamed from: f */
    public EnumC8531a f41467f = EnumC8531a.SHOW_ORIGINAL;

    /* renamed from: g */
    public boolean f41468g = true;

    /* renamed from: h */
    public final C7806h f41469h = o6.m11805a(1, null, null, 6);

    /* renamed from: j */
    public final Handler f41470j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public C1922x f41471k;

    /* renamed from: l */
    public long f41472l;

    /* renamed from: m */
    public final C1922x f41473m;

    /* renamed from: n */
    public n2 f41474n;

    /* renamed from: p */
    public boolean f41475p;

    /* renamed from: q */
    public final RunnableC7606p f41476q;

    public ViewOnAttachStateChangeListenerC8534d(C7904v c7904v, C0575g c0575g) {
        this.f41462a = c7904v;
        this.f41463b = c0575g;
        C1922x c1922x = AbstractC1911m.f9027a;
        AbstractC4154l.m8921d(c1922x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f41471k = c1922x;
        this.f41473m = new C1922x();
        C1589q c1589qM5221a = c7904v.getSemanticsOwner().m5221a();
        AbstractC4154l.m8921d(c1922x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f41474n = new n2(c1589qM5221a, c1922x);
        this.f41476q = new RunnableC7606p(10, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (tx.c0.m13489l(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:13:0x002d). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15798a(ww.AbstractC8193c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof y2.C8533c
            if (r0 == 0) goto L13
            r0 = r10
            y2.c r0 = (y2.C8533c) r0
            int r1 = r0.f41461e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41461e = r1
            goto L18
        L13:
            y2.c r0 = new y2.c
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f41459c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41461e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            vx.b r2 = r0.f41458b
            y2.d r5 = r0.f41457a
            og.od.m10798c(r10)
        L2d:
            r10 = r5
            goto L4d
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            vx.b r2 = r0.f41458b
            y2.d r5 = r0.f41457a
            og.od.m10798c(r10)
            goto L5d
        L3f:
            og.od.m10798c(r10)
            vx.h r10 = r9.f41469h
            r10.getClass()
            vx.b r2 = new vx.b
            r2.<init>(r10)
            r10 = r9
        L4d:
            r0.f41457a = r10
            r0.f41458b = r2
            r0.f41461e = r4
            java.lang.Object r5 = r2.m14752b(r0)
            if (r5 != r1) goto L5a
            goto L8c
        L5a:
            r8 = r5
            r5 = r10
            r10 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8d
            r2.m14753c()
            boolean r10 = r5.m15801d()
            if (r10 == 0) goto L71
            r5.m15802e()
        L71:
            boolean r10 = r5.f41475p
            if (r10 != 0) goto L7e
            r5.f41475p = r4
            android.os.Handler r10 = r5.f41470j
            v.p r6 = r5.f41476q
            r10.post(r6)
        L7e:
            long r6 = r5.f41466e
            r0.f41457a = r5
            r0.f41458b = r2
            r0.f41461e = r3
            java.lang.Object r10 = tx.c0.m13489l(r6, r0)
            if (r10 != r1) goto L2d
        L8c:
            return r1
        L8d:
            qw.a0 r10 = qw.a0.f30746a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.ViewOnAttachStateChangeListenerC8534d.m15798a(ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void m15799b(C1589q c1589q, InterfaceC2141e interfaceC2141e) {
        c1589q.getClass();
        List listM5206h = C1589q.m5206h(4, c1589q);
        int size = listM5206h.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listM5206h.get(i11);
            if (m15800c().m5594a(((C1589q) obj).f7882g)) {
                interfaceC2141e.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    /* renamed from: c */
    public final AbstractC1910l m15800c() {
        if (this.f41468g) {
            this.f41468g = false;
            this.f41471k = m0.m14984k(this.f41462a.getSemanticsOwner());
            this.f41472l = System.currentTimeMillis();
        }
        return this.f41471k;
    }

    /* renamed from: d */
    public final boolean m15801d() {
        return this.f41464c != null;
    }

    /* renamed from: e */
    public final void m15802e() {
        AutofillId autofillIdM16334b;
        C8862a c8862a = this.f41464c;
        if (c8862a != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f41465d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C8535e c8535e = (C8535e) arrayList.get(i10);
                int i11 = AbstractC8532b.f41456a[c8535e.f41479c.ordinal()];
                if (i11 == 1) {
                    g1 g1Var = c8535e.f41480d;
                    if (g1Var != null) {
                        c8862a.m16336d((ViewStructure) g1Var.f35448a);
                    }
                } else if (i11 == 2 && (autofillIdM16334b = c8862a.m16334b(c8535e.f41477a)) != null) {
                    c8862a.m16337e(autofillIdM16334b);
                }
            }
            c8862a.m16333a();
            arrayList.clear();
        }
    }

    /* renamed from: f */
    public final void m15803f(C1589q c1589q, n2 n2Var) {
        m15799b(c1589q, new C1476g(29, n2Var, this));
        List listM5206h = C1589q.m5206h(4, c1589q);
        int size = listM5206h.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1589q c1589q2 = (C1589q) listM5206h.get(i10);
            AbstractC1910l abstractC1910lM15800c = m15800c();
            int i11 = c1589q2.f7882g;
            if (abstractC1910lM15800c.m5594a(i11)) {
                C1922x c1922x = this.f41473m;
                if (c1922x.m5594a(i11)) {
                    Object objM5595b = c1922x.m5595b(i11);
                    if (objM5595b == null) {
                        throw a1.m14342v("node not present in pruned tree before this change");
                    }
                    m15803f(c1589q2, (n2) objM5595b);
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m15804g(int i10, String str) {
        C8862a c8862a;
        if (Build.VERSION.SDK_INT >= 29 && (c8862a = this.f41464c) != null) {
            AutofillId autofillIdM16334b = c8862a.m16334b(i10);
            if (autofillIdM16334b == null) {
                throw a1.m14342v("Invalid content capture ID");
            }
            c8862a.m16338f(autofillIdM16334b, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15805h(int r14, d4.C1589q r15) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.ViewOnAttachStateChangeListenerC8534d.m15805h(int, d4.q):void");
    }

    /* renamed from: i */
    public final void m15806i(C1589q c1589q) {
        if (m15801d()) {
            this.f41465d.add(new C8535e(c1589q.f7882g, this.f41472l, EnumC8536f.VIEW_DISAPPEAR, null));
            List listM5206h = C1589q.m5206h(4, c1589q);
            int size = listM5206h.size();
            for (int i10 = 0; i10 < size; i10++) {
                m15806i((C1589q) listM5206h.get(i10));
            }
        }
    }

    @Override // d7.InterfaceC1633f
    public final void onStart(InterfaceC1649u interfaceC1649u) {
        this.f41464c = (C8862a) this.f41463b.invoke();
        m15805h(-1, this.f41462a.getSemanticsOwner().m5221a());
        m15802e();
    }

    @Override // d7.InterfaceC1633f
    public final void onStop(InterfaceC1649u interfaceC1649u) {
        m15806i(this.f41462a.getSemanticsOwner().m5221a());
        m15802e();
        this.f41464c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f41470j.removeCallbacks(this.f41476q);
        this.f41464c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
