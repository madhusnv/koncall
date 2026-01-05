package p001o;

import androidx.media3.common.C2181a;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface jbg {

    /* renamed from: a */
    public static final jbg f30124a = new C14492a();

    /* renamed from: o.jbg$a */
    public class C14492a implements jbg {

        /* renamed from: b */
        public final uh5 f30125b = new uh5();

        @Override // p001o.jbg
        /* renamed from: a */
        public boolean mo33493a(C2181a c2181a) {
            String str = c2181a.f7943n;
            return this.f30125b.mo45062a(c2181a) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // p001o.jbg
        /* renamed from: b */
        public hbg mo33494b(C2181a c2181a) {
            String str = c2181a.f7943n;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new xe2(str, c2181a.f7924G, 16000L);
                    case "application/cea-708":
                        return new ze2(c2181a.f7924G, c2181a.f7946q);
                }
            }
            if (!this.f30125b.mo45062a(c2181a)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            qbg qbgVarMo45064c = this.f30125b.mo45064c(c2181a);
            return new uk5(qbgVarMo45064c.getClass().getSimpleName() + "Decoder", qbgVarMo45064c);
        }
    }

    /* renamed from: a */
    boolean mo33493a(C2181a c2181a);

    /* renamed from: b */
    hbg mo33494b(C2181a c2181a);
}
