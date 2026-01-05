package p001o;

import p001o.h71;

/* loaded from: classes3.dex */
public abstract class j71 {

    /* renamed from: o.j71$a */
    public static final class C14461a implements h71.InterfaceC13880a {

        /* renamed from: a */
        public final v6f f29873a;

        public C14461a(h8f h8fVar) {
            this.f29873a = m7f.m38493b(h8fVar);
        }

        @Override // p001o.h71.InterfaceC13880a
        public boolean isClosedForRead() {
            return this.f29873a.mo49493n();
        }

        @Override // p001o.h71.InterfaceC13880a
        public Object read(t6f t6fVar, long j, n64 n64Var) {
            return ml1.m39305e(this.f29873a.read(t6fVar, j));
        }
    }

    /* renamed from: b */
    public static final h71.InterfaceC13880a m33321b(h8f h8fVar) {
        return new C14461a(h8fVar);
    }
}
