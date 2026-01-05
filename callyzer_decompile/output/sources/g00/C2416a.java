package g00;

import f00.InterfaceC2173b;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Queue;
import org.slf4j.helpers.C5718g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g00.a */
/* loaded from: classes3.dex */
public final class C2416a implements InterfaceC2173b, Serializable {

    /* renamed from: a */
    public String f10907a;

    /* renamed from: b */
    public C5718g f10908b;

    /* renamed from: c */
    public Queue f10909c;

    /* renamed from: B */
    public final void m6081B(EnumC2418c enumC2418c, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            m6083D(enumC2418c, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            m6083D(enumC2418c, str, new Object[]{obj, obj2}, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6082C(g00.EnumC2418c r5, java.lang.String r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L5
            goto L11
        L5:
            int r0 = r7.length
            int r0 = r0 + (-1)
            r0 = r7[r0]
            boolean r2 = r0 instanceof java.lang.Throwable
            if (r2 == 0) goto L11
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L2e
            int r1 = r7.length
            if (r1 == 0) goto L26
            int r1 = r7.length
            int r1 = r1 + (-1)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            if (r1 <= 0) goto L22
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r2, r3, r1)
        L22:
            r4.m6083D(r5, r6, r2, r0)
            return
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "non-sensical empty or null argument array"
            r5.<init>(r6)
            throw r5
        L2e:
            r4.m6083D(r5, r6, r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g00.C2416a.m6082C(g00.c, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: D */
    public final void m6083D(EnumC2418c enumC2418c, String str, Object[] objArr, Throwable th2) {
        C2420e c2420e = new C2420e();
        System.currentTimeMillis();
        c2420e.f10912a = enumC2418c;
        c2420e.f10913b = this.f10908b;
        Thread.currentThread().getName();
        c2420e.f10914c = objArr;
        this.f10909c.add(c2420e);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: a */
    public final void mo5825a(Object obj, String str) {
        m6083D(EnumC2418c.INFO, str, new Object[]{obj}, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: c */
    public final boolean mo5827c() {
        return true;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: d */
    public final void mo5828d(String str, Object obj, Object obj2) {
        m6081B(EnumC2418c.DEBUG, str, obj, obj2);
    }

    @Override // f00.InterfaceC2173b
    public final void debug(String str) {
        m6083D(EnumC2418c.DEBUG, str, null, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: e */
    public final boolean mo5829e() {
        return true;
    }

    @Override // f00.InterfaceC2173b
    public final void error(String str) {
        m6083D(EnumC2418c.ERROR, str, null, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: f */
    public final void mo5830f(String str, Number number, Object obj) {
        m6081B(EnumC2418c.TRACE, str, number, obj);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: g */
    public final void mo5831g(Object obj, String str) {
        m6083D(EnumC2418c.TRACE, str, new Object[]{obj}, null);
    }

    @Override // f00.InterfaceC2173b
    public final String getName() {
        return this.f10907a;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: h */
    public final boolean mo5832h() {
        return true;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: i */
    public final void mo5833i(Object obj, String str) {
        m6083D(EnumC2418c.WARN, str, new Object[]{obj}, null);
    }

    @Override // f00.InterfaceC2173b
    public final void info(String str) {
        m6083D(EnumC2418c.INFO, str, null, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: j */
    public final void mo5834j(String str, Object... objArr) {
        m6082C(EnumC2418c.WARN, str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: k */
    public final boolean mo5835k() {
        return true;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: l */
    public final boolean mo5836l() {
        return true;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: m */
    public final void mo5837m(String str, Object obj, Object obj2) {
        m6081B(EnumC2418c.ERROR, str, obj, obj2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: n */
    public final void mo5838n(String str, Object... objArr) {
        m6082C(EnumC2418c.ERROR, str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: o */
    public final void mo5839o(String str, Object... objArr) {
        m6082C(EnumC2418c.DEBUG, str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: p */
    public final void mo5840p(String str, Throwable th2) {
        m6083D(EnumC2418c.INFO, str, null, th2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: q */
    public final void mo5841q(Closeable closeable, IOException iOException) {
        m6081B(EnumC2418c.WARN, "Error closing {} - {}", closeable, iOException);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: r */
    public final void mo5842r(String str, Throwable th2) {
        m6083D(EnumC2418c.TRACE, str, null, th2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: s */
    public final void mo5843s(Object obj, String str) {
        m6083D(EnumC2418c.ERROR, str, new Object[]{obj}, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: t */
    public final void mo5844t(String str, Throwable th2) {
        m6083D(EnumC2418c.DEBUG, str, null, th2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: u */
    public final void mo5845u(String str, Object... objArr) {
        m6082C(EnumC2418c.TRACE, str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: v */
    public final void mo5846v(String str) {
        m6083D(EnumC2418c.TRACE, str, null, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: w */
    public final void mo5847w(String str, Object... objArr) {
        m6082C(EnumC2418c.INFO, str, objArr);
    }

    @Override // f00.InterfaceC2173b
    public final void warn(String str) {
        m6083D(EnumC2418c.WARN, str, null, null);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: x */
    public final void mo5848x(String str, Object obj, Object obj2) {
        m6081B(EnumC2418c.INFO, str, obj, obj2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: y */
    public final void mo5849y(Object obj, String str) {
        m6083D(EnumC2418c.DEBUG, str, new Object[]{obj}, null);
    }

    @Override // f00.InterfaceC2173b
    public final void error(String str, Throwable th2) {
        m6083D(EnumC2418c.ERROR, str, null, th2);
    }

    @Override // f00.InterfaceC2173b
    public final void warn(String str, Throwable th2) {
        m6083D(EnumC2418c.WARN, str, null, th2);
    }
}
