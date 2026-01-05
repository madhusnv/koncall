package p004e;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1868c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8865a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC1878m f8866b;

    public /* synthetic */ RunnableC1868c(AbstractActivityC1878m abstractActivityC1878m, int i10) {
        this.f8865a = i10;
        this.f8866b = abstractActivityC1878m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8865a) {
            case 0:
                this.f8866b.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!AbstractC4154l.m8918a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!AbstractC4154l.m8918a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
        }
    }
}
