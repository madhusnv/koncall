package com.amplifyframework.core.configuration;

import p001o.sq8;

/* loaded from: classes5.dex */
public final class AmplifyOutputsString implements AmplifyOutputs {
    private final String json;

    public AmplifyOutputsString(String str) {
        sq8.m48649h(str, "json");
        this.json = str;
    }

    public static /* synthetic */ AmplifyOutputsString copy$default(AmplifyOutputsString amplifyOutputsString, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amplifyOutputsString.json;
        }
        return amplifyOutputsString.copy(str);
    }

    public final String component1() {
        return this.json;
    }

    public final AmplifyOutputsString copy(String str) {
        sq8.m48649h(str, "json");
        return new AmplifyOutputsString(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmplifyOutputsString) && sq8.m48644c(this.json, ((AmplifyOutputsString) obj).json);
    }

    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return this.json.hashCode();
    }

    public String toString() {
        return "AmplifyOutputsString(json=" + this.json + ")";
    }
}
