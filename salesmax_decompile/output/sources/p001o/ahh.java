package p001o;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ahh implements ug9 {

    /* renamed from: d */
    public static final String f14755d = sqi.B0(0);

    /* renamed from: e */
    public static final String f14756e = sqi.B0(1);

    /* renamed from: f */
    public static final String f14757f = sqi.B0(2);

    /* renamed from: a */
    public int f14758a;

    /* renamed from: b */
    public int f14759b;

    /* renamed from: c */
    public final int f14760c;

    public ahh(int i, int i2, int i3) {
        this.f14758a = i;
        this.f14759b = i2;
        this.f14760c = i3;
    }

    /* renamed from: a */
    public static ahh m17135a(Bundle bundle) {
        return new ahh(bundle.getInt(f14755d), bundle.getInt(f14756e), bundle.getInt(f14757f));
    }

    /* renamed from: b */
    public Bundle m17136b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f14755d, this.f14758a);
        bundle.putInt(f14756e, this.f14759b);
        bundle.putInt(f14757f, this.f14760c);
        return bundle;
    }
}
