package com.websoptimization.callyzerbiz.data.retrofit;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ApiException extends IOException {

    /* renamed from: a */
    public final String f7377a;

    public ApiException(String str) {
        super((Throwable) null);
        this.f7377a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiException) && AbstractC4154l.m8918a(this.f7377a, ((ApiException) obj).f7377a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7377a;
    }

    public final int hashCode() {
        return this.f7377a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC5601a.m11238i("ApiException(exception=null, error=", this.f7377a, ")");
    }
}
