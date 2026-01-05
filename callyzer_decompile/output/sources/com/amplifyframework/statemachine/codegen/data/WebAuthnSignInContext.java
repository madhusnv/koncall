package com.amplifyframework.statemachine.codegen.data;

import android.app.Activity;
import com.amplifyframework.statemachine.util.MaskUtilKt;
import com.sun.mail.util.AbstractC1452a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnSignInContext {
    private final WeakReference<Activity> callingActivity;
    private final String requestJson;
    private final String responseJson;
    private final String session;
    private final String username;

    public WebAuthnSignInContext(String username, WeakReference<Activity> callingActivity, String str, String str2, String str3) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        this.username = username;
        this.callingActivity = callingActivity;
        this.session = str;
        this.requestJson = str2;
        this.responseJson = str3;
    }

    public static /* synthetic */ WebAuthnSignInContext copy$default(WebAuthnSignInContext webAuthnSignInContext, String str, WeakReference weakReference, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webAuthnSignInContext.username;
        }
        if ((i10 & 2) != 0) {
            weakReference = webAuthnSignInContext.callingActivity;
        }
        if ((i10 & 4) != 0) {
            str2 = webAuthnSignInContext.session;
        }
        if ((i10 & 8) != 0) {
            str3 = webAuthnSignInContext.requestJson;
        }
        if ((i10 & 16) != 0) {
            str4 = webAuthnSignInContext.responseJson;
        }
        String str5 = str4;
        String str6 = str2;
        return webAuthnSignInContext.copy(str, weakReference, str6, str3, str5);
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

    public final WebAuthnSignInContext copy(String username, WeakReference<Activity> callingActivity, String str, String str2, String str3) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        return new WebAuthnSignInContext(username, callingActivity, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAuthnSignInContext)) {
            return false;
        }
        WebAuthnSignInContext webAuthnSignInContext = (WebAuthnSignInContext) obj;
        return AbstractC4154l.m8918a(this.username, webAuthnSignInContext.username) && AbstractC4154l.m8918a(this.callingActivity, webAuthnSignInContext.callingActivity) && AbstractC4154l.m8918a(this.session, webAuthnSignInContext.session) && AbstractC4154l.m8918a(this.requestJson, webAuthnSignInContext.requestJson) && AbstractC4154l.m8918a(this.responseJson, webAuthnSignInContext.responseJson);
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
        int iHashCode = (this.callingActivity.hashCode() + (this.username.hashCode() * 31)) * 31;
        String str = this.session;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestJson;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.responseJson;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.username;
        WeakReference<Activity> weakReference = this.callingActivity;
        String strMask = MaskUtilKt.mask(this.session);
        String strMask2 = MaskUtilKt.mask(this.requestJson);
        String strMask3 = MaskUtilKt.mask(this.responseJson);
        StringBuilder sb2 = new StringBuilder("WebAuthnSignInContext(username='");
        sb2.append(str);
        sb2.append("', callingActivity='");
        sb2.append(weakReference);
        sb2.append("', session='");
        a1.m14319B(sb2, strMask, "', requestJson='", strMask2, "', responseJson='");
        return AbstractC1452a.m4564k(sb2, strMask3, "')");
    }

    public /* synthetic */ WebAuthnSignInContext(String str, WeakReference weakReference, String str2, String str3, String str4, int i10, AbstractC4148f abstractC4148f) {
        this(str, weakReference, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4);
    }
}
