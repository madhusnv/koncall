package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i79 implements pdc {
    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lic apply(lic licVar) throws IOException, vc8 {
        Rect rectMo22322b = licVar.mo22322b();
        Bitmap bitmapM31647b = m31647b((byte[]) licVar.mo22323c(), rectMo22322b);
        fm6 fm6VarMo22324d = licVar.mo22324d();
        Objects.requireNonNull(fm6VarMo22324d);
        return lic.m37316j(bitmapM31647b, fm6VarMo22324d, new Rect(0, 0, bitmapM31647b.getWidth(), bitmapM31647b.getHeight()), licVar.mo22326f(), wuh.m55051t(licVar.mo22327g(), rectMo22322b), licVar.mo22321a());
    }

    /* renamed from: b */
    public final Bitmap m31647b(byte[] bArr, Rect rect) throws IOException, vc8 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e) {
            throw new vc8(1, "Failed to decode JPEG.", e);
        }
    }
}
