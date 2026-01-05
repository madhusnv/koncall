package og;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.websoptimization.callyzerbiz.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Matcher;
import nx.C5174l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a */
    public static boolean f26419a = false;

    /* renamed from: b */
    public static Method f26420b;

    /* renamed from: a */
    public static final C5174l m10640a(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new C5174l(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m10641b(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = c6.v0.f5527a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = c6.u0.f5520d;
        c6.u0 u0Var = (c6.u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (u0Var == null) {
            u0Var = new c6.u0();
            u0Var.f5521a = null;
            u0Var.f5522b = null;
            u0Var.f5523c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        WeakReference weakReference2 = u0Var.f5523c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u0Var.f5523c = new WeakReference(keyEvent);
        if (u0Var.f5522b == null) {
            u0Var.f5522b = new SparseArray();
        }
        SparseArray sparseArray = u0Var.f5522b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
