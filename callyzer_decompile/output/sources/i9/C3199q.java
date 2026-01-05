package i9;

import b2.C0554l;
import ea.C1973c;
import ec.InterfaceC2004b;
import ia.C3211c;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import nd.EnumC5011b;
import og.gf;
import og.u1;
import sb.InterfaceC6775b;
import sb.InterfaceC6777d;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.q */
/* loaded from: classes.dex */
public final class C3199q implements InterfaceC6775b {

    /* renamed from: a */
    public final boolean f17237a;

    /* renamed from: b */
    public final C3211c f17238b;

    /* renamed from: c */
    public final C4367l f17239c;

    /* renamed from: d */
    public final C4367l f17240d;

    /* renamed from: e */
    public EnumC3197o f17241e;

    /* renamed from: f */
    public InterfaceC6777d f17242f;

    /* renamed from: g */
    public String f17243g;

    /* renamed from: h */
    public final C0554l f17244h;

    public C3199q(C3211c c3211c, InterfaceC7411o platformProvider) {
        AbstractC4154l.m8923f(platformProvider, "platformProvider");
        this.f17237a = false;
        this.f17238b = c3211c;
        InterfaceC7559c interfaceC7559c = null;
        this.f17239c = new C4367l(new C1973c(platformProvider, interfaceC7559c, 1));
        this.f17240d = new C4367l(new C1973c(platformProvider, interfaceC7559c, 2));
        this.f17244h = new C0554l((byte) 0, 12);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17237a) {
            this.f17238b.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f A[Catch: Exception -> 0x007c, IOException -> 0x0080, EC2MetadataError -> 0x0083, TryCatch #4 {EC2MetadataError -> 0x0083, IOException -> 0x0080, Exception -> 0x007c, blocks: (B:21:0x0077, B:107:0x01bc, B:101:0x0196, B:103:0x019f, B:104:0x01a1), top: B:169:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bc A[Catch: Exception -> 0x007c, IOException -> 0x0080, EC2MetadataError -> 0x0083, PHI: r0 r2
      0x01bc: PHI (r0v62 java.lang.Object) = (r0v59 java.lang.Object), (r0v3 java.lang.Object) binds: [B:105:0x01b8, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r2v20 ??) = (r2v30 ??), (r2v31 ??) binds: [B:105:0x01b8, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {EC2MetadataError -> 0x0083, IOException -> 0x0080, Exception -> 0x007c, blocks: (B:21:0x0077, B:107:0x01bc, B:101:0x0196, B:103:0x019f, B:104:0x01a1), top: B:169:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[Catch: Exception -> 0x00a1, IOException -> 0x00a4, EC2MetadataError -> 0x00a6, TryCatch #3 {EC2MetadataError -> 0x00a6, IOException -> 0x00a4, Exception -> 0x00a1, blocks: (B:32:0x009d, B:60:0x00f1, B:62:0x00f8, B:63:0x00fc, B:54:0x00dc, B:56:0x00e0, B:57:0x00e2), top: B:169:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7550h(uw.InterfaceC7559c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3199q.m7550h(uw.c):java.lang.Object");
    }

    /* renamed from: j */
    public final InterfaceC6777d m7551j(C3198p c3198p) {
        InterfaceC6777d interfaceC6777d = this.f17242f;
        if (interfaceC6777d == null) {
            return null;
        }
        InterfaceC7564h context = c3198p.getContext();
        C3185c c3185c = new C3185c(interfaceC6777d, 1);
        EnumC5011b enumC5011b = EnumC5011b.Info;
        String strM8913b = kotlin.jvm.internal.a0.m8901a(C3199q.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        u1.m10948g(context, enumC5011b, strM8913b, null, c3185c);
        return interfaceC6777d;
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        int i10 = 1;
        Class<C3199q> cls = C3199q.class;
        String str = "resolveSingleFlight";
        String str2 = "resolveSingleFlight(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
        return this.f17244h.m1643m(new C3183a(i10, this, cls, str, str2, 0, 2), (AbstractC8193c) interfaceC7559c);
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
