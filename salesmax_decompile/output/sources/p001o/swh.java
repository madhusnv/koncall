package p001o;

import java.util.Set;

/* loaded from: classes5.dex */
public final class swh implements rwh {

    /* renamed from: a */
    public final Set f46044a;

    /* renamed from: b */
    public final qwh f46045b;

    /* renamed from: c */
    public final vwh f46046c;

    public swh(Set set, qwh qwhVar, vwh vwhVar) {
        this.f46044a = set;
        this.f46045b = qwhVar;
        this.f46046c = vwhVar;
    }

    @Override // p001o.rwh
    /* renamed from: a */
    public owh mo47214a(String str, Class cls, n76 n76Var, dvh dvhVar) {
        if (this.f46044a.contains(n76Var)) {
            return new uwh(this.f46045b, str, n76Var, dvhVar, this.f46046c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", n76Var, this.f46044a));
    }
}
