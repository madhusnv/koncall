package com.amplifyframework.statemachine.codegen.data;

import android.app.Activity;
import java.util.List;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class HostedUIOptions {
    private final String browserPackage;
    private final Activity callingActivity;
    private final HostedUIProviderInfo providerInfo;
    private final List<String> scopes;

    public HostedUIOptions(Activity activity, List<String> list, HostedUIProviderInfo hostedUIProviderInfo, String str) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(hostedUIProviderInfo, "providerInfo");
        this.callingActivity = activity;
        this.scopes = list;
        this.providerInfo = hostedUIProviderInfo;
        this.browserPackage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HostedUIOptions copy$default(HostedUIOptions hostedUIOptions, Activity activity, List list, HostedUIProviderInfo hostedUIProviderInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = hostedUIOptions.callingActivity;
        }
        if ((i & 2) != 0) {
            list = hostedUIOptions.scopes;
        }
        if ((i & 4) != 0) {
            hostedUIProviderInfo = hostedUIOptions.providerInfo;
        }
        if ((i & 8) != 0) {
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

    public final HostedUIOptions copy(Activity activity, List<String> list, HostedUIProviderInfo hostedUIProviderInfo, String str) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(hostedUIProviderInfo, "providerInfo");
        return new HostedUIOptions(activity, list, hostedUIProviderInfo, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIOptions)) {
            return false;
        }
        HostedUIOptions hostedUIOptions = (HostedUIOptions) obj;
        return sq8.m48644c(this.callingActivity, hostedUIOptions.callingActivity) && sq8.m48644c(this.scopes, hostedUIOptions.scopes) && sq8.m48644c(this.providerInfo, hostedUIOptions.providerInfo) && sq8.m48644c(this.browserPackage, hostedUIOptions.browserPackage);
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
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.providerInfo.hashCode()) * 31;
        String str = this.browserPackage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HostedUIOptions(callingActivity=" + this.callingActivity + ", scopes=" + this.scopes + ", providerInfo=" + this.providerInfo + ", browserPackage=" + this.browserPackage + ")";
    }
}
