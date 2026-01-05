package p001o;

import android.content.res.Resources;

/* loaded from: classes5.dex */
public class bi1 implements ioe {

    /* renamed from: a */
    public final ioe f16288a;

    /* renamed from: b */
    public final Resources f16289b;

    public bi1(Resources resources, ioe ioeVar) {
        this.f16289b = (Resources) bgd.m18886d(resources);
        this.f16288a = (ioe) bgd.m18886d(ioeVar);
    }

    @Override // p001o.ioe
    /* renamed from: a */
    public boolean mo16415a(Object obj, rec recVar) {
        return this.f16288a.mo16415a(obj, recVar);
    }

    @Override // p001o.ioe
    /* renamed from: b */
    public zne mo16416b(Object obj, int i, int i2, rec recVar) {
        return li9.m37309d(this.f16289b, this.f16288a.mo16416b(obj, i, i2, recVar));
    }
}
