package p001o;

import android.content.Context;
import p001o.it3;

/* loaded from: classes5.dex */
public final class gd5 implements it3 {

    /* renamed from: a */
    public final Context f24999a;

    /* renamed from: b */
    public final it3.InterfaceC14366a f25000b;

    public gd5(Context context, it3.InterfaceC14366a interfaceC14366a) {
        this.f24999a = context.getApplicationContext();
        this.f25000b = interfaceC14366a;
    }

    /* renamed from: c */
    public final void m28472c() {
        bvf.m19868a(this.f24999a).m19871d(this.f25000b);
    }

    /* renamed from: f */
    public final void m28473f() {
        bvf.m19868a(this.f24999a).m19872e(this.f25000b);
    }

    @Override // p001o.vca
    public void onDestroy() {
    }

    @Override // p001o.vca
    public void onStart() {
        m28472c();
    }

    @Override // p001o.vca
    public void onStop() {
        m28473f();
    }
}
