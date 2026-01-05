package p001o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC10730a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p001o.is7;

/* loaded from: classes5.dex */
public class dq1 implements ioe {

    /* renamed from: f */
    public static final C13014a f20393f = new C13014a();

    /* renamed from: g */
    public static final C13015b f20394g = new C13015b();

    /* renamed from: a */
    public final Context f20395a;

    /* renamed from: b */
    public final List f20396b;

    /* renamed from: c */
    public final C13015b f20397c;

    /* renamed from: d */
    public final C13014a f20398d;

    /* renamed from: e */
    public final hs7 f20399e;

    /* renamed from: o.dq1$a */
    public static class C13014a {
        /* renamed from: a */
        public is7 m23673a(is7.InterfaceC14363a interfaceC14363a, rs7 rs7Var, ByteBuffer byteBuffer, int i) {
            return new k3g(interfaceC14363a, rs7Var, byteBuffer, i);
        }
    }

    /* renamed from: o.dq1$b */
    public static class C13015b {

        /* renamed from: a */
        public final Queue f20400a = uqi.m51924e(0);

        /* renamed from: a */
        public synchronized ss7 m23674a(ByteBuffer byteBuffer) {
            ss7 ss7Var;
            ss7Var = (ss7) this.f20400a.poll();
            if (ss7Var == null) {
                ss7Var = new ss7();
            }
            return ss7Var.m48850p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m23675b(ss7 ss7Var) {
            ss7Var.m48835a();
            this.f20400a.offer(ss7Var);
        }
    }

    public dq1(Context context, List list, mi1 mi1Var, wo0 wo0Var) {
        this(context, list, mi1Var, wo0Var, f20394g, f20393f);
    }

    /* renamed from: e */
    public static int m23669e(rs7 rs7Var, int i, int i2) {
        int iMin = Math.min(rs7Var.m47132a() / i2, rs7Var.m47135d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(iMax);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(rs7Var.m47135d());
            sb.append("x");
            sb.append(rs7Var.m47132a());
            sb.append("]");
        }
        return iMax;
    }

    /* renamed from: c */
    public final ms7 m23670c(ByteBuffer byteBuffer, int i, int i2, ss7 ss7Var, rec recVar) {
        long jM37350b = lja.m37350b();
        try {
            rs7 rs7VarM48837c = ss7Var.m48837c();
            if (rs7VarM48837c.m47133b() > 0 && rs7VarM48837c.m47134c() == 0) {
                Bitmap.Config config = recVar.m46585c(ts7.f47669a) == s75.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                is7 is7VarM23673a = this.f20398d.m23673a(this.f20399e, rs7VarM48837c, byteBuffer, m23669e(rs7VarM48837c, i, i2));
                is7VarM23673a.mo32676d(config);
                is7VarM23673a.mo32674b();
                Bitmap bitmapMo32673a = is7VarM23673a.mo32673a();
                if (bitmapMo32673a == null) {
                    return null;
                }
                ms7 ms7Var = new ms7(new js7(this.f20395a, is7VarM23673a, f4i.m26071c(), i, i2, bitmapMo32673a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Decoded GIF from stream in ");
                    sb.append(lja.m37349a(jM37350b));
                }
                return ms7Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Decoded GIF from stream in ");
                sb2.append(lja.m37349a(jM37350b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(lja.m37349a(jM37350b));
            }
        }
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ms7 mo16416b(ByteBuffer byteBuffer, int i, int i2, rec recVar) {
        ss7 ss7VarM23674a = this.f20397c.m23674a(byteBuffer);
        try {
            return m23670c(byteBuffer, i, i2, ss7VarM23674a, recVar);
        } finally {
            this.f20397c.m23675b(ss7VarM23674a);
        }
    }

    @Override // p001o.ioe
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(ByteBuffer byteBuffer, rec recVar) {
        return !((Boolean) recVar.m46585c(ts7.f47670b)).booleanValue() && AbstractC10730a.m12695g(this.f20396b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public dq1(Context context, List list, mi1 mi1Var, wo0 wo0Var, C13015b c13015b, C13014a c13014a) {
        this.f20395a = context.getApplicationContext();
        this.f20396b = list;
        this.f20398d = c13014a;
        this.f20399e = new hs7(mi1Var, wo0Var);
        this.f20397c = c13015b;
    }
}
