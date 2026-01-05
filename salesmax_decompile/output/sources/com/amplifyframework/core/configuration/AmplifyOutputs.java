package com.amplifyframework.core.configuration;

import p001o.sq8;

/* loaded from: classes5.dex */
public interface AmplifyOutputs {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AmplifyOutputs fromResource(int i) {
            return new AmplifyOutputsResource(i);
        }

        public final AmplifyOutputs fromString(String str) {
            sq8.m48649h(str, "json");
            return new AmplifyOutputsString(str);
        }
    }

    static AmplifyOutputs fromResource(int i) {
        return Companion.fromResource(i);
    }

    static AmplifyOutputs fromString(String str) {
        return Companion.fromString(str);
    }
}
