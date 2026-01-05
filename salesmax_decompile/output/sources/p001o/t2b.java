package p001o;

import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class t2b {

    /* renamed from: a */
    public static final HashSet f46260a = new HashSet();

    /* renamed from: b */
    public static String f46261b = "media3.common";

    /* renamed from: a */
    public static synchronized void m49198a(String str) {
        if (f46260a.add(str)) {
            f46261b += ", " + str;
        }
    }

    /* renamed from: b */
    public static synchronized String m49199b() {
        return f46261b;
    }
}
