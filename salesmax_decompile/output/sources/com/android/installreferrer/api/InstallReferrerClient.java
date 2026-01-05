package com.android.installreferrer.api;

import android.content.Context;
import p001o.zj8;

/* loaded from: classes5.dex */
public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    public static final class C10720b {

        /* renamed from: a */
        public final Context f11130a;

        public C10720b(Context context) {
            this.f11130a = context;
        }

        /* renamed from: a */
        public InstallReferrerClient m12625a() {
            Context context = this.f11130a;
            if (context != null) {
                return new zj8(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* renamed from: c */
    public static C10720b m12621c(Context context) {
        return new C10720b(context);
    }

    /* renamed from: a */
    public abstract void mo12622a();

    /* renamed from: b */
    public abstract ReferrerDetails mo12623b();

    /* renamed from: d */
    public abstract void mo12624d(InstallReferrerStateListener installReferrerStateListener);
}
