package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public class b38 extends RuntimeException {

    /* renamed from: a */
    public final int f15506a;

    /* renamed from: b */
    public final String f15507b;

    /* renamed from: c */
    public final transient bre f15508c;

    public b38(bre breVar) {
        super(m18139a(breVar));
        this.f15506a = breVar.m19664b();
        this.f15507b = breVar.m19666e();
        this.f15508c = breVar;
    }

    /* renamed from: a */
    public static String m18139a(bre breVar) {
        Objects.requireNonNull(breVar, "response == null");
        return "HTTP " + breVar.m19664b() + " " + breVar.m19666e();
    }
}
