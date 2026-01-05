package com.amplifyframework.statemachine.codegen.data;

import android.app.Activity;
import com.amplifyframework.statemachine.util.MaskUtilKt;
import java.lang.ref.WeakReference;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class WebAuthnSignInContext {
    private final WeakReference<Activity> callingActivity;
    private final String requestJson;
    private final String responseJson;
    private final String session;
    private final String username;

    public WebAuthnSignInContext(String str, WeakReference<Activity> weakReference, String str2, String str3, String str4) {
        sq8.m48649h(str, "username");
        sq8.m48649h(weakReference, "callingActivity");
        this.username = str;
        this.callingActivity = weakReference;
        this.session = str2;
        this.requestJson = str3;
        this.responseJson = str4;
    }

    public static /* synthetic */ WebAuthnSignInContext copy$default(WebAuthnSignInContext webAuthnSignInContext, String str, WeakReference weakReference, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webAuthnSignInContext.username;
        }
        if ((i & 2) != 0) {
            weakReference = webAuthnSignInContext.callingActivity;
        }
        WeakReference weakReference2 = weakReference;
        if ((i & 4) != 0) {
            str2 = webAuthnSignInContext.session;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = webAuthnSignInContext.requestJson;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = webAuthnSignInContext.responseJson;
        }
        return webAuthnSignInContext.copy(str, weakReference2, str5, str6, str4);
    }

    public final String component1() {
        return this.username;
    }

    public final WeakReference<Activity> component2() {
        return this.callingActivity;
    }

    public final String component3() {
        return this.session;
    }

    public final String component4() {
        return this.requestJson;
    }

    public final String component5() {
        return this.responseJson;
    }

    public final WebAuthnSignInContext copy(String str, WeakReference<Activity> weakReference, String str2, String str3, String str4) {
        sq8.m48649h(str, "username");
        sq8.m48649h(weakReference, "callingActivity");
        return new WebAuthnSignInContext(str, weakReference, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAuthnSignInContext)) {
            return false;
        }
        WebAuthnSignInContext webAuthnSignInContext = (WebAuthnSignInContext) obj;
        return sq8.m48644c(this.username, webAuthnSignInContext.username) && sq8.m48644c(this.callingActivity, webAuthnSignInContext.callingActivity) && sq8.m48644c(this.session, webAuthnSignInContext.session) && sq8.m48644c(this.requestJson, webAuthnSignInContext.requestJson) && sq8.m48644c(this.responseJson, webAuthnSignInContext.responseJson);
    }

    public final WeakReference<Activity> getCallingActivity() {
        return this.callingActivity;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final String getResponseJson() {
        return this.responseJson;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = ((this.username.hashCode() * 31) + this.callingActivity.hashCode()) * 31;
        String str = this.session;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestJson;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.responseJson;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "WebAuthnSignInContext(username='" + this.username + "', callingActivity='" + this.callingActivity + "', session='" + MaskUtilKt.mask(this.session) + "', requestJson='" + MaskUtilKt.mask(this.requestJson) + "', responseJson='" + MaskUtilKt.mask(this.responseJson) + "')";
    }

    public /* synthetic */ WebAuthnSignInContext(String str, WeakReference weakReference, String str2, String str3, String str4, int i, id5 id5Var) {
        this(str, weakReference, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
