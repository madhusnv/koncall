package og;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c9.C0917l;
import ex.InterfaceC2137a;
import fk.C2310p;
import hq.C3012q;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import mq.C4833a;
import t2.AbstractC7013l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p1 {
    /* renamed from: a */
    public static void m10811a(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC4154l.m8923f(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
    }

    /* renamed from: b */
    public static final byte[] m10812b(FileInputStream fileInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, fileInputStream.available()));
        m10811a(fileInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC4154l.m8922e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* renamed from: c */
    public static final l7.a0 m10813c(l7.n0[] n0VarArr, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        Object[] objArrCopyOf = Arrays.copyOf(n0VarArr, n0VarArr.length);
        C3012q c3012q = new C3012q(13);
        C4833a c4833a = new C4833a(1, context);
        C0917l c0917l = AbstractC7013l.f33949a;
        C0917l c0917l2 = new C0917l(16, c3012q, c4833a);
        boolean zM8616i = c3966o.m8616i(context);
        Object objM8596M = c3966o.m8596M();
        if (zM8616i || objM8596M == C3961j.f20408a) {
            objM8596M = new C2310p(context, 2);
            c3966o.j0(objM8596M);
        }
        l7.a0 a0Var = (l7.a0) hg.m10691b(objArrCopyOf, c0917l2, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
        for (l7.n0 n0Var : n0VarArr) {
            a0Var.f21996b.f29925s.m9232a(n0Var);
        }
        return a0Var;
    }
}
