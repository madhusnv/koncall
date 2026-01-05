package p001o;

import android.graphics.Color;

/* loaded from: classes2.dex */
public abstract class d18 {
    /* renamed from: a */
    public static String m22221a(String str) {
        return "." + str + ",." + str + " *";
    }

    /* renamed from: b */
    public static String m22222b(int i) {
        return sqi.m48702G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}
