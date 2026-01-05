package ug;

import ai.AbstractC0151h;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35915a = 1;

    /* renamed from: b */
    public final URL f35916b;

    /* renamed from: c */
    public final byte[] f35917c;

    /* renamed from: d */
    public final String f35918d;

    /* renamed from: e */
    public final Map f35919e;

    /* renamed from: f */
    public final Object f35920f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC0151h f35921g;

    public x0(y0 y0Var, String str, URL url, byte[] bArr, Map map, w0 w0Var) {
        Objects.requireNonNull(y0Var);
        this.f35921g = y0Var;
        AbstractC6840z.m13033d(str);
        AbstractC6840z.m13036g(url);
        this.f35916b = url;
        this.f35917c = bArr;
        this.f35920f = w0Var;
        this.f35918d = str;
        this.f35919e = map;
    }

    /* renamed from: a */
    public void m14184a(int i10, IOException iOException, byte[] bArr, Map map) {
        m1 m1Var = ((n1) ((t2) this.f35921g).f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new androidx.fragment.app.b2(this, i10, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.x0.run():void");
    }

    public x0(t2 t2Var, String str, URL url, byte[] bArr, HashMap map, s2 s2Var) {
        Objects.requireNonNull(t2Var);
        this.f35921g = t2Var;
        AbstractC6840z.m13033d(str);
        this.f35916b = url;
        this.f35917c = bArr;
        this.f35920f = s2Var;
        this.f35918d = str;
        this.f35919e = map;
    }
}
