package org.slf4j.helpers;

import f00.InterfaceC2173b;
import g00.C2416a;
import g00.EnumC2418c;
import g00.InterfaceC2419d;
import h00.InterfaceC2766b;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.g */
/* loaded from: classes3.dex */
public final class C5718g implements InterfaceC2173b {

    /* renamed from: a */
    public final String f28192a;

    /* renamed from: b */
    public volatile InterfaceC2173b f28193b;

    /* renamed from: c */
    public Boolean f28194c;

    /* renamed from: d */
    public Method f28195d;

    /* renamed from: e */
    public C2416a f28196e;

    /* renamed from: f */
    public final Queue f28197f;

    /* renamed from: g */
    public final boolean f28198g;

    public C5718g(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z6) {
        this.f28192a = str;
        this.f28197f = linkedBlockingQueue;
        this.f28198g = z6;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: A */
    public final InterfaceC2766b mo5824A(EnumC2418c enumC2418c) {
        return m11275B().mo5824A(enumC2418c);
    }

    /* renamed from: B */
    public final InterfaceC2173b m11275B() {
        if (this.f28193b != null) {
            return this.f28193b;
        }
        if (this.f28198g) {
            return C5713b.f28187a;
        }
        if (this.f28196e == null) {
            Queue queue = this.f28197f;
            C2416a c2416a = new C2416a();
            c2416a.f10908b = this;
            c2416a.f10907a = this.f28192a;
            c2416a.f10909c = queue;
            this.f28196e = c2416a;
        }
        return this.f28196e;
    }

    /* renamed from: C */
    public final boolean m11276C() {
        Boolean bool = this.f28194c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f28195d = this.f28193b.getClass().getMethod("log", InterfaceC2419d.class);
            this.f28194c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f28194c = Boolean.FALSE;
        }
        return this.f28194c.booleanValue();
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: a */
    public final void mo5825a(Object obj, String str) {
        m11275B().mo5825a(obj, str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: b */
    public final boolean mo5826b(EnumC2418c enumC2418c) {
        return m11275B().mo5826b(enumC2418c);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: c */
    public final boolean mo5827c() {
        return m11275B().mo5827c();
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: d */
    public final void mo5828d(String str, Object obj, Object obj2) {
        m11275B().mo5828d(str, obj, obj2);
    }

    @Override // f00.InterfaceC2173b
    public final void debug(String str) {
        m11275B().debug(str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: e */
    public final boolean mo5829e() {
        return m11275B().mo5829e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5718g.class == obj.getClass() && this.f28192a.equals(((C5718g) obj).f28192a);
    }

    @Override // f00.InterfaceC2173b
    public final void error(String str) {
        m11275B().error(str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: f */
    public final void mo5830f(String str, Number number, Object obj) {
        m11275B().mo5830f(str, number, obj);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: g */
    public final void mo5831g(Object obj, String str) {
        m11275B().mo5831g(obj, str);
    }

    @Override // f00.InterfaceC2173b
    public final String getName() {
        return this.f28192a;
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: h */
    public final boolean mo5832h() {
        return m11275B().mo5832h();
    }

    public final int hashCode() {
        return this.f28192a.hashCode();
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: i */
    public final void mo5833i(Object obj, String str) {
        m11275B().mo5833i(obj, str);
    }

    @Override // f00.InterfaceC2173b
    public final void info(String str) {
        m11275B().info(str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: j */
    public final void mo5834j(String str, Object... objArr) {
        m11275B().mo5834j(str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: k */
    public final boolean mo5835k() {
        return m11275B().mo5835k();
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: l */
    public final boolean mo5836l() {
        return m11275B().mo5836l();
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: m */
    public final void mo5837m(String str, Object obj, Object obj2) {
        m11275B().mo5837m(str, obj, obj2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: n */
    public final void mo5838n(String str, Object... objArr) {
        m11275B().mo5838n(str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: o */
    public final void mo5839o(String str, Object... objArr) {
        m11275B().mo5839o(str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: p */
    public final void mo5840p(String str, Throwable th2) {
        m11275B().mo5840p(str, th2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: q */
    public final void mo5841q(Closeable closeable, IOException iOException) {
        m11275B().mo5841q(closeable, iOException);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: r */
    public final void mo5842r(String str, Throwable th2) {
        m11275B().mo5842r(str, th2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: s */
    public final void mo5843s(Object obj, String str) {
        m11275B().mo5843s(obj, str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: t */
    public final void mo5844t(String str, Throwable th2) {
        m11275B().mo5844t(str, th2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: u */
    public final void mo5845u(String str, Object... objArr) {
        m11275B().mo5845u(str, objArr);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: v */
    public final void mo5846v(String str) {
        m11275B().mo5846v(str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: w */
    public final void mo5847w(String str, Object... objArr) {
        m11275B().mo5847w(str, objArr);
    }

    @Override // f00.InterfaceC2173b
    public final void warn(String str) {
        m11275B().warn(str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: x */
    public final void mo5848x(String str, Object obj, Object obj2) {
        m11275B().mo5848x(str, obj, obj2);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: y */
    public final void mo5849y(Object obj, String str) {
        m11275B().mo5849y(obj, str);
    }

    @Override // f00.InterfaceC2173b
    /* renamed from: z */
    public final InterfaceC2766b mo5850z(EnumC2418c enumC2418c) {
        return m11275B().mo5850z(enumC2418c);
    }

    @Override // f00.InterfaceC2173b
    public final void error(String str, Throwable th2) {
        m11275B().error(str, th2);
    }

    @Override // f00.InterfaceC2173b
    public final void warn(String str, Throwable th2) {
        m11275B().warn(str, th2);
    }
}
