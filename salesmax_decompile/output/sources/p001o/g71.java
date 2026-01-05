package p001o;

import p001o.h71;

/* loaded from: classes3.dex */
public abstract class g71 {

    /* renamed from: o.g71$a */
    public static final class C13631a implements h71.InterfaceC13880a {

        /* renamed from: a */
        public final y6f f24672a;

        public C13631a(y6f y6fVar) {
            this.f24672a = y6fVar;
        }

        @Override // p001o.h71.InterfaceC13880a
        public boolean isClosedForRead() {
            return this.f24672a.isClosedForRead();
        }

        @Override // p001o.h71.InterfaceC13880a
        public Object read(t6f t6fVar, long j, n64 n64Var) {
            return this.f24672a.read(t6fVar, j, n64Var);
        }
    }

    /* renamed from: b */
    public static final h71.InterfaceC13880a m28112b(y6f y6fVar) {
        return new C13631a(y6fVar);
    }
}
