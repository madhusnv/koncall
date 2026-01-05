package p001o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p001o.mvh;

/* loaded from: classes5.dex */
public class hy5 implements mvh {

    /* renamed from: a */
    public final int f27786a;

    /* renamed from: b */
    public final boolean f27787b;

    public hy5(int i, boolean z) {
        this.f27786a = i;
        this.f27787b = z;
    }

    @Override // p001o.mvh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo31286a(Drawable drawable, mvh.InterfaceC15437a interfaceC15437a) {
        Drawable drawableMo39729f = interfaceC15437a.mo39729f();
        if (drawableMo39729f == null) {
            drawableMo39729f = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableMo39729f, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f27787b);
        transitionDrawable.startTransition(this.f27786a);
        interfaceC15437a.mo39728c(transitionDrawable);
        return true;
    }
}
