package com.amplifyframework.core.configuration;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AmplifyOutputsResource implements AmplifyOutputs {
    private final int resourceId;

    public AmplifyOutputsResource(int i10) {
        this.resourceId = i10;
    }

    public static /* synthetic */ AmplifyOutputsResource copy$default(AmplifyOutputsResource amplifyOutputsResource, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = amplifyOutputsResource.resourceId;
        }
        return amplifyOutputsResource.copy(i10);
    }

    public final int component1() {
        return this.resourceId;
    }

    public final AmplifyOutputsResource copy(int i10) {
        return new AmplifyOutputsResource(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmplifyOutputsResource) && this.resourceId == ((AmplifyOutputsResource) obj).resourceId;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    public int hashCode() {
        return Integer.hashCode(this.resourceId);
    }

    public String toString() {
        return AbstractC5601a.m11232c(this.resourceId, "AmplifyOutputsResource(resourceId=", ")");
    }
}
