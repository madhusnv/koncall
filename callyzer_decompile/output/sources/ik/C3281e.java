package ik;

import android.net.Uri;
import fk.C2295a;
import fk.C2296b;
import java.net.URL;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.e */
/* loaded from: classes.dex */
public final class C3281e {

    /* renamed from: a */
    public final C2296b f17490a;

    /* renamed from: b */
    public final InterfaceC7564h f17491b;

    public C3281e(C2296b appInfo, InterfaceC7564h blockingDispatcher) {
        AbstractC4154l.m8923f(appInfo, "appInfo");
        AbstractC4154l.m8923f(blockingDispatcher, "blockingDispatcher");
        this.f17490a = appInfo;
        this.f17491b = blockingDispatcher;
    }

    /* renamed from: a */
    public static final URL m7632a(C3281e c3281e) {
        c3281e.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C2296b c2296b = c3281e.f17490a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c2296b.f10339a).appendPath("settings");
        C2295a c2295a = c2296b.f10341c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c2295a.f10335c).appendQueryParameter("display_version", c2295a.f10334b).build().toString());
    }
}
