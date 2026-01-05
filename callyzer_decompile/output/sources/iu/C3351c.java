package iu;

import com.skydoves.balloon.internals.DefinitionKt;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iu.c */
/* loaded from: classes3.dex */
public final class C3351c extends AbstractC3353e {

    /* renamed from: a */
    public final float f17733a;

    /* renamed from: b */
    public final float f17734b;

    public C3351c(float f6) {
        this.f17733a = f6;
        this.f17734b = w9.m11911b(f6, DefinitionKt.NO_Float_VALUE, 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3351c) && Float.compare(this.f17733a, ((C3351c) obj).f17733a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17733a);
    }

    public final String toString() {
        return "UploadProgress(progress=" + this.f17733a + ")";
    }
}
