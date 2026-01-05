package tc;

import ad.C0109p;
import ex.InterfaceC2137a;
import i0.m0;
import java.util.Map;
import jc.AbstractC3745u;
import jc.C3734j;
import jc.InterfaceC3738n;
import jc.e0;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tc.g */
/* loaded from: classes.dex */
public final class C7122g implements InterfaceC7116a {

    /* renamed from: a */
    public final C7117b f34329a;

    /* renamed from: b */
    public final boolean f34330b;

    /* renamed from: c */
    public final e0 f34331c;

    /* renamed from: d */
    public final C6366p f34332d;

    /* renamed from: e */
    public final C6366p f34333e;

    /* renamed from: f */
    public final AbstractC3745u f34334f;

    public C7122g(C7117b builder, boolean z6) {
        AbstractC4154l.m8923f(builder, "builder");
        this.f34329a = builder;
        this.f34330b = z6;
        this.f34331c = builder.f34310a;
        final int i10 = 0;
        this.f34332d = nd.m10782c(new InterfaceC2137a(this) { // from class: tc.f

            /* renamed from: b */
            public final /* synthetic */ C7122g f34328b;

            {
                this.f34328b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.f34328b.f34329a.f34311b.m293a();
                    case 1:
                        return this.f34328b.f34329a.f34312c.m8274N();
                    default:
                        Map values = (Map) this.f34328b.f34329a.f34314e.f482a;
                        AbstractC4154l.m8923f(values, "values");
                        return new C3734j(values);
                }
            }
        });
        final int i11 = 1;
        this.f34333e = nd.m10782c(new InterfaceC2137a(this) { // from class: tc.f

            /* renamed from: b */
            public final /* synthetic */ C7122g f34328b;

            {
                this.f34328b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.f34328b.f34329a.f34311b.m293a();
                    case 1:
                        return this.f34328b.f34329a.f34312c.m8274N();
                    default:
                        Map values = (Map) this.f34328b.f34329a.f34314e.f482a;
                        AbstractC4154l.m8923f(values, "values");
                        return new C3734j(values);
                }
            }
        });
        this.f34334f = builder.f34313d;
        final int i12 = 2;
        nd.m10782c(new InterfaceC2137a(this) { // from class: tc.f

            /* renamed from: b */
            public final /* synthetic */ C7122g f34328b;

            {
                this.f34328b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f34328b.f34329a.f34311b.m293a();
                    case 1:
                        return this.f34328b.f34329a.f34312c.m8274N();
                    default:
                        Map values = (Map) this.f34328b.f34329a.f34314e.f482a;
                        AbstractC4154l.m8923f(values, "values");
                        return new C3734j(values);
                }
            }
        });
    }

    @Override // tc.InterfaceC7116a
    /* renamed from: a */
    public final InterfaceC3738n mo13398a() {
        return (InterfaceC3738n) this.f34333e.getValue();
    }

    @Override // tc.InterfaceC7116a
    /* renamed from: b */
    public final e0 mo13399b() {
        return this.f34331c;
    }

    @Override // tc.InterfaceC7116a
    /* renamed from: c */
    public final AbstractC3745u mo13400c() {
        return this.f34334f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7122g)) {
            return false;
        }
        C7122g c7122g = (C7122g) obj;
        return AbstractC4154l.m8918a(this.f34329a, c7122g.f34329a) && this.f34330b == c7122g.f34330b;
    }

    @Override // tc.InterfaceC7116a
    public final C0109p getUrl() {
        return (C0109p) this.f34332d.getValue();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34330b) + (this.f34329a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequestBuilderView(builder=");
        sb2.append(this.f34329a);
        sb2.append(", allowToBuilder=");
        return m0.m7382o(sb2, this.f34330b, ')');
    }
}
