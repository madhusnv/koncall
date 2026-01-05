package com.amplifyframework.core.configuration;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AmplifyOutputsString implements AmplifyOutputs {
    private final String json;

    public AmplifyOutputsString(String json) {
        AbstractC4154l.m8923f(json, "json");
        this.json = json;
    }

    public static /* synthetic */ AmplifyOutputsString copy$default(AmplifyOutputsString amplifyOutputsString, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = amplifyOutputsString.json;
        }
        return amplifyOutputsString.copy(str);
    }

    public final String component1() {
        return this.json;
    }

    public final AmplifyOutputsString copy(String json) {
        AbstractC4154l.m8923f(json, "json");
        return new AmplifyOutputsString(json);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmplifyOutputsString) && AbstractC4154l.m8918a(this.json, ((AmplifyOutputsString) obj).json);
    }

    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return this.json.hashCode();
    }

    public String toString() {
        return AbstractC5601a.m11238i("AmplifyOutputsString(json=", this.json, ")");
    }
}
