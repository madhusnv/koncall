package a1;

import android.util.ArrayMap;
import com.amplifyframework.storage.s3.transfer.RunnableC1255b;
import com.amplifyframework.storage.s3.transfer.RunnableC1257d;
import i0.AbstractC3084o;
import i0.C3088s;
import i0.InterfaceC3093x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import og.u1;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.e */
/* loaded from: classes.dex */
public final class C0006e extends AbstractC3084o {

    /* renamed from: a */
    public final /* synthetic */ int f32a = 1;

    /* renamed from: b */
    public Object f33b;

    /* renamed from: c */
    public Object f34c;

    public /* synthetic */ C0006e() {
    }

    @Override // i0.AbstractC3084o
    /* renamed from: a */
    public void mo82a(int i10) {
        switch (this.f32a) {
            case 1:
                Iterator it = ((HashSet) this.f33b).iterator();
                while (it.hasNext()) {
                    AbstractC3084o abstractC3084o = (AbstractC3084o) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f34c).get(abstractC3084o)).execute(new RunnableC1257d(abstractC3084o, i10, 2));
                    } catch (RejectedExecutionException unused) {
                        u1.m10944c("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: b */
    public final void mo83b(int i10, InterfaceC3093x interfaceC3093x) {
        switch (this.f32a) {
            case 0:
                ((C8299i) this.f33b).m15507b(null);
                ((i0.e0) this.f34c).mo7333p(this);
                break;
            default:
                Iterator it = ((HashSet) this.f33b).iterator();
                while (it.hasNext()) {
                    AbstractC3084o abstractC3084o = (AbstractC3084o) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f34c).get(abstractC3084o)).execute(new RunnableC1255b(abstractC3084o, i10, interfaceC3093x, 5));
                    } catch (RejectedExecutionException unused) {
                        u1.m10944c("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: c */
    public void mo84c(int i10, C3088s c3088s) {
        switch (this.f32a) {
            case 1:
                Iterator it = ((HashSet) this.f33b).iterator();
                while (it.hasNext()) {
                    AbstractC3084o abstractC3084o = (AbstractC3084o) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f34c).get(abstractC3084o)).execute(new RunnableC1255b(abstractC3084o, i10, c3088s, 4));
                    } catch (RejectedExecutionException unused) {
                        u1.m10944c("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    public C0006e(C8299i c8299i, i0.e0 e0Var) {
        this.f33b = c8299i;
        this.f34c = e0Var;
    }
}
