package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class uv implements bm7, Serializable {

    /* renamed from: a */
    public final Object f49525a;

    /* renamed from: b */
    public final Class f49526b;

    /* renamed from: c */
    public final String f49527c;

    /* renamed from: d */
    public final String f49528d;

    /* renamed from: e */
    public final boolean f49529e;

    /* renamed from: f */
    public final int f49530f;

    /* renamed from: g */
    public final int f49531g;

    public uv(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f49525a = obj;
        this.f49526b = cls;
        this.f49527c = str;
        this.f49528d = str2;
        this.f49529e = (i2 & 1) == 1;
        this.f49530f = i;
        this.f49531g = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        return this.f49529e == uvVar.f49529e && this.f49530f == uvVar.f49530f && this.f49531g == uvVar.f49531g && sq8.m48644c(this.f49525a, uvVar.f49525a) && sq8.m48644c(this.f49526b, uvVar.f49526b) && this.f49527c.equals(uvVar.f49527c) && this.f49528d.equals(uvVar.f49528d);
    }

    @Override // p001o.bm7
    public int getArity() {
        return this.f49530f;
    }

    public int hashCode() {
        Object obj = this.f49525a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f49526b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f49527c.hashCode()) * 31) + this.f49528d.hashCode()) * 31) + (this.f49529e ? 1231 : 1237)) * 31) + this.f49530f) * 31) + this.f49531g;
    }

    public String toString() {
        return kge.m35694g(this);
    }
}
