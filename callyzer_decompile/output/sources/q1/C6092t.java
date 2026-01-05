package q1;

import com.skydoves.balloon.internals.DefinitionKt;
import k2.b1;
import n1.AbstractC4941a;
import org.bouncycastle.asn1.x509.DisplayText;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.t */
/* loaded from: classes.dex */
public final class C6092t {

    /* renamed from: a */
    public final /* synthetic */ int f29751a;

    /* renamed from: b */
    public final b1 f29752b;

    /* renamed from: c */
    public final b1 f29753c;

    /* renamed from: d */
    public boolean f29754d;

    /* renamed from: e */
    public Object f29755e;

    /* renamed from: f */
    public final s1.c0 f29756f;

    public C6092t(int i10, int i11, int i12) {
        this.f29751a = i12;
        switch (i12) {
            case 1:
                this.f29752b = new b1(i10);
                this.f29753c = new b1(i11);
                this.f29756f = new s1.c0(i10, 90, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
                break;
            default:
                this.f29752b = new b1(i10);
                this.f29753c = new b1(i11);
                this.f29756f = new s1.c0(i10, 30, 100);
                break;
        }
    }

    /* renamed from: a */
    public final void m12125a(int i10, int i11) {
        switch (this.f29751a) {
            case 0:
                if (i10 < DefinitionKt.NO_Float_VALUE) {
                    AbstractC4941a.m9884a("Index should be non-negative (" + i10 + ')');
                }
                this.f29752b.m8527g(i10);
                this.f29756f.m12843b(i10);
                this.f29753c.m8527g(i11);
                break;
            default:
                if (i10 < DefinitionKt.NO_Float_VALUE) {
                    AbstractC4941a.m9884a("Index should be non-negative");
                }
                this.f29752b.m8527g(i10);
                this.f29756f.m12843b(i10);
                this.f29753c.m8527g(i11);
                break;
        }
    }
}
