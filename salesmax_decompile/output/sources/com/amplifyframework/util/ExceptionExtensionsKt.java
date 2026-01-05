package com.amplifyframework.util;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ExceptionExtensionsKt {
    @InternalAmplifyApi
    public static final /* synthetic */ <T extends Throwable> void throwIf(Exception exc) throws Exception {
        sq8.m48655n(3, "T");
        if (exc instanceof Throwable) {
            throw exc;
        }
    }
}
