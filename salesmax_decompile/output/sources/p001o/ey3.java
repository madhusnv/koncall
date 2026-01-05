package p001o;

import ai.salesmax.model.CallEvent;

/* loaded from: classes.dex */
public final class ey3 {

    /* renamed from: a */
    public String f22372a;

    /* renamed from: b */
    public String f22373b;

    /* renamed from: c */
    public String f22374c;

    /* renamed from: d */
    public Integer f22375d;

    /* renamed from: e */
    public boolean f22376e;

    /* renamed from: f */
    public Integer f22377f;

    /* renamed from: g */
    public CallEvent.PhoneHandle f22378g;

    public ey3(String str, String str2, String str3, Integer num, boolean z, Integer num2, CallEvent.PhoneHandle phoneHandle) {
        sq8.m48649h(str, "number");
        this.f22372a = str;
        this.f22373b = str2;
        this.f22374c = str3;
        this.f22375d = num;
        this.f22376e = z;
        this.f22377f = num2;
        this.f22378g = phoneHandle;
    }

    /* renamed from: a */
    public final String m25835a() {
        return this.f22373b;
    }

    /* renamed from: b */
    public final String m25836b() {
        return this.f22372a;
    }

    /* renamed from: c */
    public final CallEvent.PhoneHandle m25837c() {
        return this.f22378g;
    }

    /* renamed from: d */
    public final boolean m25838d() {
        return this.f22376e;
    }

    /* renamed from: e */
    public final Integer m25839e() {
        return this.f22377f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey3)) {
            return false;
        }
        ey3 ey3Var = (ey3) obj;
        return sq8.m48644c(this.f22372a, ey3Var.f22372a) && sq8.m48644c(this.f22373b, ey3Var.f22373b) && sq8.m48644c(this.f22374c, ey3Var.f22374c) && sq8.m48644c(this.f22375d, ey3Var.f22375d) && this.f22376e == ey3Var.f22376e && sq8.m48644c(this.f22377f, ey3Var.f22377f) && sq8.m48644c(this.f22378g, ey3Var.f22378g);
    }

    /* renamed from: f */
    public final String m25840f() {
        return this.f22374c;
    }

    /* renamed from: g */
    public final Integer m25841g() {
        return this.f22375d;
    }

    /* renamed from: h */
    public final void m25842h(String str) {
        this.f22374c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f22372a.hashCode() * 31;
        String str = this.f22373b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22374c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f22375d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f22376e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode4 + i) * 31;
        Integer num2 = this.f22377f;
        int iHashCode5 = (i2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CallEvent.PhoneHandle phoneHandle = this.f22378g;
        return iHashCode5 + (phoneHandle != null ? phoneHandle.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m25843i(Integer num) {
        this.f22375d = num;
    }

    public String toString() {
        return "ContactNumber(number=" + this.f22372a + ", name=" + this.f22373b + ", source=" + this.f22374c + ", subscriptionId=" + this.f22375d + ", refresh=" + this.f22376e + ", simSlotIndex=" + this.f22377f + ", phoneHandle=" + this.f22378g + ")";
    }

    public /* synthetic */ ey3(String str, String str2, String str3, Integer num, boolean z, Integer num2, CallEvent.PhoneHandle phoneHandle, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? phoneHandle : null);
    }
}
