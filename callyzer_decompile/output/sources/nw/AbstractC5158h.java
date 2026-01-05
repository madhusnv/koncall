package nw;

import java.util.WeakHashMap;
import og.c2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5158h {

    /* renamed from: a */
    public static final WeakHashMap f25234a = new WeakHashMap();

    /* renamed from: b */
    public static synchronized AbstractC5158h m10068b() {
        AbstractC5158h c5161k;
        ClassLoader classLoaderM10571b = c2.m10571b();
        WeakHashMap weakHashMap = f25234a;
        c5161k = (AbstractC5158h) weakHashMap.get(classLoaderM10571b);
        if (c5161k == null) {
            c5161k = new C5161k();
            weakHashMap.put(classLoaderM10571b, c5161k);
        }
        return c5161k;
    }

    /* renamed from: a */
    public abstract String mo10069a(String str);
}
