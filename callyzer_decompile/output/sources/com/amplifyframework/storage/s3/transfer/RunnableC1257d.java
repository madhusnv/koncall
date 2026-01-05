package com.amplifyframework.storage.s3.transfer;

import i0.AbstractC3084o;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.IntConsumer;
import p020v.g1;
import t5.AbstractC7044b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.transfer.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1257d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5937a;

    /* renamed from: b */
    public final /* synthetic */ int f5938b;

    /* renamed from: c */
    public final /* synthetic */ Object f5939c;

    public /* synthetic */ RunnableC1257d(Object obj, int i10, int i11) {
        this.f5937a = i11;
        this.f5939c = obj;
        this.f5938b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5937a) {
            case 0:
                TransferStatusUpdater.unregisterAllListener$lambda$19((TransferStatusUpdater) this.f5939c, this.f5938b);
                return;
            case 1:
                ((AbstractC7044b) this.f5939c).mo9653g(this.f5938b);
                return;
            case 2:
                ((AbstractC3084o) this.f5939c).mo82a(this.f5938b);
                return;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5939c;
                int i10 = this.f5938b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    g1 g1Var = (g1) it.next();
                    if (i10 == 5) {
                        synchronized (g1Var.f36559p) {
                            try {
                                if (g1Var.m14381l() && g1Var.f36560q != null) {
                                    g1Var.m14380k("Close DeferrableSurfaces for CameraDevice error.");
                                    ArrayList arrayList = g1Var.f36560q;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        ((v0) obj).mo7416a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        g1Var.getClass();
                    }
                }
                return;
            default:
                ((IntConsumer) this.f5939c).accept(this.f5938b);
                return;
        }
    }
}
