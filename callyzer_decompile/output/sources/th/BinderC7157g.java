package th;

import eb.g2;
import ig.AbstractBinderC3252h;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.g */
/* loaded from: classes.dex */
public final class BinderC7157g extends AbstractBinderC3252h {

    /* renamed from: f */
    public final g2 f34398f;

    /* renamed from: g */
    public final C8650g f34399g;

    /* renamed from: h */
    public final /* synthetic */ C7158h f34400h;

    /* renamed from: i */
    public final /* synthetic */ C7158h f34401i;

    public BinderC7157g(C7158h c7158h, C8650g c8650g, String str) {
        this.f34401i = c7158h;
        g2 g2Var = new g2("OnRequestInstallCallback");
        this.f34400h = c7158h;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f34398f = g2Var;
        this.f34399g = c8650g;
    }
}
