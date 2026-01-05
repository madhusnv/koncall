package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes5.dex */
public class ReferrerDetails {

    /* renamed from: a */
    public final Bundle f11131a;

    public ReferrerDetails(Bundle bundle) {
        this.f11131a = bundle;
    }

    /* renamed from: a */
    public String m12628a() {
        return this.f11131a.getString("install_referrer");
    }
}
