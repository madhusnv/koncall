package com.amplifyframework.statemachine.codegen.data;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUIOptions {
    private final String browserPackage;
    private final Activity callingActivity;
    private final HostedUIProviderInfo providerInfo;
    private final List<String> scopes;

    public HostedUIOptions(Activity callingActivity, List<String> list, HostedUIProviderInfo providerInfo, String str) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(providerInfo, "providerInfo");
        this.callingActivity = callingActivity;
        this.scopes = list;
        this.providerInfo = providerInfo;
        this.browserPackage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HostedUIOptions copy$default(HostedUIOptions hostedUIOptions, Activity activity, List list, HostedUIProviderInfo hostedUIProviderInfo, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            activity = hostedUIOptions.callingActivity;
        }
        if ((i10 & 2) != 0) {
            list = hostedUIOptions.scopes;
        }
        if ((i10 & 4) != 0) {
            hostedUIProviderInfo = hostedUIOptions.providerInfo;
        }
        if ((i10 & 8) != 0) {
            str = hostedUIOptions.browserPackage;
        }
        return hostedUIOptions.copy(activity, list, hostedUIProviderInfo, str);
    }

    public final Activity component1() {
        return this.callingActivity;
    }

    public final List<String> component2() {
        return this.scopes;
    }

    public final HostedUIProviderInfo component3() {
        return this.providerInfo;
    }

    public final String component4() {
        return this.browserPackage;
    }

    public final HostedUIOptions copy(Activity callingActivity, List<String> list, HostedUIProviderInfo providerInfo, String str) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(providerInfo, "providerInfo");
        return new HostedUIOptions(callingActivity, list, providerInfo, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIOptions)) {
            return false;
        }
        HostedUIOptions hostedUIOptions = (HostedUIOptions) obj;
        return AbstractC4154l.m8918a(this.callingActivity, hostedUIOptions.callingActivity) && AbstractC4154l.m8918a(this.scopes, hostedUIOptions.scopes) && AbstractC4154l.m8918a(this.providerInfo, hostedUIOptions.providerInfo) && AbstractC4154l.m8918a(this.browserPackage, hostedUIOptions.browserPackage);
    }

    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    public final Activity getCallingActivity() {
        return this.callingActivity;
    }

    public final HostedUIProviderInfo getProviderInfo() {
        return this.providerInfo;
    }

    public final List<String> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int iHashCode = this.callingActivity.hashCode() * 31;
        List<String> list = this.scopes;
        int iHashCode2 = (this.providerInfo.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.browserPackage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HostedUIOptions(callingActivity=" + this.callingActivity + ", scopes=" + this.scopes + ", providerInfo=" + this.providerInfo + ", browserPackage=" + this.browserPackage + ")";
    }
}
