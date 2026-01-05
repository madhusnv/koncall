package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class bre {

    /* renamed from: a */
    public final zqe f16734a;

    /* renamed from: b */
    public final Object f16735b;

    /* renamed from: c */
    public final cre f16736c;

    public bre(zqe zqeVar, Object obj, cre creVar) {
        this.f16734a = zqeVar;
        this.f16735b = obj;
        this.f16736c = creVar;
    }

    /* renamed from: c */
    public static bre m19661c(cre creVar, zqe zqeVar) {
        Objects.requireNonNull(creVar, "body == null");
        Objects.requireNonNull(zqeVar, "rawResponse == null");
        if (zqeVar.U0()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new bre(zqeVar, null, creVar);
    }

    /* renamed from: f */
    public static bre m19662f(Object obj, zqe zqeVar) {
        Objects.requireNonNull(zqeVar, "rawResponse == null");
        if (zqeVar.U0()) {
            return new bre(zqeVar, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m19663a() {
        return this.f16735b;
    }

    /* renamed from: b */
    public int m19664b() {
        return this.f16734a.m59739h();
    }

    /* renamed from: d */
    public boolean m19665d() {
        return this.f16734a.U0();
    }

    /* renamed from: e */
    public String m19666e() {
        return this.f16734a.m59726C();
    }

    public String toString() {
        return this.f16734a.toString();
    }
}
