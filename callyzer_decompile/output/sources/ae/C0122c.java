package ae;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import b00.C0526k;
import ge.C2580l;
import java.nio.ByteBuffer;
import ke.AbstractC4066g;
import pg.k9;
import q8.AbstractC6142a;
import uw.InterfaceC7559c;
import yd.C8635r;
import yd.EnumC8622e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.c */
/* loaded from: classes.dex */
public final class C0122c implements InterfaceC0127h {

    /* renamed from: a */
    public final /* synthetic */ int f402a;

    /* renamed from: b */
    public final C2580l f403b;

    /* renamed from: c */
    public final Object f404c;

    public /* synthetic */ C0122c(Object obj, C2580l c2580l, int i10) {
        this.f402a = i10;
        this.f404c = obj;
        this.f403b = c2580l;
    }

    @Override // ae.InterfaceC0127h
    /* renamed from: a */
    public final Object mo300a(InterfaceC7559c interfaceC7559c) {
        int i10 = this.f402a;
        Object obj = this.f404c;
        C2580l c2580l = this.f403b;
        switch (i10) {
            case 0:
                return new C0124e(new BitmapDrawable(c2580l.f14045a.getResources(), (Bitmap) obj), false, EnumC8622e.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C0526k c0526k = new C0526k();
                    c0526k.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = c2580l.f14045a;
                    return new C0133n(new C8635r(c0526k, null), null, EnumC8622e.MEMORY);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC4066g.f20920a;
                boolean z6 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof AbstractC6142a);
                if (z6) {
                    bitmapDrawable = new BitmapDrawable(c2580l.f14045a.getResources(), k9.m11735b(bitmapDrawable, c2580l.f14046b, c2580l.f14048d, c2580l.f14049e, c2580l.f14050f));
                }
                return new C0124e(bitmapDrawable, z6, EnumC8622e.MEMORY);
        }
    }
}
