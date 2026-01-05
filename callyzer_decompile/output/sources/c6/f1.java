package c6;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import c9.C0917l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final AbstractC0315j f5447a;

    /* renamed from: b */
    public ArrayList f5448b;

    /* renamed from: c */
    public final HashMap f5449c;

    public f1(AbstractC0315j abstractC0315j) {
        super(abstractC0315j.f2354a);
        this.f5449c = new HashMap();
        this.f5447a = abstractC0315j;
    }

    /* renamed from: a */
    public final i1 m2381a(WindowInsetsAnimation windowInsetsAnimation) {
        i1 i1Var = (i1) this.f5449c.get(windowInsetsAnimation);
        if (i1Var == null) {
            i1Var = new i1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                i1Var.f5469a = new g1(windowInsetsAnimation);
            }
            this.f5449c.put(windowInsetsAnimation, i1Var);
        }
        return i1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f5447a.mo925d(m2381a(windowInsetsAnimation));
        this.f5449c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m2381a(windowInsetsAnimation);
        this.f5447a.mo926f();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f5448b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f5448b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            i1 i1VarM2381a = m2381a(windowInsetsAnimation);
            i1VarM2381a.f5469a.mo2387c(windowInsetsAnimation.getFraction());
            this.f5448b.add(i1VarM2381a);
        }
        return this.f5447a.mo927g(y1.m2537d(null, windowInsets)).m2539c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m2381a(windowInsetsAnimation);
        C0917l c0917lMo928h = this.f5447a.mo928h(new C0917l(bounds));
        c0917lMo928h.getClass();
        e1.m2380c();
        return e1.m2378a(((C7340b) c0917lMo928h.f5594b).m13738d(), ((C7340b) c0917lMo928h.f5595c).m13738d());
    }
}
