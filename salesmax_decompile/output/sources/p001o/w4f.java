package p001o;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class w4f {

    /* renamed from: a */
    public Context f51468a;

    /* renamed from: b */
    public int f51469b;

    /* renamed from: c */
    public ViewGroup f51470c;

    /* renamed from: d */
    public View f51471d;

    /* renamed from: e */
    public Runnable f51472e;

    /* renamed from: f */
    public Runnable f51473f;

    public w4f(ViewGroup viewGroup, int i, Context context) {
        this.f51468a = context;
        this.f51470c = viewGroup;
        this.f51469b = i;
    }

    /* renamed from: c */
    public static w4f m53931c(ViewGroup viewGroup) {
        return (w4f) viewGroup.getTag(g8e.transition_current_scene);
    }

    /* renamed from: d */
    public static w4f m53932d(ViewGroup viewGroup, int i, Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(g8e.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(g8e.transition_scene_layoutid_cache, sparseArray);
        }
        w4f w4fVar = (w4f) sparseArray.get(i);
        if (w4fVar != null) {
            return w4fVar;
        }
        w4f w4fVar2 = new w4f(viewGroup, i, context);
        sparseArray.put(i, w4fVar2);
        return w4fVar2;
    }

    /* renamed from: g */
    public static void m53933g(ViewGroup viewGroup, w4f w4fVar) {
        viewGroup.setTag(g8e.transition_current_scene, w4fVar);
    }

    /* renamed from: a */
    public void m53934a() {
        if (this.f51469b > 0 || this.f51471d != null) {
            m53936e().removeAllViews();
            if (this.f51469b > 0) {
                LayoutInflater.from(this.f51468a).inflate(this.f51469b, this.f51470c);
            } else {
                this.f51470c.addView(this.f51471d);
            }
        }
        Runnable runnable = this.f51472e;
        if (runnable != null) {
            runnable.run();
        }
        m53933g(this.f51470c, this);
    }

    /* renamed from: b */
    public void m53935b() {
        Runnable runnable;
        if (m53931c(this.f51470c) != this || (runnable = this.f51473f) == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: e */
    public ViewGroup m53936e() {
        return this.f51470c;
    }

    /* renamed from: f */
    public boolean m53937f() {
        return this.f51469b > 0;
    }
}
