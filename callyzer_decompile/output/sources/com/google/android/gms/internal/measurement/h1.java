package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h1 implements Runnable {

    /* renamed from: a */
    public final long f6225a;

    /* renamed from: b */
    public final long f6226b;

    /* renamed from: c */
    public final boolean f6227c;

    /* renamed from: d */
    public final /* synthetic */ l1 f6228d;

    public h1(l1 l1Var, boolean z6) {
        Objects.requireNonNull(l1Var);
        this.f6228d = l1Var;
        this.f6225a = System.currentTimeMillis();
        this.f6226b = SystemClock.elapsedRealtime();
        this.f6227c = z6;
    }

    /* renamed from: a */
    public abstract void mo3100a();

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.f6228d;
        if (l1Var.f6280e) {
            mo3101b();
            return;
        }
        try {
            mo3100a();
        } catch (Exception e2) {
            l1Var.m3483d(e2, false, this.f6227c);
            mo3101b();
        }
    }

    /* renamed from: b */
    public void mo3101b() {
    }
}
