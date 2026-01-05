package p001o;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes5.dex */
public class aoe implements ioe {

    /* renamed from: a */
    public final koe f15078a;

    /* renamed from: b */
    public final mi1 f15079b;

    public aoe(koe koeVar, mi1 mi1Var) {
        this.f15078a = koeVar;
        this.f15079b = mi1Var;
    }

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(Uri uri, int i, int i2, rec recVar) {
        zne zneVarMo16416b = this.f15078a.mo16416b(uri, i, i2, recVar);
        if (zneVarMo16416b == null) {
            return null;
        }
        return ly5.m38102a(this.f15079b, (Drawable) zneVarMo16416b.get(), i, i2);
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(Uri uri, rec recVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
