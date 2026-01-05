package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class BaseResponse<T> {

    @InterfaceC4485b("data")
    private final T data;

    @InterfaceC4485b("errorCode")
    private final int errorCode;

    @InterfaceC4485b("message")
    private final String message;

    public BaseResponse(T t7, String str, int i10) {
        this.data = t7;
        this.message = str;
        this.errorCode = i10;
    }

    /* renamed from: a */
    public final Object m4732a() {
        return this.data;
    }

    /* renamed from: b */
    public final int m4733b() {
        return this.errorCode;
    }

    /* renamed from: c */
    public final String m4734c() {
        return this.message;
    }

    /* renamed from: d */
    public final boolean m4735d() {
        return this.data == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        return AbstractC4154l.m8918a(this.data, baseResponse.data) && AbstractC4154l.m8918a(this.message, baseResponse.message) && this.errorCode == baseResponse.errorCode;
    }

    public final int hashCode() {
        T t7 = this.data;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        String str = this.message;
        return Integer.hashCode(this.errorCode) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        T t7 = this.data;
        String str = this.message;
        int i10 = this.errorCode;
        StringBuilder sb2 = new StringBuilder("BaseResponse(data=");
        sb2.append(t7);
        sb2.append(", message=");
        sb2.append(str);
        sb2.append(", errorCode=");
        return AbstractC5601a.m11233d(i10, ")", sb2);
    }

    public /* synthetic */ BaseResponse(Object obj, String str, int i10, int i11, AbstractC4148f abstractC4148f) {
        this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? null : str, i10);
    }
}
