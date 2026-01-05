package p001o;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class m56 extends Editable.Factory {

    /* renamed from: a */
    public static final Object f34819a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f34820b;

    /* renamed from: c */
    public static Class f34821c;

    public m56() {
        try {
            f34821c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, m56.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f34820b == null) {
            synchronized (f34819a) {
                if (f34820b == null) {
                    f34820b = new m56();
                }
            }
        }
        return f34820b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f34821c;
        return cls != null ? yzf.m58570c(cls, charSequence) : super.newEditable(charSequence);
    }
}
