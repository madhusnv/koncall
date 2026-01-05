package p001o;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class kve implements ug9 {

    /* renamed from: c */
    public static final String f32752c = sqi.B0(0);

    /* renamed from: d */
    public static final String f32753d = sqi.B0(1);

    /* renamed from: a */
    public final String f32754a;

    /* renamed from: b */
    public final int f32755b;

    public kve(String str, int i) {
        this.f32754a = str;
        this.f32755b = i;
    }

    /* renamed from: a */
    public static kve m36258a(Bundle bundle) {
        return new kve((String) op0.m42515e(bundle.getString(f32752c)), bundle.getInt(f32753d));
    }

    /* renamed from: b */
    public Bundle m36259b() {
        Bundle bundle = new Bundle();
        bundle.putString(f32752c, this.f32754a);
        bundle.putInt(f32753d, this.f32755b);
        return bundle;
    }
}
