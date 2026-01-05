package androidx.fragment.app;

import java.util.ArrayList;
import p7.C5838i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0359x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2745a;

    /* renamed from: b */
    public final /* synthetic */ Object f2746b;

    public /* synthetic */ RunnableC0359x(int i10, Object obj) {
        this.f2745a = i10;
        this.f2746b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2745a) {
            case 0:
                j0 j0Var = (j0) this.f2746b;
                d2 d2Var = j0Var.mViewLifecycleOwner;
                d2Var.f2496f.m6568b(j0Var.mSavedViewRegistryState);
                j0Var.mSavedViewRegistryState = null;
                break;
            case 1:
                v1.m1269a(4, (ArrayList) this.f2746b);
                break;
            default:
                ArrayList arrayList = ((j1) this.f2746b).f2592n;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((C5838i) obj).getClass();
                }
                break;
        }
    }
}
