package p001o;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class p1b extends z75 {

    /* renamed from: a */
    public final q1b f39176a;

    /* renamed from: b */
    public final String f39177b;

    /* renamed from: c */
    public final int f39178c;

    public p1b(Throwable th, q1b q1bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(q1bVar == null ? null : q1bVar.f41088a);
        super(sb.toString(), th);
        this.f39176a = q1bVar;
        int i = sqi.f45790a;
        String strM42866a = i >= 21 ? m42866a(th) : null;
        this.f39177b = strM42866a;
        this.f39178c = i >= 23 ? m42867b(th) : sqi.m48721Z(strM42866a);
    }

    /* renamed from: a */
    public static String m42866a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static int m42867b(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
