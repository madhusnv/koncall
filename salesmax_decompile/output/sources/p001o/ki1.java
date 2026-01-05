package p001o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class ki1 implements ioe {

    /* renamed from: a */
    public final mi1 f32267a = new ni1();

    @Override // p001o.ioe
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo16415a(Object obj, rec recVar) {
        return m35724d(ii1.m32159a(obj), recVar);
    }

    @Override // p001o.ioe
    /* renamed from: b */
    public /* bridge */ /* synthetic */ zne mo16416b(Object obj, int i, int i2, rec recVar) {
        return m35723c(ii1.m32159a(obj), i, i2, recVar);
    }

    /* renamed from: c */
    public zne m35723c(ImageDecoder.Source source, int i, int i2, rec recVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new vf5(i, i2, recVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(bitmapDecodeBitmap.getWidth());
            sb.append("x");
            sb.append(bitmapDecodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
        }
        return new oi1(bitmapDecodeBitmap, this.f32267a);
    }

    /* renamed from: d */
    public boolean m35724d(ImageDecoder.Source source, rec recVar) {
        return true;
    }
}
