package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class zmh extends rqe {

    /* renamed from: b */
    public final WeakReference f57420b;

    public zmh(Context context, Resources resources) {
        super(resources);
        this.f57420b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawableM47073a = m47073a(i);
        Context context = (Context) this.f57420b.get();
        if (drawableM47073a != null && context != null) {
            poe.m43968g().m43988w(context, i, drawableM47073a);
        }
        return drawableM47073a;
    }
}
