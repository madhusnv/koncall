package p001o;

import java.util.Objects;

/* loaded from: classes.dex */
public class od8 {

    /* renamed from: a */
    public String f38144a;

    /* renamed from: b */
    public String f38145b;

    /* renamed from: c */
    public String f38146c;

    /* renamed from: a */
    public String m42072a() {
        return this.f38144a;
    }

    /* renamed from: b */
    public void m42073b(String str) {
        this.f38144a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38144a, ((od8) obj).f38144a);
    }

    public int hashCode() {
        return Objects.hash(this.f38144a);
    }

    public String toString() {
        return "ImageModel{id='" + this.f38144a + "', localPath='" + this.f38145b + "', bucketName='" + this.f38146c + "'}";
    }
}
