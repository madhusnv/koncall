package tb;

import ex.InterfaceC2139c;
import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.AbstractC4154l;
import ox.C5770a;
import sb.InterfaceC6777d;
import td.C7124a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.g */
/* loaded from: classes.dex */
public final class C7096g {

    /* renamed from: a */
    public final String f34239a;

    /* renamed from: b */
    public final String f34240b;

    /* renamed from: c */
    public final C7126c f34241c;

    /* renamed from: d */
    public final InterfaceC2139c f34242d;

    /* renamed from: e */
    public final EnumC7093d f34243e;

    /* renamed from: f */
    public final EnumC7091b f34244f;

    /* renamed from: g */
    public final boolean f34245g;

    /* renamed from: h */
    public final boolean f34246h;

    /* renamed from: i */
    public final boolean f34247i;

    /* renamed from: j */
    public final f0 f34248j;

    /* renamed from: k */
    public final EnumC7092c f34249k;

    /* renamed from: l */
    public final InterfaceC6777d f34250l;

    /* renamed from: m */
    public final C5770a f34251m;

    /* renamed from: n */
    public final boolean f34252n;

    public C7096g(C7095f c7095f) {
        String str = c7095f.f34225a;
        if (str == null) {
            throw new IllegalArgumentException("Signing config must specify a region");
        }
        this.f34239a = str;
        String str2 = c7095f.f34226b;
        if (str2 == null) {
            throw new IllegalArgumentException("Signing config must specify a service");
        }
        this.f34240b = str2;
        C7126c c7126cM13407e = c7095f.f34227c;
        if (c7126cM13407e == null) {
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            c7126cM13407e = C7124a.m13407e();
        }
        this.f34241c = c7126cM13407e;
        this.f34242d = c7095f.f34228d;
        this.f34243e = c7095f.f34229e;
        this.f34244f = c7095f.f34230f;
        this.f34245g = c7095f.f34231g;
        this.f34246h = c7095f.f34232h;
        this.f34247i = c7095f.f34233i;
        f0 f0Var = c7095f.f34234j;
        this.f34248j = f0Var == null ? C7115z.f34309a : f0Var;
        this.f34249k = c7095f.f34235k;
        InterfaceC6777d interfaceC6777d = c7095f.f34236l;
        if (interfaceC6777d == null) {
            throw new IllegalArgumentException("Signing config must specify credentials");
        }
        this.f34250l = interfaceC6777d;
        this.f34251m = c7095f.f34237m;
        this.f34252n = c7095f.f34238n;
    }

    /* renamed from: a */
    public final C7095f m13374a() {
        C7095f c7095f = new C7095f();
        c7095f.f34225a = this.f34239a;
        c7095f.f34226b = this.f34240b;
        c7095f.f34227c = this.f34241c;
        InterfaceC2139c interfaceC2139c = this.f34242d;
        AbstractC4154l.m8923f(interfaceC2139c, "<set-?>");
        c7095f.f34228d = interfaceC2139c;
        EnumC7093d enumC7093d = this.f34243e;
        AbstractC4154l.m8923f(enumC7093d, "<set-?>");
        c7095f.f34229e = enumC7093d;
        EnumC7091b enumC7091b = this.f34244f;
        AbstractC4154l.m8923f(enumC7091b, "<set-?>");
        c7095f.f34230f = enumC7091b;
        c7095f.f34231g = this.f34245g;
        c7095f.f34232h = this.f34246h;
        c7095f.f34233i = this.f34247i;
        c7095f.f34234j = this.f34248j;
        EnumC7092c enumC7092c = this.f34249k;
        AbstractC4154l.m8923f(enumC7092c, "<set-?>");
        c7095f.f34235k = enumC7092c;
        c7095f.f34236l = this.f34250l;
        c7095f.f34237m = this.f34251m;
        c7095f.f34238n = this.f34252n;
        return c7095f;
    }
}
