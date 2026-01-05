package p001o;

import androidx.media3.common.C2181a;
import java.util.Objects;
import p001o.nf8;

/* loaded from: classes2.dex */
public interface qbg {

    /* renamed from: o.qbg$a */
    public interface InterfaceC16329a {

        /* renamed from: a */
        public static final InterfaceC16329a f41600a = new a();

        /* renamed from: o.qbg$a$a */
        public class a implements InterfaceC16329a {
            @Override // p001o.qbg.InterfaceC16329a
            /* renamed from: a */
            public boolean mo45062a(C2181a c2181a) {
                return false;
            }

            @Override // p001o.qbg.InterfaceC16329a
            /* renamed from: b */
            public int mo45063b(C2181a c2181a) {
                return 1;
            }

            @Override // p001o.qbg.InterfaceC16329a
            /* renamed from: c */
            public qbg mo45064c(C2181a c2181a) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        /* renamed from: a */
        boolean mo45062a(C2181a c2181a);

        /* renamed from: b */
        int mo45063b(C2181a c2181a);

        /* renamed from: c */
        qbg mo45064c(C2181a c2181a);
    }

    /* renamed from: o.qbg$b */
    public static class C16330b {

        /* renamed from: c */
        public static final C16330b f41601c = new C16330b(-9223372036854775807L, false);

        /* renamed from: a */
        public final long f41602a;

        /* renamed from: b */
        public final boolean f41603b;

        public C16330b(long j, boolean z) {
            this.f41602a = j;
            this.f41603b = z;
        }

        /* renamed from: b */
        public static C16330b m45066b() {
            return f41601c;
        }

        /* renamed from: c */
        public static C16330b m45067c(long j) {
            return new C16330b(j, true);
        }
    }

    /* renamed from: a */
    void mo29158a(byte[] bArr, int i, int i2, C16330b c16330b, fu3 fu3Var);

    /* renamed from: b */
    default gbg mo36355b(byte[] bArr, int i, int i2) {
        final nf8.C15566a c15566aM40508q = nf8.m40508q();
        C16330b c16330b = C16330b.f41601c;
        Objects.requireNonNull(c15566aM40508q);
        mo29158a(bArr, i, i2, c16330b, new fu3() { // from class: o.pbg
            @Override // p001o.fu3
            public final void accept(Object obj) {
                c15566aM40508q.mo32056a((jd4) obj);
            }
        });
        return new ld4(c15566aM40508q.m40520k());
    }

    /* renamed from: c */
    int mo29159c();

    default void reset() {
    }
}
