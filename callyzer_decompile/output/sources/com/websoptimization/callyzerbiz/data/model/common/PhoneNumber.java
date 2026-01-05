package com.websoptimization.callyzerbiz.data.model.common;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class PhoneNumber {

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("number")
    private final String number;

    public PhoneNumber(String number, int i10) {
        AbstractC4154l.m8923f(number, "number");
        this.number = number;
        this.countryCode = i10;
    }

    /* renamed from: a */
    public final String m4616a() {
        return this.countryCode + this.number;
    }

    /* renamed from: b */
    public final String m4617b() {
        return AbstractC5601a.m11232c(this.countryCode, "+", this.number);
    }

    /* renamed from: c */
    public final String m4618c() {
        return this.number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        return AbstractC4154l.m8918a(this.number, phoneNumber.number) && this.countryCode == phoneNumber.countryCode;
    }

    public final int hashCode() {
        return Integer.hashCode(this.countryCode) + (this.number.hashCode() * 31);
    }

    public final String toString() {
        return "PhoneNumber(number=" + this.number + ", countryCode=" + this.countryCode + ")";
    }
}
