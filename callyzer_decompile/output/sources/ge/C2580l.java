package ge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import com.sun.mail.util.AbstractC1452a;
import he.C2916g;
import he.EnumC2915f;
import i0.m0;
import iz.C3389v;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.l */
/* loaded from: classes.dex */
public final class C2580l {

    /* renamed from: a */
    public final Context f14045a;

    /* renamed from: b */
    public final Bitmap.Config f14046b;

    /* renamed from: c */
    public final ColorSpace f14047c;

    /* renamed from: d */
    public final C2916g f14048d;

    /* renamed from: e */
    public final EnumC2915f f14049e;

    /* renamed from: f */
    public final boolean f14050f;

    /* renamed from: g */
    public final boolean f14051g;

    /* renamed from: h */
    public final boolean f14052h;

    /* renamed from: i */
    public final String f14053i;

    /* renamed from: j */
    public final C3389v f14054j;

    /* renamed from: k */
    public final C2584p f14055k;

    /* renamed from: l */
    public final C2582n f14056l;

    /* renamed from: m */
    public final EnumC2570b f14057m;

    /* renamed from: n */
    public final EnumC2570b f14058n;

    /* renamed from: o */
    public final EnumC2570b f14059o;

    public C2580l(Context context, Bitmap.Config config, ColorSpace colorSpace, C2916g c2916g, EnumC2915f enumC2915f, boolean z6, boolean z10, boolean z11, String str, C3389v c3389v, C2584p c2584p, C2582n c2582n, EnumC2570b enumC2570b, EnumC2570b enumC2570b2, EnumC2570b enumC2570b3) {
        this.f14045a = context;
        this.f14046b = config;
        this.f14047c = colorSpace;
        this.f14048d = c2916g;
        this.f14049e = enumC2915f;
        this.f14050f = z6;
        this.f14051g = z10;
        this.f14052h = z11;
        this.f14053i = str;
        this.f14054j = c3389v;
        this.f14055k = c2584p;
        this.f14056l = c2582n;
        this.f14057m = enumC2570b;
        this.f14058n = enumC2570b2;
        this.f14059o = enumC2570b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2580l)) {
            return false;
        }
        C2580l c2580l = (C2580l) obj;
        if (AbstractC4154l.m8918a(this.f14045a, c2580l.f14045a) && this.f14046b == c2580l.f14046b) {
            return (Build.VERSION.SDK_INT < 26 || AbstractC4154l.m8918a(this.f14047c, c2580l.f14047c)) && AbstractC4154l.m8918a(this.f14048d, c2580l.f14048d) && this.f14049e == c2580l.f14049e && this.f14050f == c2580l.f14050f && this.f14051g == c2580l.f14051g && this.f14052h == c2580l.f14052h && AbstractC4154l.m8918a(this.f14053i, c2580l.f14053i) && AbstractC4154l.m8918a(this.f14054j, c2580l.f14054j) && AbstractC4154l.m8918a(this.f14055k, c2580l.f14055k) && AbstractC4154l.m8918a(this.f14056l, c2580l.f14056l) && this.f14057m == c2580l.f14057m && this.f14058n == c2580l.f14058n && this.f14059o == c2580l.f14059o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14046b.hashCode() + (this.f14045a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f14047c;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f14049e.hashCode() + ((this.f14048d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f14050f), 31, this.f14051g), 31, this.f14052h);
        String str = this.f14053i;
        return this.f14059o.hashCode() + ((this.f14058n.hashCode() + ((this.f14057m.hashCode() + m0.m7369b(m0.m7369b((((iM4558e + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14054j.f17981a)) * 31, 31, this.f14055k.f14071a), 31, this.f14056l.f14062a)) * 31)) * 31);
    }
}
