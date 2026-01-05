package q7;

import android.os.Bundle;
import aw.C0465e;
import d7.C1651w;
import d7.EnumC1645q;
import d7.q0;
import d7.t0;
import g8.C2546f;
import i8.C3182a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.C4413m;
import od.C5338b;
import og.nd;
import pg.n7;
import qw.C6361k;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q7.c */
/* loaded from: classes.dex */
public final class C6136c {

    /* renamed from: a */
    public final C4409i f29892a;

    /* renamed from: b */
    public final AbstractC4422v f29893b;

    /* renamed from: c */
    public final Bundle f29894c;

    /* renamed from: d */
    public EnumC1645q f29895d;

    /* renamed from: e */
    public final C4413m f29896e;

    /* renamed from: f */
    public final String f29897f;

    /* renamed from: g */
    public final Bundle f29898g;

    /* renamed from: h */
    public final C2546f f29899h;

    /* renamed from: i */
    public boolean f29900i;

    /* renamed from: j */
    public final C1651w f29901j;

    /* renamed from: k */
    public EnumC1645q f29902k;

    /* renamed from: l */
    public final t0 f29903l;

    /* renamed from: m */
    public final C6366p f29904m;

    public C6136c(C4409i c4409i) {
        this.f29892a = c4409i;
        this.f29893b = c4409i.f22046b;
        this.f29894c = c4409i.f22047c;
        this.f29895d = c4409i.f22048d;
        this.f29896e = c4409i.f22049e;
        this.f29897f = c4409i.f22050f;
        this.f29898g = c4409i.f22051g;
        this.f29899h = new C2546f(new C3182a(c4409i, new C0465e(9, c4409i)));
        C6366p c6366pM10782c = nd.m10782c(new C5338b(4));
        this.f29901j = new C1651w(c4409i);
        this.f29902k = EnumC1645q.INITIALIZED;
        this.f29903l = (t0) c6366pM10782c.getValue();
        this.f29904m = nd.m10782c(new C5338b(5));
    }

    /* renamed from: a */
    public final Bundle m12163a() {
        Bundle bundle = this.f29894c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        bundleM11799a.putAll(bundle);
        return bundleM11799a;
    }

    /* renamed from: b */
    public final void m12164b() {
        if (!this.f29900i) {
            C2546f c2546f = this.f29899h;
            c2546f.m6567a();
            this.f29900i = true;
            if (this.f29896e != null) {
                q0.m5336c(this.f29892a);
            }
            c2546f.m6568b(this.f29898g);
        }
        int iOrdinal = this.f29895d.ordinal();
        int iOrdinal2 = this.f29902k.ordinal();
        C1651w c1651w = this.f29901j;
        if (iOrdinal < iOrdinal2) {
            c1651w.m5357i(this.f29895d);
        } else {
            c1651w.m5357i(this.f29902k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a0.m8901a(C4409i.class).m8914c());
        sb2.append("(" + this.f29897f + ')');
        sb2.append(" destination=");
        sb2.append(this.f29893b);
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
