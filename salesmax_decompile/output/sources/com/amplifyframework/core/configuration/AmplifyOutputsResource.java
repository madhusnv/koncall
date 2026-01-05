package com.amplifyframework.core.configuration;

/* loaded from: classes5.dex */
public final class AmplifyOutputsResource implements AmplifyOutputs {
    private final int resourceId;

    public AmplifyOutputsResource(int i) {
        this.resourceId = i;
    }

    public static /* synthetic */ AmplifyOutputsResource copy$default(AmplifyOutputsResource amplifyOutputsResource, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = amplifyOutputsResource.resourceId;
        }
        return amplifyOutputsResource.copy(i);
    }

    public final int component1() {
        return this.resourceId;
    }

    public final AmplifyOutputsResource copy(int i) {
        return new AmplifyOutputsResource(i);
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
        return "AmplifyOutputsResource(resourceId=" + this.resourceId + ")";
    }
}
