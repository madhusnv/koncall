package p001o;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class ai1 implements jpe {

    /* renamed from: a */
    public final Bitmap.CompressFormat f14766a;

    /* renamed from: b */
    public final int f14767b;

    public ai1() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p001o.jpe
    /* renamed from: a */
    public zne mo17137a(zne zneVar, rec recVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) zneVar.get()).compress(this.f14766a, this.f14767b, byteArrayOutputStream);
        zneVar.mo19618b();
        return new br1(byteArrayOutputStream.toByteArray());
    }

    public ai1(Bitmap.CompressFormat compressFormat, int i) {
        this.f14766a = compressFormat;
        this.f14767b = i;
    }
}
