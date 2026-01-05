package yi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import wi.AbstractC8057g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.m */
/* loaded from: classes.dex */
public final class C8684m implements InterfaceC8675d {

    /* renamed from: c */
    public static final Charset f42032c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f42033a;

    /* renamed from: b */
    public C8683l f42034b;

    public C8684m(File file) {
        this.f42033a = file;
    }

    @Override // yi.InterfaceC8675d
    /* renamed from: b */
    public final void mo13824b() throws IOException {
        AbstractC8057g.m15188b(this.f42034b);
        this.f42034b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // yi.InterfaceC8675d
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo13825c() {
        /*
            r6 = this;
            java.io.File r0 = r6.f42033a
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Lc
        La:
            r4 = r3
            goto L3d
        Lc:
            yi.l r1 = r6.f42034b
            if (r1 != 0) goto L1b
            yi.l r1 = new yi.l     // Catch: java.io.IOException -> L18
            r1.<init>(r0)     // Catch: java.io.IOException -> L18
            r6.f42034b = r1     // Catch: java.io.IOException -> L18
            goto L1b
        L18:
            java.util.Objects.toString(r0)
        L1b:
            yi.l r0 = r6.f42034b
            if (r0 != 0) goto L20
            goto La
        L20:
            int[] r1 = new int[]{r2}
            int r0 = r0.m16026P()
            byte[] r0 = new byte[r0]
            yi.l r4 = r6.f42034b     // Catch: java.io.IOException -> L34
            yi.f r5 = new yi.f     // Catch: java.io.IOException -> L34
            r5.<init>(r0, r1)     // Catch: java.io.IOException -> L34
            r4.m16031n(r5)     // Catch: java.io.IOException -> L34
        L34:
            ee.g r4 = new ee.g
            r1 = r1[r2]
            r5 = 12
            r4.<init>(r0, r1, r5)
        L3d:
            if (r4 != 0) goto L41
            r1 = r3
            goto L4c
        L41:
            int r0 = r4.f9605b
            byte[] r1 = new byte[r0]
            java.lang.Object r4 = r4.f9606c
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r1, r2, r0)
        L4c:
            if (r1 == 0) goto L56
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r2 = yi.C8684m.f42032c
            r0.<init>(r1, r2)
            return r0
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.C8684m.mo13825c():java.lang.String");
    }

    @Override // yi.InterfaceC8675d
    /* renamed from: e */
    public final void mo13826e(String str, long j6) {
        File file = this.f42033a;
        if (this.f42034b == null) {
            try {
                this.f42034b = new C8683l(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.f42034b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f42034b.m16029h(String.format(Locale.US, "%d %s%n", Long.valueOf(j6), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f42032c));
            while (!this.f42034b.m16032u() && this.f42034b.m16026P() > 65536) {
                this.f42034b.m16023A();
            }
        } catch (IOException unused2) {
        }
    }
}
