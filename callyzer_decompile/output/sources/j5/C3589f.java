package j5;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.f */
/* loaded from: classes.dex */
public final class C3589f implements Comparable {

    /* renamed from: a */
    public C3592i f19185a;

    /* renamed from: b */
    public final /* synthetic */ C3590g f19186b;

    public C3589f(C3590g c3590g) {
        this.f19186b = c3590g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19185a.f19192b - ((C3592i) obj).f19192b;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f19185a != null) {
            for (int i10 = 0; i10 < 9; i10++) {
                StringBuilder sbM4568o = AbstractC1452a.m4568o(string);
                sbM4568o.append(this.f19185a.f19198h[i10]);
                sbM4568o.append(" ");
                string = sbM4568o.toString();
            }
        }
        StringBuilder sbM11245p = AbstractC5601a.m11245p(string, "] ");
        sbM11245p.append(this.f19185a);
        return sbM11245p.toString();
    }
}
