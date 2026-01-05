package sf;

import android.os.Bundle;
import pf.C5902b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.t */
/* loaded from: classes.dex */
public abstract class AbstractC6834t {

    /* renamed from: a */
    public Boolean f32492a;

    /* renamed from: b */
    public boolean f32493b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6819e f32494c;

    /* renamed from: d */
    public final int f32495d;

    /* renamed from: e */
    public final Bundle f32496e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC6819e f32497f;

    public AbstractC6834t(AbstractC6819e abstractC6819e, int i10, Bundle bundle) {
        this.f32497f = abstractC6819e;
        Boolean bool = Boolean.TRUE;
        this.f32494c = abstractC6819e;
        this.f32492a = bool;
        this.f32493b = false;
        this.f32495d = i10;
        this.f32496e = bundle;
    }

    /* renamed from: a */
    public abstract void mo12993a(C5902b c5902b);

    /* renamed from: b */
    public abstract boolean mo12994b();

    /* renamed from: c */
    public final void m13027c() {
        synchronized (this) {
            this.f32492a = null;
        }
        synchronized (this.f32494c.f32391m) {
            this.f32494c.f32391m.remove(this);
        }
    }
}
