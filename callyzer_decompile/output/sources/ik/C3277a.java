package ik;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.a */
/* loaded from: classes.dex */
public final class C3277a implements InterfaceC3292p {

    /* renamed from: a */
    public final Bundle f17474a;

    public C3277a(Context appContext) {
        AbstractC4154l.m8923f(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f17474a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: a */
    public final Boolean mo7628a() {
        Bundle bundle = this.f17474a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: b */
    public final Object mo7629b(InterfaceC7559c interfaceC7559c) {
        return a0.f30746a;
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: c */
    public final C5770a mo7630c() {
        Bundle bundle = this.f17474a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new C5770a(bb.m10551g(bundle.getInt("firebase_sessions_sessions_restart_timeout"), EnumC5772c.SECONDS));
        }
        return null;
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: d */
    public final Double mo7631d() {
        Bundle bundle = this.f17474a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
