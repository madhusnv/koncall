package p001o;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class hef implements Serializable {

    /* renamed from: a */
    public final char f26746a;

    /* renamed from: b */
    public final char f26747b;

    /* renamed from: c */
    public final char f26748c;

    public hef() {
        this(':', ',', ',');
    }

    /* renamed from: a */
    public static hef m30311a() {
        return new hef();
    }

    /* renamed from: b */
    public char m30312b() {
        return this.f26748c;
    }

    /* renamed from: c */
    public char m30313c() {
        return this.f26747b;
    }

    /* renamed from: d */
    public char m30314d() {
        return this.f26746a;
    }

    public hef(char c, char c2, char c3) {
        this.f26746a = c;
        this.f26747b = c2;
        this.f26748c = c3;
    }
}
