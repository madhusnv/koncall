package f0;

import a2.AbstractC0030c;
import d0.AbstractC1545b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C2169d extends AbstractC1545b {

    /* renamed from: a */
    public final int f10036a = 1;

    /* renamed from: b */
    public final EnumC2167b f10037b = EnumC2167b.IMAGE_FORMAT;

    @Override // d0.AbstractC1545b
    /* renamed from: a */
    public final EnumC2167b mo5083a() {
        return this.f10037b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i10 = this.f10036a;
        if (i10 == 0) {
            str = "JPEG";
        } else if (i10 != 1) {
            str = "UNDEFINED(" + i10 + ')';
        } else {
            str = "JPEG_R";
        }
        return AbstractC0030c.m123n(sb2, str, ')');
    }
}
