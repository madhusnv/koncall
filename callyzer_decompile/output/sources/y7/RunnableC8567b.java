package y7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.b */
/* loaded from: classes.dex */
public final class RunnableC8567b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f41575a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f41576b;

    /* renamed from: c */
    public final /* synthetic */ C8573h f41577c;

    public /* synthetic */ RunnableC8567b(C8573h c8573h, ArrayList arrayList, int i10) {
        this.f41575a = i10;
        this.f41577c = c8573h;
        this.f41576b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41575a) {
            case 0:
                ArrayList arrayList = this.f41576b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    C8573h c8573h = this.f41577c;
                    if (i10 >= size) {
                        arrayList.clear();
                        c8573h.f41650m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        C8572g c8572g = (C8572g) obj;
                        t0 t0Var = c8572g.f41634a;
                        int i11 = c8572g.f41635b;
                        int i12 = c8572g.f41636c;
                        int i13 = c8572g.f41637d;
                        int i14 = c8572g.f41638e;
                        c8573h.getClass();
                        View view = t0Var.f41792a;
                        int i15 = i13 - i11;
                        int i16 = i14 - i12;
                        if (i15 != 0) {
                            view.animate().translationX(DefinitionKt.NO_Float_VALUE);
                        }
                        if (i16 != 0) {
                            view.animate().translationY(DefinitionKt.NO_Float_VALUE);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c8573h.f41653p.add(t0Var);
                        viewPropertyAnimatorAnimate.setDuration(c8573h.f41592e).setListener(new C8569d(c8573h, t0Var, i15, view, i16, viewPropertyAnimatorAnimate)).start();
                    }
                }
            default:
                ArrayList arrayList2 = this.f41576b;
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    C8573h c8573h2 = this.f41577c;
                    if (i17 >= size2) {
                        arrayList2.clear();
                        c8573h2.f41649l.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i17);
                        i17++;
                        t0 t0Var2 = (t0) obj2;
                        c8573h2.getClass();
                        View view2 = t0Var2.f41792a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        c8573h2.f41652o.add(t0Var2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(c8573h2.f41590c).setListener(new C8568c(c8573h2, t0Var2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                }
        }
    }
}
