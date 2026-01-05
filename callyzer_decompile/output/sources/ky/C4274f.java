package ky;

import hy.C3060k;
import hy.InterfaceC3055f;
import java.util.List;
import jy.C3865b;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5942w;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.f */
/* loaded from: classes3.dex */
public final class C4274f implements InterfaceC3055f {

    /* renamed from: b */
    public static final C4274f f21673b = new C4274f();

    /* renamed from: c */
    public static final String f21674c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a */
    public final /* synthetic */ C3865b f21675a;

    public C4274f() {
        InterfaceC3055f elementDesc = C4283o.f21689a.getDescriptor();
        AbstractC4154l.m8923f(elementDesc, "elementDesc");
        this.f21675a = new C3865b(elementDesc, 0);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return f21674c;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: c */
    public final boolean mo7278c() {
        this.f21675a.getClass();
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: d */
    public final int mo7279d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return this.f21675a.mo7279d(name);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        this.f21675a.getClass();
        return C3060k.f16414c;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        this.f21675a.getClass();
        return 1;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        this.f21675a.getClass();
        return String.valueOf(i10);
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        this.f21675a.getClass();
        return C6668r.f31943a;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        this.f21675a.mo7283h(i10);
        return C6668r.f31943a;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        return this.f21675a.mo7284i(i10);
    }

    @Override // hy.InterfaceC3055f
    public final boolean isInline() {
        this.f21675a.getClass();
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        this.f21675a.mo7285j(i10);
        return false;
    }
}
