package p001o;

import android.util.SparseArray;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class ega {

    /* renamed from: a */
    public static final SparseArray f21594a = new SparseArray();

    /* renamed from: a */
    public static Object m24969a(View view, Object obj, int i) {
        Object tag = view.getTag(i);
        view.setTag(i, obj);
        return tag;
    }
}
