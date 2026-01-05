package ug;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f35462a;

    /* renamed from: b */
    public final /* synthetic */ String f35463b;

    /* renamed from: c */
    public final /* synthetic */ long f35464c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f35465d;

    /* renamed from: e */
    public final /* synthetic */ boolean f35466e;

    /* renamed from: f */
    public final /* synthetic */ boolean f35467f;

    /* renamed from: g */
    public final /* synthetic */ boolean f35468g;

    /* renamed from: h */
    public final /* synthetic */ q2 f35469h;

    public h2(q2 q2Var, String str, String str2, long j6, Bundle bundle, boolean z6, boolean z10, boolean z11) {
        this.f35462a = str;
        this.f35463b = str2;
        this.f35464c = j6;
        this.f35465d = bundle;
        this.f35466e = z6;
        this.f35467f = z10;
        this.f35468g = z11;
        this.f35469h = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f35469h.m14124V(this.f35462a, this.f35463b, this.f35464c, this.f35465d, this.f35466e, this.f35467f, this.f35468g);
    }
}
