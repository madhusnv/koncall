package qr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f30531a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f30532b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f30533c;

    public /* synthetic */ e0(int i10, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c) {
        this.f30531a = i10;
        this.f30532b = interfaceC2137a;
        this.f30533c = interfaceC2139c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f30531a
            switch(r0) {
                case 0: goto La1;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "screenName"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r0)
            ex.a r0 = r3.f30532b
            r0.invoke()
            ex.c r0 = r3.f30533c
            r0.invoke(r4)
        L16:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L19:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "result"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L9e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L2d
            goto L99
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L7c
            r1 = 29
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r0 >= r1) goto L66
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L99
            java.lang.Object r0 = r4.get(r2)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L99
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r4.get(r0)
            if (r1 == 0) goto L99
            java.lang.Object r0 = r4.get(r0)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L99
            goto L93
        L66:
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L99
            java.lang.Object r0 = r4.get(r2)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L99
            goto L93
        L7c:
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            java.lang.Object r1 = r4.get(r0)
            if (r1 == 0) goto L99
            java.lang.Object r0 = r4.get(r0)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L99
        L93:
            ex.a r4 = r3.f30532b
            r4.invoke()
            goto L9e
        L99:
            ex.c r0 = r3.f30533c
            r0.invoke(r4)
        L9e:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        La1:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            ur.o r0 = new ur.o
            r0.<init>(r4)
            ex.c r4 = r3.f30533c
            r4.invoke(r0)
            ex.a r4 = r3.f30532b
            r4.invoke()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.e0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e0(InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c) {
        this.f30531a = 0;
        this.f30533c = interfaceC2139c;
        this.f30532b = interfaceC2137a;
    }
}
