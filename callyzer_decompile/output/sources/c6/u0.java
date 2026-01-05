package c6;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.websoptimization.callyzerbiz.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: d */
    public static final ArrayList f5520d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f5521a;

    /* renamed from: b */
    public SparseArray f5522b;

    /* renamed from: c */
    public WeakReference f5523c;

    /* renamed from: a */
    public final View m2517a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f5521a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM2517a = m2517a(viewGroup.getChildAt(childCount));
                if (viewM2517a != null) {
                    return viewM2517a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
