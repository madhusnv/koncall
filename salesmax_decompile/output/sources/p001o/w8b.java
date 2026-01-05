package p001o;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class w8b implements q8b {

    /* renamed from: a */
    public String f51610a;

    /* renamed from: b */
    public int f51611b;

    /* renamed from: c */
    public int f51612c;

    public w8b(String str, int i, int i2) {
        this.f51610a = str;
        this.f51611b = i;
        this.f51612c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8b)) {
            return false;
        }
        w8b w8bVar = (w8b) obj;
        return (this.f51611b < 0 || w8bVar.f51611b < 0) ? TextUtils.equals(this.f51610a, w8bVar.f51610a) && this.f51612c == w8bVar.f51612c : TextUtils.equals(this.f51610a, w8bVar.f51610a) && this.f51611b == w8bVar.f51611b && this.f51612c == w8bVar.f51612c;
    }

    public int hashCode() {
        return s6c.m47910b(this.f51610a, Integer.valueOf(this.f51612c));
    }
}
