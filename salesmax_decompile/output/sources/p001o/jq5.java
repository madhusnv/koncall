package p001o;

import java.util.List;

/* loaded from: classes.dex */
public final class jq5 {

    /* renamed from: a */
    public final String f30945a;

    /* renamed from: b */
    public final String f30946b;

    /* renamed from: c */
    public final String f30947c;

    /* renamed from: d */
    public final String f30948d;

    /* renamed from: e */
    public final String f30949e;

    /* renamed from: f */
    public final Integer f30950f;

    /* renamed from: g */
    public final String f30951g;

    /* renamed from: h */
    public final List f30952h;

    public jq5(String str, String str2, String str3, String str4, String str5, Integer num, String str6, List list) {
        this.f30945a = str;
        this.f30946b = str2;
        this.f30947c = str3;
        this.f30948d = str4;
        this.f30949e = str5;
        this.f30950f = num;
        this.f30951g = str6;
        this.f30952h = list;
    }

    /* renamed from: a */
    public final String m34271a() {
        return this.f30947c;
    }

    /* renamed from: b */
    public final String m34272b() {
        return this.f30949e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq5)) {
            return false;
        }
        jq5 jq5Var = (jq5) obj;
        return sq8.m48644c(this.f30945a, jq5Var.f30945a) && sq8.m48644c(this.f30946b, jq5Var.f30946b) && sq8.m48644c(this.f30947c, jq5Var.f30947c) && sq8.m48644c(this.f30948d, jq5Var.f30948d) && sq8.m48644c(this.f30949e, jq5Var.f30949e) && sq8.m48644c(this.f30950f, jq5Var.f30950f) && sq8.m48644c(this.f30951g, jq5Var.f30951g) && sq8.m48644c(this.f30952h, jq5Var.f30952h);
    }

    public int hashCode() {
        String str = this.f30945a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30946b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30947c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30948d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30949e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f30950f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f30951g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.f30952h;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Device(deviceId=" + this.f30945a + ", manufacturer=" + this.f30946b + ", model=" + this.f30947c + ", brand=" + this.f30948d + ", osVersion=" + this.f30949e + ", sdkVersion=" + this.f30950f + ", hardware=" + this.f30951g + ", supportedAbi=" + this.f30952h + ")";
    }
}
