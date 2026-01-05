package com.amplifyframework.core.configuration;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AmplifyOutputs {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AmplifyOutputs fromResource(int i10) {
            return new AmplifyOutputsResource(i10);
        }

        public final AmplifyOutputs fromString(String json) {
            AbstractC4154l.m8923f(json, "json");
            return new AmplifyOutputsString(json);
        }
    }

    static AmplifyOutputs fromResource(int i10) {
        return Companion.fromResource(i10);
    }

    static AmplifyOutputs fromString(String str) {
        return Companion.fromString(str);
    }
}
